package com.uca.l2capas.services.impl;
import com.uca.l2capas.domain.entity.Mago;
import com.uca.l2capas.repository.MagoRepository;
import com.uca.l2capas.services.MagoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MagoServiceImpl implements MagoService {

    private final MagoRepository magoRepository;

    @Override
    public void createMago(Mago mago) {
        magoRepository.save(mago);
    }

}