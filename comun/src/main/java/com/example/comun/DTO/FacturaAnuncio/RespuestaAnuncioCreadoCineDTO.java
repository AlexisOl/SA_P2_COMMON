

package com.example.comun.DTO.FacturaAnuncio;


import lombok.Data;
import java.time.LocalDate;
import java.util.UUID;

@Data
    public class RespuestaAnuncioCreadoCineDTO {
        private UUID anuncioId;
        private UUID factura;
        private LocalDate fechainicio;
        private LocalDate fechafin;
        private UUID cineId;
        private double costo;
        private String correlationId;
}
