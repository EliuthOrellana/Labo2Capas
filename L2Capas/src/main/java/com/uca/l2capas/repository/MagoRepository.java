package com.uca.l2capas.repository;

import com.uca.l2capas.domain.entity.Mago;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface MagoRepository extends JpaRepository<Mago, UUID> {
    List<Mago> findByIsDeathEaterTrue();

    List<Mago> findByPatronus(String patronus);
}