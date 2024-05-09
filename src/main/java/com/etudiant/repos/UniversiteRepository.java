package com.etudiant.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.etudiant.entities.Universite;

@RepositoryRestResource(path = "rest")
public interface UniversiteRepository extends JpaRepository<Universite, Long> {
}
