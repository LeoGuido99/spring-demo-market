package com.proyecto.demo.web.controller;

import com.proyecto.demo.domain.dto.AuthenticationRequest;
import com.proyecto.demo.domain.dto.AuthenticationResponse;
import com.proyecto.demo.domain.service.MarketUserDetailsService;
import com.proyecto.demo.web.security.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/auth")
public class AuthController {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private MarketUserDetailsService marketUserDetailsService;
    @Autowired
    private JWTUtil jwtUtil;

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> createToken(@RequestBody AuthenticationRequest authenticationRequest){
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(),
                    authenticationRequest.getPassword()));
            UserDetails userDetails = marketUserDetailsService.loadUserByUsername(authenticationRequest.getUsername());
            String jtw = jwtUtil.generateToken(userDetails);

            return new ResponseEntity<>(new AuthenticationResponse(jtw),HttpStatus.OK);
        } catch (BadCredentialsException e) {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
    }
}
