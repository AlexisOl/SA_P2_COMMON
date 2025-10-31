package com.example.comun.DTO.FacturaBoleto;


import lombok.Data;
import java.time.LocalDate;
import java.util.UUID;

@Data
    public class DebitoUsuario {
        private UUID userId;
        private Double monto;
        private UUID idCine;
        private String motivo;
        private UUID factura;
        private UUID ventaId;
        private String correlationId;
}


