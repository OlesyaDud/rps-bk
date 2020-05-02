package com.olesya.rps.rps.controller;

import com.olesya.rps.rps.model.ChoiceEnum;
import com.olesya.rps.rps.model.ResultEnum;


public class GameResult {

	ChoiceEnum player1;
	ChoiceEnum player2;
	ResultEnum winner;
	public GameResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GameResult(ChoiceEnum player1, ChoiceEnum player2, ResultEnum winner) {
		super();
		this.player1 = player1;
		this.player2 = player2;
		this.winner = winner;
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
	public ResultEnum getWinner() {
		return winner;
	}
	public void setWinner(ResultEnum winner) {
		this.winner = winner;
	}
	
	
}
