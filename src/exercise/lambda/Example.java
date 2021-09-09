package exercise.lambda;

public class Example {

	public static void main(String[] args) {
		
		MyFunction mf=()->{return "CGI";};
		
		System.out.println(mf.printCompanyName());

	}

}
