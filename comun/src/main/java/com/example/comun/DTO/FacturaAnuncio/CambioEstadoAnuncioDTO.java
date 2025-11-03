package com.example.comun.DTO.FacturaAnuncio;


import lombok.Data;
import java.time.LocalDate;
import java.util.UUID;
import java.util.List;
@Data

public class CambioEstadoAnuncioDTO {
    private UUID anuncioId;
    private String motivoFallo;
    private String correlationId;
}
