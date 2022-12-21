package com.repaso.controller;

import com.repaso.entities.Administrador;
import com.repaso.repository.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/administrador")
public class AdministradorController {
    @Autowired
    private AdministradorRepository administradorRepository;

    @ GetMapping()
    public List<Administrador> getAdministradores(){
        return administradorRepository.findAll();
    }
    @GetMapping("/{documento}")
    public Administrador getAdminbyId(@PathVariable Integer documento) {

        Optional<Administrador> administrador = administradorRepository.findById(documento);

        if (administrador.isPresent()) {
            return administrador.get();
        }

        return null;

    }

    @PostMapping
    public Administrador guardar(@RequestBody Administrador administrador) {
        administradorRepository.save(administrador);
        return administrador;
    }

    @DeleteMapping("/{documento}")
    public Administrador deleteDetallesbyId(@PathVariable Integer documento) {

        Optional<Administrador> administrador = administradorRepository.findById(documento);

        if (administrador.isPresent()) {

            Administrador adminReturn = administrador.get();

            administradorRepository.deleteById(documento);

            return adminReturn;
        }

        return null;

    }
}
