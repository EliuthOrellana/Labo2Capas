package com.uca.l2capas.controller;

import com.uca.l2capas.domain.entity.Mago;
import com.uca.l2capas.services.impl.MagoServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/wizards")
@AllArgsConstructor
public class MagoController {
    private final MagoServiceImpl magoService;

    @PostMapping("/create")
    public ResponseEntity<Mago> createMago(@RequestBody Mago mago) {
        magoService.createMago(mago);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(mago);
    }
}
