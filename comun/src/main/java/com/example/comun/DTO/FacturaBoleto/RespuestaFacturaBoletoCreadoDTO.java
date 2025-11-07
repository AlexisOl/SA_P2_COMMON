package com.example.comun.DTO.FacturaBoleto;


import lombok.Data;
import java.time.LocalDate;
import java.util.UUID;
import java.util.List;

@Data
    public class RespuestaFacturaBoletoCreadoDTO {
      private UUID factura;
      private UUID ventaId;
      private boolean exito;
      private List<UUID> ids;
      private String motivoFallo;
      private String correlationId;
}


