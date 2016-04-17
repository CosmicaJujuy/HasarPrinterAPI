package com.ar.dev.tierra.hasar.api.model;

import java.io.Serializable;
import java.util.Date;

public class Temporada implements Serializable {

    private int idTemporada;
    private String nombreTemporada;
    private int usuarioCreacion;
    private Integer usuarioModificacion;
    private Date fechaCreacion;
    private Date fechaModificacion;

    public Temporada() {
    }

    public Temporada(int idTemporada, String nombreTemporada) {
        this.idTemporada = idTemporada;
        this.nombreTemporada = nombreTemporada;
    }

    public Temporada(int idTemporada, String nombreTemporada, int usuarioCreacion, Integer usuarioModificacion, Date fechaCreacion, Date fechaModificacion) {
        this.idTemporada = idTemporada;
        this.nombreTemporada = nombreTemporada;
        this.usuarioCreacion = usuarioCreacion;
        this.usuarioModificacion = usuarioModificacion;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
    }

    /**
     * @return the idTemporada
     */
    public int getIdTemporada() {
        return idTemporada;
    }

    /**
     * @param idTemporada the idTemporada to set
     */
    public void setIdTemporada(int idTemporada) {
        this.idTemporada = idTemporada;
    }

    /**
     * @return the nombreTemporada
     */
    public String getNombreTemporada() {
        return nombreTemporada;
    }

    /**
     * @param nombreTemporada the nombreTemporada to set
     */
    public void setNombreTemporada(String nombreTemporada) {
        this.nombreTemporada = nombreTemporada;
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
