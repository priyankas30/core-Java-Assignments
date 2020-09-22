/*27.	Write a program to fine the smallest and greatest number present in the array of integer type*/

import java.util.*;
class Q27
{
	public static void main(String args[])
	{
		int a[]={5,7,9,10,20};
		int ar=a.length;
		System.out.println("Given Array");
		for (int p:a)
		{
			System.out.print(" "+p);
		}
		Arrays.sort(a);
		System.out.println();
		System.out.println("Smallest ELements  " +a[0]);
		System.out.println("Larggest Elements  " +a[ar-1]);
	}
}	