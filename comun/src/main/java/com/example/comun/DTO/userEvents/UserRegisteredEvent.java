package com.example.comun.DTO.userEvents;

public record UserRegisteredEvent(
        String userId,
        String nombre,
        String email
) {}