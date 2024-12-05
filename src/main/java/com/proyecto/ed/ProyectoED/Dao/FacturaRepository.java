package com.proyecto.ed.ProyectoED.Dao;

import com.proyecto.ed.ProyectoED.Models.Factura;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FacturaRepository {

    private final JdbcTemplate jdbcTemplate;

    // Constructor para inyección de dependencia
    public FacturaRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Factura> getAllFacturas() {
        String sql = "SELECT * FROM Factura";
        return jdbcTemplate.query(sql, mapFacturaFromResultSet());
    }

    public Factura getFacturaById(int idFactura) {
        String sql = "SELECT * FROM Factura WHERE IDFactura = ?";
        return jdbcTemplate.queryForObject(sql, mapFacturaFromResultSet(), idFactura);
    }

    public void saveFactura(Factura factura) {
        String sql = "INSERT INTO Factura (numeroDocumento, IDTipoDocumento, montoTotal, descuentoDocumento, subTotalDocumento, IDMetodoPago, direccionEntrega, observacionesDocumento) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, factura.getNumeroDocumento(),
                factura.getIDTipoDocumento(),
                factura.getMontoTotal(),
                factura.getDescuentoDocumento(),
                factura.getSubTotalDocumento(),
                factura.getIDMetodoPago(),
                factura.getDireccionEntrega(),
                factura.getObservacionesDocumento());
    }

    private RowMapper<Factura> mapFacturaFromResultSet() {
        return (rs, rowNum) -> new Factura(
                rs.getString("numeroDocumento"),
                rs.getInt("IDTipoDocumento"),
                rs.getBigDecimal("montoTotal"),
                rs.getBigDecimal("descuentoDocumento"),
                rs.getBigDecimal("subTotalDocumento"),
                rs.getInt("IDMetodoPago"),
                rs.getString("direccionEntrega"),
                rs.getString("observacionesDocumento")
        );
    }
}
