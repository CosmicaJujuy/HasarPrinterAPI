package com.ar.dev.tierra.hasar.api.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author PauloGaldo
 */
public class Sexo implements Serializable {

    private int idSexo;
    private String nombreSexo;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private int usuarioCreacion;
    private Integer usuarioModificacion;

    public Sexo() {
    }

    public Sexo(int idSexo, String nombreSexo) {
        this.idSexo = idSexo;
        this.nombreSexo = nombreSexo;
    }

    public Sexo(int idSexo, String nombreSexo, Date fechaCreacion, Date fechaModificacion, int usuarioCreacion, Integer usuarioModificacion) {
        this.idSexo = idSexo;
        this.nombreSexo = nombreSexo;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.usuarioCreacion = usuarioCreacion;
        this.usuarioModificacion = usuarioModificacion;
    }

    /**
     * @return the idSexo
     */
    public int getIdSexo() {
        return idSexo;
    }

    /**
     * @param idSexo the idSexo to set
     */
    public void setIdSexo(int idSexo) {
        this.idSexo = idSexo;
    }

    /**
     * @return the nombreSexo
     */
    public String getNombreSexo() {
        return nombreSexo;
    }

    /**
     * @param nombreSexo the nombreSexo to set
     */
    public void setNombreSexo(String nombreSexo) {
        this.nombreSexo = nombreSexo;
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
