package com.alanturing.proyectodaw2425.dominio;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class CertificacionEstudiante {

    @EmbeddedId
    private CertificacionEstudianteId id;

    @Column
    private Date fecha;

    @ManyToOne
    @MapsId("dni")
    @JoinColumn(name = "DNI")
    private Estudiante estudiante;

    @ManyToOne
    @MapsId("codigoCertificacion")
    @JoinColumn(name = "codigo_certificacion")
    private Certificacion certificacion;

    public CertificacionEstudianteId getId() {
        return id;
    }

    public void setId(CertificacionEstudianteId id) {
        this.id = id;
    }
}
