package com.proyecto.demo.domain;

import lombok.Getter;
import lombok.Setter;

public class PurchaseItem {
    @Getter @Setter
    private Integer productId;

    @Getter @Setter
    private Integer cuantity;

    @Getter @Setter
    private Integer total;

    @Getter @Setter
    private Boolean active;
}
