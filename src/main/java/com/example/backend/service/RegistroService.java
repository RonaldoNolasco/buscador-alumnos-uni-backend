package com.example.backend.service;

import com.example.backend.model.Registro;
import com.example.backend.repository.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

@Service
public class RegistroService{
    @Autowired
    private RegistroRepository registroRepository;

    public List<Registro> getRegistrosByCodigo(String codigo){
        return registroRepository.findByCodigo(codigo);
    }

    public Page<Registro> getRegistro(Pageable pageable) {
        return registroRepository.findAll(pageable);
    }

    public Registro createRegistro(Registro registro) {
        return registroRepository.save(registro);
    }
}