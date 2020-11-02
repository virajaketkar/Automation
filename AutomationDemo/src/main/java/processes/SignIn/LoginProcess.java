package processes.SignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pages.objects.SignIn.LoginPage;
import utilities.BaseClass;
import utilities.Constant;
import utilities.ExcelUtils;
import utilities.Log;

public class LoginProcess extends BaseClass {
	int iTestCaseRow = 0 ;
	LoginPage loginPage = new LoginPage(driver);
	
	public LoginProcess(WebDriver driver) {
		super(driver);
		
	}
	
	public void login(int iTestCaseRow) throws Exception
	{
		
		Log.info("Login Process starts ");
	
	//	//loginPage.clickPSLink();
		loginPage.clickRoleButton();
					
		loginPage.enterUserID(iTestCaseRow);
	//	loginPage.enterPWD(iTestCaseRow);
	//	loginPage.clickSignInButton();
		
		
		
		
		Log.info("Login Process ends ");
	
	}
	
	
	
	
	
	
	public void bmologin(int iTestCaseRow) throws Exception
	{
		
		Log.info("Login Process starts ");
	
		//loginPage.clickPSLink();
		loginPage.clickRoleButton();
					
		loginPage.enterUserID(iTestCaseRow);
		loginPage.enterPWD(iTestCaseRow);
		loginPage.clickSignInButton();
		
		
		
		
		Log.info("Login Process ends ");
	
	}
	
	
	
	
	public void validationSignIn() throws Exception
	{
		String validationtext = driver.findElement(By.xpath(".//*[@id='glow-ingress-line1']")).getText();
		//nav-link-accountList
		
		System.out.println(validationtext);
		//Hello
		if(validationtext.contains("Hello"))
		{
			System.out.print("*****SignIn not completed *************");
		}
		else
		{
			System.out.println("*************Sign In Compelte !************ : " + validationtext);
		}
		
	}
	
	
	
	public void validationinvalidSignIn() throws Exception
	{
		Thread.sleep(3000);
		driver.findElement(By.id("continue")).click();
	//	driver.findElement(By.id("ap_password")).sendKeys("12345");
		driver.findElement(By.id("signInSubmit")).click();
		String validationtext = driver.findElement(By.xpath("//*[@id='auth-password-missing-alert']")).getText();
		//nav-link-accountList
		
		System.out.println(validationtext);
		//Hello
		if(validationtext.contains("Important Message!"))
		{
			System.out.print("*****Invalid SignIn  *************");
		}
		
		
	}
	
	
	public void SignOutProcess() throws Exception
	{
		
		WebElement mouseOverMenu = driver.findElement(By.cssSelector("#nav-link-accountList"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mouseOverMenu);
        actions.build().perform();          
	
		loginPage.clickSignOutButton();
		
		  //Assert the mouse over menu option is present        
       // assertTrue(driver.findElement(By.cssSelector("#nav-al-your-account > a:nth-child(2) > span:nth-child(1)")) != null);
	}
	
	
	




}