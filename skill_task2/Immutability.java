package skill_task2;

public class Immutability {

	public static void main(String[] args) {
		String h = " Say My Name? ";
		String b = h.concat("Your'e goddamnright");
		System.out.println("Original String: " + h);         
		System.out.println("Modified String: " + b);    
		System.out.println("Is original == modified? " + (h == b)); 
	}
}
