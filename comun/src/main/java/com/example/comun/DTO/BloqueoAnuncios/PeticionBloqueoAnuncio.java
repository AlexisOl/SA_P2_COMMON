package com.example.comun.DTO.BloqueoAnuncios;


import lombok.Data;
import java.time.LocalDate;
import java.util.UUID;

@Data
    public class PeticionBloqueoAnuncio {
        private UUID anuncio;
        private UUID usuario;
        private LocalDate fechainicio;
        private LocalDate fechafin;
}
