package com.uca.l2capas.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Entity
@Table(name="Mago")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Mago {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "house")
    private String house;

    @Column(name = "patronus")
    private String patronus;

    @Column(name = "isDeathEater")
    private Boolean isDeathEater;

}