package cz.mendelu.wedding.web.controllers;

import cz.mendelu.wedding.dao.GuestDAO;
import cz.mendelu.wedding.domain.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;
import java.util.List;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Pavel Kouril <pk@pavelkouril.cz>
 */
@Controller
@RequestMapping("/")
@Transactional
public class HomepageController {

    @Autowired
    private PasswordEncoder passwordEncoder;
    
    @Autowired
    private GuestDAO guestDAO;
    
    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model, Principal principal) {
        //guestDAO.save(new Guest("Olda","olda@olda.cz",passwordEncoder.encode("oldaolda")));
        return "index";
    }

}
