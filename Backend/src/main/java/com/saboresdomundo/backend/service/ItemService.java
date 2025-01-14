package com.saboresdomundo.backend.service;

import org.springframework.stereotype.Service;
import com.saboresdomundo.backend.repository.ItemRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepo;
}
