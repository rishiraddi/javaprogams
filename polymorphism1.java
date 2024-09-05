import java.util.*;
class polymorphism1
{
	public static void main(String arg[])
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter \n1 for rectangle\n2 for triangle\n3 for circle\n4 to quit");
		while(true)
		{
			System.out.println("Select your choice");
			int choice=reader.nextInt();
			switch(choice)
			{
				case 1:System.out.print("Length of rectangle=");
				int l=reader.nextInt();
				System.out.print("Breadth of rectangle=");
				int b=reader.nextInt();
				rectangle r=new rectangle(l,b);
				System.out.println("Area of rectangle="+r.getarea());
				break;
				case 2:System.out.print("Base of triangle=");
				l=reader.nextInt();
				System.out.print("Height of triangle=");
				b=reader.nextInt();
				triangle t=new triangle(l,b);
				System.out.println("Area of triangle="+t.getarea());
				break;
				case 3:System.out.print("Radius of circle=");
				int d=reader.nextInt();
				circle c=new circle(d);
				System.out.println("Area of circle="+c.getarea());
				break;
				case 4:return;
				default:System.out.println("Enter valid choice");
			}
		}	
	}
}
interface shape
{
	public double getarea();
}
class data
{
	int length,breadth;
	double radius;
	data(int a,int b)
	{
		length=a;
		breadth=b;
	}
	data(double r)
	{
		radius=r;
	}
}
class rectangle extends data implements shape
{
	rectangle(int a,int b)
	{
		super(a,b);
	}
	public double getarea()
	{
		return(length*breadth);
	}
}
class triangle extends data implements shape
{
	triangle(int a,int b)
	{
		super(a,b);
	}
	public double getarea()
	{
		return(0.5*length*breadth);
	}
}
class circle extends data implements shape
{
	circle(double a)
	{
		super(a);
	}
	public double getarea()
	{
		return(3.14*radius*radius);
	}
}

		
	
		 
