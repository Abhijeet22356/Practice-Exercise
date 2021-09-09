package exercise.lambda3;

import java.util.Scanner;

public class ModifyString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the 1st word");
		String x=sc.next();
		System.out.println("enter the 2nd word");
		String y=sc.next();
		
		StringConcat stc=(a,b)->{return a.concat(b);};
		
		System.out.println(stc.joinString(x, y));

	}

}
