package com.saboresdomundo.backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.saboresdomundo.backend.service.ReserveService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/reserve")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class ReserveController {
    private final ReserveService reserveService;
}
