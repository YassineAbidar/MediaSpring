/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.mediaTech.service.impl;

import com.fstg.mediaTech.bean.Produit;
import com.fstg.mediaTech.dao.IProduitDao;
import com.fstg.mediaTech.service.IProduitService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author yassine
 */
@Service
public class ProduitServiceImpl implements IProduitService {

    @Autowired
    private IProduitDao iProduitDao;

    @Override
    public void save(Produit produit) {
        iProduitDao.save(produit);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Produit> findAll() {
        
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return iProduitDao.findAll();
    }

    @Override
    public Produit findById(Long id) {
        return null;
//        return iProduitDao.findById(id);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Produit produit, String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(String ref) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
