package com.saboresdomundo.backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.saboresdomundo.backend.service.ItemService;
import com.saboresdomundo.backend.service.OrderItemService;
import com.saboresdomundo.backend.service.OrderService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/order")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class OrderController {
    private final ItemService itemService;
    private final OrderItemService orderItemService;
    private final OrderService orderService;

}
