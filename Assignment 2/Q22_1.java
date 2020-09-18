import java.util.*;
class Q22_1
{
	public static void main(String...b)
	{
		int arr[]=new int [5];
		int temp=0;
		System.out.println("How many elemnets you wnat in array");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		System.out.println("Enter elemets");
		for (int i=0;i < arr.length; i++)
		{
			arr[i]=sc.nextInt();
			//n=sc.nextInt();
			//System.out.println(arr[i]+ " ");
		}
		for(int i=0; i < arr.length; i++)
		{
			for(int j = i+1 ; j < arr.length; j++)
			{
				if(arr[i] < arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
	System.out.println("Reverse order is: ");
	for(int i=0; i < arr.length; i++)
	{
		System.out.println(arr[i]+ " ");
	}
	}
}
