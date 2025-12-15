/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cabinet;

/**
 *
 * @author hp
 */
public class consultation {

    private String id;
    private String patient;
    private String date;
    private String prix;          // 🔥 prix maintenant en String
    private String categorie;
    private String description;

    public consultation(String id, String patient, String date, String prix, String categorie, String description) {
        this.id= id;
        this.patient = patient;
        this.date = date;
        this.prix = prix;                    // ✔ correspond bien à String
        this.categorie = categorie;
        this.description = description;
    }

    // ---------- GETTERS ----------
    public String getId() {
        return id;
    }

    public String getPatient() {
        return patient;
    }

    public String getDate() {
        return date;
    }

    public String getPrix() {
        return prix;
    }

    public String getCategorie() {
        return categorie;
    }

    public String getDescription() {
        return description;
    }

    // ---------- SETTERS ----------
    public void setId(String id) {
        this.id = id;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
