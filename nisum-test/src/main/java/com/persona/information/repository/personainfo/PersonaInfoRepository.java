package com.persona.information.repository.personainfo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.persona.information.model.Persona;

@Repository
public interface PersonaInfoRepository extends JpaRepository<Persona, Integer>, CrudRepository<Persona, Integer>
{
	 
}
