package com.example.comun.DTO.PeticionSnackEspecifica;

import lombok.Data;
import java.util.UUID;
@Data
public class VerificarSnackDTO {
    private UUID snackId;
    private String correlationId;
}
