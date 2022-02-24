package control_statements;


public class SwitchWithoutBreak {
	public static void main(String[] args) {
		String browser = "chrome";
		switch(browser)
		{
		case "firefox" : System.out.println("firefox browser");
		break;
		case "ie" : System.out.println("ie browser");
		break;
		case "chrome" : System.out.println("chrome browser");
	
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
//opera browser
//out of switch
