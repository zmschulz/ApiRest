package com.example.ApiRest.Controladores;

import com.example.ApiRest.Entidades.Libro;
import com.example.ApiRest.Servicios.LibroServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "Apirest.com/Libro")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl> {
}
