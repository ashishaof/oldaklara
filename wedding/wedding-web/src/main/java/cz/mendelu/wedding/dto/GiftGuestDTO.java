/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.wedding.dto;

import cz.mendelu.wedding.domain.Gift;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author olda
 */
public class GiftGuestDTO {
    private String lunch;
    private String party;
    private Integer selectedgift;
    private List<Gift> gifts=new ArrayList<>();

    public Integer getSelectedgift() {
        return selectedgift;
    }

    public void setSelectedgift(Integer selectedgift) {
        this.selectedgift = selectedgift;
    }

    @Override
    public String toString() {
        return "GiftGuestDTO{" + "lunch=" + lunch + ", party=" + party + ", selectedGift=" + selectedgift + ", gifts=" + gifts + '}';
    }
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.lunch);
        hash = 67 * hash + Objects.hashCode(this.party);
        hash = 67 * hash + Objects.hashCode(this.gifts);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GiftGuestDTO other = (GiftGuestDTO) obj;
        if (!Objects.equals(this.lunch, other.lunch)) {
            return false;
        }
        if (!Objects.equals(this.party, other.party)) {
            return false;
        }
        if (!Objects.equals(this.gifts, other.gifts)) {
            return false;
        }
        return true;
    }

    
    
    public String getLunch() {
        return lunch;
    }

    public void setLunch(String lunch) {
        this.lunch = lunch;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public List<Gift> getGifts() {
        return gifts;
    }

    public void setGifts(List<Gift> gifts) {
        this.gifts = gifts;
    }
    
    
}
