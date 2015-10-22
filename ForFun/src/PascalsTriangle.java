import java.util.Scanner;

public class PascalsTriangle
	{
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
			{
				System.out.print("How many rows would you like?");
				int rows = userInput.nextInt();
				System.out.println("1 \n1  1");
				int num[] = {1, 1};
				for(int i = 3; i <= rows; i++)
					{
						int newRow[] = new int[i];
						newRow[0] = 1;
						for(int j = 1; j < num.length; j++)
							newRow[j] = (num[j - 1] + num[j]);
						newRow[num.length] = 1;
						for(int x = 0; x < newRow.length; x++)
							{
								System.out.print(newRow[x] + "  ");
							}
						System.out.println("");
						num = newRow;
					}
			}

	}
