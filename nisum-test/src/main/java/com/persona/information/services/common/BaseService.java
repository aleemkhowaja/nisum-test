package com.persona.information.services.common;
 
import java.util.List;

public interface BaseService<T,V,M> {
	
	/**
	 * create Persona Information
	 * @param createDto
	 * @return
	 */
	 M create(V createDto);
	
	 /**
	  * retrieve Persona Information by Id
	  * @param modelId
	  * @return
	  */
	 M detail(Integer modelId);
	
	 /**
	  * retrieve all Persona Information
	  * @return
	  */
	 List<M> findAll();
	 
	 /**
	  * Delete Persona Information
	  * @param modelId
	  * @return
	  */
	 Integer delete(Integer modelId);
	
}
