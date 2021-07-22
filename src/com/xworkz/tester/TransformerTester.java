package com.xworkz.tester;

import com.xworkz.dto.TransformerDTO;
import com.xworkz.service.TransformerService;
import com.xworkz.service.TransformerServiceImpl;

public class TransformerTester {

	public static void main(String[] args) {
		
	TransformerDTO dto = new TransformerDTO("Harsha", "Ananthapuram", null, "fighting", "playing", "staying home","coding and playing");
	
	TransformerService transformerService = new TransformerServiceImpl();
	transformerService.validateAndSave(dto);
	
	}
}