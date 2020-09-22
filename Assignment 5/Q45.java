class student
{
	private int rollno;
	private double percent;
	student()
	{
		rollno=0;
		percent=0;
	}
	student(int rollno,double percent)
	{
		this.rollno=rollno;
		this.percent=percent;
	}
	void show()
	{
		System.out.println("Roll No "+rollno+"Percentage "+percent);
	}
	int getRollno(){
	return rollno;
	}
	double getpercent(){
		return percent;
	}
}
class collegeStudent extends student
{
	private int sem;
	collegeStudent()
	{
		sem=0;
	}
	collegeStudent(int sem,int rollno,double percent)
	{
		super(rollno,percent);
		this.sem=sem;
	}
	void show()
	{
		
		super.show();
		System.out.println("Sem "+sem);
	}
}
class schoolStudent extends student
{
	private int className;
	schoolStudent()
	{
		className=0;
	}
	schoolStudent(int className,int rollno,double percent)
	{
		super (rollno,percent);
		this.className=className;
	}
	void show()
	{
		super.show();
		System.out.println(" cllass name "+className);
	}
}
public class Q45
{
	public static void main(String...k)
	{
		student [] s={ new schoolStudent(10,101,56.40),
		new schoolStudent(12,102,75.78),
		new schoolStudent(11,102,85.36),
		new collegeStudent(3,200,50.25),
		new collegeStudent(4,201,75.15)};
	for (student ar:s)
	{
		ar.show();
	}
	int searchRollno=200;
	
	for(student ar:s)
	{
		if (ar.getRollno()==searchRollno)
		{
			if(ar instanceof collegeStudent)
			{
				System.out.println("this is college student");
			}
			else if(ar instanceof schoolStudent)
			{
				System.out.println("this is School student");
			}
			else
			System.out.println("not found");
		}
		//ar.show();
	}
	int count=0;
	for(student ar:s)
	{
		if(ar.getpercent()>75)
		{
			System.out.println("Grade A");
		count++;
		ar.show();
		}
	}
	System.out.println("No of student with Grade A:"+count);

}
}