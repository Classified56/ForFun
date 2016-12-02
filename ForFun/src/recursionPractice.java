import java.util.*;

public class recursionPractice {

	public static void main(String[] args) {
		getUnique("ABCDFFDEFG");

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

}
