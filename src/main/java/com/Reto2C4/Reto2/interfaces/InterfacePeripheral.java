/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Reto2C4.Reto2.interfaces;

import com.Reto2C4.Reto2.modelo.Peripheral;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author angys
 */
public interface InterfacePeripheral extends MongoRepository<Peripheral, String> {
    
}
