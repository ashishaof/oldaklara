/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.wedding.dao;

import cz.mendelu.wedding.domain.Guest;
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
public class GuestDAOimpl implements GuestDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Guest findById(int id) {

        try {
            return entityManager.find(Guest.class, id);
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }
    }

    @Override
    public void save(Guest guest) {
        if (findById(guest.getId()) != null) {
            try {
                entityManager.merge(guest);
            } catch (Exception e) {
                throw new DaoLayerException(e.getMessage());
            }
        } else {
            try {
                entityManager.persist(guest);
            } catch (Exception e) {
                throw new DaoLayerException(e.getMessage());
            }
        }

    }

    @Override
    public void delete(Guest guest) {
        try {
            entityManager.remove(findById(guest.getId()));
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }

    }

    @Override
    public List<Guest> findAll() {

        try {
            return entityManager.createQuery("select e from Guest e", Guest.class).getResultList();
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }

    }

    @Override
    public Guest findByEmail(String email) {
        try {
            return entityManager.createQuery("select g from Guest g where g.email = ?1", Guest.class).setParameter(1, email).getSingleResult();
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }
    }

}
