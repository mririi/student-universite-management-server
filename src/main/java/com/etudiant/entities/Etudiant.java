package com.etudiant.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private String nom;
    private String prenom;
    private Date dateInscri;
    private String Section;

    @ManyToOne
    private Universite universite;

    public Etudiant() {
        super();
    }

    public Etudiant(String nom, String prenom, Date dateInscri, String section) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.dateInscri = dateInscri;
        this.Section = section;
    }

    public Long getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(Long idEtudiant) {
        this.idEtudiant = idEtudiant;
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

    public Date getDateInscri() {
        return dateInscri;
    }

    public void setDateInscri(Date dateInscri) {
        this.dateInscri = dateInscri;
    }

    public String getSection() {
        return Section;
    }

    public void setSection(String section) {
        this.Section = section;
    }

    public Universite getUniversite() {
        return universite;
    }

    public void setUniversite(Universite universite) {
        this.universite = universite;
    }

    @Override
    public String toString() {
        return "Etudiant [idEtudiant=" + idEtudiant + ", Nom=" + nom + ", Prenom=" + prenom + ", dateInscri="
                + dateInscri + ", Section=" + Section + "]";
    }


}

