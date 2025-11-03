package com.example.comun.DTO.FacturaAnuncio;


import lombok.Data;
import java.time.LocalDate;
import java.util.UUID;
import java.util.List;
@Data


public class DiasDescuentoAnunciosBloqueados {
    private UUID cine;
    private Long diasSolapados;
    private Long diasRango ;
    private Long diasCubiertos;
    private Double precio;
    private boolean estado;

}
