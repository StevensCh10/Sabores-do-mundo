package com.saboresdomundo.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.saboresdomundo.backend.model.Reserve;
import com.saboresdomundo.backend.repository.ReserveRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ReserveService {
    private final ReserveRepository reserveRepo;

    public Reserve getReserveById(Long id){
        log.info("[getReserveById]: Iniciando busca por reserva");
        var foundReserve = reserveRepo.findById(id).orElseThrow(() -> {
            log.warn("[getReserveById]: Falha na busca. Reserva com ID: {} não encontrada no sistema", id);
            return new RuntimeException();
        });
        log.info("[getReserveById]: Busca finalizada com sucesso");
        return foundReserve;
    }

    public Reserve createReserve(Reserve newReserve){
        log.info("[createReserve]: Iniciando cadastro da reserva");
        Reserve foundReserveByReservantName = reserveRepo.findByReserveByReservantName(newReserve.getReservantName());
        Reserve foundReserveByReservantPhone = reserveRepo.findByReserveByReservantPhone(newReserve.getReservantPhone());
        if(foundReserveByReservantName == null && foundReserveByReservantPhone == null){
            var registeredOrder = reserveRepo.save(newReserve);
            log.info("[createReserve]: Cadastro finalizado com sucesso");
            return registeredOrder;
        }
        log.warn("[createReserve]: Falha no cadastro da reserva");
        throw new RuntimeException("Erro ao criar reserva");
    }

    public Reserve alterNumberReservant(Reserve reserve, String newNumber){
        log.info("[alterNumberReservant]: Iniciando alteração do telefone do reservante");
        Reserve foundReserveByReservantPhone = reserveRepo.findByReserveByReservantPhone(newNumber);
        if(foundReserveByReservantPhone == null){
            reserve.setReservantPhone(newNumber);
            var updatedOrder = reserveRepo.save(reserve);
            log.info("[alterNumberReservant]: Alteração concluída com sucesso");
            return updatedOrder;
        }
        log.warn("[alterNumberReservant]: Falha na alteração do telefone do reservante");
        throw new RuntimeException();
    }

    public List<Reserve> allReserves(){
        log.info("[allReserves]: Iniciando busca por todas as reservas do sistema");
        var reserves = reserveRepo.findAll();
        log.info("[allReserves]: Busca finalizada com sucesso");
        return reserves;
    }

    public void excludeReserve(Long id){
        log.info("[excludeReserve]: Iniciando remoção de reserva");
        reserveRepo.deleteById(id);
        log.info("[excludeReserve]: Remoção finalizada com sucesso");
    }
}
