package com.example.comun.DTO.FacturaBoleto;


import lombok.Data;
import java.time.LocalDate;
import java.util.UUID;
import java.util.List;

@Data
    public class FacturaSnackCreadaDTO {
        private UUID ventaId;
        private UUID usuarioId;
        private UUID idCine;
        private UUID ventaSnackId;
        private List<DetalleSnackDTO> detalleSnacks;
        private String correlationId;
}

