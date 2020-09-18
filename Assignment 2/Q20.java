/* 20.	Print all prime numbers between two given numbers. [ break continue */
import java.util.Scanner;
public class Q20
{
	public static void main(String...p)
	{
		Scanner sc=new Scanner (System.in);
		int flag;
		System.out.println("Enter lower range");
		 int a=sc.nextInt();
		System.out.println("Enter Upper range");
		int b=sc.nextInt();
		System.out.println("prime numbers beetween " +a+ "and " +b+ " are : ");
			for (int i=a;i<=b;i++)
			{
				if (i==1 || i==0)
				continue;
				flag=1;
				for(int j=2;j<=i/2;++j)
				{
					if (i%j==0)
					{
						flag=0;
					break;
				}
			}
			if( flag == 1)
			
			
				System.out.println(i);
	}
	}
}