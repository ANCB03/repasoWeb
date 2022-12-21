package com.repaso.repository;

import com.repaso.entities.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministradorRepository extends JpaRepository<Administrador,Integer> {
}
