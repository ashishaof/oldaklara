/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.wedding;

import cz.mendelu.wedding.dao.GiftDAO;
import cz.mendelu.wedding.domain.Gift;
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
    
    @Test
    public void testSave() {
        Gift g=new Gift("tv","smartTV");
        giftDao.save(g);
        
        Gift result = giftDao.findById(g.getId());
        assertEquals(g, result);
    }
    
    
}
