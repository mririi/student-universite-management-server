package com.etudiant.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.etudiant.entities.Universite;
import com.etudiant.service.UniversiteService;

@RestController
@RequestMapping("/api/university/")
@CrossOrigin
public class UniversiteRESTController {
    @Autowired
    UniversiteService universiteService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Universite getUniversiteById(@PathVariable("id") Long id) {
        return universiteService.getUniversite(id);

    }

    @RequestMapping(path = "all", method = RequestMethod.GET)
    public List<Universite> getAllUniversites() {
        return universiteService.getAllUniversites();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Universite createUniversite(@RequestBody Universite universite) {
        return universiteService.saveUniversite(universite);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Universite updateUniversite(@RequestBody Universite universite) {
        return universiteService.updateUniversite(universite);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteUniversite(@PathVariable("id") Long id) {
        universiteService.deleteUniversiteById(id);
    }
}
