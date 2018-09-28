package practice;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String result = null;
		
		int userGuess;
		int computerGuess;
		int count = 0;
		int choice = 0;
		
		for(int i = 0; i < 5; i++) {
		
		Scanner input = new Scanner(System.in);
		computerGuess = (int )(Math.random() * 3 + 1);
		
		System.out.println("1 for Rock \n2 for Paper \n3 for Scissors");
		userGuess = input.nextInt();
		
		if(userGuess == 1)
		{
			if(computerGuess == 1)
			{
				result = "The computer guessed Rock. It's a tie!";
			}
			
			else if(computerGuess == 2)
			{
				result = "The computer guessed Paper. You win!";
				count = count +1;
			}
			
			else if(computerGuess == 3)
			{
				result = "The computer guessed Scissors. You lose!";
			}
		}
		
		else if(userGuess == 2)
		{
			if(computerGuess == 1)
			{
				result = "The computer guessed Rock. You win!";
				count = count +1;
			}
			
			else if(computerGuess == 2)
			{
				result = "The computer guessed Paper. It's a tie!";
			}
			
			else if(computerGuess == 3)
			{
				result = "The computer guessed Scissors. You lose!";
			}
		}
		
		else if(userGuess == 3)
		{
			if(computerGuess == 1)
			{
				result = "The computer guessed Rock. You lose!";
			}
			
			else if(computerGuess == 2)
			{
				result = "The computer guessed Paper. You win!";
				count = count +1;
			}
			
			else if(computerGuess == 3)
			{
				result = "The computer guessed Scissors. It's a tie!";
			}
		}
		
		else if(userGuess == 4)
		{
			result = "The sun explodes and destroys all planets in the solar system. You lose.";
		}
		
		else
		{
			result = "Where you sought for answers you found a hollow shell. You lose.";
		}
		
		System.out.println("\nDid you win?\n" + result + "\nNumber of wins " + count);
		
		System.out.println("Would you like to play again?");
		choice = input.nextInt();
		
		}while(choice != 999);

	}

}
