package com.ar.dev.tierra.hasar.api.model;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 * @author PauloGaldo
 */
public class PlanPago implements Serializable {

    private int idPlanesPago;
    private Tarjeta tarjeta;
    private String nombrePlanesPago;
    private int cuotasPlanesPago;
    private Date fechaInicioPlanes;
    private Date fechaFinalizacionPlanes;
    private int porcentajeInterez;
    private String fechaCierre;
    private boolean estadoPlanes;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private int usuarioCreacion;
    private Integer usuarioMoficacion;

    public PlanPago() {
    }

    public PlanPago(int idPlanesPago, Tarjeta tarjeta, String nombrePlanesPago, int cuotasPlanesPago, Date fechaInicioPlanes, int porcentajeInterez, boolean estadoPlanes, Date fechaCreacion, int usuarioCreacion) {
        this.idPlanesPago = idPlanesPago;
        this.tarjeta = tarjeta;
        this.nombrePlanesPago = nombrePlanesPago;
        this.cuotasPlanesPago = cuotasPlanesPago;
        this.fechaInicioPlanes = fechaInicioPlanes;
        this.porcentajeInterez = porcentajeInterez;
        this.estadoPlanes = estadoPlanes;
        this.fechaCreacion = fechaCreacion;
        this.usuarioCreacion = usuarioCreacion;
    }

    public PlanPago(int idPlanesPago, Tarjeta tarjeta, String nombrePlanesPago, int cuotasPlanesPago, Date fechaInicioPlanes, Date fechaFinalizacionPlanes, int porcentajeInterez, String fechaCierre, boolean estadoPlanes, Date fechaCreacion, Date fechaModificacion, int usuarioCreacion, Integer usuarioMoficacion) {
        this.idPlanesPago = idPlanesPago;
        this.tarjeta = tarjeta;
        this.nombrePlanesPago = nombrePlanesPago;
        this.cuotasPlanesPago = cuotasPlanesPago;
        this.fechaInicioPlanes = fechaInicioPlanes;
        this.fechaFinalizacionPlanes = fechaFinalizacionPlanes;
        this.porcentajeInterez = porcentajeInterez;
        this.fechaCierre = fechaCierre;
        this.estadoPlanes = estadoPlanes;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.usuarioCreacion = usuarioCreacion;
        this.usuarioMoficacion = usuarioMoficacion;
    }

    /**
     * @return the idPlanesPago
     */
    public int getIdPlanesPago() {
        return idPlanesPago;
    }

    /**
     * @param idPlanesPago the idPlanesPago to set
     */
    public void setIdPlanesPago(int idPlanesPago) {
        this.idPlanesPago = idPlanesPago;
    }

    /**
     * @return the tarjeta
     */
    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    /**
     * @param tarjeta the tarjeta to set
     */
    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    /**
     * @return the nombrePlanesPago
     */
    public String getNombrePlanesPago() {
        return nombrePlanesPago;
    }

    /**
     * @param nombrePlanesPago the nombrePlanesPago to set
     */
    public void setNombrePlanesPago(String nombrePlanesPago) {
        this.nombrePlanesPago = nombrePlanesPago;
    }

    /**
     * @return the cuotasPlanesPago
     */
    public int getCuotasPlanesPago() {
        return cuotasPlanesPago;
    }

    /**
     * @param cuotasPlanesPago the cuotasPlanesPago to set
     */
    public void setCuotasPlanesPago(int cuotasPlanesPago) {
        this.cuotasPlanesPago = cuotasPlanesPago;
    }

    /**
     * @return the fechaInicioPlanes
     */
    public Date getFechaInicioPlanes() {
        return fechaInicioPlanes;
    }

    /**
     * @param fechaInicioPlanes the fechaInicioPlanes to set
     */
    public void setFechaInicioPlanes(Date fechaInicioPlanes) {
        this.fechaInicioPlanes = fechaInicioPlanes;
    }

    /**
     * @return the fechaFinalizacionPlanes
     */
    public Date getFechaFinalizacionPlanes() {
        return fechaFinalizacionPlanes;
    }

    /**
     * @param fechaFinalizacionPlanes the fechaFinalizacionPlanes to set
     */
    public void setFechaFinalizacionPlanes(Date fechaFinalizacionPlanes) {
        this.fechaFinalizacionPlanes = fechaFinalizacionPlanes;
    }

    /**
     * @return the porcentajeInterez
     */
    public int getPorcentajeInterez() {
        return porcentajeInterez;
    }

    /**
     * @param porcentajeInterez the porcentajeInterez to set
     */
    public void setPorcentajeInterez(int porcentajeInterez) {
        this.porcentajeInterez = porcentajeInterez;
    }

    /**
     * @return the fechaCierre
     */
    public String getFechaCierre() {
        return fechaCierre;
    }

    /**
     * @param fechaCierre the fechaCierre to set
     */
    public void setFechaCierre(String fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    /**
     * @return the estadoPlanes
     */
    public boolean isEstadoPlanes() {
        return estadoPlanes;
    }

    /**
     * @param estadoPlanes the estadoPlanes to set
     */
    public void setEstadoPlanes(boolean estadoPlanes) {
        this.estadoPlanes = estadoPlanes;
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
     * @return the usuarioMoficacion
     */
    public Integer getUsuarioMoficacion() {
        return usuarioMoficacion;
    }

    /**
     * @param usuarioMoficacion the usuarioMoficacion to set
     */
    public void setUsuarioMoficacion(Integer usuarioMoficacion) {
        this.usuarioMoficacion = usuarioMoficacion;
    }

    

}
