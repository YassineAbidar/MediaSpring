/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.mediaTech.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author yassine
 */
@Entity
public class Client implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String reference;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Client(String reference, String nom, String prenom, String tele) {
        this.reference = reference;
        this.nom = nom;
        this.prenom = prenom;
        this.tele = tele;
    }
    private String nom;
    private String prenom;
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

    public Client(String nom, String prenom, String tele) {
        this.nom = nom;
        this.prenom = prenom;
        this.tele = tele;
    }

}
