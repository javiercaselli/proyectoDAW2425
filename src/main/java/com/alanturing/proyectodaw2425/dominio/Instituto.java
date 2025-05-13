package com.alanturing.proyectodaw2425.dominio;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Instituto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoIes;

    private String descripcion;

    private String urlPagina;

    private String telefono;

    private String contrasenia;

    private String email;

    private String localizacion;

    @OneToMany(mappedBy = "instituto")
    private Set<EstudianteCicloInstituto> estudianteCicloInstituto;

    public Set<EstudianteCicloInstituto> getEstudianteCicloInstituto() {
        return estudianteCicloInstituto;
    }

    public void setEstudianteCicloInstituto(Set<EstudianteCicloInstituto> estudianteCicloInstituto) {
        this.estudianteCicloInstituto = estudianteCicloInstituto;
    }

    public Long getCodigoIes() {
        return codigoIes;
    }

    public void setCodigoIes(Long codigoIes) {
        this.codigoIes = codigoIes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrlPagina() {
        return urlPagina;
    }

    public void setUrlPagina(String urlPagina) {
        this.urlPagina = urlPagina;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
}
