package com.alanturing.proyectodaw2425.dominio;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.Nationalized;

import java.time.LocalDate;

@Entity
@Table(name = "experiencia_estudiante")
public class ExperienciaEstudiante {
    @EmbeddedId
    private ExperienciaEstudianteId id;

    @MapsId("dni")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DNI", nullable = false)
    private Estudiante dni;

    @MapsId("codigoExperiencia")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codigo_experiencia", nullable = false)
    private Experiencia codigoExperiencia;

    @Size(max = 200)
    @Nationalized
    @Column(name = "descripcion", length = 200)
    private String descripcion;

    @Column(name = "fecha_inicio")
    private LocalDate fechaInicio;

    @Column(name = "fecha_fin")
    private LocalDate fechaFin;

    public ExperienciaEstudianteId getId() {
        return id;
    }

    public void setId(ExperienciaEstudianteId id) {
        this.id = id;
    }

    public Estudiante getDni() {
        return dni;
    }

    public void setDni(Estudiante dni) {
        this.dni = dni;
    }

    public Experiencia getCodigoExperiencia() {
        return codigoExperiencia;
    }

    public void setCodigoExperiencia(Experiencia codigoExperiencia) {
        this.codigoExperiencia = codigoExperiencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

}