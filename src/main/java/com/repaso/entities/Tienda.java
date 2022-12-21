package com.repaso.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "tienda")
public class Tienda implements Serializable {
    @Id
    @Column(nullable = false,length = 15)
    private int id_tienda;

    @Column(nullable = false,length = 30)
    private String nombre;

    @Column(nullable = false,length = 30)
    private String direccion;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tienda")
    private List<Tienda_Administrador> tienda_administradores = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "tienda")
    private List<Tienda_Producto> tienda_productos = new ArrayList<>();
}
