package com.example.comun.DTO.boletos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HorarioDTO {
    private UUID funcionId;
    private UUID peliculaId;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private String idioma;
    private String formato;
    private String correlationId;
}
