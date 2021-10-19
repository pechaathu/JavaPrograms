package OOP;

public class stacks {
	int s[] = new int [10];
	int top;
	
	stacks()
	{
		top=-1;
	}
	
	void push (int x)
	{
		if(top<10)
		{
			s[++top]=x;
		}
		else
		{
			System.out.println("Stack is full");
		}
	}
	
	int pop()
	{
		if(top<0)
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else
			return s[top--];
	}
}
