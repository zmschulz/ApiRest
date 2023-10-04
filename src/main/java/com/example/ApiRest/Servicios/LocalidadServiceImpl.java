package com.example.ApiRest.Servicios;

import com.example.ApiRest.Entidades.Localidad;
import com.example.ApiRest.Repositorios.BaseRepository;

public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService{
    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
