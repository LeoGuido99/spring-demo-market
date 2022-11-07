package com.proyecto.demo.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_producto")
    @Getter @Setter
    private Integer idProducto;

    @Getter @Setter
    private String nombre;

    @Column(name="id_categoria")
    @Getter @Setter
    private Integer idCategoria;

    @Column(name="codigo_barras")
    @Getter @Setter
    private String codigoBarras;

    @Column(name="precio_venta")
    @Getter @Setter
    private Double precioVenta;

    @Column(name="cantidad_stock")
    @Getter @Setter
    private Integer cantidadStock;

    @Getter @Setter
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_categoria",insertable = false,updatable = false)
    @Getter @Setter
    private Categoria categoria;

}
