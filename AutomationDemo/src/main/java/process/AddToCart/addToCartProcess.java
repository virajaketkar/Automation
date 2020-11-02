package process.AddToCart;

import org.openqa.selenium.WebDriver;

import pages.objects.mainpage.mainPage;
import utilities.BaseClass;
import utilities.Log;

public class addToCartProcess extends BaseClass {

	public addToCartProcess(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		
	int iTestCaseRow;
	mainPage Page = new mainPage(driver);
	
	 public  void addtoCart() throws Exception{
		 try
		 {
			 Log.info("Add to cart  Process starts "); 
			 Thread.sleep(3000);
	   			Page.dealStore().click(); 
	    		Page.deaChk().click();
	    		Page.viewDeal().click();
	    		Page.addToCart().click();
	    		Page.closepopUp().click();
	    		
			Log.info("Add Cart Process ends ");
		/*	
			if(driver.findElement(By.id("signInSubmit")).isDisplayed())
			{
				System.out.println("***********Sign In Required  ***********");
			}*/
					
		
			 
					
				
}catch(Exception e)

	{
		System.out.println("Validation Fail..." + e);
	}	
	
}
}