package chapter07_how_to_01;

import java.util.Scanner;

public class ScoreAnalyzer
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Student fred = new Student(100);
		System.out.println("Please enter values, Q to quit:");
		while (in.hasNextDouble())
		{  
			if (!fred.addScore(in.nextDouble()))
			{
				System.out.println("Too many scores.");
				in.close();
				return;
			}
		}
		in.close();
		System.out.println("Final score: " + fred.finalScore());
	}
}
