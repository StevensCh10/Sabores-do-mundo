package com.saboresdomundo.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.saboresdomundo.backend.model.Reserve;

public interface ReserveRepository extends JpaRepository<Long, Reserve>{
    
}
