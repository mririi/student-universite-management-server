package com.etudiant;

import java.util.Date;
import java.util.List;

import com.etudiant.repos.EtudiantRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.etudiant.entities.Etudiant;
import com.etudiant.entities.Universite;

@SpringBootTest
class EtudiantsApplicationTests {
	@Autowired
	private EtudiantRepository etudiantRepository;
	
	@Test
	public void testCreateEtudiant() {
		Etudiant etud = new Etudiant("lastname","firstname",new Date(),"RSI");
		etudiantRepository.save(etud);
	}
	@Test
	public void testFindEtudiant()
	{
	Etudiant e = etudiantRepository.findById(1L).get();
	System.out.println(e);
	}
	
	@Test
	public void testUpdateEtudiant()
	{
		Etudiant e = etudiantRepository.findById(1L).get();
	e.setSection("TEST");
	etudiantRepository.save(e);
	}
	
	@Test
	public void testFindByNom()
	{
	List<Etudiant> etuds = etudiantRepository.findByNom("lastname");

	for (Etudiant e : etuds)
	{
	System.out.println(e);
	}

	}
	@Test
	public void testFindByNomContains ()
	{
	List<Etudiant> etuds=etudiantRepository.findByNomContains("lastname");

	for (Etudiant e : etuds)
	{
	System.out.println(e);
	} }
	
	@Test
	public void testfindByNomPrenom()
	{
	List<Etudiant> etuds = etudiantRepository.findByNomPrenom("lastname","firstname");
	for (Etudiant e : etuds)
	{
	System.out.println(e);
	}

	}
	
	@Test
	public void testfindByUniversite()
	{
	Universite uni = new Universite();
	uni.setIdUni(1L);
	List<Etudiant> etuds = etudiantRepository.findByUniversite(uni);
	for (Etudiant e : etuds)
	{
	System.out.println(e);
	}

	}
	
	@Test
	public void findByCategorieIdCat()
	{
	List<Etudiant> etuds = etudiantRepository.findByUniversiteIdUni(1L);
	for (Etudiant e : etuds)
	{
	System.out.println(e);
	}

	}
}
