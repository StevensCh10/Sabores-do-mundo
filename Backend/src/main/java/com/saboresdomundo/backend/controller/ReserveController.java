package com.saboresdomundo.backend.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.saboresdomundo.backend.dto.ReserveDTO;
import com.saboresdomundo.backend.model.Reserve;
import com.saboresdomundo.backend.service.ReserveService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/reserve")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@Slf4j
@RequiredArgsConstructor
public class ReserveController {
    private final ReserveService reserveService;

    @PostMapping
    @ResponseStatus(value = HttpStatus.OK)
    public ReserveDTO createReserve(@RequestBody Reserve newReserve){
        log.info("Iniciando endpoint da criação de reserva");
        return reserveService.createReserve(newReserve);
    }

    @PutMapping
    public ReserveDTO alterNumberReservant(@RequestBody Reserve reserve, @RequestBody String number){
        log.info("Iniciando endpoint da alteração de numero do reservante");
        return reserveService.alterNumberReservant(reserve, number);
    }

    @GetMapping 
    public List<ReserveDTO> getAllReserves(){
        log.info("Iniciando endpoint da busca por todas as reservas");
        return reserveService.allReserves();
    }

    @DeleteMapping
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteReserve(@RequestParam Long id){
        log.info("Iniciando endpoint da remoção de uma reserva");
        reserveService.excludeReserve(id);
    }
}
