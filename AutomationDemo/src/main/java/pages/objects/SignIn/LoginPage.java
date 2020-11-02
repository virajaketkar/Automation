package pages.objects.SignIn;

import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BaseClass;
import utilities.Constant;
import utilities.ExcelUtils;
import utilities.Log;
import utilities.Utils;

public class LoginPage extends BaseClass {
	
	public static final String USER_ID_ID = "//input[@id='ap_email']";
	public static final String PASSWORD_ID = "//input[@id='ap_password']";
	public static final String SIGN_IN_BUTTON_XPATH = "//input[@id='signInSubmit']";
	public static final String ROLE_BUTTON_XPATH = "//a[@id='nav-link-accountList']";
	public static final String ROLE_BUTTON_XPATH1 = "nav-link-accountList";
	//nav-link-accountList
	//By.xpath("span[text()='Hello, Sign in']")
	public static final String SIGNIN_BUTTON ="//span[text()='Sign in']";
	public static final String SIGNOUT_BUTTON="//*[text()='Sign Out']";
	public static final String MOUSE_OVERTEXT ="//a[@id='nav-link-yourAccount']/span[2]";
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	private WebElement element = null;
	
	public WebElement signOut_MouseOver() throws Exception {
		
		element = getElementByXpath( MOUSE_OVERTEXT );
		Log.info("Select Mouse Over Text: " + element);
		return element;
	}

	
	
public WebElement signIn_Button() throws Exception {
		
		element = getElementByXpath(SIGNIN_BUTTON );
		Log.info("Select SignIn Button: " + element);
		return element;
	}

public WebElement signoUT_Button() throws Exception {
	
	element = getElementByXpath(SIGNOUT_BUTTON);
	Log.info("Select Sign OUT  Button: " + element);
	return element;
}
	
	
	public WebElement userIDTextBox() throws Exception {
		element = getElementByXpath(USER_ID_ID);
		Log.info("User ID: " + element);
		return element;
	}
	
	private WebElement passwordTextBox() throws Exception {
		element = getElementByXpath(PASSWORD_ID);
		Log.info("Password: " + element);
		return element;
	}
	
	private WebElement signInButton() throws Exception {
		element = getElementByXpath(SIGN_IN_BUTTON_XPATH);
		Log.info("Sign In Button:" + element);
		return element;
	}
	
	public WebElement roleButton() throws Exception {
		element = getElementByXpath("//span[text()='Hello, Sign in']");
		
		/*Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		*/		Log.info("Role Button: " + element);
		return element;
	}
	
	
	
	public void enterTesterMID() throws Exception {
	  	  element = userIDTextBox();
	  	  if (element.isDisplayed()) {
	  		  element.clear();
	  		  element.sendKeys(Utils.getProperties().getProperty("testerID"));
	  		  Log.info("Enter Tester Id");
	  	  }
	  	  
	   }
		
	    public void enterTesterMPWD() throws Exception {
	   	 element = passwordTextBox();
	   	 if (element.isDisplayed());
	   	 element.sendKeys(Utils.getProperties().getProperty("testerPWD"));
	   	 Log.info("Enter Tester password");
	    }
	
	public void clickPSLink() throws Exception {
		//element = pSLink();
		if (element.isDisplayed()) {
			element.click();
			Log.info("PS Link clicked.");
		}
	}
	
	public void enterUserID(int iTestCaseRow) throws Exception {
		element = userIDTextBox();
		if (element.isDisplayed()) {
			element.clear();
			if(!Utils.isEmpty(Utils.getProperties().getProperty("userID")))
			{
				element.sendKeys(Utils.getProperties().getProperty("userID"));
			} else {
				System.out.println("Debugg 1");
				//ExcelUtils.setExcelFile(Constant.fileTestData(), "PaymodPhoenix");
				element.sendKeys(ExcelUtils.getCellData(iTestCaseRow, Constant.Username));
			    
			}
			Log.info(" Enter User Id.");
		}
	}
	
	
	
	public void enterTesterID() throws Exception 
	{
		
		element = userIDTextBox();
		if (element.isDisplayed()) {
			element.clear();
			//element.sendKeys(Utils.getProperties().getProperty("userID"));
			element.sendKeys(ExcelUtils.getCellData(1, Constant.TesterID));
			Log.info(" Enter User Id.");
		}
	}
	
	public void enterTesterPWD() throws Exception 
	{
		element = passwordTextBox();
		if (element.isDisplayed()) {
			//element.sendKeys(new String(Base64.getDecoder().decode(Utils.getProperties().getProperty("password").getBytes())));
			element.sendKeys(ExcelUtils.getCellData(1, Constant.PWD));
			Log.info(" Enter Password.");
		}
	}
	
	
	public void enterPWD(int iTestCaseRow) throws Exception {
		element = passwordTextBox();
		if (element.isDisplayed()) {
			if(!Utils.isEmpty(Utils.getProperties().getProperty("password"))) {
				element.sendKeys(new String(Base64.getDecoder().decode(Utils.getProperties().getProperty("password").getBytes())));
			} else {
				element.sendKeys(ExcelUtils.getCellData(iTestCaseRow, Constant.Password));
				
			}
			Log.info(" Enter Password.");
		}
	}
	
	
	public void enterS34Manager2UserID(int iTestCaseRow) throws Exception {
		element = userIDTextBox();
		if (element.isDisplayed()) {
			element.clear();
				element.sendKeys(ExcelUtils.getCellData(iTestCaseRow, Constant.S34Manager2UserId));
			Log.info(" Entered S34manager User Id.");
		}
	}
	
	public void clickSignInButton() throws Exception {
		element = signInButton();
		if (element.isDisplayed()) {
			element.click();
			Log.info("Click Sign In Button.");
		}
	}
	
	public void clickSignOutButton() throws Exception {
		element = signoUT_Button();
		if (element.isDisplayed()) {
			Thread.sleep(2000);
			element.click();
			//element.click();
			Log.info("Click Sign Out Button.");
		}
	}
	
	
	public void clickRoleButton() throws Exception {
		roleButton().click();				
		Log.info("Click Role Button.");
		
	}

	public WebElement FrenchLangLink() throws Exception {
		Log.info("Click on french lan link Link");
		element = driver.findElement(By.xpath("//a[contains(@title, 'Canadian French')]"));
		Log.info("Click on french lan link Link: " + element);
		Utils.waitForElement(element);
		return element;
	}
	private WebElement frenchSignInButton() throws Exception {
		element = getElementByXpath("//input[contains(@class,'psloginbutton')]");
		Log.info("Sign In Button:" + element);
		return element;
	}
	public void clickFrenchSignInButton() throws Exception {
		element = frenchSignInButton();
		if (element.isDisplayed()) {
			element.click();
			Log.info("Click Sign In Button.");
		}
	}
}
