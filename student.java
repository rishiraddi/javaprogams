import java.util.*;
class Student
{
	String name;
	String usn;
	String branch;
	long phone;
	Student(String name,String usn,String branch,long phone)
	{
		this.name=name;
		this.usn=usn;
		this.branch=branch;
		this.phone=phone;
	}
	public static void main(String args[])
	{
		Scanner read=new Scanner(System.in);
		String name;
		String usn;
		String branch;
		long phone;
		int n;
		System.out.println("Enter the number of students: ");
		n=read.nextInt();
		Student s[] =new Student[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("\nEnter the details of the student "+(i+1)+":");
			System.out.print("Name:");
			name=read.next();
			System.out.print("USN:");
			usn=read.next();
			System.out.print("Branch:");
			branch=read.next();
			System.out.print("Ph. No.:");
			phone=read.nextLong();
			s[i]=new Student(name,usn,branch,phone);
		}
		System.out.println("\nStudent Details");
		System.out.println("NAME\tUSN\t\tBRANCH\t\tPHONE_NO");
		for(int i=0;i<n;i++)
		{
			System.out.println(s[i].name+"\t"+s[i].usn+"\t"+s[i].branch+"\t"+s[i].phone);
		}
	}
}
