package com.alanturing.proyectodaw2425.dominio;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.Nationalized;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "estudiante")
public class Estudiante {
    @Id
    @Size(max = 20)
    @Nationalized
    @Column(name = "DNI", nullable = false, length = 20)
    private String dni;

    @Size(max = 50)
    @NotNull
    @Nationalized
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Size(max = 50)
    @NotNull
    @Nationalized
    @Column(name = "apellido1", nullable = false, length = 50)
    private String apellido1;

    @Size(max = 50)
    @NotNull
    @Nationalized
    @Column(name = "apellido2", nullable = false, length = 50)
    private String apellido2;

    @Size(max = 500)
    @NotNull
    @Nationalized
    @Column(name = "carta_presentacion", nullable = false, length = 500)
    private String cartaPresentacion;

    @Size(max = 50)
    @NotNull
    @Nationalized
    @Column(name = "prov_instituto", nullable = false, length = 50)
    private String provInstituto;

    @Size(max = 1000)
    @Nationalized
    @Column(name = "descripcion", length = 1000)
    private String descripcion;

    @Size(max = 1000)
    @Nationalized
    @Column(name = "URL_linkedin", length = 1000)
    private String urlLinkedin;

    @Size(max = 1000)
    @Nationalized
    @Column(name = "URL_github", length = 1000)
    private String urlGithub;

    @Size(max = 100)
    @NotNull
    @Nationalized
    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Size(max = 1000)
    @Nationalized
    @Column(name = "img_perfil", length = 1000)
    private String imgPerfil;

    @Size(max = 1000)
    @NotNull
    @Nationalized
    @Column(name = "curriculum", nullable = false, length = 1000)
    private String curriculum;

    @Size(max = 1000)
    @NotNull
    @Nationalized
    @Column(name = "video_cv", nullable = false, length = 1000)
    private String videoCv;

    @ManyToMany
    @JoinTable(name = "proyecto_personal_estudiante",
            joinColumns = @JoinColumn(name = "DNI"),
            inverseJoinColumns = @JoinColumn(name = "codigo_proyecto"))
    @JsonIgnore
    private Set<ProyectoPersonal> proyectoPersonals = new LinkedHashSet<>();

    @OneToMany(mappedBy = "estudiante")
    @JsonIgnore
    private Set<IdiomaEstudiante> idiomasEstudiantes;

    @OneToMany(mappedBy = "estudiante")
    @JsonIgnore
    private Set<CertificacionEstudiante> certificacionesEstudiantes;

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

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getCartaPresentacion() {
        return cartaPresentacion;
    }

    public void setCartaPresentacion(String cartaPresentacion) {
        this.cartaPresentacion = cartaPresentacion;
    }

    public String getProvInstituto() {
        return provInstituto;
    }

    public void setProvInstituto(String provInstituto) {
        this.provInstituto = provInstituto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrlLinkedin() {
        return urlLinkedin;
    }

    public void setUrlLinkedin(String urlLinkedin) {
        this.urlLinkedin = urlLinkedin;
    }

    public String getUrlGithub() {
        return urlGithub;
    }

    public void setUrlGithub(String urlGithub) {
        this.urlGithub = urlGithub;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImgPerfil() {
        return imgPerfil;
    }

    public void setImgPerfil(String imgPerfil) {
        this.imgPerfil = imgPerfil;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }

    public String getVideoCv() {
        return videoCv;
    }

    public void setVideoCv(String videoCv) {
        this.videoCv = videoCv;
    }

    public Set<ProyectoPersonal> getProyectoPersonals() {
        return proyectoPersonals;
    }

    public void setProyectoPersonals(Set<ProyectoPersonal> proyectoPersonals) {
        this.proyectoPersonals = proyectoPersonals;
    }
    public Set<IdiomaEstudiante> getIdiomasEstudiantes() {
        return idiomasEstudiantes;
    }

    public void setIdiomasEstudiantes(Set<IdiomaEstudiante> idiomasEstudiantes) {
        this.idiomasEstudiantes = idiomasEstudiantes;
    }

    public Set<CertificacionEstudiante> getCertificacionesEstudiantes() {
        return certificacionesEstudiantes;
    }

    public void setCertificacionesEstudiantes(Set<CertificacionEstudiante> certificacionesEstudiantes) {
        this.certificacionesEstudiantes = certificacionesEstudiantes;
    }


}