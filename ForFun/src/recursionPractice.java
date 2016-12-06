import java.util.*;

public class recursionPractice {

	public static void main(String[] args) {
		getUnique("ABCDFFDEFG");
		System.out.println(hanoi(3, 1, 3));
	}
	
	public static void getUnique(String str){
		ArrayList<Character> letters = new ArrayList<>();
		System.out.println(uniqueString(str, letters));
	}

	public static boolean uniqueString(String str, ArrayList<Character> arr){
		if(str.length() == 0)
			return true;
		char letter = str.charAt(0);
		str = str.substring(1);
		if(arr.contains(letter))
			return false;
		else
		{
			arr.add(letter);
			return uniqueString(str, arr);
		}
	}

	public static String hanoi(int nDisks, int fromPeg, int toPeg)
	{
		int helpPeg;
		String Sol1, Sol2, myStep;

		if ( nDisks == 1 )
		{
			System.out.println("base case");
			return fromPeg + " -> " + toPeg + "\n";
		}

		else
		{
			System.out.println("else section");
			helpPeg = 6 - fromPeg - toPeg;
			Sol1 = hanoi(nDisks-1, fromPeg, helpPeg);
			System.out.println("between calls");
			myStep = fromPeg + " -> " + toPeg + "\n";
			Sol2 = hanoi(nDisks-1, helpPeg, toPeg);

			return Sol1 + myStep + Sol2;
		}
	}
}
