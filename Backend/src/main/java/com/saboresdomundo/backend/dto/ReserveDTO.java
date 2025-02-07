package com.saboresdomundo.backend.dto;

import java.time.LocalDateTime;
import com.saboresdomundo.backend.model.Reserve;
import lombok.Builder;

@Builder
public record ReserveDTO(Long id, LocalDateTime dateTime, int amountOfPeople, String reservantPhone, String reservanteName) {
    
    public static ReserveDTO fromEntity(Reserve reserve){
        return ReserveDTO.builder()
            .id(reserve.getId())
            .dateTime(reserve.getReserveDate())
            .amountOfPeople(reserve.getAmountOfPeople())
            .reservantPhone(reserve.getReservantPhone())
            .reservanteName(reserve.getReservantName())
            .build();
    }
}
