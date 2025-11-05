package com.example.comun.DTO.promocion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PromocionDTO {
    private UUID promocionId;
    private String nombre;
    private Double porcentajeDescuento;
    private Boolean activa;
    private Boolean existe;
}
