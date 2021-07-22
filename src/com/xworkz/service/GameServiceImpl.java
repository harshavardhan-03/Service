package com.xworkz.service;

import com.xworkz.dto.GameDTO;

public class GameServiceImpl implements GameService {

	@Override
	public String validateAndSave(GameDTO dto) {
		System.out.println("Invoked Validate And Save" + dto);
		boolean nameValid = false;
		boolean versionValid = false;
		boolean developedByValid = false;
		boolean maxPlayersValid = false;
		boolean memoryRequiredValid = false;
		
		if (dto != null) {
			System.out.println("DTO is not null, will start validating");
			String name = dto.getName();
			if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 10) {
				System.out.println("Name is Valid");
				nameValid = true;
			} else {
				System.out.println("Name is Invalid");
				nameValid = false;
			}

			String version = dto.getVersion();
			if (version != null && version.length() > 1 && version.length() <= 50) {
				System.out.println("Version is valid");
				versionValid = true;
			} else {
				System.out.println("Version is invalid");
				versionValid = false;
			}
			
			String developedBy = dto.getDevolopedBy();
			if (developedBy.length() >= 3 && developedBy.length() <= 15) {
				System.out.println("developedBy is valid");
				developedByValid = true;
			} else {
				System.out.println("developedBy is invalid");
				developedByValid = false;
			}
			
			int maxPlayers = dto.getMaxPlayers();
			if (maxPlayers >= 3 && maxPlayers <= 8) {
				System.out.println("maxPlayers is valid");
				maxPlayersValid = true;
			} else {
				System.out.println("maxPlayers is invalid");
				maxPlayersValid = false;
			}
			
			double memoryRequired = dto.getMemoryRequired();
			if (memoryRequired >= 500 && memoryRequired <= 500000) {
				System.out.println("memoryRequired is valid");
				memoryRequiredValid = true;
			} else {
				System.out.println("memoryRequired is invalid");
				memoryRequiredValid = false;
			}
			
			if (nameValid && versionValid && developedByValid && maxPlayersValid && memoryRequiredValid) {
				System.out.println("Data is valid, returning success");
				return "SUCCESS";
			}
			return "FAILED";
		}
		System.out.println("DTO is null, cannot Pass to dao");
		return "INVALID";

	}

}
