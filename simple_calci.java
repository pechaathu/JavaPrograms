import java.util.Scanner;
public class simple_calci 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int a,b;
		System.out.println("Enter the first number:");
		a = scanner.nextInt();
		System.out.println("Enter the second number:");
		b = scanner.nextInt();
		System.out.println("Enter the operator:");
		char x;
		x = scanner.next().charAt(0);
		
		switch(x) 
		{
			case '+': 
				System.out.println(a + b); break;
			case '-':
				System.out.println(a - b); break;
			case '*':
				System.out.println(a * b); break;
			case '/':
				System.out.println(a / b); break;
			case '%':
				System.out.println(a % b); break;
			default:
				System.out.println("Invalid Input");
		}	
	}
}
