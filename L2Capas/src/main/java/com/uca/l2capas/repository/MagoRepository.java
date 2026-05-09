package com.uca.l2capas.repository;

import com.uca.l2capas.domain.entity.Mago;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface MagoRepository extends JpaRepository<Mago, UUID> {
}