package com.wael.pays.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.wael.pays.entities.Ville;
import com.wael.pays.service.VilleService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class VilleRESTController {
	
	@Autowired
	VilleService villeService;
	@RequestMapping(method = RequestMethod.GET)
	public List<Ville> getAllVilles() {
	return villeService.getAllVilles();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Ville getVilleById(@PathVariable("id") Long id) {
	return villeService.getVille(id);
	 }
	
	@RequestMapping(method = RequestMethod.POST)
	public Ville createVille(@RequestBody Ville ville) {
	return villeService.saveVille(ville);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Ville updateVille(@RequestBody Ville ville) {
	return villeService.updateVille(ville);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteVille(@PathVariable("id") Long id)
	{
	villeService.deleteVilleById(id);
	}
	
	
	@RequestMapping(value="/ville_pays/{idPays}",method = RequestMethod.GET)
	public List<Ville> getVillesByPaysId(@PathVariable("idPays") Long idPays) {
	return villeService.findByPaysIdPays(idPays);
	}
	

}
