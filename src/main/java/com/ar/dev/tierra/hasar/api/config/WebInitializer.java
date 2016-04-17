package com.ar.dev.tierra.hasar.api.config;

import com.ar.dev.tierra.hasar.api.HasarPrinterAPI;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 *
 * @author PauloGaldo
 */
public class WebInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(HasarPrinterAPI.class);
    }
}
