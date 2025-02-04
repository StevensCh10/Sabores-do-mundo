package com.saboresdomundo.backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.saboresdomundo.backend.model.Reserve;
import com.saboresdomundo.backend.service.ReserveService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/reserve")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class ReserveController {
    private final ReserveService reserveService;

    @PostMapping
    @ResponseStatus(value = HttpStatus.OK)
    public Reserve createReserve(Reserve newReserve){
        return reserveService.createReserve(newReserve);
    }

    @PutMapping
    public Reserve alterNumberReservant(Reserve reserve, String number){
        return reserveService.alterNumberReservant(reserve, number);
    }

    @GetMapping 
    public List<Reserve> getAllReserves(){
        return reserveService.allReserves();
    }

    @DeleteMapping
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteReserve(Long id){
        reserveService.excludeReserve(id);
    }
}
