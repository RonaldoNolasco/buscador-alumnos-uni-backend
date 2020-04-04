package com.example.backend.controller;

import com.example.backend.model.Registro;
import com.example.backend.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")

public class RegistroController{
    @Autowired
    private RegistroService registroService;

    @GetMapping("/registrox")
    public List<Registro> getRegistrosByCodigoInAndNombreInAndApInAndAm(@RequestParam("codigo") String codigo,
                                                                        @RequestParam("nombre") String nombre,
                                                                        @RequestParam("ap") String ap,
                                                                        @RequestParam("am") String am ) {
        return registroService.getRegistrosByCodigoInAndNombreInAndApInAndAm(codigo, nombre, ap, am);
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