package practical_task2;

public class String_Immutability {
      public static void main(String[] args) {
    	  String s = "Hello";
          System.out.println("Original: " + s);
          s.concat(" World");
          System.out.println("After concat (unchanged): " + s); 
          s = s.concat(" World"); 
          System.out.println("After assigning concat: " + s); 

	}
}
