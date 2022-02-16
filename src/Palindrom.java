import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {

		
		
		int i = 0;
		while(i<6) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a string");
			String word = sc.nextLine();
			int low =0;
			int high = word.length()-1;
			boolean isPalindrom=true;
			
			
		while (low <high) {
			if (word.charAt(low)!=word.charAt(high)) {
				 isPalindrom=false;}
				low++;
				high--;
			}
			
		if(isPalindrom) 
			System.out.println(word+" is palindrom");
		else
			System.out.println(word+" is not a palindrom");
		
	i++;}

}}
