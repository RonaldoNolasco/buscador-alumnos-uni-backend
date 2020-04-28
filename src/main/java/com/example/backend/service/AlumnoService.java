package com.example.backend.service;

import com.example.backend.model.Alumno;
import com.example.backend.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.io.BufferedReader;
import java.io.FileReader;

import java.util.List;

@Service
public class AlumnoService{
    @Autowired
    private AlumnoRepository alumnoRepository;

    String line = "";

    public void saveData(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("files/AlumnoPrueba.txt"));
            while((line = br.readLine()) != null){
                String [] data = line.split(",");
                Alumno a = new Alumno();
                a.setCodigo(data[0]);
                a.setEspecialidad(data[1]);
                a.setAp(data[2]);
                a.setAm(data[3]);
                a.setNombre(data[4]);
                alumnoRepository.save(a);
            }
            br.close();
            
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }

    public List<Alumno> getAlumnosByCodigoInAndNombreInAndApInAndAm(String codigo, String nombre, String ap, String am){
        return alumnoRepository.findByCodigoInAndNombreInAndApInAndAm(codigo,nombre,ap,am);
    }
}