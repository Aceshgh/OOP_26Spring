package lab1;
import java.util.Scanner;

public class problem6 {
	
	public static void main(String[] args) {
		System.out.println("enter word = ");
		Scanner scanner = new Scanner(System.in);
		String s =scanner.nextLine();
		
		StringBuilder sb =new StringBuilder(s);
		sb.reverse();
		
		String t =sb.toString();
		if(s.equals(t)) {
			System.out.println("Palindrome");
		} else System.out.println("Not palindrome");
	}
}