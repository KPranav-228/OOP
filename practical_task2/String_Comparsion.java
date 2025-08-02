package practical_task2;

public class String_Comparsion {

	public static void main(String[] args) {
		 String s1 = "BMW";
	        String s2 = "Bmw";
	        String s3 = new String("BMW");
	        System.out.println("s1 == s2: " + (s1 == s2)); 
	        System.out.println("s1 == s3: " + (s1 == s3)); 
	        System.out.println("s1.equals(s3): " + s1.equals(s3)); 
	}
}

