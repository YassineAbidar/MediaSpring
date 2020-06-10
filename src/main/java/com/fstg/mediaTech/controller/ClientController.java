/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.mediaTech.controller;

import com.fstg.mediaTech.bean.Client;
import com.fstg.mediaTech.dao.IClientDao;
import com.fstg.mediaTech.service.IClientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author yassine
 */
@Controller
public class ClientController {

    @Autowired
    private IClientService clientService;

    @RequestMapping(value = "/index")
    public String index(Model model) {
        List<Client> clients = clientService.findAll();
        model.addAttribute("listClient",clients);
        return "Client/clients";
    }
}
