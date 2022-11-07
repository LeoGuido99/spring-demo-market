package com.proyecto.demo.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    @Getter @Setter
    private Integer idCategoria;

    @Getter @Setter
    private String descripcion;

    @Getter @Setter
    private Boolean estado;

    @Getter @Setter
    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;
}
