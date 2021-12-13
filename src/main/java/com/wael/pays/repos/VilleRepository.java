package com.wael.pays.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.wael.pays.entities.Pays;
import com.wael.pays.entities.Ville;

@RepositoryRestResource(path = "rest")
public interface VilleRepository extends JpaRepository<Ville,Long> {
	
	List<Ville> findByNomVille(String nom);
	List<Ville> findByNomVilleContains(String nom); 
	
	@Query("select v from Ville v where v.nomVille like %?1 and v.surfaceVille > ?2")
	List<Ville> findByNomVilleSurface (String nom, Double surface);
	
	@Query("select v from Ville v where v.pays = ?1")
	List<Ville> findByPays (Pays pays);
	
	List<Ville> findByPaysIdPays(Long id);
	
	List<Ville> findByOrderByNomVilleAsc();
	
	@Query("select v from Ville v order by v.nomVille ASC, v.surfaceVille DESC")
	List<Ville> trierVillesNomsSurface ();



}
