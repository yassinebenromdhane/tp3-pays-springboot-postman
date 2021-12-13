package com.wael.pays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.wael.pays.entities.Pays;
import com.wael.pays.entities.Ville;
import com.wael.pays.repos.VilleRepository;

import java.util.List;

@SpringBootTest
class PaysApplicationTests {

	@Autowired
	private VilleRepository villeRepository;
	@Test
	public void testCreateVille() {
	Ville ville = new Ville("Paris",23.3,100);
	villeRepository.save(ville);
	}
	
	@Test
	public void testFindVille()
	{
	Ville v = villeRepository.findById(1L).get();

	System.out.println(v);
	}
	
	
	@Test
	public void testUpdateVille()
	{
	Ville v = villeRepository.findById(1L).get();
	v.setSurfaceVille(30.0);
	villeRepository.save(v);
	}
	
	@Test
	public void testDeleteVille()
	{
	villeRepository.deleteById(1L);;
	}
	
	@Test
	public void testListerTousVilles()
	{
	List<Ville> ville = villeRepository.findAll();
	for (Ville v : ville)
	{
	System.out.println(v);
	}

}
	
	@Test
	public void testFindByNomVille()
	{
	List<Ville> villes = villeRepository.findByNomVille("France");
	for (Ville v : villes)
	{
	System.out.println(v);
	}
	}
	
	@Test
	public void testFindByNomVilleContains()
	{
	List<Ville> villes = villeRepository.findByNomVilleContains("Fra");
	for (Ville v : villes)
	{
	System.out.println(v);
	}
	}
	
	
	@Test
	public void testFindByNomVilleSurface()
	{
	List<Ville> villes = villeRepository.findByNomVilleSurface("France", 23.3);
	for (Ville v : villes)
	{
	System.out.println(v);
	}
	}

	@Test
	public void testfindByPays()
	{
	Pays pays = new Pays();
	pays.setIdPays(1L);
	List<Ville> villes = villeRepository.findByPays(pays);
	for (Ville v : villes)
	{
	System.out.println(v);
	}
	}
	
	@Test
	public void findByPaysIdPays()
	{
	List<Ville> villes = villeRepository.findByPaysIdPays(1L);
	for (Ville v : villes)
	{
	System.out.println(v);
	}
	 }
	
	@Test
	public void testFindByOrderByNomVilleAsc()
	{
	List<Ville> villes = villeRepository.findByOrderByNomVilleAsc();
	for (Ville v : villes)
	{
	System.out.println(v);
	}
	}
	
	@Test
	public void testTrierVillesNomsSurface()
	{
	List<Ville> villes = villeRepository.trierVillesNomsSurface();
	for (Ville v : villes)
	{
	System.out.println(v);
	}
	}
	

}
