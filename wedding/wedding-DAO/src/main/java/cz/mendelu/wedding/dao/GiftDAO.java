/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.wedding.dao;

import cz.mendelu.wedding.domain.Gift;
import java.util.List;

/**
 *
 * @author BAKSHI
 */
public interface GiftDAO {

    Gift findById(int id);

    void save(Gift gift);

    void delete(Gift gift);

    List<Gift> findAll();
}
