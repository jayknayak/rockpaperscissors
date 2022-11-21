package com.rockpaperscissors;

import java.util.Scanner;

public class Game {

	String yesOrNo;

	UserInput userInput = new UserInput();
	Computer comp = new Computer();
	Checking checker = new Checking();
	Score score = new Score();
	Scanner input = new Scanner(System.in);

	public void gameLoop() {
		while (true) {
			userInput.setUserInput();
			comp.setComputerInput();
			comp.displayComputerInout();
			if (checker.check(userInput.getUserInput(),
					comp.getComputerInput()) == 0) {
				System.out.println("Tie!");
				score.scoreBoard(0);
			} else if (checker.check(userInput.getUserInput(),
					comp.getComputerInput()) == 1) {
				System.out.println("Win!");
				score.scoreBoard(1);
			} else if (checker.check(userInput.getUserInput(),
					comp.getComputerInput()) == 2) {
				System.out.println("Lose");
				score.scoreBoard(2);
			} else if (checker.check(userInput.getUserInput(),
					comp.getComputerInput()) == -1) {
				break;
			}

			System.out.println("Go to score menu? y/n");

			yesOrNo = input.next();
			if(yesOrNo.equals("y")){
				score.ScoreMenu();
			}else if(yesOrNo.equals("n")){
			
			}else{
				System.out.println("Invalid command! Continuing without going to score menu!");
			}

			System.out.println("Want to play again? y/n");
			yesOrNo = input.next();
			if(yesOrNo.equals("y")){
			}else if(yesOrNo.equals("n")){
				break;
			}else{
				System.out.println("Invalid command! Continuing!");
			}
		}
	}

	public static void main(String[] args) {
		Game game = new Game();
		game.gameLoop();
	}
}
