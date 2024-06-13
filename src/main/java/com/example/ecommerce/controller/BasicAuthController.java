package com.example.ecommerce.controller;

//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.dto.AutenticacionDto;

//@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/auth")
public class BasicAuthController {

    @GetMapping
    public AutenticacionDto basicauth() {
        return new AutenticacionDto("Usted se ha autenticado");
    }
}
