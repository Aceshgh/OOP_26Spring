package lab1;
import java.util.Scanner;

public class problem5 {

	public static void main(String[] args) {
		
		int bal = 0;
		System.out.println("your balance = " + bal);
		System.out.println("enter your money = ");
		
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		bal += money;
		System.out.println("You inserted " + money + "$. Your balance is " + bal + "$");
		
	}

}