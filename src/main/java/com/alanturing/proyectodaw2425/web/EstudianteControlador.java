package com.alanturing.proyectodaw2425.web;

import com.alanturing.proyectodaw2425.aplicacion.EstudianteService;
import com.alanturing.proyectodaw2425.dominio.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiante")
@CrossOrigin(origins = "*")
public class EstudianteControlador {
    @Autowired
    private EstudianteService estudianteService;

    // Endpoint para obtener todos los estudiantes
    @GetMapping("/listar")
    public List<Estudiante> obtenerEstudiantes() {
        return estudianteService.listarEstudiantes();
    }

    // Endpoint para crear un nuevo estudiante
    @PostMapping("/crear")
    public Estudiante crearEstudiante(@RequestBody Estudiante estudiante) {
        return estudianteService.crearEstudiante(estudiante);
    }

    // Endpoint para buscar estudiantes por su ID
    @GetMapping("obtener/{id}")
    public Estudiante obtenerEstudiante(@PathVariable String id) {
        return estudianteService.buscarEstudiantePorId(id);
    }

    // Endpoint para actualizar estudiante existente
    @PutMapping("actualizar/{id}")
    public Estudiante actualizarEstudiante(@PathVariable String id, @RequestBody Estudiante estudiante) {
        return estudianteService.actualizarEstudiante(id, estudiante);
    }

    // Endpoint para eliminar un estudiante existente
    @DeleteMapping("eliminar/{id}")
    public String eliminarEstudiante(@PathVariable String id) {
        estudianteService.eliminarEstudiante(id);
        return "Estudiante eliminado";
    }


}
