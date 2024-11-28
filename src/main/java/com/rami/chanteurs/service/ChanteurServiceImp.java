package com.rami.chanteurs.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rami.chanteurs.entities.Categorie;
import com.rami.chanteurs.entities.Chanteur;
import com.rami.chanteurs.repos.ChanteurRepository;
@Service
public class ChanteurServiceImp implements ChanteurService{
	
	@Autowired
	ChanteurRepository chanteurRepository;

	@Override
	public Chanteur saveChanteur(Chanteur p) {
		return chanteurRepository.save(p);
	}

	@Override
	public Chanteur updateChanteur(Chanteur p) {
		return chanteurRepository.save(p);
	}

	@Override
	public void deleteChanteur(Chanteur p) {
		chanteurRepository.delete(p);
	}

	@Override
	public void deleteChanteurById(Long id) {
		chanteurRepository.deleteById(id);
	}

	@Override
	public Chanteur getChanteur(Long id) {
		return chanteurRepository.findById(id).get();
	}

	@Override
	public List<Chanteur> getAllChanteurs() {
		return chanteurRepository.findAll();
	}

	@Override
	public List<Chanteur> findByNomChanteur(String nom) {
		return chanteurRepository.findByNomChanteur(nom);
	}

	@Override
	public List<Chanteur> findByNomChanteurContains(String nom) {
		return chanteurRepository.findByNomChanteurContains(nom);
	}

	@Override
	public List<Chanteur> findByNomPrix(String nom, Double prix) {
	    return chanteurRepository.findByNomPrix(nom, prix);
	}


	@Override
	public List<Chanteur> findByCategorie(Categorie categorie) {
		return chanteurRepository.findByCategorie(categorie);
	}

	@Override
	public List<Chanteur> findByCategorieIdHipHop(Long id) {
		return chanteurRepository.findByCategorieIdHipHop(id);
	}

	@Override
	public List<Chanteur> findByOrderByNomChanteurAsc() {
		return chanteurRepository.findByOrderByNomChanteurAsc();
	}

	@Override
	public List<Chanteur> trierChanteursNomsPrix() {
		return chanteurRepository.trierChanteursNomsPrix();
	}
	
}
