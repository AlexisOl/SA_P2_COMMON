package com.example.comun.DTO.FacturaBoleto;


import lombok.Data;
import java.time.LocalDate;
import java.util.UUID;

@Data
    public class RespuestaFacturaBoletoCreadoDTO {
       private UUID ventaId;
      private boolean exito;
      private String motivoFallo;
      private String correlationId;
}


