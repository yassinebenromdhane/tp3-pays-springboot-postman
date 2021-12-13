package com.wael.pays.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wael.pays.entities.Pays;
import com.wael.pays.entities.Ville;
import com.wael.pays.repos.VilleRepository;
@Service
public class VilleServiceImpl implements VilleService {
	
	@Autowired
	VilleRepository VilleRepository;
	@Override
	public Ville saveVille(Ville p) {
	return VilleRepository.save(p);
	}
	@Override
	public Ville updateVille(Ville p) {
	return VilleRepository.save(p);
	}
	@Override
	public void deleteVille(Ville p) {
	VilleRepository.delete(p);
	}
	@Override
	public void deleteVilleById(Long id) {
	VilleRepository.deleteById(id);
	}
	@Override
	public Ville getVille(Long id) {
	return VilleRepository.findById(id).get();
	}
	@Override
	public List<Ville> getAllVilles() {
	return VilleRepository.findAll();
	}
	@Override
	public List<Ville> findByNomVille(String nom) {
		// TODO Auto-generated method stub
		return VilleRepository.findByNomVille(nom);
	}
	@Override
	public List<Ville> findByNomVilleContains(String nom) {
		// TODO Auto-generated method stub
		return VilleRepository.findByNomVilleContains(nom);
	}
	@Override
	public List<Ville> findByNomVilleSurface(String nom, Double surface) {
		// TODO Auto-generated method stub
		return VilleRepository.findByNomVilleSurface(nom, surface);
	}
	@Override
	public List<Ville> findByPays(Pays pays) {
		// TODO Auto-generated method stub
		return VilleRepository.findByPays(pays);
	}
	@Override
	public List<Ville> findByPaysIdPays(Long id) {
		// TODO Auto-generated method stub
		return VilleRepository.findByPaysIdPays(id);
	}
	@Override
	public List<Ville> findByOrderByNomVilleAsc() {
		// TODO Auto-generated method stub
		return VilleRepository.findByOrderByNomVilleAsc();
	}
	@Override
	public List<Ville> trierVillesNomsSurface() {
		// TODO Auto-generated method stub
		return VilleRepository.trierVillesNomsSurface();
	}

}
