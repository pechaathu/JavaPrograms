import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {

		int marks [][] = new int [3][4];
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<4; j++)
			{
				marks[i][j] = scanner.nextInt();
			}
		}
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<4; j++)
			{
				System.out.print(marks[i][j]);
			}
			System.out.println();
		}
	}

}
