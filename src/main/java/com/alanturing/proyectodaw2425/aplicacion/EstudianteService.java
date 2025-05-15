package com.alanturing.proyectodaw2425.aplicacion;

import com.alanturing.proyectodaw2425.dominio.Estudiante;
import com.alanturing.proyectodaw2425.infraestructura.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {
    @Autowired
    private EstudianteRepository estudianteRepository;

    // Obtener todos los estudiantes
    public List<Estudiante> listarEstudiantes() {
        return estudianteRepository.findAll();
    }

    // Crear un nuevo estudiante
    public Estudiante crearEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    // Obtener un estudiante por ID
    public Estudiante buscarEstudiantePorId(String id) {
        return estudianteRepository.findById(id).orElse(null);
    }

    // Actualizar un estudiante
    public Estudiante actualizarEstudiante(String id, Estudiante datosEstudiante) {
        // El primer paso para la edición es localizar la entidad (tupla de BD) a modificar
        Estudiante estudiante = estudianteRepository.findById(id).orElseThrow(() -> new RuntimeException("No existe el estudiante"));

        // Si la tupla existe, modificamos los datos
        if (datosEstudiante.getContrasenia() != null) estudiante.setContrasenia(datosEstudiante.getContrasenia());
        estudiante.setEmail(datosEstudiante.getEmail());
        estudiante.setNombre(datosEstudiante.getNombre());
        estudiante.setApellido1(datosEstudiante.getApellido1());
        estudiante.setApellido2(datosEstudiante.getApellido2());
        estudiante.setCartaPresentacion(datosEstudiante.getCartaPresentacion());
        estudiante.setProvInstituto(datosEstudiante.getProvInstituto());
        estudiante.setDescripcion(datosEstudiante.getDescripcion());
        estudiante.setUrlGithub(datosEstudiante.getUrlGithub());
        estudiante.setUrlLinkedin(datosEstudiante.getUrlLinkedin());
        estudiante.setImgPerfil(datosEstudiante.getImgPerfil());
        estudiante.setCurriculum(datosEstudiante.getCurriculum());
        estudiante.setVideoCv(datosEstudiante.getVideoCv());


        // Salvamos los cambios
        return estudianteRepository.save(estudiante);
    }

    // Eliminar un estudiante por ID
    public void eliminarEstudiante(String id) {
        estudianteRepository.deleteById(id);
    }
}
