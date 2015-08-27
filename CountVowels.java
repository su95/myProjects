import java.util.Scanner;


public class CountVowels {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a string: ");
		
		String str = sc.nextLine();
		
		sc.close();
		
		int aCount = 0;
		int eCount = 0;
		int iCount = 0;
		int oCount = 0;
		int uCount = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == 'a')      { aCount++; }
			
			else if(str.charAt(i) == 'e') { eCount++; }
			
			else if(str.charAt(i) == 'i') { iCount++; }
			
			else if(str.charAt(i) == 'o') { oCount++; }
			
			else if(str.charAt(i) == 'u') { uCount++; }
			
			
		}
		
		System.out.println("No of a's: " + aCount);
		System.out.println("No of e's: " + eCount);
		System.out.println("No of i's: " + iCount);
		System.out.println("No of o's: " + oCount);
		System.out.println("No of u's: " + uCount);
		System.out.println("No of vowels: " + (aCount+eCount+iCount+oCount+uCount));

	}

}






















