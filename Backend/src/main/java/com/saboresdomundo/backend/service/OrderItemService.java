package com.saboresdomundo.backend.service;

import org.springframework.stereotype.Service;
import com.saboresdomundo.backend.repository.OrderItemRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderItemService {
    private final OrderItemRepository orderItemRepo;
}
