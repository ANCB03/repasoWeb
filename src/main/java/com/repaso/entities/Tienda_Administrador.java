package com.repaso.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
@Entity
@Data
@Table(name = "tienda_administrador")
public class Tienda_Administrador implements Serializable {
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_tienda",insertable = false,updatable = false)
    private Tienda tienda;

    @ManyToOne
    @JoinColumn(name = "documento",insertable = false,updatable = false)
    private Administrador administrador;

}
