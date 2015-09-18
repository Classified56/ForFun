import java.util.Scanner;
import java.util.ArrayList;

public class fibbonacciInBase
	{
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
			{
				System.out.print("How many numbers would you like? ");
				int x = userInput.nextInt(), a = 1, b = 1, sum = 0;
				System.out.print("What base would you like it in? ");
				int base = userInput.nextInt();
				System.out.println("1 \n1");
				for(int i = 2; i < x; i++)
					{
						sum = a + b;
						b = a;
						a = sum;
						System.out.println(changeBase(sum, base));
					}
			}
		
		public static int changeBase(int num, int  base)
			{
				ArrayList<Integer> numArray = new ArrayList<Integer>();
				while(num > 0)
					{
						numArray.add(0, num % base);;
						num /= base;
					}
				int newNum = 0;
				for(int i = 0; i < numArray.size(); i++)
					{
						newNum += numArray.get(i);
						if(i < numArray.size() - 1)
							newNum *= 10;
					}
					
				return newNum;
			}

	}
