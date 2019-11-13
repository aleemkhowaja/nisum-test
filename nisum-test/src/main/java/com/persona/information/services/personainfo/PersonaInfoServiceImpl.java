package com.persona.information.services.personainfo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import com.persona.information.dto.PersonaInfoRequestDto;
import com.persona.information.enums.HairColorEnum;
import com.persona.information.enums.StatusEnum;
import com.persona.information.model.Persona;
import com.persona.information.repository.personainfo.PersonaInfoRepository;

import constants.CommonConstants;

@Service
public class PersonaInfoServiceImpl implements PersonaInfoService {

	@Autowired
	PersonaInfoRepository personaInfoRepository;
	
	@Override
	public Persona create(PersonaInfoRequestDto dto) 
	{
		Persona persona = new Persona();
		persona.setName(dto.getName());
		persona.setLastName(dto.getLastName());
		persona.setAddress(dto.getAddress());
		persona.setPhoneNumber(dto.getPhoneNumber());
		persona.setHairColorEnum(HairColorEnum.fromText(dto.getHairColorEnum()));
		persona.setStatusEnum(StatusEnum.ACTIVE);
		return personaInfoRepository.save(persona);
	}


	@Override
	public Integer delete(Integer id) 
	{
		Persona persona = personaInfoRepository.findById(id)
				.orElseThrow(() -> new ResourceAccessException(CommonConstants.PERSONA_NOT_FOUND));
		
		persona.setStatusEnum(StatusEnum.DELETED);
		personaInfoRepository.save(persona);
		
		return CommonConstants.ONE_ROW;
	}

	@Override
	public Persona detail(Integer id) 
	{
		Persona persona = personaInfoRepository.findById(id)
				.orElseThrow(() -> new ResourceAccessException(CommonConstants.PERSONA_NOT_FOUND));

		return persona;
	}


	@Override
	public List<Persona> findAll() {
		
		List<Persona> personsList = new ArrayList<Persona>();

		for (Persona user : personaInfoRepository.findAll()) {
			personsList.add(user);
		}
		return personsList;
	}

}
