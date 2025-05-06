package com.alanturing.proyectodaw2425.dominio;

import jakarta.persistence.*;

@Entity
public class IdiomaEstudiante {
    @EmbeddedId
    private IdiomaEstudianteId id;

    @ManyToOne
    @MapsId("dni")
    @JoinColumn(name = "DNI")
    private Estudiante estudiante;

    @ManyToOne
    @MapsId("nombre")
    @JoinColumn(name = "nombre")
    private Idioma idioma;

    private String nivel;
}
