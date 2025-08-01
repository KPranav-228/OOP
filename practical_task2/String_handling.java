package practical_task2;

public class String_handling {

	public static void main(String[] args) {
		String name = "Programming";
		System.out.println("Original: " + name);
		System.out.println("Uppercase: " + name.toUpperCase());
		System.out.println("Substring: " + name.substring(1, 4));
		System.out.println("Replaced: " + name.replace('m', '@'));
		System.out.println("Lowercase: " + name.toLowerCase());
		System.out.println("Length: " + name.length());
		System.out.println("Ends with 'ing': " + name.endsWith("ing"));
	}
}
