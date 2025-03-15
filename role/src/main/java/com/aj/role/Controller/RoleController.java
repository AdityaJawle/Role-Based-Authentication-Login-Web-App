package com.aj.role.Controller;

import com.aj.role.Model.Users;
import com.aj.role.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RoleController {

    private  PasswordEncoder passwordEncoder;

    @Autowired
    private RoleService roleService;

    @GetMapping("/index")
    public String home() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    public String save(@ModelAttribute Users user, Model model) {
        try {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            roleService.save(user);
            return "redirect:/index"; 
        } catch (RuntimeException e) {
            model.addAttribute("error", e.getMessage());
            return "register";
        }
    }


    @GetMapping("/adminDashboard")
    public String adlogedin(Model model) {
        String username = returnUsername();
        model.addAttribute("userDetails", username);
        return "adminDashboard";
    }

    @GetMapping("/userDashboard")
    public String urlogedin(Model model) {
        String username = returnUsername();
        model.addAttribute("userDetails", username);
        return "userDashboard";
    }

    private String returnUsername() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    
        if (authentication == null || !authentication.isAuthenticated() || authentication.getPrincipal() == null) {
            return "Guest"; 
        }
    
        Object principal = authentication.getPrincipal();
    
        if (principal instanceof UserDetails) {
            return ((UserDetails) principal).getUsername();
        }
    
        return "Unknown User"; 
    }
}
