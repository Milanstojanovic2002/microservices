package com.programming.inventory_service.repository;

import com.programming.inventory_service.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory,Long> {

    @Query(value = "select * from inventory where skuCode=:skuCode",nativeQuery = true)
    Optional<Inventory> findBySkuCode(@Param("skuCode") String skuCode);

    List<Inventory> findBySkuCodeIn(List<String> sku);

//    Optional<Inventory> findBySkuCode();
}
