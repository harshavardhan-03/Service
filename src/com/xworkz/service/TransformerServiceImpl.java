package com.xworkz.service;

import com.xworkz.dao.TransformerDAO;
import com.xworkz.dao.TransformerDAOImpl;
import com.xworkz.dto.TransformerDTO;

public class TransformerServiceImpl implements TransformerService {
	private TransformerDAO dao = new TransformerDAOImpl();

	@Override
	public String validateAndSave(TransformerDTO dto) {

		boolean nameValid = false;
		boolean placeValid = false;
		boolean angryValid = false;
		boolean happyValid = false;
		boolean sadValid = false;

		if (dto != null) {
			System.out.println("DTO is not null , will start validation");
			String name = dto.getName();
			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() <= 50) {
				System.out.println("name is valid");
				nameValid = true;
			} else {
				System.out.println("name is invalid");
				nameValid = false;
			}
			String place = dto.getPlace();
			if (place.length() >= 4 && place.length() <= 20) {
				System.out.println("place is valid");
				placeValid = true;
			} else {
				System.out.println("place is invalid");
				placeValid = false;
			}

			String angry = dto.getAngry();
			if (angry != null && !angry.isEmpty() && angry.length() >= 4 && angry.length() <= 12) {
				System.out.println("angry is valid");
				angryValid = true;
			} else {
				System.out.println("angry is invalid");
				angryValid = false;
			}

			String happy = dto.getHappy();
			if (happy != null && !happy.isEmpty() && happy.length() >= 4 && happy.length() <= 12) {
				System.out.println("happy is valid");
				happyValid = true;
			} else {
				System.out.println("happy is invalid");
				happyValid = false;
			}

			String sad = dto.getSad();
			if (sad != null && !sad.isEmpty() && sad.length() >= 4 && sad.length() <= 12) {
				System.out.println("sad is valid");
				sadValid = true;
			} else {
				System.out.println("sad is invalid");
				sadValid = false;
			}
			if (nameValid && placeValid && angryValid && happyValid && sadValid) {
				System.out.println("data is valid, returning success");
				dao.save(dto);
				return "SUCCESS";
			}
			System.out.println("DTO is null, cannot Pass to dao");
			return "FAILURE";
		}
		return "INVALID";
	}
}
