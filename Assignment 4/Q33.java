class thisfunc
{
	private int empid;
	void set(int empid)
	{
		this.empid=empid;
		System.out.println("this "+this);
	}
}
public class Q33{
	public static void main(String args[])
	{
		thisfunc t=new thisfunc();
		t.set(101);
	}
}
	
		