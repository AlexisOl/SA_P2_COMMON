package com.example.comun.DTO.eventos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VerificarRespuestaDTO {

    private boolean existe;
    private String correlationId;
}
