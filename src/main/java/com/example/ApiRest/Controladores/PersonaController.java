package com.example.ApiRest.Controladores;

import com.example.ApiRest.Entidades.Persona;
import com.example.ApiRest.Servicios.PersonaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "Apirest.com/Persona")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl> {
}
