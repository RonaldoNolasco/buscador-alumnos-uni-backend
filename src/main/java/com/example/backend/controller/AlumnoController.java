package com.example.backend.controller;

import com.example.backend.model.Alumno;
import com.example.backend.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.PostConstruct;

@CrossOrigin
@RestController
@RequestMapping("/api")

public class AlumnoController{
    @Autowired
    private AlumnoService alumnoService;

    @GetMapping("/alumnos")
    public List<Alumno> getAlumnosByCodigoInAndNombreInAndApInAndAm(@RequestParam("codigo") final String codigo,
    @RequestParam("nombre") final String nombre, @RequestParam("ap") final String ap, @RequestParam("am") final String am ) {
        return alumnoService.getAlumnosByCodigoInAndNombreInAndApInAndAm(codigo, nombre, ap, am);
    }

    @GetMapping("/alumnosAll")
    public Page<Alumno> getAlumno(final Pageable pageable) {
        return alumnoService.getAlumno(pageable);
    }

    @PostConstruct
    public void setDataInDB(){
        alumnoService.saveData();
    }
}