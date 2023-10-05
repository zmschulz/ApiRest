package com.example.ApiRest.Servicios;


import com.example.ApiRest.Entidades.Libro;
import com.example.ApiRest.Repositorios.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro,Long> implements LibroService {
    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository) {
        super(baseRepository);
    }
}
