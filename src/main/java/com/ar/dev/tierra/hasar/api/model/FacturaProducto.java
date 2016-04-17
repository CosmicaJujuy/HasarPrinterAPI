package com.ar.dev.tierra.hasar.api.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author PauloGaldo
 */
public class FacturaProducto implements Serializable {

    private int idFacturaProducto;
    private Proveedor proveedor;
    private BigDecimal monto;
    private Date fechaFactura;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private int usuarioCreacion;
    private Integer usuarioModificacion;
    private boolean estado;
    private String observaciones;
    private String estadoLocal;
    private String numeroFactura;
    private boolean carga;

    public FacturaProducto() {
    }

    public FacturaProducto(int idFacturaProducto, Proveedor proveedor, BigDecimal monto, Date fechaFactura, Date fechaCreacion, Date fechaModificacion, int usuarioCreacion, Integer usuarioModificacion, boolean estado, String observaciones, String estadoLocal, String numeroFactura, boolean carga) {
        this.idFacturaProducto = idFacturaProducto;
        this.proveedor = proveedor;
        this.monto = monto;
        this.fechaFactura = fechaFactura;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.usuarioCreacion = usuarioCreacion;
        this.usuarioModificacion = usuarioModificacion;
        this.estado = estado;
        this.observaciones = observaciones;
        this.estadoLocal = estadoLocal;
        this.numeroFactura = numeroFactura;
        this.carga = carga;
    }

    /**
     * @return the proveedor
     */
    public Proveedor getProveedor() {
        return proveedor;
    }

    /**
     * @param proveedor the proveedor to set
     */
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    /**
     * @return the monto
     */
    public BigDecimal getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    /**
     * @return the fechaFactura
     */
    public Date getFechaFactura() {
        return fechaFactura;
    }

    /**
     * @param fechaFactura the fechaFactura to set
     */
    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
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
     * @return the observaciones
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * @param observaciones the observaciones to set
     */
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    /**
     * @return the estadoLocal
     */
    public String getEstadoLocal() {
        return estadoLocal;
    }

    /**
     * @param estadoLocal the estadoLocal to set
     */
    public void setEstadoLocal(String estadoLocal) {
        this.estadoLocal = estadoLocal;
    }

    /**
     * @return the numeroFactura
     */
    public String getNumeroFactura() {
        return numeroFactura;
    }

    /**
     * @param numeroFactura the numeroFactura to set
     */
    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    /**
     * @return the idFacturaProducto
     */
    public int getIdFacturaProducto() {
        return idFacturaProducto;
    }

    /**
     * @param idFacturaProducto the idFacturaProducto to set
     */
    public void setIdFacturaProducto(int idFacturaProducto) {
        this.idFacturaProducto = idFacturaProducto;
    }

    /**
     * @return the carga
     */
    public boolean isCarga() {
        return carga;
    }

    /**
     * @param carga the carga to set
     */
    public void setCarga(boolean carga) {
        this.carga = carga;
    }

}
