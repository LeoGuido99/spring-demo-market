package com.proyecto.demo.persistence.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @Column(name = "id")
    @Getter@Setter
    private String idCliente;

    @Getter@Setter
    private String nombre;

    @Getter@Setter
    private String apellidos;

    @Getter@Setter
    private BigDecimal celular;

    @Getter@Setter
    private String direccion;

    @Column(name = "correo_electronico")
    @Getter@Setter
    private String correoElectronico;

    @OneToMany(mappedBy = "cliente")
    @Getter@Setter
    private List<Compra> compras;

}
