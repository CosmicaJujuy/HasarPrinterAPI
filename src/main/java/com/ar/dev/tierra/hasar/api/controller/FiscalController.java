/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ar.dev.tierra.hasar.api.controller;

import com.ar.dev.tierra.hasar.api.dao.FiscalDAO;
import com.ar.dev.tierra.hasar.api.model.DetalleFactura;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.comm.CommPortIdentifier;
import javax.comm.PortInUseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author PauloGaldo
 */
@RestController
@RequestMapping("/fiscal")
public class FiscalController implements Serializable {

    @Autowired
    private FiscalDAO fiscalDAO;

    @RequestMapping(value = "/connection", method = RequestMethod.GET)
    public ResponseEntity<?> isConnected() throws PortInUseException, IOException, InterruptedException {
        /*LISTA DE PUERTOS COM*/
        Enumeration pList = CommPortIdentifier.getPortIdentifiers();
        /*Bucle control puertos conectados a la impresora*/
        boolean printer = false;
        while (pList.hasMoreElements() && printer == false) {
            /*Identificamos tipo de puerto*/
            CommPortIdentifier cpi = (CommPortIdentifier) pList.nextElement();
            if (cpi.getPortType() == CommPortIdentifier.PORT_SERIAL) {
                /*Split del nombre del puerto para identificar el numero*/
                String str = cpi.getName();
                String[] port = str.split("(?<=\\D)(?=\\d)");
                /*Armamos string para ejecutar comando con el estado de la impresora*/
                String comando = "cmd /c cd command & wspooler -p" + port[1] + " -f estado.txt";
                Process p = Runtime.getRuntime().exec(comando);
                p.waitFor();
                /*Lectura de la respuesta del comando*/
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println("Respuesta: " + line);
                    }
                    reader.close();
                }
                /*Lectura del archivo estado.ans con la respuesta de la impresora*/
                List<String> respuestaList = new ArrayList<>();
                try {
                    /*Abrimos archivo estado.ans*/
                    try (FileInputStream respuesta = new FileInputStream("command/estado.ans")) {
                        try (BufferedReader br = new BufferedReader(new InputStreamReader(respuesta))) {
                            String strLine;
                            /* read log line by line */
                            while ((strLine = br.readLine()) != null) {
                                respuestaList.add(strLine);
                            }
                            System.out.println(respuestaList);
                            br.close();
                        }
                        /*Comprobamos su existencia y eliminamos*/
                        File file = new File("command/estado.ans");
                        if (file.exists()) {
                            printer = true;
                            file.delete();
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            }
        }
        /*Retornamos respuesta de conexion acorde a los resultados*/
        if (printer) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "/ticket", method = RequestMethod.POST)
    public ResponseEntity<?> ticket(@RequestBody List<DetalleFactura> detalles) throws IOException, InterruptedException {
        fiscalDAO.ticket(detalles);
        List<String> respuestaList = new ArrayList<>();
        File ticket = new File("command/ticket.200");
        if (ticket.exists()) {
            Process p = Runtime.getRuntime().exec("cmd /c cd command & wspooler -p3 -f ticket.200");
            p.waitFor();
            try (FileInputStream respuesta = new FileInputStream("command/ticket.ans")) {
                try (BufferedReader br = new BufferedReader(new InputStreamReader(respuesta))) {
                    String strLine;
                    /* read log line by line */
                    while ((strLine = br.readLine()) != null) {
                        respuestaList.add(strLine);
                    }
                    System.out.println(respuestaList);
                    br.close();
                }
                /*Comprobamos su existencia y eliminamos*/
                File file = new File("command/ticket.ans");
                File ticket_ans = new File("command/ticket.200");
                if (file.exists()) {
                    file.delete();
                    ticket_ans.delete();
                }
            }
        }
//        respuestaList.add("000000000000|00000023");
        if (!respuestaList.isEmpty()) {
            return new ResponseEntity<>(respuestaList, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "/factura/A", method = RequestMethod.POST)
    public ResponseEntity<?> factura_A(@RequestParam("detalles") List<DetalleFactura> detalles) {

        return null;
    }

    @RequestMapping(value = "/factura/B", method = RequestMethod.POST)
    public ResponseEntity<?> factura_B(@RequestParam("detalles") List<DetalleFactura> detalles) {

        return null;
    }

    @RequestMapping(value = "/factura/C", method = RequestMethod.POST)
    public ResponseEntity<?> factura_C(@RequestParam("detalles") List<DetalleFactura> detalles) {

        return null;
    }

    @RequestMapping(value = "/comprobante/Z", method = RequestMethod.POST)
    public ResponseEntity<?> comprobante_Z() throws FileNotFoundException, IOException, InterruptedException {
        PrintWriter comprobante = new PrintWriter("command/compZ.200");
        comprobante.println("9 Z");
        List<String> respuestaList = new ArrayList<>();
        File compZ = new File("command/compZ.200");
        if (compZ.exists()) {
            Process p = Runtime.getRuntime().exec("cmd /c cd command & wspooler -p3 -f compZ.200");
            p.waitFor();
            try (FileInputStream respuesta = new FileInputStream("command/compZ.ans")) {
                try (BufferedReader br = new BufferedReader(new InputStreamReader(respuesta))) {
                    String strLine;
                    /* read log line by line */
                    while ((strLine = br.readLine()) != null) {
                        respuestaList.add(strLine);
                    }
                    System.out.println(respuestaList);
                    br.close();
                }
                /*Comprobamos su existencia y eliminamos*/
                File file = new File("command/compZ.ans");
                File ticket_ans = new File("command/compZ.200");
                if (file.exists()) {
                    file.delete();
                    ticket_ans.delete();
                }
            }
        }
        if (!respuestaList.isEmpty()) {
            return new ResponseEntity<>(respuestaList, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}
