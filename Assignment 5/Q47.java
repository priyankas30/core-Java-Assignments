class person
{
	//private int i;
	person()
	{
		System.out.println("No args person called");
	}
	person(int i)
	{
		System.out.println("paramnetr Person called");
	}
}
class Employee extends person
{
	Employee()
	{
		
		System.out.println("No argd Employee called");
	}
	Employee(int j)
	{
		System.out.println("parameter employee called");
	}
}
class Q47
{
	public static void main(String...s)
	{
		Employee e=new Employee();
	}
}