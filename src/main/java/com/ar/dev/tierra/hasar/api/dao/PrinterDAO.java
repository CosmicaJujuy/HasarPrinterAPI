/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ar.dev.tierra.hasar.api.dao;

import org.springframework.stereotype.Component;

/**
 *
 * @author PauloGaldo
 */
@Component
public interface PrinterDAO {

    public int loginPrinter(String ipFrom);

}
