package com.etudiant.restcontrollers;

import java.util.List;

import com.etudiant.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.etudiant.entities.Etudiant;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class EtudiantRESTController {
    @Autowired
    EtudiantService etudiantService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.getAllEtudiants();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Etudiant getEtudiantById(@PathVariable("id") Long id) {
        return etudiantService.getEtudiant(id);

    }

    @RequestMapping(path = "all", method = RequestMethod.GET)
    public List<Etudiant> getAllEtudiant() {
        return etudiantService.getAllEtudiants();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Etudiant createEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.saveEtudiant(etudiant);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.updateEtudiant(etudiant);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteProduit(@PathVariable("id") Long id) {
        etudiantService.deleteEtudiantById(id);
    }

    @RequestMapping(value = "/etuds/{idUni}", method = RequestMethod.GET)
    public List<Etudiant> getEtudiantsByUniversiteId(@PathVariable("idUni") Long idUni) {
        return etudiantService.findByUniversiteIdUni(idUni);
    }
}
