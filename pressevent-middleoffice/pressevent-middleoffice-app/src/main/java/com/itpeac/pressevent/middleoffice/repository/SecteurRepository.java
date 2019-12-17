package com.itpeac.pressevent.middleoffice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itpeac.pressevent.middleoffice.domain.Secteur;


@Repository
public interface SecteurRepository extends JpaRepository<Secteur, Long> {
	// @RestResource(path="/byev")
	// public List<Secteur> findBy
	// List<Secteur> sect();

}
