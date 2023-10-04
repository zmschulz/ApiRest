package com.example.ApiRest.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Libro")
@NoArgsConstructor
@AllArgsConstructor

public class Libro extends Base {
    @Column(name = "Titulo")
    private String titulo;
    @Column(name = "Fecha")
    private Integer fecha;
    @Column(name = "Genero")
    private String calle;
    @Column(name = "Paginas")
    private Integer paginas;

    @ManyToMany(cascade = CascadeType.REFRESH)

    private List<Autor> autores;
}
