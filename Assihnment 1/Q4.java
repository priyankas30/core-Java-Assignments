import java.util.Scanner;
public class Q4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number");
		byte b1=sc.nextByte();
		byte b2=sc.nextByte();
		byte b3=(byte)(b1+b2);
		System.out.println("Addition is : " +b3);
	}
}