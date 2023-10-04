package com.example.ApiRest.Controladores;

import com.example.ApiRest.Entidades.Autor;
import com.example.ApiRest.Servicios.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "Apitest.con/Autor")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl> {
}
