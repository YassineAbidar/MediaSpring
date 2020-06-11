/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.mediaTech.service;
import com.fstg.mediaTech.bean.Produit;
import java.util.List;

/**
 *
 * @author yassine
 */
public interface IProduitService {

    public void save(Produit produit);

    public List<Produit> findAll();

    public Produit findById(Long id);

    public int update(Produit produit, String ref);

    public int delete(String ref);

}
