package basics;

public class String_Demo {
public static void main(String[] args) {
	String greeting = "Hello";
    System.out.println(greeting);//Hello
    
    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println("The length of the txt string is: " + txt.length());//The length of the txt string is: 26
    
    String text = "Hello World";
    System.out.println(text.toUpperCase());//HELLO WORLD
    System.out.println(text.toLowerCase());//hello world
    
    String txt1 = "Please locate where 'locate' occurs!";
    //The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace)
    //Java counts positions from zero. 0 is the first position in a string, 1 is the second, 2 is the third ...
    System.out.println(txt1.indexOf("locate"));//7
    
    String firstName = "John";
    String lastName = "Doe";
    //The + operator can be used between strings to combine them. This is called concatenation:
    //Note that we have added an empty text (" ") to create a space between firstName and lastName on print.
    System.out.println(firstName + " " + lastName);//John Doe
    //You can also use the concat() method to concatenate two strings:
    System.out.println(firstName.concat(lastName));//JohnDoe
    
    String txt2 = "We are the so-called \"Vikings\" from the north.";
    System.out.println(txt2);//We are the so-called "Vikings" from the north.
    String txt3 = "It\'s alright.";
    System.out.println(txt3);//It's alright.
    String txt4 = "The character \\ is called backslash.";
    System.out.println(txt4);//The character \ is called backslash.
    String txt5 = "Hello\nWorld!";
    System.out.println(txt5);
    //Hello
    //World!
    String txt6 = "Hello\rWorld!";
    System.out.println(txt6);
    //Hello
    //World!
    String txt7 = "Hello\tWorld!";
    System.out.println(txt7);//Hello	World!
    String txt8 = "Hell\blo World!";
    System.out.println(txt8);//Helllo World!
    
    
    //java uses the + operator for both addition and concatenation. Numbers are added. Strings are concatenated.
    //If you add a number and a string, the result will be a string concatenation:
    int x = 10;
    int y = 20;
    int z = x + y;
    System.out.println(z);//30
    String a = "10";
    String b = "20";
    String c = a + b;
    System.out.println(c);//1020
    String d = "10";
    int e = 20;
    String f = d + e;
    System.out.println(f);//1020
    //String g = "10";
    //int h = 20;
    //int i = g + h;
    //System.out.println(i);//Type mismatch: cannot convert from String to int. we will get compile time error

}
}
