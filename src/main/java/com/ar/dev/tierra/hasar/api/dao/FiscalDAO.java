/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ar.dev.tierra.hasar.api.dao;

import com.ar.dev.tierra.hasar.api.model.DetalleFactura;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author PauloGaldo
 */
@Component
public interface FiscalDAO {

    public String ticket(List<DetalleFactura> detalles);

    public String factura_a(List<DetalleFactura> detalles);

    public String factura_b(List<DetalleFactura> detalles);

    public String factura_c(List<DetalleFactura> detalles);

}
