package com.alanturing.proyectodaw2425.web;

import com.alanturing.proyectodaw2425.dominio.Estudiante;
import com.alanturing.proyectodaw2425.dominio.Instituto;
import com.alanturing.proyectodaw2425.infraestructura.EstudianteRepository;
import com.alanturing.proyectodaw2425.infraestructura.InstitutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class LoginController {

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Autowired
    private InstitutoRepository institutoRepository;

    @PostMapping("/loginEstudiante")
    public ResponseEntity<?> loginEstudiante(@RequestBody Estudiante loginRequest) {
        return estudianteRepository.findByEmailAndPassword(
                        loginRequest.getEmail(),
                        loginRequest.getContrasenia())
                .map(estudiante -> ResponseEntity.ok().body(estudiante))
                .orElse(ResponseEntity.badRequest().build());
    }

    @PostMapping("/loginInstituto")
    public ResponseEntity<?> loginInstituto(@RequestBody Instituto loginRequest) {
        return institutoRepository.findByEmailAndPassword(
                        loginRequest.getEmail(),
                        loginRequest.getContrasenia())
                .map(estudiante -> ResponseEntity.ok().body(estudiante))
                .orElse(ResponseEntity.badRequest().build());
    }

    @PostMapping("/loginEmpresa")
    public ResponseEntity<?> loginEmpresa(@RequestBody Estudiante loginRequest) {
        return estudianteRepository.findByEmailAndPassword(
                        loginRequest.getEmail(),
                        loginRequest.getContrasenia())
                .map(estudiante -> ResponseEntity.ok().body(estudiante))
                .orElse(ResponseEntity.badRequest().build());
    }
}
