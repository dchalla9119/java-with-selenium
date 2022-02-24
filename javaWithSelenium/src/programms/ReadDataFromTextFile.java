package programms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {
public static void main(String[] args) throws IOException {
	
	
	//1 logic: using FileReader  BufferReader  //using this 2 classes
	
//	FileReader fr=new FileReader("F:\\test.txt");
//	BufferedReader br=new BufferedReader(fr);
//	
//	String str;
//	
//	while((str = br.readLine())!= null)
//	{
//		System.out.println(str);
//	}
//	
//	br.close();
	
	
//	//2 logic : using scanner and file and looping
//	
//	File file=new File("F:\\\\test.txt");
//	
//	Scanner sc=new Scanner(file);
//	
//	//loop statement
//	while(sc.hasNextLine())
//	{
//		System.out.println(sc.nextLine());
//	}
	
	//3 logic : using scanner and file and delimeter
	
		File file=new File("F:\\test123.txt");
		
		Scanner sc=new Scanner(file);
		
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());

	
}
}
