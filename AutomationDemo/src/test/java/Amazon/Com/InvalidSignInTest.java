package Amazon.Com;

import org.testng.annotations.Test;

import environment.BaseTest;
import processes.SignIn.LoginProcess;
import utilities.Log;



public class InvalidSignInTest  extends BaseTest {

	
	private LoginProcess loginProcess = null;
	
	@Test(alwaysRun = true, description = "Invalid Email  Test")
	public void invalidSignIn() throws Exception {
		try {
			
			Log.info("Sign In to Amazon.Ca Test  Start");
			navigateToSignInPage(iTestCaseRow);
			loginProcess.validationinvalidSignIn();
								
		
			
			Log.info("Sign in to Amazon.ca invalid email  Test end ");
		} catch (Exception e) {
			

			
			Log.error(e.getMessage());
			throw (e);
			 
		}
	}
	
	public void navigateToSignInPage(int iTestCaseRow) throws Exception {
	
		loginProcess = new LoginProcess(driver);
		loginProcess.login(iTestCaseRow);
	}

}
