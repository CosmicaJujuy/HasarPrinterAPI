package com.ar.dev.tierra.hasar.api.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author PauloGaldo
 */
public class Tarjeta implements Serializable {

    private int idTarjeta;
    private EntidadBancaria entidadBancaria;
    private MedioPago medioPago;
    private String nombreTarjeta;
    private boolean estadoTarjeta;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private Integer usuarioCreacion;
    private Integer usuarioModificacion;

    public Tarjeta() {
    }

    public Tarjeta(int idTarjeta, EntidadBancaria entidadBancaria, MedioPago medioPago, String nombreTarjeta, boolean estadoTarjeta, Date fechaCreacion, Date fechaModificacion, Integer usuarioCreacion, Integer usuarioModificacion) {
        this.idTarjeta = idTarjeta;
        this.entidadBancaria = entidadBancaria;
        this.medioPago = medioPago;
        this.nombreTarjeta = nombreTarjeta;
        this.estadoTarjeta = estadoTarjeta;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.usuarioCreacion = usuarioCreacion;
        this.usuarioModificacion = usuarioModificacion;
    }

    /**
     * @return the idTarjeta
     */
    public int getIdTarjeta() {
        return idTarjeta;
    }

    /**
     * @param idTarjeta the idTarjeta to set
     */
    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    /**
     * @return the entidadBancaria
     */
    public EntidadBancaria getEntidadBancaria() {
        return entidadBancaria;
    }

    /**
     * @param entidadBancaria the entidadBancaria to set
     */
    public void setEntidadBancaria(EntidadBancaria entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }

    /**
     * @return the medioPago
     */
    public MedioPago getMedioPago() {
        return medioPago;
    }

    /**
     * @param medioPago the medioPago to set
     */
    public void setMedioPago(MedioPago medioPago) {
        this.medioPago = medioPago;
    }

    /**
     * @return the nombreTarjeta
     */
    public String getNombreTarjeta() {
        return nombreTarjeta;
    }

    /**
     * @param nombreTarjeta the nombreTarjeta to set
     */
    public void setNombreTarjeta(String nombreTarjeta) {
        this.nombreTarjeta = nombreTarjeta;
    }

    /**
     * @return the estadoTarjeta
     */
    public boolean isEstadoTarjeta() {
        return estadoTarjeta;
    }

    /**
     * @param estadoTarjeta the estadoTarjeta to set
     */
    public void setEstadoTarjeta(boolean estadoTarjeta) {
        this.estadoTarjeta = estadoTarjeta;
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
    public Integer getUsuarioCreacion() {
        return usuarioCreacion;
    }

    /**
     * @param usuarioCreacion the usuarioCreacion to set
     */
    public void setUsuarioCreacion(Integer usuarioCreacion) {
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
