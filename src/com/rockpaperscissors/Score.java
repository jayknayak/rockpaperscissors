package com.rockpaperscissors;

import java.util.Scanner;

public class Score {
	Scanner input = new Scanner(System.in);

    private int wins = 0;
    private int loses = 0;
    private int ties = 0;
    
    public enum ScoreCheck {
	    TIE , WIN , LOSE
	}
    
    public void scoreBoard(int winOrLoseOrTie){
    	if(winOrLoseOrTie == ScoreCheck.WIN.ordinal()){
    		wins++;
    	}else if(winOrLoseOrTie == ScoreCheck.LOSE.ordinal()){
    		loses++;
    	}else if(winOrLoseOrTie == ScoreCheck.TIE.ordinal()){
    		ties++;
    	}
    }
    
    public void ScoreMenu(){
    	System.out.println("Display Score: d");
    	System.out.println("Reset Score: r");
    	System.out.println("Exit score menu: e");

    	if(input.next().equals("d")){
    		displayScore();
    	}else if(input.next().equals("r")){
    		resetScoreBoard();
    	}else if(input.next().equals("e")){
    		return;
    	}else{
    		System.out.println("Invalid command!");
    		ScoreMenu();
    	}
    }
    
    public void displayScore(){
        System.out.println("Wins Loses Ties\n"+wins+"    "+loses+"    "+ties);
    }

    public void resetScoreBoard(){
        wins = 0;
        loses = 0;
        ties = 0;
    }
}
