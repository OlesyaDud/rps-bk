package com.olesya.rps.rps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.olesya.rps.rps.model.ChoiceEnum;
import com.olesya.rps.rps.service.GameService;

@RestController
@RequestMapping("/play")
@CrossOrigin(origins = "*")
public class GameController {
	
	@Autowired
	GameService game;
	
    @PostMapping
    public GameResult play(@RequestBody GameRequest gameRequest) {
        return game.playRound(gameRequest);
    }

    @GetMapping
    public GameResult play(@RequestParam("choice") ChoiceEnum player1){
        return game.playRound(new GameRequest(player1, null));
    }

	

}
