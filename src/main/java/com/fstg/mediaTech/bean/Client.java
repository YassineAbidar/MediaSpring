/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.mediaTech.bean;

import com.sun.istack.NotNull;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import static org.thymeleaf.util.SetUtils.size;

/**
 *
 * @author yassine
 */
@Entity
@Table(name = "clients")
public class Client implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String code_client;

    @NotNull
    private String nom;
    @NotNull
    private String prenom;
    @NotNull
    private String tele;

    public Client() {
    }

    public Client(Long id, String nom, String prenom, String tele) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.tele = tele;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getCode_client() {
        return code_client;
    }

    public Client(String code_client, String nom, String prenom, String tele) {
        this.code_client = code_client;
        this.nom = nom;
        this.prenom = prenom;
        this.tele = tele;
    }

    public void setCode_client(String code_client) {
        this.code_client = code_client;
    }

    public Client(String nom, String prenom, String tele) {
        this.nom = nom;
        this.prenom = prenom;
        this.tele = tele;
    }

}
