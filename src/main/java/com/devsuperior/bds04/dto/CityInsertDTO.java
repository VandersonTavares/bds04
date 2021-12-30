package com.devsuperior.bds04.dto;

import com.devsuperior.bds04.services.validation.CityInsertValid;

@CityInsertValid
public class CityInsertDTO extends CityDTO {
	private static final long serialVersionUID = 1L;
	
	private String password;
	
	CityInsertDTO(){
		super();
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}
