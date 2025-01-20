package com.saboresdomundo.backend.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long number;
    
    @NotNull
    private LocalDateTime date;

    private BigDecimal totalPrice;

    private boolean finished;
}
