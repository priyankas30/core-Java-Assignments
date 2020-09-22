class faculty
{
	private int facultyId;
	private double salary;
	faculty()
	{
		salary=0;
	}
	void input(int facultyId)
	{
		this.facultyId=facultyId;
	}
	void printSalary()
	{
		System.out.println(facultyId+" "+salary);
	}
	void setSalary(double salary)
	{
		this.salary=salary;
	}
	double getSalary()
	{
		return salary;
	}
}
class FullTimeFaculty extends faculty
{
	private double basicSalary;
	private double allowance;
	void input(int facultyId,double basicSalary,double allowance)
	{
		input(facultyId);
		this.basicSalary=basicSalary;
		this.allowance=allowance;
		setSalary(basicSalary+allowance);
	}
}
class PartTimeFaculty extends faculty
{
	private double workingHours;
	private double ratePerHour ;
	void input(int facultyId,int workingHours,int ratePerHour)
	{
			input(facultyId);
			this.workingHours=workingHours;
			this.ratePerHour=ratePerHour;
			setSalary(workingHours*ratePerHour);
	}
}
public class Q44
{
	public static void main(String...s)
	{
		PartTimeFaculty p=new PartTimeFaculty();
		p.input(101,4000,500);
		FullTimeFaculty f=new FullTimeFaculty();
		f.input(102,5000,1500);
		f.printSalary();
		p.printSalary();
	}
}
		