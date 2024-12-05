package com.proyecto.ed.ProyectoED.Dao;

import com.proyecto.ed.ProyectoED.Models.Reserva;
import com.proyecto.ed.ProyectoED.Dao.IReservas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ReservaImpl implements IReservas {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void guardarReserva(Reserva reserva) {
        String SQL = "INSERT INTO Reservas (Email, NombreCompleto, FechaReserva, Tipo, CantidadPersonas) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(SQL, reserva.getEmail(), reserva.getNombreCompleto(), reserva.getFechaReserva(),
                reserva.getTipo(), reserva.getCantidadPersonas());
    }
}
