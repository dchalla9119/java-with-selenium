package programms;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumbersAndString {
public static void main(String[] args) {
	
//	//1 logic  by using random class
//	Random random = new Random();
//	
//	int random_int=random.nextInt(10);
//	System.out.println(random_int);
//	
	
//	//2 using math class
//	System.out.println(Math.random());
	
	
	//3 apache commons-lang API 3rd party api
	String randNum=RandomStringUtils.randomNumeric(5);
	System.out.println(randNum);
	
	String ranSt=RandomStringUtils.randomAlphabetic(5);
	System.out.println(ranSt);
}
}
