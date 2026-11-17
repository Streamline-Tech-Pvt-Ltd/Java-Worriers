package com.streamlinetech.dr_recovery.security;

import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.Claims;

import java.util.Base64;

@Service
public class JwtService {

    private final SecretKey secretKey;

    @Value("${jwt.expiration}")
    private long expiration;

    public JwtService(
        @Value("${jwt.secret}") String secret) {

        byte[] keyBytes = Base64.getDecoder()
                .decode(secret);

        this.secretKey = Keys.hmacShaKeyFor(keyBytes);
    }

    public String generateToken(String username) {

        return Jwts.builder()
                .subject(username)
                .issuedAt(new Date())
                .expiration(
                    new Date(System.currentTimeMillis()
                            + expiration))
                .signWith(secretKey)
                .compact();
    }

    public String extractUsername(String token) {
        return extractClaims(token).getSubject();
    }

    public boolean validateToken(String token,
                                 String username) {

        String tokenUsername = extractUsername(token);

        return tokenUsername.equals(username)
                && extractClaims(token)
                   .getExpiration().after(new Date());
    }

    private Claims extractClaims(String token) {

        return Jwts.parser()
                .verifyWith(secretKey)
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }
}