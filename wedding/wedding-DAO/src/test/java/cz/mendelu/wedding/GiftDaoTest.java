/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.wedding;

import cz.mendelu.wedding.dao.GiftDAO;
import cz.mendelu.wedding.dao.GuestDAO;
import cz.mendelu.wedding.domain.Gift;
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
public class GiftDaoTest extends AbstractTestNGSpringContextTests{
    
    @Autowired
    private GiftDAO giftDao;
    @Autowired
    private GuestDAO guestDao;
    @Test
    public void testSave() {
        Gift g=new Gift("tv","smartTV");
        giftDao.save(g);
        
        Gift result = giftDao.findById(g.getId());
        assertEquals(g, result);
    }
   
    @Test
    public void testSaveWithGuest() {
        Gift gift=new Gift("tv","smartTV");
        giftDao.save(gift);
        Guest guest=new Guest("ashish","ashish@gmail.com","1213456");
        guestDao.save(guest);
        Gift result = giftDao.findById(gift.getId());
        result.setGuest(guest);
        giftDao.save(result);
        Gift result1 = giftDao.findById(gift.getId());
        assertEquals(result, result1);
        
    }
    
    
}
