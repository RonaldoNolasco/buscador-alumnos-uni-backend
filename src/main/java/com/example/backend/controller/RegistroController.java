package com.example.backend.controller;

import com.example.backend.model.Registro;
import com.example.backend.repository.RegistroRepository;
import com.example.backend.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api")

public class RegistroController{
    @Autowired
    private RegistroService registroService;

    @GetMapping("/registros/{codigo}")
    public List<Registro> getRegistroByCodigo(@PathVariable String codigo) {
        return registroService.getRegistrosByCodigo(codigo);
    }

    @GetMapping("/registros")
    public Page<Registro> getRegistro(Pageable pageable) {
        return registroService.getRegistro(pageable);
    }

    @PostMapping("/registro")
    public Registro createRegistro(@Valid @RequestBody Registro registro) {
        return registroService.createRegistro(registro);
    }
}