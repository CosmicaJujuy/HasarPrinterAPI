/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ar.dev.tierra.hasar.api.dao.impl;

import com.ar.dev.tierra.hasar.api.dao.FiscalDAO;
import com.ar.dev.tierra.hasar.api.model.Cliente;
import com.ar.dev.tierra.hasar.api.model.DetalleFactura;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author PauloGaldo
 */
@Repository
@Transactional
public class FiscalDAOImpl implements FiscalDAO {

    @Override
    public void ticket(List<DetalleFactura> detalles) {
        try (PrintWriter ticket = new PrintWriter("printer_service/command/ticket.200")) {
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
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FiscalDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void factura_a(List<DetalleFactura> detalles, Cliente cliente) {
        try (PrintWriter ticket = new PrintWriter("printer_service/command/factura_a.200")) {
            DecimalFormat decimalFormat = new DecimalFormat();
            decimalFormat.setMaximumFractionDigits(1);
            ticket.println(
                    "b" + (char) 28
                    + cliente.getNombreCliente() + (char) 28
                    + cliente.getDocumento() + (char) 28
                    + cliente.getResponsabilidadIva() + (char) 28
                    + cliente.getTipoDocumento() + (char) 28
                    + cliente.getDomicilio());
            ticket.println("@" + (char) 28 + "A" + (char) 28 + "T");
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
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FiscalDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void factura_b(List<DetalleFactura> detalles, Cliente cliente) {
        try (PrintWriter ticket = new PrintWriter("printer_service/command/factura_b.200")) {
            DecimalFormat decimalFormat = new DecimalFormat();
            decimalFormat.setMaximumFractionDigits(1);
            ticket.println(
                    "b" + (char) 28
                    + cliente.getNombreCliente() + (char) 28
                    + cliente.getDocumento() + (char) 28
                    + cliente.getResponsabilidadIva() + (char) 28
                    + cliente.getTipoDocumento() + (char) 28
                    + cliente.getDomicilio());
            ticket.println("@" + (char) 28 + "B" + (char) 28 + "T");
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
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FiscalDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void factura_c(List<DetalleFactura> detalles, Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void regalo(List<DetalleFactura> detalles, String serial) {
        try (PrintWriter ticket = new PrintWriter("printer_service/command/regalo.200")) {
            ticket.println(
                    (char) 128 + (char) 28 // caracter para abrir doc no fiscal homologado
                    + 4 + (char) 28 // talon de regalo
                    + "T" + (char) 28 // valor fijo
                    + serial // numero de identificacion del documento
            );
            for (DetalleFactura detalle : detalles) {
                ticket.println(
                        (char) 133 + (char) 28 // abrir linea de dnfh
                        + 2 + (char) 28 // campo a imprimir
                        + detalle.getProducto().getDescripcion() + (char) 28 // texto a imprimir
                        + 0 + (char) 28
                        + detalle.getCantidadDetalle() //cantidad de unidades
                );
            }
            ticket.println(
                    (char) 129 + (char) 28 // abrimos linea de cierre de dnfh
                    + 1 + (char) 28 // cantidad de copias 
                    + "mail@mail.com" //direccion e-mail
            );
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FiscalDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
