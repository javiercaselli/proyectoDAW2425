package com.alanturing.proyectodaw2425.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.Hibernate;
import org.hibernate.annotations.Nationalized;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ExperienciaEstudianteId implements Serializable {
    private static final long serialVersionUID = -122790702266313157L;
    @Size(max = 20)
    @NotNull
    @Nationalized
    @Column(name = "DNI", nullable = false, length = 20)
    private String dni;

    @NotNull
    @Column(name = "codigo_experiencia", nullable = false)
    private Integer codigoExperiencia;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getCodigoExperiencia() {
        return codigoExperiencia;
    }

    public void setCodigoExperiencia(Integer codigoExperiencia) {
        this.codigoExperiencia = codigoExperiencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ExperienciaEstudianteId entity = (ExperienciaEstudianteId) o;
        return Objects.equals(this.codigoExperiencia, entity.codigoExperiencia) &&
                Objects.equals(this.dni, entity.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoExperiencia, dni);
    }

}