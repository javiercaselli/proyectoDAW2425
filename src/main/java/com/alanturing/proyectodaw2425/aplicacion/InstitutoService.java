package com.alanturing.proyectodaw2425.aplicacion;

import com.alanturing.proyectodaw2425.dominio.Instituto;
import com.alanturing.proyectodaw2425.infraestructura.InstitutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstitutoService {
    @Autowired
    private InstitutoRepository institutoRepository;

    // Obtener todos los institutos
    public List<Instituto> listarInstitutos() {
        return institutoRepository.findAll();
    }

    // Crear un nuevo instituto
    public Instituto crearInstituto(Instituto instituto) {
        return institutoRepository.save(instituto);
    }

    // Obtener un instituto por ID
    public Instituto buscarInstitutoPorId(Long id) {
        return institutoRepository.findById(id).orElse(null);
    }

    // Actualizar un instituto
    public Instituto actualizarInstituto(Long id, Instituto datosInstituto) {
        // El primer paso para la edición es localizar la entidad (tupla de BD) a modificar
        Instituto instituto = institutoRepository.findById(id).orElseThrow(() -> new RuntimeException("No existe el instituto"));

        // Si la tupla existe, modificamos los datos
        instituto.setContrasenia(datosInstituto.getContrasenia());
        instituto.setEmail(datosInstituto.getEmail());
        instituto.setLocalizacion(datosInstituto.getLocalizacion());
        instituto.setTelefono(datosInstituto.getTelefono());
        instituto.setDescripcion(datosInstituto.getDescripcion());
        instituto.setUrlPagina(datosInstituto.getUrlPagina());

        // Salvamos los cambios
        return institutoRepository.save(instituto);
    }

    // Eliminar un instituto por ID
    public void eliminarInstituto(Long id) {
        institutoRepository.deleteById(id);
    }
}
