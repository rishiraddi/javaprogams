import java.util.*;
class stackimplementation
{
	public static void main(String args[])
	{
		int option = 1;
		Stack object = new Stack();
		System.out.println("/*Program to Implement Stack Operations*/");
		Scanner sc=new Scanner(System.in);
		System.out.println("1-> Push\n2->Pop\n3->Display\n4->Exit");
		while(option!=0)
		{
			System.out.print("Enter your choice:");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.print("Enter the element to be pushed:");
					int element=sc.nextInt();
					object.push(element);
					break;
				case 2:
					object.pop();
					break;
				case 3:
					object.display();
					break;
				case 4:
					option = 0;
				default:
					System.out.println("Enter a valid choice");
			}
		}
	}
}
interface Stack_Interface
{
	void push(int element);
	void pop();
	void display();
}
class Stack implements Stack_Interface
{
    final int stackSize=5;
    int s[]=new int[stackSize];
    int top=-1;
    public void push(int element)
    {
        if(top>=stackSize-1)
            System.out.println("Stack Overflow");
        else
            s[++top]=element;
    }
    public void pop()
    {
        int poppedElement;
        if(top==-1)
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            poppedElement=s[top--];
            System.out.println("Popped element is:"+poppedElement);
		}
    }
    public void display()
    {
        if(top==-1)
            System.out.println("Stack is Empty");
        else
        {
			System.out.println("Elements in the Stack are");
            for(int i=top;i>-1;i--)
				System.out.println(s[i]);
        }
    }
}

