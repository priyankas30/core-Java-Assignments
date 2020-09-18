/* 22.	Sort a ten element array in descending order.*/

class Q22
{
	public static void main(String...p)
	{
		int [] arr=new int [] {7,9,1,2,11};
		int temp=0;
		
		
		
System.out.println("Original Elements of array");
		for( int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		//decending order
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

