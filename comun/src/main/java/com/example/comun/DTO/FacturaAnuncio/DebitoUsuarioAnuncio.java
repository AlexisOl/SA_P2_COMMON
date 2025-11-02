package com.example.comun.DTO.FacturaAnuncio;


import lombok.Data;
import java.time.LocalDate;
import java.util.UUID;

@Data
    public class DebitoUsuarioAnuncio {
        private UUID userId;
        private Double monto;
        private UUID idAnuncio;
        private String motivo;
        private UUID factura;
        private LocalDate fechainicio;
        private LocalDate fechafin;
        private String correlationId;
}

