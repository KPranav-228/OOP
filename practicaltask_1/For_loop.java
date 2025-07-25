package practicaltask_1;
import java.util.Scanner;

public class For_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("For loop: First 5 even numbers");
        for (int i = 1; i <= 5; i++) {
            System.out.print((i * 2) + " ");
        }
        System.out.println();
    }
}
