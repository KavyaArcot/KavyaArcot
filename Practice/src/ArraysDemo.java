
public class ArraysDemo {
	public static void main (String[] args) {
		//Declare an array and allocating memory for the values
		int a[]= new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		
		//Declaring an array of 5 numbers without allocating memory
		//int a[]= {1,2,3,4,5};
		for (int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]);
		}
	}

}
