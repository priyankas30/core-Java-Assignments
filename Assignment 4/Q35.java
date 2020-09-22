class  MathOperation 
{
	static int mult(int n1,int n2)
	{
		return n1*n2;
	}
	static float mult(float n1,float n2,float n3)
	{
		return n1*n2*n3;
	}
	
	static int mult(int arr[])
	{
		int res=1;
		for (int a:arr)
		{
			res=res*a;
			
		}
		return res;
	}
	
}
public class Q35 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	int [] arr= {2,5};
		System.out.println("Multiplication of integers "+MathOperation.mult(2,3));
		System.out.println("Multiplication of floats" +MathOperation.mult(2.3f,3.5f,1.2f));
	System.out.println("Multiplication of arrays " +MathOperation.mult(arr));
	}

}
