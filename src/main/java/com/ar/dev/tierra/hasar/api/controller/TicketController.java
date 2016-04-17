package com.ar.dev.tierra.hasar.api.controller;

import java.io.*;
import java.nio.charset.*;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PauloGaldo
 */
@RestController
@RequestMapping("/ticket")
public class TicketController implements Serializable {

    private static final Charset UTF8 = Charset.forName("UTF-8");
    private final String USER_AGENT = "Mozilla/5.0";

    /**
     *
     * @param o
     * @param request
     * @return
     * @throws MalformedURLException
     * @throws IOException
     */
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public ResponseEntity<?> test(@RequestBody Object o, HttpServletRequest request) throws MalformedURLException, IOException {
        String response = "Test exitoso, direccion IP: " + request.getRemoteAddr();
        try (PrintWriter ws = new PrintWriter("command/test.615")) {
            ws.println("@" + (char) 28 + "T" + (char) 28 + "T");
            ws.println("B" + (char) 28 + "Varios" + (char) 28 + "0.5" + (char) 28 + "1.0" + (char) 28 + "21.0" + (char) 28 + "M" + (char) 28 + "0.0" + (char) 28 + "0" + (char) 28 + "b");
            ws.println("B" + (char) 28 + "Varios" + (char) 28 + "0.5" + (char) 28 + "2.0" + (char) 28 + "21.0" + (char) 28 + "M" + (char) 28 + "0.0" + (char) 28 + "0" + (char) 28 + "b");
            ws.println("E");
        }
        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "cd command & wspooler -p3 -f test.615");
        builder.redirectErrorStream(true);
        Process p = builder.start();
        List<String> list2 = new ArrayList<>();
        List<String> lastThree = new ArrayList<>();
        try {
            FileInputStream fstream = new FileInputStream("command/spooler.log");
            try (BufferedReader br = new BufferedReader(new InputStreamReader(fstream))) {
                String strLine;
                /* read log line by line */
                while ((strLine = br.readLine()) != null) {
                    list2.add(strLine);
                }
                br.close();
            }
            lastThree.add(list2.get(list2.size() - 1));
            lastThree.add(list2.get(list2.size() - 2));
            lastThree.add(list2.get(list2.size() - 3));
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return new ResponseEntity<>(lastThree, HttpStatus.OK);
    }

}
