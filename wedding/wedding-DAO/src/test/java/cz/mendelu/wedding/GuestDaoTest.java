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
    
    
}
