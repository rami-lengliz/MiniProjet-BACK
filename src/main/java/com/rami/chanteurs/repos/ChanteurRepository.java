package com.rami.chanteurs.repos;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rami.chanteurs.entities.Categorie;
import com.rami.chanteurs.entities.Chanteur;

@RepositoryRestResource(path = "rest")
public interface ChanteurRepository extends JpaRepository<Chanteur, Long> {
    List<Chanteur> findByNomChanteur(	String nomChanteur);
    List<Chanteur> findByNomChanteurContains(String nomChanteur);

    @Query("select c from Chanteur c where lower(c.nomChanteur) like lower(concat('%', :nom, '%')) and c.prixconcert > :prix")
    List<Chanteur> findByNomPrix(@Param("nom") String nom, @Param("prix") Double prix);


    @Query("select c from Chanteur c where c.categorie = :categorie")
    List<Chanteur> findByCategorie(@Param("categorie") Categorie categorie);

    List<Chanteur> findByCategorieIdHipHop(Long idHipHop);

    List<Chanteur> findByOrderByNomChanteurAsc();
    
    @Query("select c from Chanteur c order by c.nomChanteur ASC, c.prixconcert DESC")
    List<Chanteur> trierChanteursNomsPrix();
    
   
}
