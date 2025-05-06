package com.alanturing.proyectodaw2425.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class IdiomaEstudianteId implements Serializable {
    @Column(name = "DNI")
    private String dni;

    @Column(name = "nombre")
    private String nombre;

    public IdiomaEstudianteId(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public IdiomaEstudianteId() {
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
