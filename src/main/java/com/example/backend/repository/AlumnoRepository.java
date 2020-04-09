package com.example.backend.repository;

import com.example.backend.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

    @Query("SELECT u.nombre FROM Alumno u WHERE u.codigo LIKE CONCAT (?1,'%') AND u.nombre LIKE CONCAT (?2,'%') AND u.apellido_paterno LIKE CONCAT (?3,'%') AND u.apellido_materno LIKE CONCAT (?4,'%')")
    List<String> findByCodigoInAndNombreInAndApInAndAm(String codigo, String nombre, String ap, String am);

}