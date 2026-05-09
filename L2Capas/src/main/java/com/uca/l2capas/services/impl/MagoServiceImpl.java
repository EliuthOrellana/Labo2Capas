package com.uca.l2capas.services.impl;
import com.uca.l2capas.domain.entity.Mago;
import com.uca.l2capas.repository.MagoRepository;
import com.uca.l2capas.services.MagoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class MagoServiceImpl implements MagoService {

    private final MagoRepository magoRepository;

    @Override
    public void createMago(Mago mago) {
        magoRepository.save(mago);
    }

    @Override
    public List<Mago> getAllMagos() {
        return magoRepository.findAll();
    }

    @Override
    public List<Mago> getDeathEaters() {
        return magoRepository.findByIsDeathEaterTrue();
    }

    @Override
    public List<Mago> getByPatronus(String patronus) {
        return magoRepository.findByPatronus(patronus);
    }

    @Override
    public void updateMago(UUID id, Mago mago) {
        Mago magoActual = magoRepository.findById(id).orElseThrow();

        magoActual.setName(mago.getName());
        magoActual.setHouse(mago.getHouse());
        magoActual.setPatronus(mago.getPatronus());
        magoActual.setIsDeathEater(mago.getIsDeathEater());

        magoRepository.save(magoActual);
    }

    @Override
    public void deleteMago(UUID id) {
        magoRepository.deleteById(id);
    }

}