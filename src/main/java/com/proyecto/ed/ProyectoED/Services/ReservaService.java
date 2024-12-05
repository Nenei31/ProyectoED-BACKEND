package com.proyecto.ed.ProyectoED.Services;

import com.proyecto.ed.ProyectoED.Dao.IReservas;
import com.proyecto.ed.ProyectoED.Models.Reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaService {

    @Autowired
    IReservas iReservas;

    public void guardarReserva(Reserva reserva){
        iReservas.guardarReserva(reserva);
    }
}
