
public class FinalDemo {
	final int MAX; 
	
	public FinalDemo() {
		// TODO Auto-generated method stub
		MAX=100;
	}
		 
	public void MyMethod() {
		System.out.println(MAX);
	}
	public static void main (String[] args) {
		FinalDemo fd=new FinalDemo();
		fd.MyMethod();
		
				
	}
	
	
}
