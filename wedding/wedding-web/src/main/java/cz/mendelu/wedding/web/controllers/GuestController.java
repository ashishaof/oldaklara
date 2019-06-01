package cz.mendelu.wedding.web.controllers;

import cz.mendelu.wedding.dao.GiftDAO;
import cz.mendelu.wedding.dao.GuestDAO;
import cz.mendelu.wedding.domain.Gift;
import cz.mendelu.wedding.domain.Guest;
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

    @Autowired
    private GuestDAO guestDAO;

    @RequestMapping(value = "/guestpage", method = RequestMethod.GET)
    public String regularPage(Model model, Principal principal) {

        List<Gift> gifts = giftDAO.findAllExceptBooked((guestDAO.findByEmail(principal.getName())).getId());
        //List<Gift> gifts = giftDAO.findAll();
        Guest guest = guestDAO.findByEmail(principal.getName());
        

        GiftGuestDTO giftGuestDTO = new GiftGuestDTO();
        giftGuestDTO.setGifts(gifts);
        giftGuestDTO.setInvitedLunch(guest.getInvitedLunch());

        giftGuestDTO.setLunch(guest.getLunch() != false ? "lunch" : null);
        giftGuestDTO.setParty(guest.getParty() != false ? "party" : null);

        if (guest.getGift() != null) {
            giftGuestDTO.setSelectedgift(guest.getGift().getId());
        }
        
        for(Gift g:gifts){
            System.out.println("Gift guestID: "+(g.getGuest()!=null?g.getGuest().getEmail():null));
        }

        model.addAttribute("giftGuestDTO", giftGuestDTO);

        return "guestPage";
    }

    @RequestMapping(value = "/guestpage/save", method = RequestMethod.POST)
    public String saveForm(@Valid @ModelAttribute("giftGuestDTO") GiftGuestDTO giftGuestDTO, BindingResult bindingResult,
            RedirectAttributes redirectAttributes, UriComponentsBuilder uriBuilder, Principal principal) {

        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("alert_failure", "Some data were not filled!");
            return "redirect:" + uriBuilder.path("/guestpage").build();
        }

        Guest guest = guestDAO.findByEmail(principal.getName());
        if (giftGuestDTO.getSelectedgift() != null) {
            Gift gift = giftDAO.findById(giftGuestDTO.getSelectedgift());
            gift.setGuest(guest);
            guest.setGift(gift);
            giftDAO.save(gift);
        }else{
           
            guest.setGift(null);
           
        }

        if (giftGuestDTO.getParty() != null && "party".equals(giftGuestDTO.getParty())) {
            guest.setParty(Boolean.TRUE); }else{ guest.setParty(Boolean.FALSE); 
        }
        if (giftGuestDTO.getLunch() != null && "lunch".equals(giftGuestDTO.getLunch())) {
            guest.setLunch(Boolean.TRUE);  }else{ guest.setLunch(Boolean.FALSE);
        }
       
        guestDAO.save(guest);

        redirectAttributes.addFlashAttribute("alert_success", "Information was successfully edited.");

        return "redirect:" + uriBuilder.path("/guestpage").build();
    }
}
