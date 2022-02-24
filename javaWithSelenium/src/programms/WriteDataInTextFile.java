package programms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataInTextFile {
public static void main(String[] args) throws Throwable {
	
	FileWriter fw=new FileWriter("F:\\test123.txt");
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write("selenium with java");
	bw.write("selenium with python");
	bw.write("selenium with c++");
	System.out.println("finished");
	bw.close();
	
}
}
