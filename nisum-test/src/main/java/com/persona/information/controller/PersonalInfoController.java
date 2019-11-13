package com.persona.information.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.persona.information.dto.PersonaInfoRequestDto;
import com.persona.information.model.Persona;
import com.persona.information.services.personainfo.PersonaInfoService;

@RestController
@RequestMapping(value = "/persona")
public class PersonalInfoController {

	@Autowired
	private PersonaInfoService personaInfoService ;

	@GetMapping("/findAll")
	public List<Persona> returnAllPersona() {
		return personaInfoService.findAll();
	}
	
	@PostMapping(value = "/save")
	@ResponseBody
	public ResponseEntity<Persona> create( @RequestBody @Valid PersonaInfoRequestDto createDto) {
		return new ResponseEntity<Persona>(personaInfoService.create(createDto), HttpStatus.OK);
	}

	@GetMapping(value = "/edit/{id}")
	@ResponseBody
	public ResponseEntity<Persona> detail(@PathVariable @Valid Integer id) {
		return new ResponseEntity<Persona>(
				personaInfoService.detail(id), HttpStatus.OK);
	}


	@DeleteMapping(value = "/delete/{id}")
	@ResponseBody
	public ResponseEntity<Integer> delete(@PathVariable @Valid Integer id) {
		return new ResponseEntity<Integer>(personaInfoService.delete(id), HttpStatus.OK);
	}

}
