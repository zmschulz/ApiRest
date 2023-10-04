package com.example.ApiRest.Servicios;

import com.example.ApiRest.Entidades.Autor;
import com.example.ApiRest.Repositorios.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor,Long> implements AutorService{

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
