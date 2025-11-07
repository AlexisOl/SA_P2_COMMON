package com.example.comun.DTO.FacturaBoleto;


import lombok.Data;
import java.time.LocalDate;
import java.util.UUID;
import java.util.List;
@Data
    public class FacturaBoletoCreadoDTO {
        private UUID ventaId;
        private UUID usuarioId;
        private UUID idCine;
        private UUID funcionId;
        private Double montoTotal;
         private List<UUID> ids;
        private Integer cantidadBoletos;
        private LocalDate fechaVenta;
        private String correlationId;
}

