package com.wael.pays.service;

import java.util.List;


import com.wael.pays.entities.Pays;
import com.wael.pays.entities.Ville;

public interface VilleService {
	Ville saveVille(Ville v);
	Ville updateVille(Ville v);
	void deleteVille(Ville v);
	void deleteVilleById(Long id);
	Ville getVille(Long id);
	List<Ville> getAllVilles();
	List<Ville> findByNomVille(String nom);
	List<Ville> findByNomVilleContains(String nom); 
	List<Ville> findByNomVilleSurface (String nom, Double surface);
	List<Ville> findByPays (Pays pays);
	List<Ville> findByPaysIdPays(Long id);
	List<Ville> findByOrderByNomVilleAsc();
	List<Ville> trierVillesNomsSurface ();
}
