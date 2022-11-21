package com.rockpaperscissors;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
	private Scanner input = new Scanner(System.in);

    private int uInput;

    public void setUserInput(){
    	try {
    		System.out.println("Rock: 1, Paper: 2, Scissor: 3");
    		uInput = input.nextInt();
    		if(uInput<1 || uInput>3){
    			//System.out.println("Invalid value!\nYou get Rock");
    			//            uInput=1;
    			System.out.println("Invalid value!\nChoose again!");
    			setUserInput();
    		}
    	}
    	catch(InputMismatchException e) {
    		System.out.println("Invalid input; re-enter slot number:");
    		input.next();
    		setUserInput();
    	}
    }

    public int getUserInput(){
        return uInput;
    }
}
