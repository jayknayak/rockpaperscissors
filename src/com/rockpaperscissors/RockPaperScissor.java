package com.rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
	public void gamePlay() {
		int ui=userInput();
		if(ui==0) {
			ui=1;
			System.out.println("Default selection of Rock as User Input");
		}
		int ci=computerInput();
		decideWinner(ui,ci);
	}
	private int userInput() {
		System.out.println("Please enter a number from the list given below");
		System.out.println("Rock -> 1");
		System.out.println("Paper -> 2");
		System.out.println("Scissor -> 3");
		int ui=0;
		Scanner in = new Scanner(System.in);
		try {
			ui=in.nextInt();

			if(ui<1 || ui>3) {
				System.out.println("Invalid Input! Please select a valid number.");
				ui=userInput();
			}
			else {
				if(ui==1) {
					System.out.println("You have selected Rock");
				}
				else if(ui==2){
					System.out.println("You have selected Paper");
				}
				else {
					System.out.println("You have selected Scissor");
				}
			}
		}
		catch(Exception e) {
			in.next();
			System.out.println("Invalid Input! Please select a valid number.");
			ui=userInput();
		}
		in.close();
		return ui;
	}

	private int computerInput() {
		Random r = new Random();
		int ci=r.nextInt(4);
		if(ci==0) {
			ci=1;
		}
		if(ci==1) {
			System.out.println("Computer has selected Rock");
		}
		else if(ci==2) {
			System.out.println("Computer has selected Paper");
		}
		else {
			System.out.println("Computer has selected Scissor");
		}
		return ci;
	}

	private void decideWinner(int ci, int ui) {
		if(ci==ui) {
			System.out.println("It's a Tie!");
		}
		else if(ci==1 && ui==2) {
			System.out.println("Computer Wins!");
		}
		else if(ci==2 && ui==1) {
			System.out.println("You Win!");
		}
		else if(ci==1 && ui==3) {
			System.out.println("You Win!");
		}
		else if(ci==3 && ui==1) {
			System.out.println("Computer Wins!");
		}
		else if(ci==2 && ui==3) {
			System.out.println("You Win!");
		}
		else if(ci==3 && ui==2) {
			System.out.println("Computer Wins!");
		}
	}


	public static void main(String[] args) {
		RockPaperScissor rps = new RockPaperScissor();
		rps.gamePlay();
	}

}
