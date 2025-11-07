package com.example.comun.DTO.userEvents;

import java.time.Instant;

public record PasswordResetRequestedEventDto(
        String userId,
        String email,
        String nombre,
        String token,
        String link,
        Instant expiresAt
) {}
