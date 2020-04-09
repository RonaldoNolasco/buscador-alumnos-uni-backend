package com.example.backend.service;

import com.example.backend.model.Alumno;
import com.example.backend.model.TwoString;
import com.example.backend.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService{
    @Autowired
    private AlumnoRepository alumnoRepository;

    public List<TwoString> getAlumnosByCodigoInAndNombreInAndApInAndAm(String codigo, String nombre, String ap, String am){
        return alumnoRepository.findByCodigoInAndNombreInAndApInAndAm(codigo,nombre,ap,am);
    }

    public Page<Alumno> getAlumno(Pageable pageable) {
        return alumnoRepository.findAll(pageable);
    }

    public Alumno createAlumno(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }
}