package com.proyecto.ed.ProyectoED.Controllers;

import com.proyecto.ed.ProyectoED.Models.Reserva;
import com.proyecto.ed.ProyectoED.Services.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/reservas")
public class ReservaController {
    @Autowired
    private ReservaService reservaService;
    @PostMapping
    public ResponseEntity<String> guardarProducto(@RequestParam("email") String email,
                                                  @RequestParam("nombreCompleto") String nombreCompleto,
                                                  @RequestParam("fechaReserva") LocalDateTime fechaReserva,
                                                  @RequestParam("tipo") String tipo,
                                                  @RequestParam("cantidadPersonas") Integer cantidadPersonas) {
        Reserva reserva = new Reserva();
        reserva.setEmail(email);
        reserva.setFechaReserva(fechaReserva);
        reserva.setNombreCompleto(nombreCompleto);
        reserva.setTipo(tipo);
        reserva.setCantidadPersonas(cantidadPersonas);

        reservaService.guardarReserva(reserva);
        return ResponseEntity.status(HttpStatus.CREATED).body("Reserva guardada correctamente");
    }

    @GetMapping
    public String view() {
        return "hello world";
    }
}
