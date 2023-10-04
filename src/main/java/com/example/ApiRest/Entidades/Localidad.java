package com.example.ApiRest.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Localidad")
@NoArgsConstructor
@AllArgsConstructor
public class Localidad extends Base{
    @Column(name = "Denominacion")
    private String denominacion;
}
