import java.util.Scanner;
import java.util.ArrayList;

public class fibbonacciInBase
	{
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
			{
				System.out.print("How many numbers would you like? ");
				int x = userInput.nextInt(); 
				long a = 1, b = 1, sum = 0;
				System.out.print("What base would you like it in? ");
				long base = userInput.nextInt();
				System.out.println("1 \n1");
				for(int i = 2; i < x; i++)
					{
						sum = a + b;
						b = a;
						a = sum;
						System.out.println(changeBase(sum, base));
					}
			}
		public static String changeBase(long num, long  base)
			{
				ArrayList<Character> numArray = new ArrayList<Character>();
				while(num > 0)
					{
						int nextChar = (int)(num % base);
						if(nextChar <= 9)
							{
								char number = (char)(nextChar + 48);
								numArray.add(0, number);;
							}
						else
							{
								char letter = (char)(nextChar + 87);
								numArray.add(0, letter);
							}
						num /= base;
					}
				String newNum = "";
				for(int i = 0; i < numArray.size(); i++)
					{
						char next = numArray.get(i);
						newNum += next;
					}
					
				return newNum;
			}

	}