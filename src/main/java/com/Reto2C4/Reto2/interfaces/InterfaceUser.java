/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Reto2C4.Reto2.interfaces;

import com.Reto2C4.Reto2.modelo.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author angys
 */
public interface InterfaceUser extends MongoRepository<User, Integer> {
    Optional<User> findByEmail (String email);
    Optional<User> findByEmailAndPassword(String email, String password);
}
