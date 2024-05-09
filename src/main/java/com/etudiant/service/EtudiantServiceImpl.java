package com.etudiant.service;

import java.util.List;

import com.etudiant.repos.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etudiant.entities.Etudiant;

@Service
public class EtudiantServiceImpl implements EtudiantService {
    @Autowired
    EtudiantRepository etudiantRepository;

    @Override
    public Etudiant saveEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public void deleteEtudiantById(Long id) {
        etudiantRepository.deleteById(id);
    }

    @Override
    public Etudiant getEtudiant(Long id) {
        return etudiantRepository.findById(id).get();
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public List<Etudiant> findByUniversiteIdUni(Long id) {
        return etudiantRepository.findByUniversiteIdUni(id);
    }
}
