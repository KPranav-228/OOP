package skill_task2;

public class Stringmanipulation {

	public static void main(String[] args) {
		String FP = "  C:/Users/Docs/File.txt  ";

		System.out.println("Length: " + FP.length());
		System.out.println("Trimmed String: '" + FP.trim() + "'");
		System.out.println("Uppercase String: " + FP.toUpperCase());
		System.out.println("Lowercase String: " +FP.toLowerCase());
		System.out.println("Substring from index 5 to 16: " + FP.substring(5, 16));
		System.out.println("Replace all '/' with '\\': " + FP.replace('/', '\\'));
		System.out.println("Starts with '  C:': " + FP.startsWith("  C:"));
		System.out.println("Ends with '.txt  ': " +FP.endsWith(".txt  "));
		System.out.println("Index of character ':': " + FP.indexOf(':'));
		System.out.println("Last index of character '\\': " + FP.lastIndexOf('\\'));
		System.out.println("Character at index 6: " + FP.charAt(6));
	}
}