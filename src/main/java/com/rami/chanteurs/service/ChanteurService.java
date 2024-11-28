package com.rami.chanteurs.service;

import java.util.List;

import com.rami.chanteurs.entities.Categorie;
import com.rami.chanteurs.entities.Chanteur;

public interface ChanteurService {
	Chanteur saveChanteur(Chanteur p);
	Chanteur updateChanteur(Chanteur p);
	void deleteChanteur(Chanteur p);
	 void deleteChanteurById(Long id);
	 Chanteur getChanteur(Long id);
	List<Chanteur> getAllChanteurs();
	List<Chanteur> findByNomChanteur(String nom);
	List<Chanteur> findByNomChanteurContains(String nom);
	List<Chanteur> findByNomPrix (String nom, Double prix);
	List<Chanteur> findByCategorie (Categorie categorie);
	List<Chanteur> findByCategorieIdHipHop(Long id);
	List<Chanteur> findByOrderByNomChanteurAsc();
	List<Chanteur> trierChanteursNomsPrix();


}
