import java.util.*;
public class staffdetails
{
    public static void main(String args[])
    {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter number of staff members-");
		int n=reader.nextInt();
		Staff staff[]=new Staff[n];
		System.out.println("1-> Teaching\n2-> Technical\n3-> Contract\n4-> Display");
		while(true)
		{
			for(int i=0;i<n;i++)
			{
				System.out.print("Enter your choice:");
				int choice=reader.nextInt();
				switch(choice)
				{
					case 1:
						System.out.print("Enter the ID of staff:");
						String id=reader.next();
						System.out.print("Enter name of staff:");
						String name=reader.next();
						System.out.print("Enter phone number of staff:");
						long phno=reader.nextInt();
						System.out.print("Enter salary of staff:");
						long salary=reader.nextInt();
						System.out.print("Enter domain of staff:");
						String dom=reader.next();
						System.out.print("Enter number of publications of staff:");
						int p=reader.nextInt();
						staff[i]=new Teaching(id,name,phno,salary,dom,p);
						break;
					case 2:
						System.out.print("Enter the ID of staff:");
						id=reader.next();
						System.out.print("Enter name of staff:");
						name=reader.next();
						System.out.print("Enter phone number of staff:");
						phno=reader.nextInt();
						System.out.print("Enter salary of staff:");
						salary=reader.nextInt();
						System.out.print("Enter skill of staff:");
						String skill=reader.next();
						staff[i]=new Technical(id,name,phno,salary,skill);
						break;
					case 3:
						System.out.print("Enter the ID of staff:");
						id=reader.next();
						System.out.print("Enter name of staff:");
						name=reader.next();
						System.out.print("Enter phone number of staff:");
						phno=reader.nextInt();
						System.out.print("Enter salary of staff:");
						salary=reader.nextInt();
						System.out.print("Enter period of staff:");
						int period=reader.nextInt();
						staff[i]=new Contract(id,name,phno,salary,period);
						break;
					case 4:
						System.out.println("Staff ID\tName\t\tPhone\t\tSalary\t\tDomain\t  Publication\t\tSkills\t\tPeriod");
						for(int j=0;j<n;j++)
						{
							staff[j].Display();
							System.out.println();
						}
						return;
					default:
						System.out.println("Enter a valid choice");
				}
			}
		}
    }
}
class Staff
{
    private String StaffId;
    private String Name;
    private long Phone;
    private long Salary;
    Staff(String staffId,String name,long phone,long salary)
    {
        StaffId = staffId;
        Name = name;
        Phone = phone;
        Salary = salary;
    }
    public void Display()
    {
        System.out.print("  "+StaffId+"\t\t"+Name+"\t\t"+Phone+"\t\t"+Salary);
    }
}
class Teaching extends Staff
{
    private String Domain;
    private int Publications; 
    public Teaching(String staffId, String name, long phone,long salary, String domain, int publications)
    {
        super(staffId, name, phone, salary);
        Domain = domain;
        Publications = publications;
    }
    public void Display()
    {
        super.Display();
        System.out.print("\t\t"+Domain+"\t\t"+Publications+"\t\t "+"--"+"\t\t "+"--");
    }
}
class Technical extends Staff
{
    private String Skills;
    public Technical(String staffId, String name, long phone,long salary, String skills)
    {
        super(staffId, name, phone, salary);
        Skills = skills;
    }
    public void Display()
    {
        super.Display();
        System.out.print("\t\t--"+"\t\t"+"--"+"\t  "+Skills+"\t\t "+"--");
    }
}
class Contract extends Staff
{
    private int Period;
    public Contract(String staffId, String name,long phone,long salary,int period)
    {
        super(staffId, name, phone, salary);
        Period = period;
    }
    public void Display()
    {
        super.Display();
        System.out.print("\t\t--"+"\t\t"+"--"+"\t\t"+"--"+"\t\t "+Period);
    }
}

