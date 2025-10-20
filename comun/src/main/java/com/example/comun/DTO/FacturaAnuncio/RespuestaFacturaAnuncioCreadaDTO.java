package com.example.comun.DTO.FacturaAnuncio;

import lombok.Data;

import java.util.UUID;

@Data

public class RespuestaFacturaAnuncioCreadaDTO {
    private boolean estado;
    private String correlationId;
}
