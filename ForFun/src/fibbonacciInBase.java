import java.util.Scanner;
import java.math.BigInteger;
import java.util.ArrayList;

public class fibbonacciInBase
	{
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
			{
				System.out.print("How many numbers would you like? ");
				long x = userInput.nextLong(); 
				BigInteger a = BigInteger.valueOf(1);
				BigInteger b = BigInteger.valueOf(1);
				BigInteger sum = BigInteger.valueOf(0);
				System.out.print("What base would you like it in? ");
				long base = userInput.nextLong();
				System.out.println("1 \n1");
				for(int i = 2; i < x; i++)
					{
						sum = a.add(b);
						b = a;
						a = sum;
						System.out.println(changeBase(sum, base));
					}
			}
		public static String changeBase(BigInteger num, long  baseIn)
			{
				ArrayList<Character> numArray = new ArrayList<Character>();
				BigInteger base = BigInteger.valueOf(baseIn);
				while(num.signum() > 0)
					{
						BigInteger nextChar = num.mod(base);
						if(nextChar.intValue() <= 9)
							{
								char number = (char)(nextChar.add(BigInteger.valueOf(48)).intValue());
								numArray.add(0, number);
							}
						else
							{
								char letter = (char)(nextChar.add(BigInteger.valueOf(87)).intValue());
								numArray.add(0, letter);
							}
						num = num.divide(base);
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