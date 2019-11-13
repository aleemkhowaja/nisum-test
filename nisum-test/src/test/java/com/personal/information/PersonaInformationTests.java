package com.personal.information;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.persona.information.controller.PersonalInfoController;

@RunWith(SpringRunner.class)
@WebMvcTest(PersonalInfoController.class)
public class PersonaInformationTests {
	
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testfindPersona() throws Exception {
		mockMvc.perform(get("/persona/findAll")).andExpect(status().isOk())
				.andExpect(content().contentType("application/json;charset=UTF-8"))
				.andExpect(jsonPath("$.id").value("1")).andExpect(jsonPath("$.name").value("Rakesh"))
				.andExpect(jsonPath("$.lastName").value("aa")).andExpect(jsonPath("$.address").value("bb"))
				.andExpect(jsonPath("$.phoneNumber").value("123")).andExpect(jsonPath("$.hairColorEnum").value("YELLOW"))
				.andExpect(jsonPath("$.statusEnum").value("ACTIVE"));

	}


}
