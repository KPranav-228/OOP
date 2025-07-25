package practicaltask_1;
import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int value = input.nextInt();
	        if (value % 2 == 0) {
	            System.out.println("The number is even.");
	        } else {
	            System.out.println("The number is odd.");
	        }

	}

}
