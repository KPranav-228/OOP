package practicaltask_1;

public class Operators {

	public static void main(String[] args) {
		int num1 = 89;
        int num2 = 25;

        int total = num1 + num2;
        int diff = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        int mod = num1 % num2;

        System.out.println("Arithmetic Operators:");
        System.out.println("Sum: " +total);
        System.out.println("Difference: " +diff);
        System.out.println("Product: " +mul);
        System.out.println("Quotient: " +div);
        System.out.println("Remainder: " +mod);

        System.out.println("\nRelational Operators:");
        System.out.println("num1 == num2: " +(num1 == num2));
        System.out.println("num1 != num2: " +(num1 != num2));
        System.out.println("num1 > num2: " +(num1 > num2));
        System.out.println("num1 < num2: " +(num1 < num2));
        System.out.println("num1 >= num2: " +(num1 >= num2));
        System.out.println("num1 <= num2: " +(num1 <= num2));

        boolean p = true;
        boolean q = false;

        System.out.println("\nLogical Operators:");
        System.out.println("p && q: " +(p && q));
        System.out.println("p || q: " +(p || q));
        System.out.println("!p: " +(!p));
	}

}
