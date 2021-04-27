package org.mi5.sightseeing.controller;

import lombok.RequiredArgsConstructor;
import org.mi5.sightseeing.config.auth.LoginUser;
import org.mi5.sightseeing.config.auth.dto.SessionUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
public class LoginController {

    @GetMapping("/")
    public String index(Model model, @LoginUser SessionUser user) {
        if(user != null){
            model.addAttribute("userName", user.getName());
        }
        return "index";
    }
}
