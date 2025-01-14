package com.saboresdomundo.backend.service;

import org.springframework.stereotype.Service;
import com.saboresdomundo.backend.repository.ReserveRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReserveService {
    private final ReserveRepository reserveRepo;
}
