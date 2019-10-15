package id.web.fahmikudo.idp.authkeycloak.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author vulture
 */
@Controller
public class KeycloakController {
    
    @PostMapping("/admin/logout")
    public String logout(HttpServletRequest request) throws Exception {
        request.logout();
        return "redirect:/admin";
    }
    
}
