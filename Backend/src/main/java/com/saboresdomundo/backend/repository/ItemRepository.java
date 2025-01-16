package com.saboresdomundo.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.saboresdomundo.backend.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{
    
}
