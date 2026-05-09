package com.uca.l2capas.services;

import com.uca.l2capas.domain.entity.Mago;

import java.util.List;
import java.util.UUID;

public interface MagoService {
    void createMago(Mago mago);

    List<Mago> getAllMagos();

    List<Mago> getDeathEaters();

    List<Mago> getByPatronus(String patronus);

    void updateMago(UUID id, Mago mago);

    void deleteMago(UUID id);
}
