package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import environment.Drivers;
import environment.EnvironmentData;

public class Utils {
	public static WebDriver driver = null;
	private static String sBrowserName = null;

	@SuppressWarnings("deprecation")
	public static WebDriver openBrowser(EnvironmentData env) throws Exception {
		try {
			//sBrowserName = ExcelUtils.getCellData(iTestCaseRow, Constant.Browser);
			sBrowserName = getProperties().getProperty("browser");
			if (sBrowserName.equalsIgnoreCase(Constant.Browser_IE)) {
				System.setProperty("webdriver.ie.driver", Drivers.ieDriverDetails().getAbsolutePath());
				DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
			    caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
			    caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
				driver = new InternetExplorerDriver(caps);
				Log.info("New IE driver instantiated");
			} else if (sBrowserName.equalsIgnoreCase(Constant.Browser_Chrome)) {
				System.setProperty("webdriver.chrome.driver", Drivers.chromeDriverDetails().getAbsolutePath());
				driver = new ChromeDriver();
				Log.info("New chrome driver instantiated");
			} else if (sBrowserName.equalsIgnoreCase(Constant.Browser_Firefox)) {
				DesiredCapabilities dc = DesiredCapabilities.firefox();
				FirefoxProfile profile = new FirefoxProfile();
 
				//Set Location to store files after downloading.
				profile.setPreference("browser.download.dir", env.getDownloadFolder());
				profile.setPreference("browser.download.downloadDir", env.getDownloadFolder());
				profile.setPreference("browser.download.defaultFolder", env.getDownloadFolder());
				profile.setPreference("browser.download.folderList", 2);
				 
				//Set Preference to not show file download confirmation dialogue using MIME types Of different file extension types.
				profile.setPreference("browser.helperApps.neverAsk.saveToDisk", 
						"application/pdf,image/jpeg,application/vnd.oasis.opendocument.text,application/vnd.oasis.opendocument.spreadsheet," +
						"application/vnd.oasis.opendocument.presentation,application/vnd.oasis.opendocument.graphics," +
						"application/vnd.ms-excel,application/vnd.openxmlformats-officedocument.spreadsheetml.sheet," +
						"application/vnd.ms-powerpoint,application/vnd.openxmlformats-officedocument.presentationml.presentation," +
						"application/vnd.openxmlformats-officedocument.wordprocessingml.document,application/vnd.mozilla.xul+xml," +
						"application/vnd.google-earth.kml+xml");
				 
				profile.setPreference( "browser.download.manager.showWhenStarting", false );
				profile.setPreference( "pdfjs.disabled", true );
				 
				dc.setCapability(FirefoxDriver.PROFILE, profile);
				System.setProperty("webdriver.gecko.driver", Drivers.geckoDriverDetails().getAbsolutePath());
				System.out.println(Drivers.geckoDriverDetails().getAbsolutePath());
				
				/*
				 * File pathBinary = new
				 * File("C:\\Users\\Talakokm\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
				 * FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
				 * DesiredCapabilities desired = DesiredCapabilities.firefox(); FirefoxOptions
				 * options = new FirefoxOptions();
				 * desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS,
				 * options.setBinary(firefoxBinary));
				 */
				 
				driver = new FirefoxDriver(dc);
				//driver = new FirefoxDriver();
				Log.info("New firefox driver instantiated");
			}
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Log.info("Implicit wait applied on the driver for 200 seconds");
			driver.manage().deleteAllCookies();
			Log.info("Cookies has been cleared before launching the application");
			driver.manage().window().maximize();
			Log.info("Browser window has been maximized now");
			driver.get(env.getAppUrl());
			Log.info("Web application launched successfully");
		} catch (Exception e) {
			Log.error("Class Utils | Method OpenBrowser | Exception desc : " + e.getMessage());
		}
		return driver;
	}

	public static String getTestCaseName(String sTestCase) throws Exception {
		String value = sTestCase;
		try {
			int posi = value.indexOf("@");
			value = value.substring(0, posi);
			posi = value.lastIndexOf(".");
			value = value.substring(posi + 1);
			return value;
		} catch (Exception e) {
			Log.error("Class Utils | Method getTestCaseName | Exception desc : " + e.getMessage());
			throw (e);
		}
	}

	public static void mouseHoverAction(WebElement mainElement, String subElement) {
		Actions action = new Actions(driver);
		action.moveToElement(mainElement).perform();
		if (subElement.equals("Accessories")) {
			action.moveToElement(driver.findElement(By.linkText("Accessories")));
			Log.info("Accessories link is found under Product Category");
		}
		if (subElement.equals("iMacs")) {
			action.moveToElement(driver.findElement(By.linkText("iMacs")));
			Log.info("iMacs link is found under Product Category");
		}
		if (subElement.equals("iPads")) {
			action.moveToElement(driver.findElement(By.linkText("iPads")));
			Log.info("iPads link is found under Product Category");
		}
		if (subElement.equals("iPhones")) {
			action.moveToElement(driver.findElement(By.linkText("iPhones")));
			Log.info("iPhones link is found under Product Category");
		}
		action.click();
		action.perform();
		Log.info("Click action is performed on the selected Product Type");
	}

	public static void waitForElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void takeScreenshot(WebDriver driver, String path) throws Exception {
		try {
			//String reportTime = new SimpleDateFormat("yyyy-MM-dd_HH-mm").format(Calendar.getInstance().getTime());
			//String path = System.getProperty("user.dir")+Constant.SCREENSHOTS_FOLDER+sTestCaseName+"_"+reportTime+".png";
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File(path));
		} catch (Exception e) {
			Log.error("Class Utils | Method takeScreenshot | Exception occured while capturing ScreenShot : "
					+ e.getMessage());
			throw new Exception();
		}
	}
	
	public static Properties getProperties() {
		Properties prop = new Properties();
		InputStream input = null;
		try {
			input = new FileInputStream("config.properties");
			prop.load(input);
 
		} catch (IOException ioe) {

		}
		return prop;
	}
	
	// This method generates a random Alpha Numeric String
	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	public static String randomAlphaNumeric(int count) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
	}

	// This method generates a random Special Character String
	private static final String SPECIAL_CHARACTER_STRING = "~!@#$%^&*(){}[]|;:'<>?,./'";
	public static String randomSpecialCharacter(int count) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int)(Math.random()*SPECIAL_CHARACTER_STRING.length());
			builder.append(SPECIAL_CHARACTER_STRING.charAt(character));
		}
		return builder.toString();
	}

	// This method convert date string from YYYYMMDD to DD/MM/YYYY
	public static String convertDateFormat(String inputDateString) throws ParseException {
		DateFormat inputFormat = new SimpleDateFormat("yyyyMMdd");
		DateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = inputFormat.parse(inputDateString);
		return outputFormat.format(date);
	}
	
	public static boolean isEmpty(String str) {
		if (str == null || str.trim().length() == 0) {
			return true;
		}
		return false;
	}
}
