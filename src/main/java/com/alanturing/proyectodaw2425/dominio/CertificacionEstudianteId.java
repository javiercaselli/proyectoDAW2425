package com.alanturing.proyectodaw2425.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class CertificacionEstudianteId implements Serializable {
    @Column(name = "DNI")
    private String dni;

    @Column(name = "codigo_certificacion")
    private Integer codigoCertificacion;

    public CertificacionEstudianteId(String dni, Integer codigoCertificacion) {
        this.dni = dni;
        this.codigoCertificacion = codigoCertificacion;
    }

    public CertificacionEstudianteId() {
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getCodigoCertificacion() {
        return codigoCertificacion;
    }

    public void setCodigoCertificacion(Integer codigoCertificacion) {
        this.codigoCertificacion = codigoCertificacion;
    }
}
