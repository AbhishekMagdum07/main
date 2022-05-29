package Day5PracticeProblem;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an Alphaber:");
		String alpha = scanner.next();
		String alphaLower = alpha.toLowerCase();
		if (alphaLower.equals("a") || alphaLower.equals("e") || alphaLower.equals("i") || alphaLower.equals("o") || alphaLower.equals("u")) 
			System.out.println(alpha + " is a Vowel.");
		else
			System.out.println(alpha +" is a Constant."); 
	}
}
					
		

		
