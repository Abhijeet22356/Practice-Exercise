package exercise.lambda4;

import java.util.*;


public class Test {
	


	public static void main(String[] args) {
		
		  List<String> al=new ArrayList<String>();
		
		 String[] states= {"Kolkata","Bangalore","Delhi"};
		 
		 NameOfStates nos=()->{for(String a:states){al.add(a);}return al;};
           
		 for(String b:nos.printStates())
		 {
			 System.out.println(b);
		 }
	}

}
