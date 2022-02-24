package oops_Concept;

import java.util.Scanner;

class ScannerTest
{
	int practiceHrs;
	String result;
		public void hello()
		{
		System.out.println(practiceHrs+"********"+result);
		}
}
public class InitialisationConsoleScannerDemo {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	ScannerTest scannerTest = new ScannerTest();
	
	System.out.println("enter practice hrs");
	int pracHrs = scanner.nextInt();//1
	scannerTest.practiceHrs = pracHrs;
	
	System.out.println("enter the result");
	String res = scanner.next();//1
	scannerTest.result = res;
	
	scannerTest.hello();
}
}
