package com.rami.chanteurs;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.rami.chanteurs.entities.Categorie;
import com.rami.chanteurs.entities.Chanteur;
import com.rami.chanteurs.repos.ChanteurRepository;

@SpringBootTest
class ChanteursApplicationTests {

	@Autowired
	private ChanteurRepository chanteurRepository;
	@Test
	public void testCreateChanteur() {
	Chanteur prod = new Chanteur("mike",350.00,new Date());
	chanteurRepository.save(prod);
	}
	@Test
	public void testFindChanteur()
	{
	Chanteur p = chanteurRepository.findById(1L).get();
	System.out.println(p);
	}
	@Test
	public void testUpdateChanteur()
	{
	Chanteur p = chanteurRepository.findById(1L).get();
	p.setPrixconcert(1000);
	chanteurRepository.save(p);
	System.out.println(p);
	}
	
	
	public void testDeleteChanteur()
	{
	
	chanteurRepository.deleteById(1L);
	}
	
	
	@Test
	public void testListerTousChanteurs()
	{
	List<Chanteur> prods = chanteurRepository.findAll();
	for (Chanteur p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testFindChanteurByNom()
	{
		List<Chanteur> prods = chanteurRepository.findByNomChanteur("mike");
	for (Chanteur p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testFindChanteurByNomContains()
	{
		List<Chanteur> prods = chanteurRepository.findByNomChanteurContains("m");
	for (Chanteur p : prods)
	{
	System.out.println(p);
	}
	}
	 @Test
	    public void testFindByNomPrix() {
	        List<Chanteur> chanteurs = chanteurRepository.findByNomPrix("mike", 500.0);
	        for (Chanteur p : chanteurs)
	        {
	        System.out.println(p);
	        }

	    }
	 @Test
	 public void testfindByCategorie()
	 {
	 Categorie cat = new Categorie();
	 cat.setIdHipHop(1L);
	 List<Chanteur> prods = chanteurRepository.findByCategorie(cat);
	 for (Chanteur p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 @Test
	 public void findByCategorieIdCat()
	 {
	 List<Chanteur> prods = chanteurRepository.findByCategorieIdHipHop(1L);
	 for (Chanteur p : prods)
	 {
	 System.out.println(p);
	 }
	  }
	 @Test
	 public void testfindByOrderByNomChanteurAsc()
	 {
	 List<Chanteur> prods =
	 chanteurRepository.findByOrderByNomChanteurAsc();
	 for (Chanteur p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 @Test
	 public void testTrierChanteursNomsPrix()
	 {
	 List<Chanteur> prods = chanteurRepository.trierChanteursNomsPrix();
	 for (Chanteur p : prods)
	 {
	 System.out.println(p);
	 }
	 }

}
