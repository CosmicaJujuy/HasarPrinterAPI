package com.ar.dev.tierra.hasar.api.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author PauloGaldo
 */
public class DetalleFactura implements Serializable {

    private int idDetalleFactura;
    private Factura factura;
    private Producto producto;
    private int cantidadDetalle;
    private BigDecimal totalDetalle;
    private BigDecimal descuentoDetalle;
    private boolean estadoDetalle;
    private int usuarioCreacion;
    private Integer usuarioModificacion;
    private Date fechaCreacion;
    private Date fechaModificacion;

    public DetalleFactura() {
    }

    public DetalleFactura(int idDetalleFactura, Factura factura, Producto producto, int cantidadDetalle, BigDecimal totalDetalle, BigDecimal descuentoDetalle, boolean estadoDetalle, int usuarioCreacion, Integer usuarioModificacion, Date fechaCreacion, Date fechaModificacion) {
        this.idDetalleFactura = idDetalleFactura;
        this.factura = factura;
        this.producto = producto;
        this.cantidadDetalle = cantidadDetalle;
        this.totalDetalle = totalDetalle;
        this.descuentoDetalle = descuentoDetalle;
        this.estadoDetalle = estadoDetalle;
        this.usuarioCreacion = usuarioCreacion;
        this.usuarioModificacion = usuarioModificacion;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
    }

    /**
     * @return the idDetalleFactura
     */
    public int getIdDetalleFactura() {
        return idDetalleFactura;
    }

    /**
     * @param idDetalleFactura the idDetalleFactura to set
     */
    public void setIdDetalleFactura(int idDetalleFactura) {
        this.idDetalleFactura = idDetalleFactura;
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
     * @return the producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * @return the cantidadDetalle
     */
    public int getCantidadDetalle() {
        return cantidadDetalle;
    }

    /**
     * @param cantidadDetalle the cantidadDetalle to set
     */
    public void setCantidadDetalle(int cantidadDetalle) {
        this.cantidadDetalle = cantidadDetalle;
    }

    /**
     * @return the totalDetalle
     */
    public BigDecimal getTotalDetalle() {
        return totalDetalle;
    }

    /**
     * @param totalDetalle the totalDetalle to set
     */
    public void setTotalDetalle(BigDecimal totalDetalle) {
        this.totalDetalle = totalDetalle;
    }

    /**
     * @return the descuentoDetalle
     */
    public BigDecimal getDescuentoDetalle() {
        return descuentoDetalle;
    }

    /**
     * @param descuentoDetalle the descuentoDetalle to set
     */
    public void setDescuentoDetalle(BigDecimal descuentoDetalle) {
        this.descuentoDetalle = descuentoDetalle;
    }

    /**
     * @return the estadoDetalle
     */
    public boolean isEstadoDetalle() {
        return estadoDetalle;
    }

    /**
     * @param estadoDetalle the estadoDetalle to set
     */
    public void setEstadoDetalle(boolean estadoDetalle) {
        this.estadoDetalle = estadoDetalle;
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

}
