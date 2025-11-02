package com.example.comun.DTO.FacturaAnuncio;


import lombok.Data;
import java.time.LocalDate;
import java.util.UUID;

@Data
    public class PagoCines {
        private UUID anuncioId;
        private UUID usuarioId;
        private UUID cindeId;
        private LocalDate fechainicio;
        private LocalDate fechafin;
        private double costo;
        private String correlationId;
}
