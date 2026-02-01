package lab1;
import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("lenght of one side = ");
		int a = scanner.nextInt();
		double b = a;
		
		System.out.println("area: " +a*a);
		System.out.println("perimeter: " +a*4);
		System.out.println("diagonal: " +Math.sqrt(2)*b);
		
	}

}
