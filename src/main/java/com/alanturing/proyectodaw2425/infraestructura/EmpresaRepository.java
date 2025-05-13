package com.alanturing.proyectodaw2425.infraestructura;

import com.alanturing.proyectodaw2425.dominio.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, String> {

    @Query("SELECT em FROM Empresa em WHERE em.email = :email AND em.contrasenia = :password")
    public Optional<Empresa> findByEmailAndPassword(@Param("email") String email, @Param("password") String password);

}
