package control_statements;


public class SwitchTest {
public static void main(String[] args) {
	String browser = "chrome";
	switch(browser)//this is 1.8 version. in switch string is executed only in 1.7 java version. do it in 1.7 version we get output
	{
	case "firefox" : System.out.println("firefox browser");
	break;
	case "ie" : System.out.println("ie browser");
	break;
	case "chrome" : System.out.println("chrome browser");
	break;
	case "opera" : System.out.println("opera browser");
	break;
	case "mozilla" : System.out.println("mozilla browser");
	break;
	default : System.out.println("no case is matched");
	break;
	}//end of switch
	System.out.println("out of switch");
}
}

////output:
//chrome browser
//out of switch
