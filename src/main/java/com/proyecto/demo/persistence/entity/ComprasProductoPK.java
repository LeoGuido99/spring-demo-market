package com.proyecto.demo.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ComprasProductoPK implements Serializable {
    @Column(name = "id_compra")
    @Getter @Setter
    private Integer idCompra;

    @Column(name = "id_producto")
    @Getter @Setter
    private Integer idProducto;
}
