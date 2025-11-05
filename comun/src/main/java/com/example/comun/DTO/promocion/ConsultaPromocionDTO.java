package com.example.comun.DTO.promocion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsultaPromocionDTO {
    private UUID cineId;
    private UUID salaId;
    private UUID peliculaId;
    private UUID clienteId;
    private String tipo; // BOLETOS, SNACKS, AMBOS
    private String correlationId;
}
