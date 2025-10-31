package com.example.comun.DTO.FacturaBoleto.DebitoCine;


import lombok.Data;
import java.time.LocalDate;
import java.util.UUID;

@Data
    public class DebitoCineDTO {
        private Double monto;
        private String correlationId;
         private UUID idCine;
}

