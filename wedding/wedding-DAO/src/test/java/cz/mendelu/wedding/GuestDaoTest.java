/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.wedding;

import cz.mendelu.wedding.dao.GuestDAO;
import cz.mendelu.wedding.domain.Guest;
import cz.mendelu.wedding.utils.DatabaseConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.Test;

import static org.junit.Assert.*;
/**
 *
 * @author BAKSHI
 */
@ContextConfiguration(classes = DatabaseConfig.class)
@TestExecutionListeners(TransactionalTestExecutionListener.class)
@Transactional
public class GuestDaoTest extends AbstractTestNGSpringContextTests{
    
    @Autowired
    private GuestDAO guestDao;
    
    @Test
    public void testSave() {
        Guest g=new Guest("ashish","ashish@gmail.com","1213456");
        guestDao.save(g);
        
        Guest result = guestDao.findById(g.getId());
        assertEquals(g, result);
    }
    
    @Test
    public void testDelete() {
        Guest g=new Guest("fernando","fernando@gmail.com","password123");
        guestDao.save(g);

        guestDao.save(g);
        guestDao.delete(g);

        assertEquals(0, guestDao.findAll().size());
    }

    @Test
    public void testFindAll() {
        Guest g=new Guest("fernando","fernando@gmail.com","password123");
        Guest e=new Guest("fernando1","fernando1@gmail.com","password123");

        guestDao.save(g);
        guestDao.save(e);

        assertEquals(2, guestDao.findAll().size());
    }
        
    @Test
    public void testfindById(int id) {
        Guest g=new Guest("fernando","fernando@gmail.com","password123");

        guestDao.save(g);

        assertEquals(g, guestDao.findById(id));
    }
        
    @Test
    public void testfindByEmail(String email) {
        Guest g=new Guest("fernando",email,"password123");

        guestDao.save(g);

        assertEquals(g, guestDao.findByEmail(email));
    }
    
    
}
