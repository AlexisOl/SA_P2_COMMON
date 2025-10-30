package com.example.comun.DTO.PeticionSnackEspecifica;


import lombok.Data;
import java.time.LocalDate;
import java.util.UUID;

@Data
public class SnackDTO {
    private UUID id;
    private String nombre;
    private Double precio;
    private boolean existe;
    private String correlationId;
}
