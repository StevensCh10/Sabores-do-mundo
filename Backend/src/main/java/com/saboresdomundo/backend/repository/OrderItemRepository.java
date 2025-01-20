package com.saboresdomundo.backend.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.saboresdomundo.backend.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
    
    @Query(
        value = "SELECT order_item WHERE fk_order = :orderID",
        nativeQuery = true
    )
    List<OrderItem> allOrderItemsFromOrder(@Param("orderID") Long orderID);
}
