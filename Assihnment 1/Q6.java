import java.util.Scanner;
class Q6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter radius");
		int radii=sc.nextInt();
		double PI=3.14;
		double area=Math.pow(radii,2)*PI;
		System.out.println("Area is :" +area);
		double cirm=2*PI*radii;
		System.out.println("Circumference is :" + cirm);
		
	}
}
