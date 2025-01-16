package com.saboresdomundo.backend.service;

import org.springframework.stereotype.Service;

import com.saboresdomundo.backend.model.Reserve;
import com.saboresdomundo.backend.repository.ReserveRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReserveService {
    private final ReserveRepository reserveRepo;

    public Reserve findReserveById(Long id){
        return reserveRepo.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public Reserve createReserve(Reserve newReserve){
        Reserve foundReserveByReservantName = reserveRepo.findByReserveByReservantName(newReserve.getReservantName());
        Reserve foundReserveByReservantPhone = reserveRepo.findByReserveByReservantPhone(newReserve.getReservantPhone());
        if(foundReserveByReservantName == null && foundReserveByReservantPhone == null){
            return reserveRepo.save(newReserve);
        }
        throw new RuntimeException("Erro ao criar reserva");
    }

    public Reserve alterNumberReservant(Reserve reserve, String newNumber){
        Reserve foundReserveByReservantPhone = reserveRepo.findByReserveByReservantPhone(newNumber);
        if(foundReserveByReservantPhone == null){
            reserve.setReservantPhone(newNumber);
            return reserveRepo.save(reserve);
        }
        throw new RuntimeException();
    }

    public void excludeReserve(Long id){
        reserveRepo.deleteById(id);
    }
}
