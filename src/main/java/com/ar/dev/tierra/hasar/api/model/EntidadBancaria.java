package com.ar.dev.tierra.hasar.api.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author PauloGaldo
 */
public class EntidadBancaria implements Serializable {

    private int idEntidadMonetaria;
    private String nombreEntidad;
    private String direccionEntidad;
    private String telefonoEntidad;
    private boolean estadoEntidad;
    private Date fechaCreaciion;
    private Date fechaModificacion;
    private int usuarioCreacion;
    private Integer usuarioModificacion;

    public EntidadBancaria() {
    }

    public EntidadBancaria(int idEntidadMonetaria, String nombreEntidad, boolean estadoEntidad, Date fechaCreaciion, int usuarioCreacion) {
        this.idEntidadMonetaria = idEntidadMonetaria;
        this.nombreEntidad = nombreEntidad;
        this.estadoEntidad = estadoEntidad;
        this.fechaCreaciion = fechaCreaciion;
        this.usuarioCreacion = usuarioCreacion;
    }

    public EntidadBancaria(int idEntidadMonetaria, String nombreEntidad, String direccionEntidad, String telefonoEntidad, boolean estadoEntidad, Date fechaCreaciion, Date fechaModificacion, int usuarioCreacion, Integer usuarioModificacion) {
        this.idEntidadMonetaria = idEntidadMonetaria;
        this.nombreEntidad = nombreEntidad;
        this.direccionEntidad = direccionEntidad;
        this.telefonoEntidad = telefonoEntidad;
        this.estadoEntidad = estadoEntidad;
        this.fechaCreaciion = fechaCreaciion;
        this.fechaModificacion = fechaModificacion;
        this.usuarioCreacion = usuarioCreacion;
        this.usuarioModificacion = usuarioModificacion;
    }

    /**
     * @return the idEntidadMonetaria
     */
    public int getIdEntidadMonetaria() {
        return idEntidadMonetaria;
    }

    /**
     * @param idEntidadMonetaria the idEntidadMonetaria to set
     */
    public void setIdEntidadMonetaria(int idEntidadMonetaria) {
        this.idEntidadMonetaria = idEntidadMonetaria;
    }

    /**
     * @return the nombreEntidad
     */
    public String getNombreEntidad() {
        return nombreEntidad;
    }

    /**
     * @param nombreEntidad the nombreEntidad to set
     */
    public void setNombreEntidad(String nombreEntidad) {
        this.nombreEntidad = nombreEntidad;
    }

    /**
     * @return the direccionEntidad
     */
    public String getDireccionEntidad() {
        return direccionEntidad;
    }

    /**
     * @param direccionEntidad the direccionEntidad to set
     */
    public void setDireccionEntidad(String direccionEntidad) {
        this.direccionEntidad = direccionEntidad;
    }

    /**
     * @return the telefonoEntidad
     */
    public String getTelefonoEntidad() {
        return telefonoEntidad;
    }

    /**
     * @param telefonoEntidad the telefonoEntidad to set
     */
    public void setTelefonoEntidad(String telefonoEntidad) {
        this.telefonoEntidad = telefonoEntidad;
    }

    /**
     * @return the estadoEntidad
     */
    public boolean isEstadoEntidad() {
        return estadoEntidad;
    }

    /**
     * @param estadoEntidad the estadoEntidad to set
     */
    public void setEstadoEntidad(boolean estadoEntidad) {
        this.estadoEntidad = estadoEntidad;
    }

    /**
     * @return the fechaCreaciion
     */
    public Date getFechaCreaciion() {
        return fechaCreaciion;
    }

    /**
     * @param fechaCreaciion the fechaCreaciion to set
     */
    public void setFechaCreaciion(Date fechaCreaciion) {
        this.fechaCreaciion = fechaCreaciion;
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
