package itu.etatfinance.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {
    @GetMapping("/index")
    public String goHome(Model model){
        // Ensure the correct path to the index file
        return "index";
    }
}
