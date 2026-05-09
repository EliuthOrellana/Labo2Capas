package com.uca.l2capas.controller;

import com.uca.l2capas.domain.entity.Mago;
import com.uca.l2capas.services.impl.MagoServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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
    @GetMapping("/getAll")
    public ResponseEntity<List<Mago>> getAllMagos() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(magoService.getAllMagos());
    }

    @GetMapping("/deathEaters")
    public ResponseEntity<List<Mago>> getDeathEaters() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(magoService.getDeathEaters());
    }

    @GetMapping("/patronus/{patronus}")
    public ResponseEntity<List<Mago>> getByPatronus(
            @PathVariable String patronus
    ) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(magoService.getByPatronus(patronus));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Mago> updateMago(
            @PathVariable UUID id,
            @RequestBody Mago mago
    ) {
        magoService.updateMago(id, mago);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(mago);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteMago(@PathVariable UUID id) {
        magoService.deleteMago(id);

        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .build();
    }
}
