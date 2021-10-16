import java.util.Scanner;
public class matrixDiagonalSum {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int matrix [][] = new int [size][size];		
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				matrix [i][j] = scanner.nextInt();
			}
		}
		int diagSum=0;		
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				if(i==j)
				{
					diagSum += matrix [i][j];
				}
				else if(i-j == 2 || i-j == -2)
				{
					diagSum += matrix [i][j];
				}
			}
		}	
		System.out.println("Diagonal Sum = " + diagSum);
	}
}