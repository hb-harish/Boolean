import java.util.Scanner;

public class Boolean {

	public static void main(String[] args) {
		
		System.out.print("Enter your test score: ");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		char grade = 'F';//I'm not hopeful
		char mark = ' ';//I am not either

		if (score > 89)
		    grade = 'A';
		else if (score > 79)
		    grade = 'B';
		else if (score > 69)
		    grade = 'C';
		else if (score > 59)
		    grade = 'D';
		else 
		    grade = 'F';
		
		if (score % 10 > 6)
			mark = '+';
		else if (score % 10 < 3 )
			mark = '-';
		
		System.out.println("Your grade is " + grade + mark );
		
		if (score > 59)
		    System.out.println("Very good! You don't have to retake the exam!");
		else
		    System.out.println("Did you even look at the book?");
		// TODO Auto-generated method stub

	}

}
