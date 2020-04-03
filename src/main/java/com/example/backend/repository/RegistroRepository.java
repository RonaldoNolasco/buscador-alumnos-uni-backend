package com.example.backend.repository;

import com.example.backend.model.Registro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RegistroRepository extends JpaRepository<Registro, Long> {

    @Query("select u from Registro u where u.codigo LIKE CONCAT (?1,'%')")
    List<Registro> findByCodigo(String codigo);

}