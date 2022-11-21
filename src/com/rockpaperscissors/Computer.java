package com.rockpaperscissors;

import java.util.Random;

public class Computer {
	private int computerGesture;

    public void setComputerInput(){
    	Random random = new Random();
    	computerGesture=random.nextInt(4);
//        computerGesture = (int) (Math.random()*4);
        if(computerGesture == 0){
            computerGesture = 1;
        }

    }

    public int getComputerInput(){
        return computerGesture;
    }

    public void displayComputerInout(){
        if(computerGesture == 1)
        {
            System.out.println("Computer chooses rock");
        }else if(computerGesture == 2){
            System.out.println("Computer chooses paper");
        }else if(computerGesture == 3){
            System.out.println("Computer chooses scissor");
        }
    }
}
