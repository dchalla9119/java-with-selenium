package programms;

public class PatternNumber {
public static void main(String[] args) {
	
	// seperate logics 1 for pattern 2 for numbers
	
	
	int k=5;
    
//	for(int i=1; i<=k; i++)
//    {
//        for(int j=1; j<=i; j++)
//        {
//            // printing stars
//            System.out.print("* ");
//        }
//
//        // ending line after each row
//        System.out.println();
//    }
	
	for(int i=1; i<=k; i++)
    {
		int num=1;
        for(int j=1; j<=i; j++)
        {
            // printing stars
            System.out.print(num+" ");
            num++;
        }

        // ending line after each row
        System.out.println();
    }

    
//    int n=5;
//	for(int i=1; i<=n; i++)
//	{
//		for(int j=1; j<=i; j++)
//		{
//			System.out.println("* ");
//		}
//		System.out.println();
//	}

	
//	int rows = 5;
//
//    for (int i = 1; i <= rows; ++i) {
//      for (int j = 1; j <= i; ++j) {
//        System.out.print("* ");
//      }
//      System.out.println();
//    }
    
    
    }
}
