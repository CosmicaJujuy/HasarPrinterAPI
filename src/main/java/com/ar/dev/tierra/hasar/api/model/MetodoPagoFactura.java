package com.ar.dev.tierra.hasar.api.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author PauloGaldo
 */
public class MetodoPagoFactura implements Serializable {

    private int idMetodoPagoFactura;
    private PlanPago planPago;
    private Factura factura;
    private BigDecimal montoPago;
    private String comprobante;
    private boolean estado;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private int usuarioCreacion;
    private Integer usuarioModificacion;

    public MetodoPagoFactura() {
    }

    public MetodoPagoFactura(int idMetodoPagoFactura, PlanPago planPago, Factura factura, BigDecimal montoPago, String comprobante, boolean estado, Date fechaCreacion, Date fechaModificacion, int usuarioCreacion, Integer usuarioModificacion) {
        this.idMetodoPagoFactura = idMetodoPagoFactura;
        this.planPago = planPago;
        this.factura = factura;
        this.montoPago = montoPago;
        this.comprobante = comprobante;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.usuarioCreacion = usuarioCreacion;
        this.usuarioModificacion = usuarioModificacion;
    }

    /**
     * @return the idMetodoPagoFactura
     */
    public int getIdMetodoPagoFactura() {
        return idMetodoPagoFactura;
    }

    /**
     * @param idMetodoPagoFactura the idMetodoPagoFactura to set
     */
    public void setIdMetodoPagoFactura(int idMetodoPagoFactura) {
        this.idMetodoPagoFactura = idMetodoPagoFactura;
    }

    /**
     * @return the factura
     */
    public Factura getFactura() {
        return factura;
    }

    /**
     * @param factura the factura to set
     */
    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    /**
     * @return the planPago
     */
    public PlanPago getPlanPago() {
        return planPago;
    }

    /**
     * @param planPago the planPago to set
     */
    public void setPlanPago(PlanPago planPago) {
        this.planPago = planPago;
    }

    /**
     * @return the montoPago
     */
    public BigDecimal getMontoPago() {
        return montoPago;
    }

    /**
     * @param montoPago the montoPago to set
     */
    public void setMontoPago(BigDecimal montoPago) {
        this.montoPago = montoPago;
    }

    /**
     * @return the estado
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * @return the fechaCreacion
     */
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * @param fechaCreacion the fechaCreacion to set
     */
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * @return the fechaModificacion
     */
    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    /**
     * @param fechaModificacion the fechaModificacion to set
     */
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    /**
     * @return the usuarioCreacion
     */
    public int getUsuarioCreacion() {
        return usuarioCreacion;
    }

    /**
     * @param usuarioCreacion the usuarioCreacion to set
     */
    public void setUsuarioCreacion(int usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    /**
     * @return the usuarioModificacion
     */
    public Integer getUsuarioModificacion() {
        return usuarioModificacion;
    }

    /**
     * @param usuarioModificacion the usuarioModificacion to set
     */
    public void setUsuarioModificacion(Integer usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    /**
     * @return the comprobante
     */
    public String getComprobante() {
        return comprobante;
    }

    /**
     * @param comprobante the comprobante to set
     */
    public void setComprobante(String comprobante) {
        this.comprobante = comprobante;
    }

}
