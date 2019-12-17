package com.itpeac.pressevent.middleoffice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itpeac.pressevent.middleoffice.domain.Secteur;
import com.itpeac.pressevent.middleoffice.repository.SecteurRepository;

@RestController
@RequestMapping("api/secteurs")
public class SecteurController {
	
	@Autowired
	public SecteurRepository secteurRepository;

	@GetMapping
	public List<Secteur> findAll() {
		return (List<Secteur>) secteurRepository.findAll();
	}

	@PostMapping
	void addEvent(@RequestBody Secteur secteur) {

		secteurRepository.save(secteur);
	}

	@GetMapping("/{id}")
	public Optional<Secteur> getSecteurById(@PathVariable("id") long id) {
		return secteurRepository.findById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable long id) {
		secteurRepository.deleteById(id);
	}

}
