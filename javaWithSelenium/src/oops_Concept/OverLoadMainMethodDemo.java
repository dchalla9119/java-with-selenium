package oops_Concept;

public class OverLoadMainMethodDemo {
public static void main(String[] args) {
	System.out.println("String[]");
		}
public static void main(int[] args) {
	System.out.println("String");
}
public static void main() {
	System.out.println("int[]");
}
}
//output: String[]
//we can overload main
