package Inheritance;

public class Son extends GrandFather {
	public static void main (String[] args)
	{
		Son s=new Son();
		s.city();
		s.state();
		System.out.println(s.x);
		System.out.println(s.y);
		
	}
	public void activities() {
		
		System.out.println("Playing Badminton");
	}
}
