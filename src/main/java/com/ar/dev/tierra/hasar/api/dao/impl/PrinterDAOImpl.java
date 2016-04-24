/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ar.dev.tierra.hasar.api.dao.impl;

import com.ar.dev.tierra.hasar.api.dao.PrinterDAO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import javax.comm.CommPortIdentifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author PauloGaldo
 */
@Repository
@Transactional
public class PrinterDAOImpl implements PrinterDAO {

    @Override
    public int loginPrinter(String ipFrom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @SuppressWarnings("UnusedAssignment")
    public List<String> print(int option) {
        List<String> respuestaList = new ArrayList<>();
        Enumeration pList = CommPortIdentifier.getPortIdentifiers();
        while (pList.hasMoreElements()) {
            CommPortIdentifier cpi = (CommPortIdentifier) pList.nextElement();
            if (cpi.getPortType() == CommPortIdentifier.PORT_SERIAL) {
                String str = cpi.getName();
                String[] port = str.split("(?<=\\D)(?=\\d)");
                String comando = null;
                switch (option) {
                    case 1:
                        comando = "cmd /c cd command & wspooler -p" + port[1] + " -f ticket.200";
                        break;
                    case 2:
                        comando = "cmd /c cd command & wspooler -p" + port[1] + " -f factura_a.200";
                        break;
                    case 3:
                        comando = "cmd /c cd command & wspooler -p" + port[1] + " -f factura_b.200";
                        break;
                    case 4:
                        comando = "cmd /c cd command & wspooler -p" + port[1] + " -f factura_c.200";
                        break;
                    case 5:
                        comando = "cmd /c cd command & wspooler -p" + port[1] + " -f reporte_z.200";
                        break;
                }
                try {
                    Process p = Runtime.getRuntime().exec(comando);
                    p.waitFor();
                } catch (IOException | InterruptedException e) {
                    System.out.println(e);
                }
                try {
                    String responsePrinter = null;
                    switch (option) {
                        case 1:
                            responsePrinter = "command/ticket.ans";
                            break;
                        case 2:
                            responsePrinter = "command/factura_a.ans";
                            break;
                        case 3:
                            responsePrinter = "command/factura_b.ans";
                            break;
                        case 4:
                            responsePrinter = "command/factura_c.ans";
                            break;
                        case 5:
                            responsePrinter = "command/reporte_z.ans";
                            break;
                    }
                    try (FileInputStream respuesta = new FileInputStream(responsePrinter)) {
                        try (BufferedReader br = new BufferedReader(new InputStreamReader(respuesta))) {
                            String strLine;
                            while ((strLine = br.readLine()) != null) {
                                respuestaList.add(strLine);
                                System.out.println("Respuesta :" + strLine);
                            }
                            br.close();
                        }
                        File file = new File(responsePrinter);
                        if (file.exists()) {
                            file.delete();
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            }
        }
        return respuestaList;
    }

}
