package com.xworkz.tester;

import com.xworkz.dto.GameDTO;
import com.xworkz.service.GameService;
import com.xworkz.service.GameServiceImpl;

public class GameTester {

	public static void main(String[] args) {
		
		GameDTO dto = new GameDTO("8BallPool","5.4.3","Miniclip",2,5000,true);

		GameService gameService = new GameServiceImpl();
		gameService.validateAndSave(dto);
	}
}