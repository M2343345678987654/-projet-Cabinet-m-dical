/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cabinet;

/**
 *
 * @author hp
 */

public class Rendezvous {
    private String id;
    private String patient;
    private String date;
    private String heure;
    private String motif;

    public Rendezvous(String id, String patient, String date, String heure, String motif) {
        this.id = id;
        this.patient = patient;
        this.date = date;
        this.heure = heure;
        this.motif = motif;
    }

    public String getId() { return id; }
    public String getPatient() { return patient; }
    public String getDate() { return date; }
    public String getHeure() { return heure; }
    public String getMotif() { return motif; }

    public void setId(String id) { this.id = id; }
    public void setPatient(String patient) { this.patient = patient; }
    public void setDate(String date) { this.date = date; }
    public void setHeure(String heure) { this.heure = heure; }
    public void setMotif(String motif) { this.motif = motif; }

    void setRelance(String oui) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
