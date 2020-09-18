/* 19.	Calculate  series : 12+22+32+42+.........+n2 */

import java.util.*;
class Q19
{
	public static void main(String...s)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("ENter a number");
		int num=sc.nextInt();
		int sum=12;
		for (int i=0;i<num;i++)
		{
			sum=sum+10;
		}
		System.out.println(sum);
	}
}