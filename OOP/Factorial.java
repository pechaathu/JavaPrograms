package OOP;

import java.util.Scanner;

public class Factorial 
{
	static int fact(int n)
	{
		if (n==0)
			return 1;
		return n*(fact(n-1));
	}
	public static void main (String args[])
	{
		Scanner scanner = new Scanner(System.in);
		int n;
		n = scanner.nextInt();
		System.out.println(fact(n));
	}
}
