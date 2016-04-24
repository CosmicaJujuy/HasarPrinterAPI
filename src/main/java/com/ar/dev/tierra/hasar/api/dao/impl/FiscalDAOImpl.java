/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ar.dev.tierra.hasar.api.dao.impl;

import com.ar.dev.tierra.hasar.api.dao.FiscalDAO;
import com.ar.dev.tierra.hasar.api.dao.PrinterDAO;
import com.ar.dev.tierra.hasar.api.model.DetalleFactura;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author PauloGaldo
 */
@Repository
@Transactional
public class FiscalDAOImpl implements FiscalDAO {

    @Autowired
    private PrinterDAO printerDAO;
    
    @Override
    public String ticket(List<DetalleFactura> detalles) {
        try (PrintWriter ticket = new PrintWriter("command/ticket.200")) {
            DecimalFormat decimalFormat = new DecimalFormat();
            decimalFormat.setMaximumFractionDigits(1);
            ticket.println("@" + (char) 28 + "T" + (char) 28 + "T");
            BigDecimal descuento = new BigDecimal(BigInteger.ZERO);
            for (DetalleFactura detalle : detalles) {
                if (detalle.getDescuentoDetalle() != null) {
                    descuento = descuento.add(detalle.getDescuentoDetalle());
                }
                String price = null;
                BigDecimal sinIVA = detalle.getProducto().getPrecioVenta().subtract(detalle.getProducto().getPrecioVenta().multiply(new BigDecimal(17.35)).divide(new BigDecimal(100)));
                price = sinIVA.setScale(4, RoundingMode.HALF_UP).toString();
                ticket.println(
                        "B" + (char) 28 /*Abrimos linea*/
                        + detalle.getProducto().getDescripcion() + (char) 28 /*Nombre producto*/
                        + detalle.getCantidadDetalle() + ".0" + (char) 28 /*Cantidad*/
                        + price.replace(",", ".") + (char) 28 /*Precio unitario*/
                        + "21.0" + (char) 28 /*Impuestos IVA*/
                        + "M" + (char) 28 /*Suma monto*/
                        + "0.0" + (char) 28 /*Impuestos internos*/
                        + "0" + (char) 28 /*Parametro display*/
                        + "b");
                /*Cierra de linea*/
            }
            if (!descuento.equals(new BigDecimal(BigInteger.ZERO))) {
                ticket.println(
                        "T" + (char) 28 /*Abrimos linea descuento*/
                        + "Descuento: " + (char) 28 /*Texto a mostrar*/
                        + descuento + (char) 28 /*Monto descuento*/
                        + "m" + (char) 28 /*m: descuento, M: aumento*/
                        + "0" + (char) 28 /*parametro display*/
                        + "T");
                /*cierre linea descuento*/
            }
            ticket.println("E");
            List<String> responsePrinter = printerDAO.print(1);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FiscalDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return null;
    }

    @Override
    public String factura_a(List<DetalleFactura> detalles) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String factura_b(List<DetalleFactura> detalles) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String factura_c(List<DetalleFactura> detalles) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}