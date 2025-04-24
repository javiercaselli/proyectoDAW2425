package com.alanturing.proyectodaw2425.web;

import com.alanturing.proyectodaw2425.aplicacion.EmpleadoService;
import com.alanturing.proyectodaw2425.dominio.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empleado")
public class EmpleadoController {
    @Autowired
    EmpleadoService empleadoService;

    // Endpoint para obtener todos los institutos
    @GetMapping("/listar")
    public List<Empleado> obtenerEmpleados() {
        List<Empleado> empleados = empleadoService.listarEmpleados();
        return empleados;
    }

    // Endpoint para crear un nuevo instituto
    @PostMapping("/crear")
    public Empleado crearEmpleado(@RequestBody Empleado empleado) {
        return empleadoService.crearEmpleado(empleado);
    }

    // Endpoint para buscar institutos por su ID
    @GetMapping("obtener/{id}")
    public Empleado obtenerEmpleado(@PathVariable Integer id) {
        return empleadoService.buscarEmpleadoPorId(id);
    }
/*
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
*/
}
