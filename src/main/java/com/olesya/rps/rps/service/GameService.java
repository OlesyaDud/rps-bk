package com.olesya.rps.rps.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.olesya.rps.rps.controller.GameRequest;
import com.olesya.rps.rps.controller.GameResult;
import com.olesya.rps.rps.model.ChoiceEnum;
import com.olesya.rps.rps.model.ResultEnum;

import static com.olesya.rps.rps.model.ResultEnum.*;


@Service
public class GameService {

	@Autowired
	Computer compPlayer;
	
	   public GameResult playRound(GameRequest gameRequest) {
		   
	        ChoiceEnum player1 = gameRequest.getPlayer1();
	        
	        ChoiceEnum player2 = compPlayer.chooseWeapon();
	        
	        ResultEnum result = determineRoundWinner(player1, player2);
	        
	        return new GameResult(player1, player2, result);
	    }

	    protected ResultEnum determineRoundWinner(ChoiceEnum player1, ChoiceEnum player2) {
	    	
	        if (player1 == player2) {
	            return TIE;
	        }

	        if (player1 == ChoiceEnum.ROCK && player2 == ChoiceEnum.PAPER) {
	            return PLAYER2;
	        }

	        if (player1 == ChoiceEnum.SCISSORS && player2 == ChoiceEnum.ROCK) {
	            return PLAYER2;
	        }

	        if (player1 == ChoiceEnum.PAPER && player2 == ChoiceEnum.SCISSORS) {
	            return PLAYER2;
	        }

	        return PLAYER1;
	    }

	
	

}
