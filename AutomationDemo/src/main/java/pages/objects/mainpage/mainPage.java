package pages.objects.mainpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BaseClass;
import utilities.Log;

//This Add a person page used for Adding New Employee Direct Entry 
public class mainPage extends BaseClass {
	
	
	public mainPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static final String Today_Deal= "//a[@class='nav-a nav-b']/span[@class='nav-a-content' and 1]";
	
	public static final String DEAL_STORE ="//*[@id=\"nav-xshop\"]/a[2]";
	public static final String FirstProduct ="//div[@id='100_dealView_0']/div[@class='a-section dealContainer' and 1]/div[@class='a-section layer' and 2]/div[@class='a-row dealContainer dealTile' and 1]/a[@id='dealImage' and @class='a-link-normal' and 1]/div[@class='a-row a-spacing-base a-spacing-top-base imageBlock' and 1]/div[@class='a-row dealContainer' and 1]/div[@class='a-row layer backGround' and 2]";
	public static final String addToCart ="add-to-cart-button";
	public static final String dealChecBox= "//span[1]/div[@class='a-checkbox checkbox a-spacing-micro' and 1]/label[1]/span[@class='a-label a-checkbox-label' and 1]";
	//DERIVED_HCR_PER_ADD_PERSON_LINK
	public static final String ViewDeal ="//div[7]/div[@class='a-row a-spacing-medium' and 1]/span[@class='a-declarative' and 1]/span[1]";
	public static final String dealFirstVlaue ="//*[@id=\"abb-intl-product-view-B079GHKCNP\"]/div[1]/div[2]/h3/a";
	////*[@id="abb-intl-product-view-B01J2G4VBG"]/div[1]/div[2]/h3/a
	
	public static final String CLOSE="//i[@class='a-icon a-icon-close']";
	public static final String CHECKOUT ="//a[@class='hucSprite s_checkout hlb-checkout-button']";
	
	private WebElement element = null;
	
public WebElement closepopUp() throws Exception {
		
		element = getElementByXpath(CLOSE);
		Log.info("Select CLOSE : " + element);
		return element;
	}

public WebElement checkOut() throws Exception {
	
	element = getElementByXpath(CHECKOUT );
	Log.info("Select Check Out : " + element);
	return element;
}



	
public WebElement viewDealfirst() throws Exception {
		
		element = getElementByXpath(dealFirstVlaue);
		Log.info("Select view deal frist value: " + element);
		return element;
	}
	
	
public WebElement viewDeal() throws Exception {
		
		element = getElementByXpath(ViewDeal );
		Log.info("Select view deal: " + element);
		return element;
	}
	
public WebElement deaChk() throws Exception {
		
		element = getElementByXpath(dealChecBox);
		Log.info("Select Deal chk box: " + element);
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
