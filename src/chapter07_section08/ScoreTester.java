package chapter07_section08;

import java.util.Scanner;

public class ScoreTester
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		double expected = in.nextDouble();
		Student fred = new Student(100);
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
		System.out.println("Expected: " + expected);
	}
}
