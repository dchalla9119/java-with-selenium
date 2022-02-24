package programms;

public class SwappingTwoNumbers {
public static void main(String[] args) {
	
	int a=10,b=20;
	 System.out.println("Before swapping the values are..."+a+"   "+b);
	
//	//1 logic by using 3rd variable
//	 int c;
//	 c=a;
//	 a=b;
//	 b=c;
//	 System.out.println("After swapping the values are..."+a+"   "+b);
	
	 
//	//2 logic without using 3rd variable
//		 a=a+b;//10+20=30
//		 b=a-b;//30-20=10
//		 a=a-b;//30-10=20
//		 System.out.println("After swapping the values are..."+a+"   "+b);
	 
	 
//	//3 logic  using * and / without using 3rd variable
//	 //here a and b value should not be 0
//	 a=a*b;//10*20=200
//	 b=a/b;//200/20=10
//	 a=a/b;//200/10=20
//	 System.out.println("After swapping the values are..."+a+"   "+b);

	 
//	//4 logic  using bitwise XOR operator. it will convert to decimal and do the calculation
//		 //here a and b value should not be 0
//		 a=a^b;
//		 b=a^b;
//		 a=a^b;
//		 System.out.println("After swapping the values are..."+a+"   "+b);

	 
	 //5 logic single statement expression
	// a=10,b=20. it will start execution of logic from right to left
	 b=a+b-(a=b);
	// a=b--->a=20
	 //a+b-a = 10+20-20=10
	 //b=10
	 
	 System.out.println("After swapping the values are..."+a+"   "+b);
}
}
