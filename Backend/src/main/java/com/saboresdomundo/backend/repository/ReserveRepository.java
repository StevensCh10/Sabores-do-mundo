package com.saboresdomundo.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.saboresdomundo.backend.model.Reserve;

public interface ReserveRepository extends JpaRepository<Reserve, Long>{

    Reserve findByReservantPhone(String reservantPhone);

    @Query(
        value = """
                SELECT
                    CASE
                        WHEN EXISTS (
                            SELECT 1 FROM reserve WHERE reservant_phone = :phone OR reservant_name = :name
                        )
                        THEN 1
                        ELSE 0
                    END AS encontrado
                """,
        nativeQuery = true
    )
    Boolean existsReserveByReservantNameOrPhone(@Param("name")String name, @Param("phone") String phone);
}
