/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.wedding.web;
import cz.mendelu.wedding.dao.GuestDAO;
import cz.mendelu.wedding.domain.Guest;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
/**
 *
 * @author BAKSHI
 */
@Service
public class UserServiceImpl implements UserService{
    
    @Autowired
    private GuestDAO guestDAO;
    
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Guest guest = guestDAO.findByEmail(s);

        List<GrantedAuthority> auths = new ArrayList<>();
     

        return buildUserForAuthentication(guest, auths);
    }

    private User buildUserForAuthentication(Guest guest, List<GrantedAuthority> authorities) {
        return new User(guest.getEmail(), guest.getPassword(), authorities);
    }
   
}
