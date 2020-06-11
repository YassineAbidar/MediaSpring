/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.mediaTech.controller;

import com.fstg.mediaTech.bean.Client;
import com.fstg.mediaTech.bean.Produit;
import com.fstg.mediaTech.service.IClientService;
import com.fstg.mediaTech.service.IProduitService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author yassine
 */
@Controller
public class ProduitController {
    @Autowired
    private IProduitService iProduitService;

    @RequestMapping(value = "/produits/index")
    public String index(Model model) {
        List<Produit> produits = iProduitService.findAll();
        model.addAttribute("listProduit", produits);
        return "Client/produits";
    }
}