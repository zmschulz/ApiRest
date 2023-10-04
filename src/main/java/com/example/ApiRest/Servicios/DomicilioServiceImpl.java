package com.example.ApiRest.Servicios;

import com.example.ApiRest.Entidades.Domicilio;
import com.example.ApiRest.Repositorios.BaseRepository;

public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio,Long> implements DomicilioService{
    public DomicilioServiceImpl(BaseRepository<Domicilio, Long> baseRepository) {
        super(baseRepository);
    }
}
