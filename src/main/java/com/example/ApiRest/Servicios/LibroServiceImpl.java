package com.example.ApiRest.Servicios;


import com.example.ApiRest.Entidades.Libro;
import com.example.ApiRest.Repositorios.BaseRepository;

public class LibroServiceImpl extends BaseServiceImpl<Libro,Long> implements LibroService {
    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository) {
        super(baseRepository);
    }
}
