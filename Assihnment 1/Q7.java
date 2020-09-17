import java.util.Scanner;
class Q7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number of subject");
		int subject=sc.nextInt();
		int sum=0;
		for (int i=0;i<subject;i++)
		{
			System.out.println("Marks of subject" +i+" marks");
			int marks=sc.nextInt();
			sum=sum+marks;
		}
		
		
	//	int totalmarks=subject * 100;
		int per= (sum/subject);
		System.out.println("Percetage is :" + per+ "%");
		
	}
}