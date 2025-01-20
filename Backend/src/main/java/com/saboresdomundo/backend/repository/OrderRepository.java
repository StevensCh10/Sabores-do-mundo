package com.saboresdomundo.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.saboresdomundo.backend.model.Order;
import jakarta.transaction.Transactional;

public interface OrderRepository extends JpaRepository<Order, Long>{

    @Transactional
    @Modifying
    @Query(
        value = "UPDATE order SET finished = true WHERE id = :id" + "",
        nativeQuery = true
    )
    void finalizeOrder(@Param("id") Long id);
}
