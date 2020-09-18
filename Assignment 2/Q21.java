/* 21.	Program to show sum and average of 10 element array. Accept array elements from user. */
import java.util.Scanner;
class Q21
{
	public static void main(String args[])
	{
		int n,sum=0;
		float avg;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter element you want in array");
		n=sc.nextInt();
		int arr[]=new int [n];
		System.out.println("Enter elements");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("Sum :" +sum);
		avg=(float)sum/n;
		System.out.println("Average : "+avg);
	}
}

