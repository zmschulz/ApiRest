package com.example.ApiRest.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Dommicilio")
@NoArgsConstructor
@AllArgsConstructor

public class Domicilio extends Base{
    @Column(name = "Calle")
    private String calle;
    @Column(name = "Numero")
    private String numero;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;
}
