

package com.example.comun.DTO.FacturaAnuncio;


import lombok.Data;

import java.util.UUID;

@Data
    public class AnuncioCreadoDTO {
        private UUID anuncioId;
        private UUID idCine;
        private UUID usuarioId;
        private double costo;
        private String correlationId;
}