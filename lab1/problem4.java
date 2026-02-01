package lab1;
import java.util.Scanner;

public class problem4 {

	public static void main(String[] args) {
		
		System.out.println("enter a, b and c = ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c =scanner.nextInt();
	
		int D =b*b-4*a*c;
		if(D<0) {
			System.out.println("error");
		} else System.out.println(D);
		
	}

}