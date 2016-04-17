package com.ar.dev.tierra.hasar.api.model;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 * @author PauloGaldo
 */
public class MedioPago implements Serializable {

    private int idMedioPago;
    private String nombrePago;
    private boolean estado;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private int usuarioCreacion;
    private Integer usuarioModificacion;

    public MedioPago() {
    }

    public MedioPago(int idMedioPago, String nombrePago, boolean estado, Date fechaCreacion, int usuarioCreacion) {
        this.idMedioPago = idMedioPago;
        this.nombrePago = nombrePago;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.usuarioCreacion = usuarioCreacion;
    }

    public MedioPago(int idMedioPago, String nombrePago, boolean estado, Date fechaCreacion, Date fechaModificacion, int usuarioCreacion, Integer usuarioModificacion) {
        this.idMedioPago = idMedioPago;
        this.nombrePago = nombrePago;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.usuarioCreacion = usuarioCreacion;
        this.usuarioModificacion = usuarioModificacion;
    }

    /**
     * @return the idMedioPago
     */
    public int getIdMedioPago() {
        return idMedioPago;
    }

    /**
     * @param idMedioPago the idMedioPago to set
     */
    public void setIdMedioPago(int idMedioPago) {
        this.idMedioPago = idMedioPago;
    }

    /**
     * @return the nombrePago
     */
    public String getNombrePago() {
        return nombrePago;
    }

    /**
     * @param nombrePago the nombrePago to set
     */
    public void setNombrePago(String nombrePago) {
        this.nombrePago = nombrePago;
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

}
