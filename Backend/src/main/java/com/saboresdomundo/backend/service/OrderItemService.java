package com.saboresdomundo.backend.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.saboresdomundo.backend.model.OrderItem;
import com.saboresdomundo.backend.repository.OrderItemRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderItemService {
    private final OrderItemRepository orderItemRepo;

    public OrderItem addOrderItem(OrderItem newOrderItem){
        log.info("[addOrder]: Iniciando registro do item ao pedido");
        var registeredOrderItem = orderItemRepo.save(newOrderItem);
        log.info("[addOrder]: Registro finalizado com sucesso");
        return registeredOrderItem;
    }

    public List<OrderItem> allOrderItemsFromOrder(Long orderID){
        log.info("[allOrderItemsFromOrder]: Iniciando busca por todos os itens do pedido");
        var orderItems = orderItemRepo.allOrderItemsFromOrder(orderID);
        log.info("[allOrderItemsFromOrder]: Busca finalizada com sucesso");
        return orderItems;
    }
}
