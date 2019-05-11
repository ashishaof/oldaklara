/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.wedding.dao;

import cz.mendelu.wedding.domain.Gift;
import cz.mendelu.wedding.utils.DaoLayerException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author BAKSHI
 */
@Repository
public class GiftDAOimpl implements GiftDAO{
  @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Gift findById(int id) {

        try {
            return entityManager.find(Gift.class, id);
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }
    }

    @Override
    public void save(Gift gift) {
            if (findById(gift.getId()) != null) {
            try {
                entityManager.merge(gift);
            } catch (Exception e) {
                throw new DaoLayerException(e.getMessage());
            }
        } else {
            try {
                entityManager.persist(gift);
            } catch (Exception e) {
                throw new DaoLayerException(e.getMessage());
            }
        }

    }

    @Override
    public void delete(Gift gift) {
        try {
            entityManager.remove(findById(gift.getId()));
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }

    }

    @Override
    public List<Gift> findAll() {
            
        try {
            return entityManager.createQuery("select g from Gift g", Gift.class).getResultList();
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }

    }

 
    
      
}
