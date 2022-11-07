package com.proyecto.demo.domain;

import lombok.Getter;
import lombok.Setter;

public class Category {
    @Getter @Setter
    private int categoryId;
    @Getter @Setter
    private String category;
    @Setter
    private boolean active;
    public boolean isActive() {
        return active;
    }
}
