package com.saboresdomundo.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.saboresdomundo.backend.model.Order;

public interface OrderRepository extends JpaRepository<Long, Order>{
    
}
