package com.saboresdomundo.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.saboresdomundo.backend.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<Long, OrderItem>{
    
}
