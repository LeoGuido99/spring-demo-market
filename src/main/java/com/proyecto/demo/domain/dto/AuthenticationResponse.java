package com.proyecto.demo.domain.dto;

import lombok.Getter;
import lombok.Setter;

public class AuthenticationResponse {
    @Getter @Setter
    private String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }
}
