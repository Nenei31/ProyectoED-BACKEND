package com.proyecto.ed.ProyectoED.Models;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reserva {
    private Long reservaId;
    private String email;
    private String nombreCompleto;
    private LocalDateTime fechaReserva;
    private String tipo;
    private int cantidadPersonas;
}
