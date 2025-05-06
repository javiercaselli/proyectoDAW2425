package com.alanturing.proyectodaw2425.dominio;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.Nationalized;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ciclo")
public class Ciclo {
    @Id
    @Size(max = 50)
    @Nationalized
    @Column(name = "nombre", nullable = false, length = 50)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nombre;

    @NotNull
    @Column(name = "ID", nullable = false)
    private Integer id;

    @OneToMany(mappedBy = "ciclo")
    @JsonIgnore
    private Set<EstudianteCicloInstituto> estudianteCicloInstitutos = new LinkedHashSet<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<EstudianteCicloInstituto> getEstudianteCicloInstitutos() {
        return estudianteCicloInstitutos;
    }

    public void setEstudianteCicloInstitutos(Set<EstudianteCicloInstituto> estudianteCicloInstitutos) {
        this.estudianteCicloInstitutos = estudianteCicloInstitutos;
    }

}