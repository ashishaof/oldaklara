
package cz.mendelu.wedding.web.controllers;


import java.security.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
 @RequestMapping("/")

public class RegularPageController {
   @RequestMapping(method = RequestMethod.GET)
    public String regularPage(Model model, Principal principal){
        
        return "03-regular-page";
    }
}
