package excersies;

import java.util.Scanner;

public class TestScoreStatistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Score;
		
		Scanner input = new Scanner(System.in);
		Score = input.nextInt();
		
		do
		{
			if(Score <= 0 || Score >= 100)
			{
				System.out.println("Error.");
			}
		}while(Score == 999);

	}

}
