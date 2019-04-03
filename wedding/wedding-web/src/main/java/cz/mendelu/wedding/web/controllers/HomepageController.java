package cz.mendelu.wedding.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;
import java.util.List;

/**
 * @author Pavel Kouril <pk@pavelkouril.cz>
 */
@Controller
@RequestMapping("/")
public class HomepageController {

   

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model, Principal principal) {
       
        
        
        
        
        return "nonsense";
    }

}