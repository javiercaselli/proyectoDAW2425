package com.alanturing.proyectodaw2425.web;

import com.alanturing.proyectodaw2425.aplicacion.InstitutoService;
import com.alanturing.proyectodaw2425.dominio.Instituto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/instituto")
@CrossOrigin(origins = "*")
public class InstitutoControlador {
    @Autowired
    private InstitutoService institutoService;

    // Endpoint para obtener todos los institutos
    @GetMapping("/listar")
    public List<Instituto> obtenerInstitutos() {
        return institutoService.listarInstitutos();
    }

    // Endpoint para crear un nuevo instituto
    @PostMapping("/crear")
    public Instituto crearInstituto(@RequestBody Instituto instituto) {
        return institutoService.crearInstituto(instituto);
    }

    // Endpoint para buscar institutos por su ID
    @GetMapping("obtener/{id}")
    public Instituto obtenerInstituto(@PathVariable Long id) {
        return institutoService.buscarInstitutoPorId(id);
    }

    // Endpoint para actualizar instituto existente
    @PutMapping("actualizar/{id}")
    public Instituto actualizarInstituto(@PathVariable Long id, @RequestBody Instituto instituto) {
        return institutoService.actualizarInstituto(id, instituto);
    }

    // Endpoint para eliminar un instituto existente
    @DeleteMapping("eliminar/{id}")
    public String eliminarInstituto(@PathVariable Long id) {
        institutoService.eliminarInstituto(id);
        return "Instituto eliminado";
    }


}
