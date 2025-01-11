package itu.etatfinance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import itu.etatfinance.service.PosteBilanService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import java.util.Map;


@RestController
public class PosteBilanController {

    @Autowired
    PosteBilanService posteBilanService;

    @GetMapping("/posteBilan")
    @ResponseBody
    public Map<String, String> posteBilan() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "success");
        return response;
    }
    
    
}
