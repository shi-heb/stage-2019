
package com.itpeac.pressevent.middleoffice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.itpeac.pressevent.middleoffice.FileService;
import com.itpeac.pressevent.middleoffice.domain.Evenement;
import com.itpeac.pressevent.middleoffice.domain.EvenementDTO;
import com.itpeac.pressevent.middleoffice.repository.EvenementRepository;
import com.itpeac.pressevent.middleoffice.repository.SecteurRepository;
import com.itpeac.pressevent.middleoffice.repository.TypeRepository;
import com.itpeac.pressevent.middleoffice.repository.UtilisateurRepository;

@RestController
@RequestMapping("/api/evenements")
public class EvenementController {
	@Autowired
	public EvenementRepository evenementRepository;
	
	private final FileService fileService;
	
	@Autowired
	public EvenementController(FileService fileService) {
		this.fileService = fileService;
	}

 @Autowired
	 public UtilisateurRepository utilisateurRepository;
 
 @Autowired
 public SecteurRepository secteurRepository;
 
 @Autowired
 public TypeRepository typeRepository;
 
	// @Autowired
	// public EvenementDTORepository evenementDTORepository;

	@GetMapping
	public List<Evenement/* DTO */> getAll() {
		/* List<Evenement> res = */return (List<Evenement>) evenementRepository.findAll();  

//		List<EvenementDTO> evtsDto = new ArrayList<EvenementDTO>();
//		
//		for (Evenement evt : res) {
//			EvenementDTO dto = new EvenementDTO();
//			dto.setNom(evt.getNom());
//			evtsDto.add(dto);
//		}

		// return evtsDto;
	}
	@PutMapping("/update/{id}")
	void updateEvent(@PathVariable("id") long id,@RequestBody EvenementDTO evenementDTO) {
		Long a= id;
		List<Evenement> res = (List<Evenement>) evenementRepository.findAll();
		for (Evenement evt : res) {
			if(evt.getId()==a) {
				evt.setNom(evenementDTO.getNom());
				evt.setContact(evenementDTO.getContact());
				evt.setDateDebut(evenementDTO.getDateDebut());
				evt.setDescription(evenementDTO.getDescription());
				//evt.setType(evenementDTO.getType());
				evt.setType(typeRepository.getOne(evenementDTO.getType().getId()));
				//evt.setSecteur(evenementDTO.getSecteur());
				evt.setSecteur(secteurRepository.getOne(evenementDTO.getSecteur().getId()));
				evt.setImage( evenementDTO.getImage());
				evt.setDatePub(evenementDTO.getDatePub());  
				//evt.setLocation(evenementDTO.getPays(), evenementDTO.getVille(), evenementDTO.getRue());
				//evt.setLocation(evenementDTO.getLocation().getPays(),evenementDTO.getLocation().getVille());
				evt.setLocation(evenementDTO.getLocation().getPays(),evenementDTO.getLocation().getVille());
				//evt.setUtilisateur(evenementDTO.getUtilisateur());
				evt.setUtilisateur(utilisateurRepository.getOne(evenementDTO.getUtilisateur().getId()));
				evt.setEmail(evenementDTO.getEmail());
				evt.setLien(evenementDTO.getLien());
				evt.setLat(evenementDTO.getLat());
				evt.setLg(evenementDTO.getLg());
				evenementRepository.save(evt);
			}}}
	
	
	
	
		
		
		
	

	@GetMapping("/{id}")
	public Optional<Evenement> getEvenementById(@PathVariable("id") long id) {
		return evenementRepository.findById(id);   
	}
	@RequestMapping(value= "/events")
	public  List<Evenement> getEvenementByNom(@RequestParam("nom") String nom) {
		return evenementRepository.findByNom(nom);   
	}
	
	

	@PostMapping()
	void addEvent(@RequestBody EvenementDTO evenementDTO ) {

//		evenementRepository.save(evenement);
//		EvenementDTO evenementDTO = new EvenementDTO();
//		evenementDTO.setNom(evenement.getNom());
//		 evenementDTORepository.save(evenementDTO);
		Evenement evenement=new Evenement();
		evenement.setNom(evenementDTO.getNom());
		evenement.setContact(evenementDTO.getContact());
		evenement.setDateDebut(evenementDTO.getDateDebut());
		evenement.setDescription(evenementDTO.getDescription());
		evenement.setType(evenementDTO.getType());
		evenement.setSecteur(evenementDTO.getSecteur());
		evenement.setImage(evenementDTO.getImage());
		evenement.setDatePub(evenementDTO.getDatePub());
		evenement.setLocation(evenementDTO.getPays(), evenementDTO.getVille());
		evenement.setUtilisateur(evenementDTO.getUtilisateur());
		evenement.setEmail(evenementDTO.getEmail());
		evenement.setLien(evenementDTO.getLien());
		evenement.setLat(evenementDTO.getLat());
		evenement.setLg(evenementDTO.getLg());
		
		evenementRepository.save(evenement);
		}

	
	
	

	@DeleteMapping("/{id}")
	public void deleteevent(@PathVariable long id) {
		evenementRepository.deleteById(id);
	}

	/*
	 * @GetMapping("/events/{id}") public List<Evenement>
	 * getEvenement(@PathVariable("id") long id) { return
	 * evenementRepository.findEventCat(); }
	 */

	// @GetMapping("/search/{id}")
	// @Query("from Evenement e where e.id_secteur = :id")
//	public List<Evenement> getEvenementBycat(@PathVariable("id") long id) {
//		return evenementRepository.findBycat(id);
//
//	}
}
