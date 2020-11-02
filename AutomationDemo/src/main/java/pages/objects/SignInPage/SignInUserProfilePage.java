package pages.objects.SignInPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BaseClass;
import utilities.Log;
//This Test case is to submit Time Sheet by Default Week 
public class SignInUserProfilePage extends BaseClass {
	
	
	public SignInUserProfilePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static final String SIGNIN_LINK = "//a[@id='nav-link-accountList']";
	public static final String SIGNIN_BUTTON ="//span[text()='Sign in']";
	public static final String EMAIL_TEXTBOX ="//input[@id='ap_email']";
	public static final String PASS_ID ="//input[@id='ap_password']";
    public static final String SUBMIT_BUTTON ="//input[@id='signInSubmit']";
    public static final String LOCKOUT_CHECKBOX ="PSOPRDEFN_ACCTLOCK";
    public static final String SYMBOL_ID ="PSOPRDEFN_SYMBOLICID";
    public static final String PASSWORD ="PSOPRDEFN_OPERPSWD";
    public static final String CONFIRM_PASSWORD ="PSUSRPRFL_WRK_OPERPSWDCONF";
    public static final String SAVE_BUTTON ="#ICSave";

    //Begins with  = ID=PSOPRDEFN_SRCH_OPRID;


	
	private WebElement element = null;
	

public WebElement signIn_Button() throws Exception {
		
		element = getElementByXpath(SIGNIN_BUTTON );
		Log.info("Select SignIn Button: " + element);
		return element;
	}
	
	

public WebElement signIn_ID() throws Exception {
		
		element = getElementByXpath( SIGNIN_LINK);
		Log.info("Select SignIn Link: " + element);
		return element;
	}
	

public WebElement email_ID() throws Exception {
	
	element = getElementByXpath(EMAIL_TEXTBOX);
	Log.info("Select email Id: " + element);
	return element;
}


public WebElement password_ID() throws Exception {
	
	element = getElementByXpath(PASS_ID);
	Log.info("Select Password Textbox: " + element);
	return element;
}
public WebElement submit() throws Exception {
	
	element = getElementByXpath(SUBMIT_BUTTON);
	Log.info("Select Submit Button: " + element);
	return element;
}


	
	
}
