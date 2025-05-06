package com.alanturing.proyectodaw2425.dominio;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.Nationalized;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "experiencia")
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_experiencia", nullable = false)
    private Integer id;

    @Size(max = 100)
    @Nationalized
    @Column(name = "puesto", length = 100)
    private String puesto;

    @Size(max = 100)
    @Nationalized
    @Column(name = "nombre_empresa", length = 100)
    private String nombreEmpresa;

    @OneToMany(mappedBy = "codigoExperiencia")
    @JsonIgnore
    private Set<ExperienciaEstudiante> experienciaEstudiantes = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public Set<ExperienciaEstudiante> getExperienciaEstudiantes() {
        return experienciaEstudiantes;
    }

    public void setExperienciaEstudiantes(Set<ExperienciaEstudiante> experienciaEstudiantes) {
        this.experienciaEstudiantes = experienciaEstudiantes;
    }

}