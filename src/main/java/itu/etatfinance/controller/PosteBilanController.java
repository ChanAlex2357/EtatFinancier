package itu.etatfinance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import itu.etatfinance.model.AdminBilanVariable;
import itu.etatfinance.model.PosteBilanVariable;
import itu.etatfinance.model.TypePoste;
import itu.etatfinance.service.PosteBilanVariableService;
import itu.etatfinance.service.TypePosteService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
import java.util.Map;
import itu.etatfinance.util.ResponseUtil;


@RestController
@RequestMapping("/api/bilan/")
public class PosteBilanController {

    @Autowired
    PosteBilanVariableService posteBilanService;

    @Autowired
    TypePosteService typePosteService;

    @GetMapping("/variables")
    @ResponseBody
    public Map<String, Object> bilanVariables() {
        try {
            AdminBilanVariable adminBilanVariable = posteBilanService.loAdminBilanVariable();
            return ResponseUtil.successResponse( "Variables de Bilan loaded successfully", adminBilanVariable);
        } catch (Exception e) {
            return ResponseUtil.errorResponse( e.getMessage(), null,e);
        }
    }
}
