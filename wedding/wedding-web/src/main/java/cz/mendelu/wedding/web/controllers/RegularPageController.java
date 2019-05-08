package cz.mendelu.wedding.web.controllers;

import cz.mendelu.wedding.dao.GiftDAO;
import cz.mendelu.wedding.domain.Gift;
import java.security.Principal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/rg")

public class RegularPageController {

    @Autowired
    private GiftDAO giftDAO;

    @RequestMapping(method = RequestMethod.GET)
    public String regularPage(Model model, Principal principal) {

        List<Gift> gifts = giftDAO.findAll();

        model.addAttribute("gifts", gifts);

        return "03-regular-page";
    }
}
