package excersies;

import java.util.Scanner;

public class TestScoreStatistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Score;
		int high = 0;
		int low = 100;
		int count = 0;
		int total = 0;
		int average;
		
		Scanner input = new Scanner(System.in);
		Score = input.nextInt();
		
		do
		{
			System.out.println("Enter a test score >> ");
			Score = input.nextInt();
			
			if(Score > high)
			{
				high = Score;
				count = count +1;
			}
			
			else if(Score < low)
			{
				low = Score;
				count = count +1;
			}
			
			else if(Score > 100 || Score < 0)
			{
				System.out.println("Error.");
			}
			
			total = total + Score;
			
			average = total / count;
			
		}while(Score != 999);

	}

}
