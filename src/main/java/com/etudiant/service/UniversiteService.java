package com.etudiant.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.etudiant.entities.Universite;

@Service
public interface UniversiteService {
	Universite saveUniversite(Universite u);
	Universite updateUniversite(Universite u);
	void deleteUniversiteById(Long id);
	Universite getUniversite(Long id);
	List<Universite> getAllUniversites();
}
