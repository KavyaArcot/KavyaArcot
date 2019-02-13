
public class ExceptionDemo {
	int a=4;
	//One try can be followed by n number of catch blocks
	//Catch should be immediate after try, you can print whatever exception be to handled(if try fails it automatically comes to catch and executes)
	//Whatever code you have written in the finally block will be executed irrespective of the exception
	

	public static void main (String[] args) {
		int b=7;
		int c=0;
		
		try {
			int k=b/c;
			
				System.out.println(k);
			
		}
		catch(ArithmeticException e) {
			System.out.println("Arithemetic Exception Thrown");
		}
		catch(Exception e) {
			System.out.println("Exception error it cant be handled");
		}
		finally {
			System.out.println("Irrespective of the code whatever the value/code will be executed");
		}
		
	}

}
