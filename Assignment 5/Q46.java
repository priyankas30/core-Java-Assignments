class person
{
	void show()
	{
		System.out.println("Person called");
	}
}
class Employee extends person
{
	void show()
	{
		System.out.println("Employee called");
	}
	void Empjob()
	{
		System.out.println("Employee Job");
	}
}
class manager extends person{
	void show()
	{
		System.out.println("Manager  called");
	}
	void MngrDeatils()
	{
		System.out.println("Manage details");
	}
}
class Q46
{
	public static void main(String...s)
	{
		person p[]={ new Employee(),new manager()};
		for( person ar:p)
		{
			if(ar instanceof Employee) 
			{
				Employee e = (Employee)ar;
				
				e.Empjob();
			}
			else  if(ar instanceof manager )
			{
		
				manager m=(manager)ar;
			m.MngrDeatils();
			
			}
	
		}
	}
}
		
		
		