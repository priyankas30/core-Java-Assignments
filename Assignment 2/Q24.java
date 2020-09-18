/* 24.	Write a program to search an element in the array.*/
import java.util.*;
class Q24
{
	public static void main(String args[])
	{
		int count,num,i;
		int arr[]=new int [6];
		Scanner sc=new Scanner (System.in);
		count=sc.nextInt();
		System.out.println("Enter " +count+ " elements");
		for( i=0;i<count;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Element you wnat to search");
		{
			num =sc.nextInt();
			for ( i=0;i<count;i++)
			{
				if (num==arr[i])
				{
					System.out.println(num+" is present at index "+i);
					break;
				}
			}
		if (i == count )
			{
				// System.out.println(num + " not present in input array");
				System.out.println(num+ " not present in array");
			}
		}
	}
}	