import java.util.Scanner;
public class fibbonacciInBin
	{
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
			{
				System.out.print("How many numbers would you like? ");
				int x = userInput.nextInt(), a = 1, b = 1, sum = 0;
				System.out.println("1 \n1");
				for(int i = 2; i < x; i++)
					{
						sum = a + b;
						b = a;
						a = sum;
						System.out.println(Integer.toBinaryString(sum));
					}
			}

	}
