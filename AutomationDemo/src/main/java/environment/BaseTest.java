package environment;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import utilities.Constant;
import utilities.ExcelUtils;
import utilities.ExtentReportUtils;
import utilities.Log;
import utilities.Utils;

import executionstatus.ExecutionStatus;

public class BaseTest {

	protected WebDriver driver;
	protected String sTestCaseName = null;
	protected String methodName = null;
	protected EnvironmentData env = null;
	protected int iTestCaseRow;
    protected ExecutionStatus executionStatus = null;

	// public static ExtentHtmlReporter htmlReporter;
	// public static ExtentReports extent;

	// public static ExtentTest test;

	@BeforeSuite
	public void beforeSuite() {
		ExtentReportUtils.setup();
	}
	
	
	@BeforeClass
	public synchronized void beforeClass() {
		ExtentReportUtils.createTest(getClass().getSimpleName());
	}

	@BeforeMethod
	public void before() throws Exception {
		sTestCaseName = getClass().getSimpleName();
		Log.startTestCase(sTestCaseName);
		if (env == null) {
			Map<String, EnvironmentData> envMap = ExcelUtils
					.createEnvironmentDataFromExcel(Constant.ENVIRONMENT_EXCEL_FILE);
			env = envMap.get(Utils.getProperties().getProperty("environment"));
		}
		
		if(executionStatus == null) { 
			executionStatus = new ExecutionStatus();
			executionStatus.setTCName(sTestCaseName); 
		}
	}

	@BeforeMethod
	public synchronized void beforeMethod(Method method) throws Exception {
		ExtentReportUtils.createChildTest(method);
		methodName = method.getName();
	}

	@BeforeMethod
	public void beforeMethod() throws Exception {
		sTestCaseName = this.toString();
		sTestCaseName = Utils.getTestCaseName(this.toString());
		Log.startTestCase(sTestCaseName);
		ExcelUtils.setExcelFile(Constant.fileTestData(), "IBMDEMO");
		iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName, Constant.TestCaseName);
		if (driver == null) {
			driver = Utils.openBrowser(env);
		}
		// new BaseClass(driver);
	}

	@AfterMethod
	public void afterMethod(ITestResult result) {
		try {
			String reportTime = new SimpleDateFormat("yyyy-MM-dd_HH-mm").format(Calendar.getInstance().getTime());
			String fileName = sTestCaseName + "_" + reportTime + ".png";

			String path = Constant.SCREENSHOTS_FOLDER + fileName;
			Log.info("File name is: " + fileName);
			Utils.takeScreenshot(driver, path);

			ExtentReportUtils.reportResult(result, fileName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//driver.quit(); 
		Log.info("Browser is closed now");
	}
	
	@AfterTest public void after() { 
		//driver.quit(); 
		//driver = null;
		//Log.info("Browser is closed now"); 
	}

/*	 @AfterSuite public void tearDown() throws FindFailed, InterruptedException { 
		 ExtentReportUtils.upload();
		 ExtentReportUtils.loginBox();
	 }*/
	 

}
