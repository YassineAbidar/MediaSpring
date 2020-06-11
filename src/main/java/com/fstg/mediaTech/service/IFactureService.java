/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.mediaTech.service;

import com.fstg.mediaTech.bean.Client;
import com.fstg.mediaTech.bean.Facture;
import java.util.List;

/**
 *
 * @author yassine
 */
public interface IFactureService {

    public void save(Facture facture);

    public List<Facture> findAll();

    public Facture findById(Long id);

    public int update(Facture facture, String ref);

    public int delete(String ref);
}
