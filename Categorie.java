/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cabinet;

/**
 *
 * @author hp
 */
public class Categorie {
    private String id;
    private String designation;
    private String description;

    // Constructeur complet
    public Categorie(String id, String designation, String description) {
        this.id = id;
        this.designation = designation;
        this.description = description;
    }

    // Getters & Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Pour afficher correctement dans JComboBox
    @Override
    public String toString() {
        return designation;
    }
    
}
