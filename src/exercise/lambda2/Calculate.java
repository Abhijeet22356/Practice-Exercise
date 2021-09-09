package exercise.lambda2;

import java.util.Scanner;

public class Calculate {
	
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		
		Increament i= a->{return a+5;};
		System.out.println(i.increamentByFive(b));
		
		

	}

}
