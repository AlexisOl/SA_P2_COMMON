package com.example.comun.DTO.DW;


import lombok.Data;
import java.time.LocalDate;
import java.util.UUID;
import java.util.List;
@Data
    public class ListadoFacturadoAnuncio {
        private List<ReplicacionFacturaAnuncioDTO> listado;
}
