package com.example.comun.DTO.BloqueoAnuncios;


import lombok.Data;
import java.time.LocalDate;
import java.util.UUID;

@Data
    public class CreditoUsuarioBloqueoEspecifico {
        private UUID userId;
        private Double monto;
        private String correlationId;
}

