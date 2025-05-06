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
public class EstudianteCicloInstitutoId implements Serializable {
    private static final long serialVersionUID = 3136768326014144349L;
    @Size(max = 20)
    @NotNull
    @Nationalized
    @Column(name = "DNI", nullable = false, length = 20)
    private String dni;

    @Size(max = 50)
    @NotNull
    @Nationalized
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @NotNull
    @Column(name = "codigo_ies", nullable = false)
    private Integer codigoIes;

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

    public Integer getCodigoIes() {
        return codigoIes;
    }

    public void setCodigoIes(Integer codigoIes) {
        this.codigoIes = codigoIes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EstudianteCicloInstitutoId entity = (EstudianteCicloInstitutoId) o;
        return Objects.equals(this.codigoIes, entity.codigoIes) &&
                Objects.equals(this.nombre, entity.nombre) &&
                Objects.equals(this.dni, entity.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoIes, nombre, dni);
    }

}