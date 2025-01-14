package com.saboresdomundo.backend.service;

import org.springframework.stereotype.Service;
import com.saboresdomundo.backend.repository.OrderRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepo;
}
