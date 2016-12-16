/** Basic_Calculator.java by Survingo */
import java.util.InputMismatchException;

public class Basic_Calculator {
	
	static java.util.Scanner scan = new java.util.Scanner(System.in);
	
	public static void println (String str) { System.out.println(str); } // really too lazy for that
	public static void println () { System.out.println(); }
	
	public static void main (String[] args) {
		
		System.out.println();
		System.out.println("==============================================================================");
		System.out.println("                                Basic Calculator");
		System.out.println("==============================================================================");
		System.out.println();
		
		while(true){
			
			double a = 0, b = 0, c = 0;
			String ro = null;
			boolean error = false;
					
			System.out.print(" Enter first number: ");
			a = scan.nextDouble(); // InputMismatchException...
			println();
			
			
			do {
				
				try {
					
					System.out.print(" Enter basic operation (\"+\", \"-\", \"*\", \"/\"): ");
					ro = scan.next();
					println();
					
					if (!(ro.equals("+") || ro.equals("-") || ro.equals("*") || ro.equals("/"))) {
						
						error = true;
						println(" Error: The basic operation " + ro + " is not a legal one!");
						println();
						
					} else {
						
						error = false;
						
					}
					
				} catch (InputMismatchException e) {
				}
				
			} while (error);
			
			
			System.out.print(" Enter second number: ");
			b = scan.nextDouble();
			println();
			
			
			if (ro.equals("/")) {
				
				while (b == 0) {
					
					println(" Error: You can't divide by 0.");
					System.out.print(" Enter second number: ");
					b = scan.nextDouble();
					println();
					
				}
				
				c = a / b;
				
			}
			
			else {
				
				if (ro.equals("+")) c = a + b;
				
				if (ro.equals("-")) c = a - b;
				
				if (ro.equals("*")) c = a * b;
				
			}
			
			output(a, ro, b, c);
			println(" New task: ");
			println();
			
		}
		
	}
	
	
	public static void output (double a, String ro, double b, double c){
		println(a + " " + ro + " " + b + " = " + c);
	}
	
}
