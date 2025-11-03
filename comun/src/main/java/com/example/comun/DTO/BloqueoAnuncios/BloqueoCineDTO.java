package com.example.comun.DTO.BloqueoAnuncios;


import lombok.Data;
import java.time.LocalDate;
import java.util.UUID;

@Data
    public class BloqueoCineDTO {
        private UUID cine;
        private LocalDate fecha;
        private Long cantidad_dias;
}

