
public class ArraySum {

	public static void main(String[] args) {
		//Print the sum of intergers in the array
		
		int sum=0;
		int a[]= {1,2,3,4};
				for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("The sum of integers in the array :"+sum);
	}
}
