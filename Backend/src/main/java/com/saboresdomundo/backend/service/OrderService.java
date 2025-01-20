package com.saboresdomundo.backend.service;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;
import com.saboresdomundo.backend.model.Order;
import com.saboresdomundo.backend.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {
    private final OrderRepository orderRepo;

    public Order getOrderById(Long id){
        log.info("[getOrderByID]: Iniciando busca por pedido");
        Order foundOrder = orderRepo.findById(id).orElseThrow(() -> {
            log.warn("[getOrderById]: Falha na busca. Pedido com ID: {} não encontrado", id);
            return new RuntimeException();
        });
        log.info("[getOrderById]: Busca finalizada com sucesso");
        return foundOrder;
    }

    public List<Order> getAllOrders(){
        log.info("[getAllOrders]: Iniciando busca por todos os pedidos");
        var orders = orderRepo.findAll();
        log.info("[getAllOrders]: Busca finalizada com sucesso");
        return orders;
    }

    public Order addOrder(Order newOrder){
        log.info("[addOrder]: Iniciando cadastro de pedido");
        newOrder.setTotalPrice(BigDecimal.valueOf(0));
        newOrder.setFinished(false);
        log.info("[addOrder]: Pedido cadastrado com sucesso");
        return orderRepo.save(newOrder);
    }

    public Order updateTotalPrice(Long id, BigDecimal aditional){
        log.info("[addOrder]: Atualizando preço total");
        var order = getOrderById(id);
        order.setTotalPrice(order.getTotalPrice().add(aditional));
        log.info("[addOrder]: Preço total atualizado com sucesso");
        return order;
    }

    public boolean finalizeOrder(Long id){
        log.info("[addOrder]: Iniciando finalização do pedido");
        orderRepo.finalizeOrder(id);
        log.info("[addOrder]: Pedido finalizado com sucesso");
        return true;
    }

    public void deleteOrder(Long id){
        log.info("[addOrder]: Iniciando remoção de pedido");
        orderRepo.deleteById(id);
        log.info("[addOrder]: Pedido removido com sucesso");
    }
}
