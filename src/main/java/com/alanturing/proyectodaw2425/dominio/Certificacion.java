package com.alanturing.proyectodaw2425.dominio;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Certificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoCertificacion;

    private String nombre;

    @OneToMany(mappedBy = "certificacion")
    @JsonIgnore
    private Set<CertificacionEstudiante> certificacionesEstudiantes;


    public Integer getCodigoCertificacion() {
        return codigoCertificacion;
    }

    public void setCodigoCertificacion(Integer codigoCertificacion) {
        this.codigoCertificacion = codigoCertificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
