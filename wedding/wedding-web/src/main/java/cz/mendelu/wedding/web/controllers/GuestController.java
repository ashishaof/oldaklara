package cz.mendelu.wedding.web.controllers;

import cz.mendelu.wedding.dao.GiftDAO;
import cz.mendelu.wedding.domain.Gift;
import cz.mendelu.wedding.dto.GiftGuestDTO;
import java.security.Principal;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.util.UriComponentsBuilder;

@Controller
@Transactional
public class GuestController {

    @Autowired
    private GiftDAO giftDAO;
    
    @RequestMapping(value ="/guestpage",method = RequestMethod.GET)
    public String regularPage(Model model, Principal principal) {
       
        List<Gift> gifts = giftDAO.findAll();
        
        GiftGuestDTO giftGuestDTO=new GiftGuestDTO();
        giftGuestDTO.setGifts(gifts);
        model.addAttribute("giftGuestDTO", giftGuestDTO);

        return "guestPage";
    }
    
    
    @RequestMapping(value ="/guestpage/save",method = RequestMethod.POST)
    public String saveForm(@Valid @ModelAttribute("giftGuestDTO") GiftGuestDTO giftGuestDTO, BindingResult bindingResult,
                         RedirectAttributes redirectAttributes, UriComponentsBuilder uriBuilder, Principal principal) {
       
        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("alert_failure", "Some data were not filled!");
            return "redirect:" + uriBuilder.path("/guestpage").build();
        }
        System.out.println(giftGuestDTO);
        System.out.println("Principal user: "+principal.getName());
        //okemonFacade.changeNickName(pokemon.getNickname(), pokemon.getId());

        redirectAttributes.addFlashAttribute("alert_success", "Information was successfully edited.");

        return "redirect:" + uriBuilder.path("/guestpage").build();
    }
}
