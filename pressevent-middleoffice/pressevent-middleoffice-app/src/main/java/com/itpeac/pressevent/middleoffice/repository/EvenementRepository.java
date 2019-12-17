package com.itpeac.pressevent.middleoffice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.itpeac.pressevent.middleoffice.domain.Evenement;

@Repository
public interface EvenementRepository extends JpaRepository<Evenement, Long> {

	
	
	@Query("FROM Evenement e WHERE  e.utilisateur.nom = :nom")
	List<Evenement>findByNom(@Param("nom")String nom);
	// List <Evenement> findAllEventByCategoryId(@Param("id")Long id);
	// EvenementRepository evenementRepository;
	// @Query("SELECT * FROM Evenement e GROUP BY id_secteur ")
	// @RestResource(path="/bycat")
	// List <Evenement>
	// findAllEventByCategoryId=evenementRepository.findAllById(ids)
	// @Query("from Evenement e where e.id_secteur = :id")
	// @RestResource(path ="/byUserName")
	// public List<Evenement> findBy

}
