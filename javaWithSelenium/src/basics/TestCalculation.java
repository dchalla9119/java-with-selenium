package basics;


public class TestCalculation {
	 public static void main(String args[]) {
	      int a = 20, b = 10;
	      Test1 demo = new Test1();
	      demo.addition(a, b);
	      demo.Subtraction(a, b);
	      demo.multiplication(a, b);
	   }
	   int z;
		
	   public void addition(int x, int y) {
	      z = x + y;
	      System.out.println("The sum of the given numbers:"+z);
	   }
		
	   public void Subtraction(int x, int y) {
	      z = x - y;
	      System.out.println("The difference between the given numbers:"+z);
	   }
	}

	class Test1 extends Calculation {
	   public void multiplication(int x, int y) {
	      z = x * y;
	      System.out.println("The product of the given numbers:"+z);
	   }
		
	  
	}
	
//	//output:
//	The sum of the given numbers:30
//	The difference between the given numbers:10
//	The product of the given numbers:200
