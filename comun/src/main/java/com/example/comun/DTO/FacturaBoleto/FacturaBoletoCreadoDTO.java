package com.example.comun.DTO.FacturaBoleto;


import lombok.Data;

import java.util.UUID;

@Data
    public class FacturaBoletoCreadoDTO {
        private UUID ventaId;
        private UUID usuarioId;
        private UUID funcionId;
        private Double montoTotal;
        private Integer cantidadBoletos;
        private LocalDateTime fechaVenta;
        private String correlationId;
}

