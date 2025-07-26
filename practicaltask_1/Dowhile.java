package practicaltask_1;
import java.util.Scanner;
public class Dowhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int maxCount=scanner.nextInt();
		int count=1;
		do {
		System.out.println("Count is: "+count);
		count++;
        }while(count<=maxCount);
	}
}





