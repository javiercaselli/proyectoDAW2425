package com.alanturing.proyectodaw2425.infraestructura;

import com.alanturing.proyectodaw2425.dominio.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
}
