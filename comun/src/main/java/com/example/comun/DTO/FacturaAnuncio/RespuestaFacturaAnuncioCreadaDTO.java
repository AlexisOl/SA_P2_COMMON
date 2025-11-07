package com.example.comun.DTO.FacturaAnuncio;

import lombok.Data;

import java.util.UUID;
import java.util.List;
@Data

public class RespuestaFacturaAnuncioCreadaDTO {
      private UUID factura;
      private UUID anuncioId;
      private boolean exito;
      private Double monto;
      private String motivoFallo;
      private String correlationId;
     private List<DiasDescuentoAnunciosBloqueados> dineroCines;
}
