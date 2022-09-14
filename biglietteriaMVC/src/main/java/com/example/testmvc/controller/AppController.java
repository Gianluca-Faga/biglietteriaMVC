package com.example.testmvc.controller;


import com.example.testmvc.dao.Servizi;
import com.example.testmvc.model.Biglietto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private Servizi serv;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String viewHomePage(Model model) {
        List<Biglietto> listaBiglietti = serv.listAll();
        model.addAttribute("listaBiglietti", listaBiglietti);
        return "lista_biglietti";
    }

}