package com.itpeac.pressevent.middleoffice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itpeac.pressevent.middleoffice.domain.Type;

@Repository
public interface TypeRepository extends JpaRepository<Type, Long> {

}
