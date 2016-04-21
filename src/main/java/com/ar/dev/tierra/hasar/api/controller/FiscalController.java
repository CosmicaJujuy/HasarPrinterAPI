/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ar.dev.tierra.hasar.api.controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
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
import javax.comm.SerialPort;

/**
 *
 * @author PauloGaldo
 */
@RestController
@RequestMapping("/fiscal")
public class FiscalController implements Serializable {

    @RequestMapping(value = "/connection", method = RequestMethod.POST)
    public ResponseEntity<?> isConnected() throws PortInUseException, IOException {
        Enumeration pList = CommPortIdentifier.getPortIdentifiers();

        while (pList.hasMoreElements()) {
            CommPortIdentifier cpi = (CommPortIdentifier) pList.nextElement();
            if (cpi.getPortType() == CommPortIdentifier.PORT_SERIAL) {
                String str = cpi.getName();
                String[] port = str.split("(?<=\\D)(?=\\d)");
                ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "cd command & wspooler -p" + port[1] + "-f test.615");
                builder.redirectErrorStream(true);
                Process p = builder.start();
                
                BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                
                List<String> respuestaList = new ArrayList<>();
                try {
                    FileInputStream respuesta = new FileInputStream("command/respuesta.ans");
                    try (BufferedReader br = new BufferedReader(new InputStreamReader(respuesta))) {
                        String strLine;
                        /* read log line by line */
                        while ((strLine = br.readLine()) != null) {
                            respuestaList.add(strLine);
                        }
                        System.out.println(respuestaList);
                        br.close();
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
