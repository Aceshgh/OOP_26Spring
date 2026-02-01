package lab1;
import java.util.Scanner;

public class problem1 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("your name = ");
		String n = scanner.nextLine();
		String box = "-";
		box = box.repeat(n.length() );
		
		System.out.println("+" + box +"+");
		System.out.println("|" + n +"|");
		System.out.println("+" + box +"+");
	}
}
