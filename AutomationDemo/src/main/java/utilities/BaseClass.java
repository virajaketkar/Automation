package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import environment.EnvironmentData;

public class BaseClass {
	public static WebDriver driver;
	public static boolean bResult;
	protected static Wait<WebDriver> wait;
	public EnvironmentData env;
	
	protected final static long FLUENT_WAIT_TIMEOUT = 30; // in seconds
    protected final static long FLUENT_WAIT_POLLING_FREQUENCY = 3; // in seconds
    public static final String PROCESS_MONITOR_LINK_ID = "PRCSRQSTDLG_WRK_LOADPRCSMONITORPB";
    public static final String OK_BUTTON_ID = "#ICSave";
    public static final String HOME_LINK_PARTIAL_TEXT = "Home";
    public static final String PROCESS_OK_BUTTON_ID = "#ICOK";
    public static final String REFRESH_BUTTON_ID = "REFRESH_BTN";
    public static final String RUN_STATUS_ID = "PMN_PRCSLIST_RUNSTATUSDESCR$0";
    public static final String DIST_STATUS_ID = "PMN_PRCSLIST_DISTSTATUS$0";
    
	public  BaseClass(WebDriver driver){
		BaseClass.driver = driver;
		BaseClass.bResult = true;
		wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(FLUENT_WAIT_TIMEOUT))
                .pollingEvery(Duration.ofSeconds(FLUENT_WAIT_POLLING_FREQUENCY))
                .ignoring(NoSuchElementException.class);
	}
	
	
	
	public static JsonObject getUIElement(String ElementRep) {
		
		Properties pageprop = new Properties();
		InputStream input = null;
		JsonObject PageObject=null;
		System.out.println("Value of the pages"+ElementRep);
		String PageElements[] = ElementRep.split("\\.");
		System.out.println("Split elements"+PageElements[0]+PageElements[1]);
		
		try {
				input = new FileInputStream("C:\\Selenium\\paymod_automation_ws\\paymod_pilot\\ObjectReference\\"+PageElements[0]+".properties");
				pageprop.load(input);
				System.out.println("Retrieved page value" + pageprop.getProperty(PageElements[1]));
				
				JsonParser parser = new JsonParser();
				PageObject = (JsonObject) parser.parse(pageprop.getProperty(PageElements[1]));
				String name = PageObject.getAsString();
				System.out.println("Json string retrieved "+name);
				
				//System.exit(0);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception in retrieving property value"+e.getMessage());
			//e.printStackTrace();
		} catch(IOException e1) {
			System.out.println("Exception in retrieving property value"+e1.getMessage());
		}
		
		return PageObject;
	}
	
	@SuppressWarnings("null")
	public static void entertext(String UIElement, String value) {
		try {
			
			System.out.println("Entering enter text function");
			//WebElement textbox = findWebElement();
			WebElement textbox = null;
			textbox.sendKeys(value);
			
			//UIHelper.findIFrame(driver, By.id("PRCSRUNCNTL_RUN_CNTL_ID"));
			//driver.findElement(By.id("PRCSRUNCNTL_RUN_CNTL_ID")).sendKeys(value);
			//driver.switchTo().defaultContent();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception in enter text"+e.getMessage());
			e.printStackTrace();
		}
	}
	
	protected static WebElement getElementByID(String elementLocator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementLocator)));

    }

    protected WebElement getElementByName(String elementLocator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(elementLocator)));
    }

    protected static WebElement getElementByXpath(String elementLocator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementLocator)));
    }

    protected WebElement getElementByClassName(String elementLocator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(elementLocator)));
    }
    
  
	

	
	public WebElement OKButton() throws Exception {
		WebElement element = getElementByID(OK_BUTTON_ID);
		Log.info(" OK Button  selected: " + element);
		return element;
	}
	
	public void clickOK() throws Exception {
		Thread.sleep(2000);
		OKButton().click();
		Log.info("OK button clicked ");
	}
	
	public void createExcelFileForAbendList(List<String> abendList, EnvironmentData env, String abendListFile) throws Exception {
		Log.info("Create Excel File For Abend List starts ");
		String file = Constant.EXCEL_DATA_FOLDER + abendListFile;
		ExcelUtils.createExcelFromArray(file, abendList);
		Log.info("Create Excel File For Abend List ends ");
	}

}
