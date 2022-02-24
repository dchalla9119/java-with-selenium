package control_statements;


public class Switch1 {
	public static void main(String[] args) {
		String browser = "je";
		switch(browser)
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
//no case is matched
//out of switch
