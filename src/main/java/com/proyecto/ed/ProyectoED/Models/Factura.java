package com.proyecto.ed.ProyectoED.Models;
import java.math.BigDecimal;


public class Factura {
    private Integer IDFactura;
    private String numeroDocumento;
    private Integer IDTipoDocumento;
    private BigDecimal montoTotal;
    private BigDecimal descuentoDocumento;
    private BigDecimal subTotalDocumento;
    private Integer IDMetodoPago;
    private String direccionEntrega;
    private String observacionesDocumento;

    public Factura(){

    }

    public Factura(String numeroDocumento, Integer IDTipoDocumento, BigDecimal montoTotal, BigDecimal descuentoDocumento, BigDecimal subTotalDocumento, Integer IDMetodoPago, String direccionEntrega, String observacionesDocumento) {
        this.numeroDocumento = numeroDocumento;
        this.IDTipoDocumento = IDTipoDocumento;
        this.montoTotal = montoTotal;
        this.descuentoDocumento = descuentoDocumento;
        this.subTotalDocumento = subTotalDocumento;
        this.IDMetodoPago = IDMetodoPago;
        this.direccionEntrega = direccionEntrega;
        this.observacionesDocumento = observacionesDocumento;
    }

    public Integer getIDFactura() {
        return IDFactura;
    }

    public void setIDFactura(Integer IDFactura) {
        this.IDFactura = IDFactura;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Integer getIDTipoDocumento() {
        return IDTipoDocumento;
    }

    public void setIDTipoDocumento(Integer IDTipoDocumento) {
        this.IDTipoDocumento = IDTipoDocumento;
    }

    public BigDecimal getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(BigDecimal montoTotal) {
        this.montoTotal = montoTotal;
    }

    public BigDecimal getDescuentoDocumento() {
        return descuentoDocumento;
    }

    public void setDescuentoDocumento(BigDecimal descuentoDocumento) {
        this.descuentoDocumento = descuentoDocumento;
    }

    public BigDecimal getSubTotalDocumento() {
        return subTotalDocumento;
    }

    public void setSubTotalDocumento(BigDecimal subTotalDocumento) {
        this.subTotalDocumento = subTotalDocumento;
    }

    public Integer getIDMetodoPago() {
        return IDMetodoPago;
    }

    public void setIDMetodoPago(Integer IDMetodoPago) {
        this.IDMetodoPago = IDMetodoPago;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public String getObservacionesDocumento() {
        return observacionesDocumento;
    }

    public void setObservacionesDocumento(String observacionesDocumento) {
        this.observacionesDocumento = observacionesDocumento;
    }
}

