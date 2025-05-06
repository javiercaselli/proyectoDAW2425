package com.alanturing.proyectodaw2425.dominio;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.Nationalized;

@Entity
@Table(name = "estudiante_ciclo_instituto")
public class EstudianteCicloInstituto {
    @EmbeddedId
    private EstudianteCicloInstitutoId id;

    @MapsId("dni")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DNI", nullable = false)
    private Estudiante dni;

    @MapsId("nombre")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "nombre", nullable = false)
    private Ciclo ciclo;

    @MapsId("codigoIes")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codigo_ies", nullable = false)
    private Instituto instituto;

    @Size(max = 20)
    @NotNull
    @Nationalized
    @Column(name = "curso", nullable = false, length = 20)
    private String curso;

    @Size(max = 20)
    @NotNull
    @Nationalized
    @Column(name = "curso_escolar", nullable = false, length = 20)
    private String cursoEscolar;

    public EstudianteCicloInstitutoId getId() {
        return id;
    }

    public void setId(EstudianteCicloInstitutoId id) {
        this.id = id;
    }

    public Estudiante getDni() {
        return dni;
    }

    public void setDni(Estudiante dni) {
        this.dni = dni;
    }

    public Ciclo getCiclo() {
        return ciclo;
    }

    public void setCiclo(Ciclo nombre) {
        this.ciclo = nombre;
    }

    public Instituto getInstituto() {
        return instituto;
    }

    public void setInstituto(Instituto codigoIes) {
        this.instituto = codigoIes;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCursoEscolar() {
        return cursoEscolar;
    }

    public void setCursoEscolar(String cursoEscolar) {
        this.cursoEscolar = cursoEscolar;
    }

}