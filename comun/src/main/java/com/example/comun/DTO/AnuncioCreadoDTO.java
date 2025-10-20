

package com.example.comun.DTO;


import lombok.Data;
import java.time.LocalDate;
import java.util.UUID;

@Data
    public class AnuncioCreadoDTO {
        private UUID anuncioId;
        private UUID idCine;
        private UUID usuarioId;
        private double costo;
        private String correlationId;
}