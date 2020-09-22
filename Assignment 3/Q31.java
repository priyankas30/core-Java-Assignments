/*31.	Create a class Student with 2 data members rno and name. 
Create one method setData() that takes roll number and student name as parameter 
and stores them in data members rno and name. 
Create one more method showData() to print the data member values. 
Create another class ( main class) StudentDemo that creates
 Student class object and calls setData() and showData() methods.*/
  import java.util.Scanner;
 class Student
 {
	 private int rno;
	 private String name;
	 
	 void setData(int no,String sname)
	 {
		 rno=no;
		 name=sname;
	 }
	 void showData()
	 {
		 System.out.println("student Rollno  " +rno);
		 System.out.println("student name   "+name);
	 }
 }

 class Q31
 {
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner (System.in);
		 System.out.println("Enter roll number ");
		 int rno=sc.nextInt();
		  System.out.println("Enter name ");
		 String name=sc.next();
		  		 
		 System.out.println("Enter student Details : ");
		 Student s=new Student();
		 s.setData(rno,name);
		 s.showData();
	 }
 }