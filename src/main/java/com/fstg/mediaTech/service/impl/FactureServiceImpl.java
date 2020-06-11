/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.mediaTech.service.impl;

import com.fstg.mediaTech.bean.Facture;
import com.fstg.mediaTech.service.IFactureService;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author yassine
 */
@Service
public class FactureServiceImpl implements IFactureService{
    @Override
    public void save(Facture facture) {
       
    }

    @Override
    public List<Facture> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Facture findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Facture facture, String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
