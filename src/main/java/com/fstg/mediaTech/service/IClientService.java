/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.mediaTech.service;

import com.fstg.mediaTech.bean.Client;
import java.util.List;

/**
 *
 * @author yassine
 */
public interface IClientService {

    public void save(Client client);

    public List<Client> findAll();

    public Client findById(Long id);

    public int update(Client client, String ref);

    public int delete(String ref);

}
