package com.devsuperior.bds04.services.validation;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.devsuperior.bds04.dto.CityInsertDTO;
import com.devsuperior.bds04.exceptions.FieldMessage;
import com.devsuperior.bds04.repositories.CityRepository;

public class CityInsertValidator implements ConstraintValidator<CityInsertValid, CityInsertDTO> {
	
	@Autowired
	private CityRepository repository;
	
	@Override
	public void initialize(CityInsertValid ann) {
	}

	@Override
	public boolean isValid(CityInsertDTO dto, ConstraintValidatorContext context) {
		
		List<FieldMessage> list = new ArrayList<>();
		
		// Coloque aqui seus testes de validação, acrescentando objetos FieldMessage à lista
		
		//Não precisou :D

		for (FieldMessage e : list) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(e.getMessage()).addPropertyNode(e.getFieldName())
					.addConstraintViolation();
		}
		return list.isEmpty();
	}
}