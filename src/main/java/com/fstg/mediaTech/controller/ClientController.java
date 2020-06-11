/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.mediaTech.controller;

import com.fstg.mediaTech.bean.Client;
import com.fstg.mediaTech.service.IClientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    public String index(Model model, @RequestParam(name = "motcle", defaultValue = "") String motcle) {
        List<Client> clients = clientService.findBymotCle("%" + motcle + "%");
        String moclet = motcle;
        model.addAttribute("listClient", clients);
        model.addAttribute("mc", moclet);
        return "Client/clients";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(@RequestParam(name = "id") long id) {
        clientService.delete(id);
        return "redirect:/index";
    }

    @RequestMapping(value = "/formClient", method = RequestMethod.GET)
    public String formClient(Model model) {
        model.addAttribute("client", new Client());
        return "Client/formclient";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Model model,Client client) {
        clientService.save(client);
        return "redirect:/index";
    }
}
