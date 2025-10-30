package com.example.comun.DTO.FacturaBoleto;


import lombok.Data;
import java.time.LocalDate;
import java.util.UUID;
import java.util.List;

@Data
public class DetalleSnackDTO {
    private UUID snackId;
    private Integer cantidad;
    private Double subtotal;
    private LocalDate fechaVenta;
}
