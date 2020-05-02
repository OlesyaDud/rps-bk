package com.olesya.rps.rps.controller;

import com.olesya.rps.rps.model.ChoiceEnum;

public class GameRequest {

	ChoiceEnum player1;
	ChoiceEnum player2;
	public GameRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GameRequest(ChoiceEnum player1, ChoiceEnum player2) {
		super();
		this.player1 = player1;
		this.player2 = player2;
	}
	public ChoiceEnum getPlayer1() {
		return player1;
	}
	public void setPlayer1(ChoiceEnum player1) {
		this.player1 = player1;
	}
	public ChoiceEnum getPlayer2() {
		return player2;
	}
	public void setPlayer2(ChoiceEnum player2) {
		this.player2 = player2;
	}
	
}
