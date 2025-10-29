package com.example.comun.DTO.FacturaBoleto;


import lombok.Data;
import java.time.LocalDate;
import java.util.UUID;

@Data
    public class DebitoUsuario {
        private UUID userId;
        private Double monto;
        private String motivo;
        private UUID funcionId;
        private LocalDate fechaVenta;
        private String correlationId;
}


