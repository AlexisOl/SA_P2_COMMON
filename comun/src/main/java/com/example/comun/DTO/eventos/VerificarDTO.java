package com.example.comun.DTO.eventos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VerificarDTO {

    private UUID id;
    private String correlationId;
}
