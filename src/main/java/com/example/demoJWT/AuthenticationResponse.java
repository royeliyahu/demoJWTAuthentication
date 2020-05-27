package com.example.demoJWT;

public class AuthenticationResponse {

    private final String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public AuthenticationResponse() {
        this.jwt = new String();
    }

    public String getJwt() {
        return jwt;
    }
}
