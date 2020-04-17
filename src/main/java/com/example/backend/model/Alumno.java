package com.example.backend.model;

import javax.persistence.*;
import org.hibernate.annotations.Immutable;

@Immutable
@Entity(name = "Alumno")
@Table(name = "alumno")

public class Alumno{
    @Id
    @Column(name="codigo", nullable=false, length=9)
    private String codigo;

    @Column(name="especialidad", nullable=false, length=2)
    private String especialidad;

    @Column(name="apellido_paterno", nullable=false, length=40)
    private String ap;

    @Column(name="apellido_materno", nullable=false, length=40)
    private String am;

    @Column(name="nombre", nullable=false, length=40)
    private String nombre;
    
    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEspecialidad() {
        return this.especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getAp() {
        return this.ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public String getAm() {
        return this.am;
    }

    public void setAm(String am) {
        this.am = am;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}