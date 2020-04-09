package com.example.backend.model;

public class TwoString{
    private String codigo;
    private String nombre;
    
    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TwoString(String a, String b){
        this.codigo = a;
        this.nombre = b;
    }
}