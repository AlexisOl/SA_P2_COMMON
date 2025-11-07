package com.example.comun.DTO.boletos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PeliculaDTO {
    private UUID peliculaId;
    private String titulo;
    private Integer duracion;
    private String correlationId;
}
