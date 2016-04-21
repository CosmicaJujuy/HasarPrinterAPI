/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ar.dev.tierra.hasar.api.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Enumeration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.comm.CommPortIdentifier;
import javax.comm.PortInUseException;
import javax.comm.SerialPort;
import javax.comm.UnsupportedCommOperationException;

/**
 *
 * @author PauloGaldo
 */
@RestController
@RequestMapping("/fiscal")
public class FiscalController implements Serializable {

    static SerialPort serialPort;
    static OutputStream outputStream;
    static String messageString = "Hello, world!\n";
    
    @RequestMapping(value = "/connection", method = RequestMethod.POST)
    public ResponseEntity<?> isConnected() throws PortInUseException, IOException {
        Enumeration pList = CommPortIdentifier.getPortIdentifiers();

        while (pList.hasMoreElements()) {
            CommPortIdentifier cpi = (CommPortIdentifier) pList.nextElement();
            System.out.print("Port " + cpi.getName() + " ");
            switch (cpi.getPortType()) {
                case CommPortIdentifier.PORT_SERIAL:
                    System.out.println("is a Serial Port: " + cpi.getCurrentOwner());
                    System.out.println("is a Serial Port: " + cpi.getName());
                    serialPort = (SerialPort) cpi.open("SimpleWriteApp", 2000);
                    outputStream = serialPort.getOutputStream();
                    System.out.println(serialPort.getName());
                    outputStream.write(messageString.getBytes());
                    break;
                case CommPortIdentifier.PORT_PARALLEL:
                    System.out.println("is a Parallel Port: " + cpi);
                    break;
                default:
                    System.out.println("is an Unknown Port: " + cpi);
                    break;
            }
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
