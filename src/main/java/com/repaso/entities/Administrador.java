package com.repaso.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "administrador")
public class Administrador implements Serializable {
    @Id
    @Column(unique = true,length = 15)
    private int documento;

    @Column(nullable = false,length = 50)
    private String nombre;

    @Column(nullable = false,length = 50)
    private String apellido;

    @Column(nullable = false)
    private Date fechaN;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "administrador")
    private List<Tienda_Administrador> tienda_administradores = new ArrayList<>();
}
