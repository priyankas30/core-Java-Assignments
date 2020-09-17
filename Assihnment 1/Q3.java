/* 03.	Find the result of following expressions. You need to determine the primitive data type of the 
variable by looking carefully the given expression and initialize variables by any random value.
A. y = x2 + 3x - 7 (print value of y) 
B. y = x++ + ++x (print value of x and y) 
C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
D. c  (print value of z) [ x, y, z are boolean variables ]
D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]
*/

class Q3
{
	public static void main(String...p)
	{
		int x=5;
		int y1=(x*x +3*x -7);
		System.out.println("values of y :" +y1);
		int y=x++ + ++x;
		System.out.println("values of x :" +x);
		System.out.println("values of y :" +y);
		int  z = x++ - --y - --x  +  x++ ;
		System.out.println("values of x :" +x);
		System.out.println("values of y :" +y);
		System.out.println("values of z :" +z);
		boolean a=true;
		boolean b=true;
		boolean b1 = a && b || !(a || b);
		System.out.println("values of b1 :" +b1);
		
	}
}
		