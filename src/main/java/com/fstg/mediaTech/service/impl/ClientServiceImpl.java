/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.mediaTech.service.impl;

import com.fstg.mediaTech.bean.Client;
import com.fstg.mediaTech.dao.IClientDao;
import com.fstg.mediaTech.service.IClientService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author yassine
 */
@Service
public class ClientServiceImpl implements IClientService {

    @Autowired
    private IClientDao clientDao;

    @Override
    public void save(Client client) {
        clientDao.save(client);
    }

    @Override
    public List<Client> findAll() {
        return clientDao.findAll();
    }

    @Override
    public Client findById(Long id) {
        return null;
    }

    @Override
    public int update(Client client, String ref) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 0;
    }

    @Override
    public int delete(String ref) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 0;
    }

}
