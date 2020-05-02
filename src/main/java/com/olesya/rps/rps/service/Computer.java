package com.olesya.rps.rps.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.olesya.rps.rps.model.ChoiceEnum;


@Service
public class Computer {
	

	private final Random random;

	public Computer(Random random) {
		super();
		this.random = random;
	}

	public Computer() {
		this(new Random());
	}
	
	   public ChoiceEnum chooseWeapon(){
		   
	        int index = random.nextInt(3);
	        
	        switch(index){
	        
	            case(0): return ChoiceEnum.ROCK;
	            case(1): return ChoiceEnum.PAPER;
	            default: return ChoiceEnum.SCISSORS;
	        }
	    }

}
