//import java.util.Scanner;
package basicprograms;
import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=scanner.nextInt();
		if(num%2==0) {
			System.out.println("The number is Even ");
		}
		else {
			System.out.println("The Number is Odd ");
		} 
	}
}
