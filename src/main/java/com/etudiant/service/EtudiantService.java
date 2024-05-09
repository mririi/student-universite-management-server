package com.etudiant.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.etudiant.entities.Etudiant;

@Service
public interface EtudiantService {

    Etudiant saveEtudiant(Etudiant e);

    Etudiant updateEtudiant(Etudiant e);

    void deleteEtudiantById(Long id);

    Etudiant getEtudiant(Long id);

    List<Etudiant> getAllEtudiants();

    List<Etudiant> findByUniversiteIdUni(Long id);
}

