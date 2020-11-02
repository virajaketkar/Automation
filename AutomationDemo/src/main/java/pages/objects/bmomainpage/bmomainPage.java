package pages.objects.bmomainpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BaseClass;
import utilities.Log;

//This Add a person page used for Adding New Employee Direct Entry 
public class bmomainPage extends BaseClass {
	
	
	public bmomainPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	

	public static final String Today_Deal= "//a[@class='nav-a nav-b']/span[@class='nav-a-content' and 1]";
	
	public static final String DEAL_STORE ="//*[@id=\"nav-xshop\"]/a[2]";
	public static final String FirstProduct ="//div[@id='100_dealView_0']/div[@class='a-section dealContainer' and 1]/div[@class='a-section layer' and 2]/div[@class='a-row dealContainer dealTile' and 1]/a[@id='dealImage' and @class='a-link-normal' and 1]/div[@class='a-row a-spacing-base a-spacing-top-base imageBlock' and 1]/div[@class='a-row dealContainer' and 1]/div[@class='a-row layer backGround' and 2]";
	public static final String addToCart ="add-to-cart-button";
	public static final String CONTINUE= "//span[@class='dijitReset dijitInline dijitIcon dijitNoIcon']";
	//DERIVED_HCR_PER_ADD_PERSON_LINK
	public static final String PASSWORD ="//input[@id='regSignInPassword']";
	public static final String CARDNUMBER="//input[@id='siBankCard']";
	////*[@id="abb-intl-product-view-B01J2G4VBG"]/div[1]/div[2]/h3/a
	
	public static final String LOGIN="sign-in";
	public static final String MASTERCARD ="//a[contains(text(),'BMO Mastercard']";
	////a[contains(text(),'Add New Button']
	private WebElement element = null;
	
public WebElement loginlink() throws Exception {
		
		element = getElementByID(LOGIN);
		Log.info("Select Login : " + element);
		return element;
	}

public WebElement mastercardlink() throws Exception {
	
	element = driver.findElement(By.partialLinkText("BMO Mastercard"));
	Log.info("Select MasterCard : " + element);
	return element;
}



	
public WebElement continueButton() throws Exception {
		
		element = getElementByXpath(CONTINUE);
		Log.info("Select Continue Button: " + element);
		return element;
	}
	
	
public WebElement password() throws Exception {
		
		element = getElementByXpath(PASSWORD);
		Log.info("Select Password text box: " + element);
		return element;
	}
	
public WebElement cardNumberfield() throws Exception {
		
		element = getElementByXpath(CARDNUMBER);
		Log.info("Select Card Number text box: " + element);
		return element;
	}
	
	
public WebElement dealStore() throws Exception {
		
		element = getElementByXpath(DEAL_STORE);
		Log.info("Select Deal Store link: " + element);
		return element;
	}
	
	
	public WebElement TodayDeal() throws Exception {
		
		element = getElementByID(FirstProduct);
		Log.info("Select First Product link: " + element);
		return element;
	}
	
public WebElement addToCart() throws Exception {
		
		element = getElementByID(addToCart);
		Log.info("Select add toc art  link: " + element);
		return element;
	}
	
	
public WebElement firstProduct() throws Exception {
		
		element = getElementByID(FirstProduct);
		Log.info("Select first product link: " + element);
		return element;
	}
	
	
	
	
	
	

	
	
	
	
}
