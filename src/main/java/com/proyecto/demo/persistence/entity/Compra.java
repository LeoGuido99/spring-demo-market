package com.proyecto.demo.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "compras")
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    @Getter @Setter
    private Integer idCompra;

    @Column(name = "id_cliente")
    @Getter @Setter
    private String idCliente;

    @Getter @Setter
    private LocalDateTime fecha;
    @Column(name = "medio_pago")

    @Getter @Setter
    private String medioPago;

    @Getter @Setter
    private String comentario;

    @Getter @Setter
    private String estado;
    @ManyToOne
    @JoinColumn(name = "id_cliente", insertable = false, updatable = false)
    @Getter @Setter
    private Cliente cliente;

    @OneToMany(mappedBy = "compra",cascade = {CascadeType.ALL})
    @Getter @Setter
    private List<ComprasProducto> productos;

}
