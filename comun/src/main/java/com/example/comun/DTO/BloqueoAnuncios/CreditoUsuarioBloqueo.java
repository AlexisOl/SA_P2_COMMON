package com.example.comun.DTO.BloqueoAnuncios;


import lombok.Data;
import java.time.LocalDate;
import java.util.UUID;

@Data
    public class CreditoUsuarioBloqueo {
        private List<CreditoUsuarioBloqueoEspecifico> listado;
        private String correlationId;
}
