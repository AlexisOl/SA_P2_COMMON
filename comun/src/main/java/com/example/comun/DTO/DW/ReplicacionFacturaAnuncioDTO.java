package com.example.comun.DTO.DW;


import lombok.Data;
import java.time.LocalDate;
import java.util.UUID;
import java.util.List;
@Data
public class ReplicacionFacturaAnuncioDTO {
    private UUID id;
    private UUID anuncio;
    private UUID usuario;
    private Double monto;
    private LocalDate fecha;
    private String estado;
    private String detalle;
    private UUID cine;
}
