/*17.	Write a program to reverse a given number.*/

class Q17
{
	public static void main(String[] args)
	{
		int num=12345,rem=0,n;
		
		while(num > 0)
		{
			n=num%10;
			rem=rem*10+n;
			num=num/10;
		}
		System.out.println("Reverse num : " +rem);
	}
}