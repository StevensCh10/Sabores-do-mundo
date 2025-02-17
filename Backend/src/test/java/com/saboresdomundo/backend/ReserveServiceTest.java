package com.saboresdomundo.backend;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.saboresdomundo.backend.dto.ReserveDTO;
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
                    .id(1L)
                    .reserveDate(LocalDateTime.of(2025, 4, 24, 14, 30, 0))
                    .reservantPhone("81999546165")
                    .reservantName("Stevens Wendell Marinho Chaves")
                    .build();
    }

    @Test
    void ShouldInsertReserve(){
        log.info("Iniciando ShouldInsertReserve");
        reserve.setId(null);
        
        when(repository.existsReserveByReservantNameOrPhone(reserve.getReservantName(), reserve.getReservantPhone())).thenReturn(0);
        when(repository.save(reserve)).thenReturn(reserve);

        ReserveDTO newReserve = service.createReserve(reserve);
        assertEquals(newReserve.reservanteName(), reserve.getReservantName());
    }

    @Test
    void ShouldAlterNumberReservant(){
        log.info("Iniciando ShouldAlterNumberReservant");

        String newNumber = "81988704731";  
        String oldNumber = "81999546165";

        when(repository.findByReservantPhone(newNumber)).thenReturn(null);
        when(repository.save(reserve)).thenReturn(reserve);

        ReserveDTO updatedReserve = service.alterNumberReservant(reserve, newNumber);
        assertNotEquals(oldNumber, updatedReserve.reservantPhone());
    }

    @Test
    void ShouldFail_WhenAlterNumberReservantAndNumberNotAvailable(){
        log.info("Iniciando ShouldAlterNumberReservant");

        String newNumber = "81988704731";  

        when(repository.findByReservantPhone(newNumber)).thenReturn(any(Reserve.class));
        RuntimeException e = assertThrows(RuntimeException.class, () -> {
            service.alterNumberReservant(reserve, newNumber);
        });
        assertThat(e, instanceOf(RuntimeException.class));
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
