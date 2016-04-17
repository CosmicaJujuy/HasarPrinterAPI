package com.ar.dev.tierra.hasar.api.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**
 * 
 * @author PauloGaldo
 */
public class Producto implements Serializable {

    private int idProducto;
    private String codigoProducto;
    private String claseProducto;
    private Categoria categoria;
    private Marcas marcas;
    private FacturaProducto facturaProducto;
    private Sexo sexo;
    private Temporada temporada;
    private String descripcion;
    private String colorProducto;
    private BigDecimal precioCosto;
    private BigDecimal precioVenta;
    private BigDecimal precioLista;
    private int cantidadTotal;
    private int cantidadMinima;
    private String talla;
    private Date fechaProducto;
    private boolean estadoProducto;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private int usuarioCreacion;
    private Integer usuarioModificacion;

    public Producto() {
    }

    public Producto(int idProducto, String codigoProducto, String claseProducto, Categoria categoria, Marcas marcas, FacturaProducto facturaProducto, Sexo sexo, Temporada temporada, String descripcion, String colorProducto, BigDecimal precioCosto, BigDecimal precioVenta, BigDecimal precioLista, int cantidadTotal, int cantidadMinima, String talla, Date fechaProducto, boolean estadoProducto, Date fechaCreacion, Date fechaModificacion, int usuarioCreacion, Integer usuarioModificacion) {
        this.idProducto = idProducto;
        this.codigoProducto = codigoProducto;
        this.claseProducto = claseProducto;
        this.categoria = categoria;
        this.marcas = marcas;
        this.facturaProducto = facturaProducto;
        this.sexo = sexo;
        this.temporada = temporada;
        this.descripcion = descripcion;
        this.colorProducto = colorProducto;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.precioLista = precioLista;
        this.cantidadTotal = cantidadTotal;
        this.cantidadMinima = cantidadMinima;
        this.talla = talla;
        this.fechaProducto = fechaProducto;
        this.estadoProducto = estadoProducto;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.usuarioCreacion = usuarioCreacion;
        this.usuarioModificacion = usuarioModificacion;
    }

    /**
     * @return the idProducto
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * @return the codigoProducto
     */
    public String getCodigoProducto() {
        return codigoProducto;
    }

    /**
     * @param codigoProducto the codigoProducto to set
     */
    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    /**
     * @return the claseProducto
     */
    public String getClaseProducto() {
        return claseProducto;
    }

    /**
     * @param claseProducto the claseProducto to set
     */
    public void setClaseProducto(String claseProducto) {
        this.claseProducto = claseProducto;
    }

    /**
     * @return the categoria
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the marcas
     */
    public Marcas getMarcas() {
        return marcas;
    }

    /**
     * @param marcas the marcas to set
     */
    public void setMarcas(Marcas marcas) {
        this.marcas = marcas;
    }

    /**
     * @return the facturaProducto
     */
    public FacturaProducto getFacturaProducto() {
        return facturaProducto;
    }

    /**
     * @param facturaProducto the facturaProducto to set
     */
    public void setFacturaProducto(FacturaProducto facturaProducto) {
        this.facturaProducto = facturaProducto;
    }

    /**
     * @return the sexo
     */
    public Sexo getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the temporada
     */
    public Temporada getTemporada() {
        return temporada;
    }

    /**
     * @param temporada the temporada to set
     */
    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the colorProducto
     */
    public String getColorProducto() {
        return colorProducto;
    }

    /**
     * @param colorProducto the colorProducto to set
     */
    public void setColorProducto(String colorProducto) {
        this.colorProducto = colorProducto;
    }

    /**
     * @return the precioCosto
     */
    public BigDecimal getPrecioCosto() {
        return precioCosto;
    }

    /**
     * @param precioCosto the precioCosto to set
     */
    public void setPrecioCosto(BigDecimal precioCosto) {
        this.precioCosto = precioCosto;
    }

    /**
     * @return the precioVenta
     */
    public BigDecimal getPrecioVenta() {
        return precioVenta;
    }

    /**
     * @param precioVenta the precioVenta to set
     */
    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }

    /**
     * @return the precioLista
     */
    public BigDecimal getPrecioLista() {
        return precioLista;
    }

    /**
     * @param precioLista the precioLista to set
     */
    public void setPrecioLista(BigDecimal precioLista) {
        this.precioLista = precioLista;
    }

    /**
     * @return the cantidadTotal
     */
    public int getCantidadTotal() {
        return cantidadTotal;
    }

    /**
     * @param cantidadTotal the cantidadTotal to set
     */
    public void setCantidadTotal(int cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    /**
     * @return the cantidadMinima
     */
    public int getCantidadMinima() {
        return cantidadMinima;
    }

    /**
     * @param cantidadMinima the cantidadMinima to set
     */
    public void setCantidadMinima(int cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }

    /**
     * @return the talla
     */
    public String getTalla() {
        return talla;
    }

    /**
     * @param talla the talla to set
     */
    public void setTalla(String talla) {
        this.talla = talla;
    }

    /**
     * @return the fechaProducto
     */
    public Date getFechaProducto() {
        return fechaProducto;
    }

    /**
     * @param fechaProducto the fechaProducto to set
     */
    public void setFechaProducto(Date fechaProducto) {
        this.fechaProducto = fechaProducto;
    }

    /**
     * @return the estadoProducto
     */
    public boolean isEstadoProducto() {
        return estadoProducto;
    }

    /**
     * @param estadoProducto the estadoProducto to set
     */
    public void setEstadoProducto(boolean estadoProducto) {
        this.estadoProducto = estadoProducto;
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
