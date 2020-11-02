package Amazon.Com;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import utilities.Log;
import environment.BaseTest;
import process.AddToCart.addToCartProcess;
import processes.SignIn.LoginProcess;



public class AddproductToCartTest  extends BaseTest {

	private LoginProcess loginProcess = null;
	private addToCartProcess addProcess =null;
	
	
	@Test(alwaysRun = true, description = "Add Prodcut to Cart Test")
	public void addProduct() throws Exception {
		try {
			
			Log.info("Add Product To Cart  Test ");
		//	navigateToCartPage(iTestCaseRow);
			addProcess = new  addToCartProcess(driver);
			addProcess.addtoCart();			
			Log.info("Add Product to cart test end");
		} catch (Exception e)
		{
			AssertJUnit.fail("Add Product To Cart Test Fail");
			Log.error(e.getMessage());
			throw (e);
			
		}
	}
	
	public void navigateToCartPage(int iTestCaseRow) throws Exception {
		loginProcess = new LoginProcess(driver);
		loginProcess.login(iTestCaseRow);
	    addProcess = new  addToCartProcess(driver);
	}

}
