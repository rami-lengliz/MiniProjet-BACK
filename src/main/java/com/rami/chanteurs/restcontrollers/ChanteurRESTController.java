package com.rami.chanteurs.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rami.chanteurs.entities.Chanteur;
import com.rami.chanteurs.service.ChanteurService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ChanteurRESTController {

    @Autowired
    ChanteurService chanteurService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Chanteur> getAllChanteurs() {
        return chanteurService.getAllChanteurs();
    }
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Chanteur getChanteurById(@PathVariable("id") Long id) {
    return chanteurService.getChanteur(id);
     }
    @RequestMapping(method = RequestMethod.POST)
    public Chanteur createChanteur(@RequestBody Chanteur chanteur) {
    return chanteurService.saveChanteur(chanteur);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public Chanteur updateChanteur(@RequestBody Chanteur chanteur) {
    return chanteurService.updateChanteur(chanteur);
    }
    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deleteChanteur(@PathVariable("id") Long id)
    {
    chanteurService.deleteChanteurById(id);
    }
    @RequestMapping(value="/prodscat/{idHipHop}",method = RequestMethod.GET)
    public List<Chanteur> getChanteursByHipHopId(@PathVariable("idHipHop") Long idHipHop) {
    return chanteurService.findByCategorieIdHipHop(idHipHop);
    }




}