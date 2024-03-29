package com.itpeac.pressevent.middleoffice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itpeac.pressevent.middleoffice.domain.Utilisateur;
@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>{

}
