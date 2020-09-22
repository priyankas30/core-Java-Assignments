import java.util.*;
class CircleDemo
{
	private double radius;
	private double area;
	public void init(int radius)
	{
		this.radius=radius;
	}
	void calculate()
	{
		double PI=3.14;
		area=PI*radius*radius;
	}
	void display()
	{
		System.out.println(area);
	}
}
public class Q34{
	public static void main(String...s)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter radius");
		int radius=sc.nextInt();
		CircleDemo c=new CircleDemo();
		c.init(radius);
		c.calculate();
		c.display();
	}
}

		