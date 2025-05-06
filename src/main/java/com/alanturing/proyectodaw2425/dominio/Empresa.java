package com.alanturing.proyectodaw2425.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.Nationalized;

@Entity
@Table(name = "empresa")
public class Empresa {
    @Id
    @Size(max = 50)
    @Nationalized
    @Column(name = "CIF", nullable = false, length = 50)
    private String cif;

    @Size(max = 100)
    @NotNull
    @Nationalized
    @Column(name = "direccion", nullable = false, length = 100)
    private String direccion;

    @Size(max = 100)
    @NotNull
    @Nationalized
    @Column(name = "localidad", nullable = false, length = 100)
    private String localidad;

    @Size(max = 100)
    @NotNull
    @Nationalized
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Size(max = 30)
    @NotNull
    @Nationalized
    @Column(name = "nombre_responsable", nullable = false, length = 30)
    private String nombreResponsable;

    @Size(max = 50)
    @NotNull
    @Nationalized
    @Column(name = "apellido1_responsable", nullable = false, length = 50)
    private String apellido1Responsable;

    @Size(max = 50)
    @NotNull
    @Nationalized
    @Column(name = "apellido2_responsable", nullable = false, length = 50)
    private String apellido2Responsable;

    @Size(max = 100)
    @NotNull
    @Nationalized
    @Column(name = "provincia", nullable = false, length = 100)
    private String provincia;

    @Size(max = 100)
    @NotNull
    @Nationalized
    @Column(name = "direccion_sede_practicas", nullable = false, length = 100)
    private String direccionSedePracticas;

    @Size(max = 100)
    @NotNull
    @Nationalized
    @Column(name = "telefono", nullable = false, length = 100)
    private String telefono;

    @Size(max = 100)
    @NotNull
    @Nationalized
    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Size(max = 100)
    @NotNull
    @Nationalized
    @Column(name = "\"contraseña\"", nullable = false, length = 100)
    private String contraseña;

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }

    public String getApellido1Responsable() {
        return apellido1Responsable;
    }

    public void setApellido1Responsable(String apellido1Responsable) {
        this.apellido1Responsable = apellido1Responsable;
    }

    public String getApellido2Responsable() {
        return apellido2Responsable;
    }

    public void setApellido2Responsable(String apellido2Responsable) {
        this.apellido2Responsable = apellido2Responsable;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDireccionSedePracticas() {
        return direccionSedePracticas;
    }

    public void setDireccionSedePracticas(String direccionSedePracticas) {
        this.direccionSedePracticas = direccionSedePracticas;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}