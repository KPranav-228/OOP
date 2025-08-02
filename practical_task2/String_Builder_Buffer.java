package practical_task2;

public class String_Builder_Buffer {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb);
        StringBuffer sbf = new StringBuffer("Java");
        sbf.insert(4, " Programming");
        System.out.println("StringBuffer: " + sbf);
	}
}
