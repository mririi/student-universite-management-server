package com.etudiant.repos;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.etudiant.entities.Etudiant;
import com.etudiant.entities.Universite;
@RepositoryRestResource(path = "rest")
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

	List<Etudiant> findByNom(String nom);
	List<Etudiant> findByNomContains(String nom);
	@Query("select p from Etudiant p where p.nom ='Riahi' and p.prenom = 'Hadil'")
	List<Etudiant> findByNomPrenom (String nom, String prenom);
	List<Etudiant> findByUniversite (Universite univeriste);
	List<Etudiant> findByUniversiteIdUni(Long id);

}