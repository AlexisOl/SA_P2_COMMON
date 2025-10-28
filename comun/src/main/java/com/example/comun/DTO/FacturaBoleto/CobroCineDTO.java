package com.example.comun.DTO.FacturaBoleto;


import lombok.Data;
import java.time.LocalDate;
import java.util.UUID;

@Data
    public class CobroCineDTO {
      private UUID idCine;
      private double costo;
      private String correlationId;
}


