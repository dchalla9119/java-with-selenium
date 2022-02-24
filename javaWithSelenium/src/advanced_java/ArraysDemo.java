package advanced_java;

public class ArraysDemo {


public static void main(String[] args) {
	
	int[] a = new int[6];
	a[0] = 123;
	a[1] = 456;
	a[2] = 556;
	a[3] = 665;
	//a[4] = "dghjk"; //it is int array it wont take string elements
	//if we dont perform initialisation we will get default values. here we dont perform initialisation for a[4] a[5] we will get default values
	a[4] = 5665;
	a[5] = 566;
	//a[6] = 5665;
//	//if we declare a[6] wwe will get bound out of length error. we cannot increase or decrease the length once it is declared
//	//size is fixed in arrays
//	//in arrays we dont have any predefined methods. we have only one predefined method length to find the length of array
//	//this is not a heterogenious it will take only homogeneious
//	
	for(int i=0; i<a.length; i++)
	{
		System.out.println(a[i]);
	}
	
//	String[] str = {"hello","practice","java","selenium"};//declaration and initialisation in one line
//	//this of type string array it will take only string values
//	for(int i=0; i<str.length; i++)
//	{
//		System.out.println(str[i]);
//	}
	
	
//	int[][] a = new int[2][2];
//	a[0][0] = 456;
//	a[0][1] = 4556;
//	a[1][0] = 456556;
//	a[1][1] = 42356;
//	//a[1][1] = "asdf"; //we will get compile time error we defined int it cannot take string values
////	//size is fixed in arrays
////	//in arrays we dont have any predefined methods. we have only one predefined method length to find the length of array
////	//this is not a heterogenious it will take only homogeneious
//
//	
//	//whenever you have outer loop and inner loop mechanism, control comes to inner loop and the loop is executed till the condition becomes false.
//	
//	for(int i=0; i<a.length; i++)
//	{
//		for(int j=0; j<a.length; j++)
//		{
//			System.out.println(a[i][j]);
//		}
//	}
	
	
	
	
}
}


