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
import javax.comm.CommPort;
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
    
    @RequestMapping(value = "/connection", method = RequestMethod.POST)
    public ResponseEntity<?> isConnected() throws PortInUseException, IOException {
        Enumeration pList = CommPortIdentifier.getPortIdentifiers();        
        
        while (pList.hasMoreElements()) {
            CommPortIdentifier cpi = (CommPortIdentifier) pList.nextElement();
            if(cpi.getPortType() == CommPortIdentifier.PORT_SERIAL){
                
                System.out.println(cpi.getCurrentOwner());
                System.out.println(cpi.getName());
                System.out.println(cpi.toString());
            }
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
