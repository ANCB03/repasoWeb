package com.repaso.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "producto")
public class Producto implements Serializable {
    @Id
    @Column(nullable = false,length = 15)
    private int id_producto;

    @Column(nullable = false,length = 200)
    private String descripcion;

    @Column(nullable = false,length = 10)
    private int cantidad;

    @Column(nullable = false,length = 14)
    private Double precio;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "producto")
    private List<Tienda_Producto> tienda_productos = new ArrayList<>();
}
