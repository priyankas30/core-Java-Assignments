/* 26.	Create an array of 17 elements in 5 rows.  And calculate sum of all elements.*/


//import java .util.Scanner;
class Q17
{
	public static void main(String...p)
	{
		int a[]={1,2,3};
		int b[]={4,5,6};
		int c[]={7,8,9};
		int d[]={10,11,12,13};
		int e[]={14,15,1,6,17};
		int sum=0;
		
		int arr[][]= new int [5][];
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		arr[3]=d;
		arr[4]=e;
		
		for(int ar[]:arr)
		{
			for(int s:ar)
			{
				System.out.print(" "+s);
				sum=sum+s;
				
			}
			System.out.println();
		}
		System.out.println("sum  "+sum);
		
	}