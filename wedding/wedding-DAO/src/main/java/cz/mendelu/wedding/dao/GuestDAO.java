/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.wedding.dao;

import cz.mendelu.wedding.domain.Guest;
import java.util.List;

/**
 *
 * @author BAKSHI
 */
public interface GuestDAO {

    Guest findById(int id);
    
    Guest findByEmail(String email);

    void save(Guest guest);

    void delete(Guest guest);

    List<Guest> findAll();
}
