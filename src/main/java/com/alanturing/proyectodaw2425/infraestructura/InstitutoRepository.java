package com.alanturing.proyectodaw2425.infraestructura;

import com.alanturing.proyectodaw2425.dominio.Instituto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InstitutoRepository extends JpaRepository<Instituto, Long> {

    @Query("SELECT i FROM Instituto i WHERE i.email = :email AND i.contrasenia = :password")
    public Optional<Instituto> findByEmailAndPassword(@Param("email") String email, @Param("password") String password);

}
