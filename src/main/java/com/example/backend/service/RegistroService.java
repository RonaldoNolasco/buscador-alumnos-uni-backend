package com.example.backend.service;

import com.example.backend.model.Registro;
import com.example.backend.repository.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistroService{
    @Autowired
    private RegistroRepository registroRepository;

    public List<Registro> getRegistrosByCodigoInAndNombreInAndApInAndAm(String codigo, String nombre, String ap, String am){
        return registroRepository.findByCodigoInAndNombreInAndApInAndAm(codigo,nombre,ap,am);
    }

    public Page<Registro> getRegistro(Pageable pageable) {
        return registroRepository.findAll(pageable);
    }

    public Registro createRegistro(Registro registro) {
        return registroRepository.save(registro);
    }
}