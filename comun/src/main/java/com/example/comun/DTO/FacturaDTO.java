

package com.example.comun.DTO;


import lombok.Data;
import java.time.LocalDate;
@Data
public class FacturaDTO {
    private Long id;
    private LocalDate fecha;
    private Double monto;
    private Long idUsuario;
    private Long idAnuncio;
}