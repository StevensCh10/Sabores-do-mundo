package com.saboresdomundo.backend;

import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.saboresdomundo.backend.model.Reserve;
import com.saboresdomundo.backend.repository.ReserveRepository;
import com.saboresdomundo.backend.service.ReserveService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ExtendWith(MockitoExtension.class)
public class ReserveServiceTest {
    
    @Mock
    private ReserveRepository repository;

    @InjectMocks
    private ReserveService service;

    private Reserve reserve;

    @BeforeEach
    private void setup(){
        log.info("Iniciando setup de teste");

        reserve = Reserve.builder()
                    .id(null)
                    .reserveDate(LocalDateTime.of(2025, 4, 24, 14, 30, 0))
                    .reservantPhone("81999546165")
                    .reservantName("Stevens Wendell Marinho Chaves")
                    .build();
    }

    @Test
    void ShouldInsertReserve(){
        log.info("Iniciando ShouldInsertReserve");
        
    }

    @Test
    void ShouldAlterNumberReservant(){
        log.info("Iniciando ShouldAlterNumberReservant");
        
    }

    @Test
    void ShouldReturnAllReserves(){
        log.info("Iniciando ShouldReturnAllReserves");
        
    }

    @Test
    void ShouldRemoveReserve(){
        log.info("Iniciando ShouldRemoveReserve");
        
    }
}
