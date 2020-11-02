package pages.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.BaseClass;
import utilities.Log;
import utilities.UIHelper;
import utilities.Utils;

public class Common_Obj extends BaseClass {
	private static WebElement element = null;
	
	public Common_Obj(WebDriver driver) {
		super(driver);
	}
	//crefli_HC_PAY_SHEET_LN_CAN

	
	
	
	//Process AND Review Summary 
	
	//fldra_HC_FOR_PAY
	
	
	
	
	//Request and Trigger Summary 
	//crefli_HC_RETROPAY_RQST_SUMM_NA
	public static WebElement requestTriggerSummary() throws Exception {
		try {
			element = driver.findElement(By.id("crefli_HC_RETROPAY_RQST_SUMM_NA"));
			Log.info("Request and Trigger Summary ");
			Utils.waitForElement(element);
		} catch (Exception e) {
			Log.error("Request and Trigger Summary link Not Found !");
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement byPaylineSecurity() throws Exception {
		try {
			element = driver.findElement(By.id("crefli_HC_PAY_SHEET_LN_CAN"));
			Log.info("ByPaylineSecurity");
			Utils.waitForElement(element);
		} catch (Exception e) {
			Log.error("ByPaylineSecurity link Not Found !");
			throw (e);
		}
		return element;
	}
	
	
	
	public static WebElement reviewPayCalendars() throws Exception {
		try {
			element = driver.findElement(By.id("crefli_HC_PAY_CALENDAR_TABLE_NA8"));
			Log.info("Review Pay Calendars");
			Utils.waitForElement(element);
		} catch (Exception e) {
			Log.error("Review Pay Calendars link Not Found !");
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement preconfirmAuditReport() throws Exception {
		try {
			element = driver.findElement(By.id("crefli_HC_RUN_PRECONF_CAN"));
			Log.info("Preconfirm Audit Report");
			Utils.waitForElement(element);
		} catch (Exception e) {
			Log.error("Preconfirm Audit Report link Not Found !");
			throw (e);
		}
		return element;
	}
	
	public static WebElement ConfirmPayroll() throws Exception {
		try {
			element = driver.findElement(By.id("crefli_HC_RUNCTL_PAY_CONF_CAN"));
			Log.info("Confirm Payroll link.");
			Utils.waitForElement(element);
		} catch (Exception e) {
			Log.error("Confirm Payroll Not Found !");
			throw (e);
		}
		return element;
	}
	
	public static WebElement Navigation_MenuLink() throws Exception {
		try {
			//Thread.sleep(1000);
			element = driver.findElement(By.xpath("//*[contains(text(),'Main Menu')]"));
			System.out.println(element);
			Log.info("Click on Menu Link");
			Utils.waitForElement(element);
		} catch (Exception e) {
			System.out.println(element);
			Log.error("Link Not Found !");
			throw (e);
		}
		return element;
	}
	
	//crefli_PW_NEG_NET_GBL
	public static WebElement NegativeNetUpdateLink() throws Exception {
		try {
			element = driver.findElement(By.id("crefli_PW_NEG_NET_GBL"));
			 			
			Log.info("Select crefli_PW_NEG_NET_GBL");
			//Utils.waitForElement(element);
		} catch (Exception e) {
			System.out.println(element);
			Log.error("Link Not Found !");
			throw (e);
		}
		return element;
	}
	
	public static WebElement AuditReport() throws Exception {
		try {
			element = driver.findElement(By.id("crefli_HC_RUN_PRECALC_CAN"));
			 			
			Log.info("Select Generate AuditReport");
			//Utils.waitForElement(element);
		} catch (Exception e) {
			System.out.println(element);
			Log.error("Link Not Found !");
			throw (e);
		}
		return element;
	}
	
	public static WebElement AdjustPensionDeduction_Rect () throws Exception {
		try {
			element = driver.findElement(By.linkText("Adjust Pension Deduction (Ret)"));
			 			
			Log.info("Select Adjust Pension Deduction Rect ");
			//Utils.waitForElement(element);
		} catch (Exception e) {
			System.out.println(element);
			Log.error("Link Not Found !");
			throw (e);
		}
		return element;
	}
	

	public static WebElement PeopleTool() throws Exception{
		try {
			element = driver.findElement(By.id("fldra_PT_PEOPLETOOLS"));
			Log.info("People Tool: " + element);
			Utils.waitForElement(element);
		} catch (Exception e) {
			Log.error("People Tool link not Found !");
			throw (e);
		}
		return element;
	}
	
	public static WebElement UserProfile() throws Exception{
		try {
			element = driver.findElement(By.id("PT_USER_PROFILES"));
			Log.info("User Profile: " + element);
			Utils.waitForElement(element);
		} catch (Exception e) {
			Log.error("User Profile not Found !");
			throw (e);
		}
		return element;
	}
	
	public static WebElement UserProfileLink() throws Exception{
		try {
			element = driver.findElement(By.id("crefli_PT_USERMAINT_GBL"));
			Log.info("User Profile link: " + element);
			Utils.waitForElement(element);
		} catch (Exception e) {
			Log.error("User Profile link not Found !");
			throw (e);
		}
		return element;
	}
	public static WebElement Security() throws Exception{
		try {
			element = driver.findElement(By.id("PT_SECURITY"));
			Log.info("Security link: " + element);
			Utils.waitForElement(element);
		} catch (Exception e) {
			Log.error("Security link not Found !");
			throw (e);
		}
		return element;
	}
	
	public static WebElement TransitionPaymentAdjustment () throws Exception {
		try {
			element = driver.findElement(By.linkText("Transition Payment Adjustment"));
			 			
			Log.info("Select TransitionPaymentAdjustment");
			//Utils.waitForElement(element);
		} catch (Exception e) {
			System.out.println(element);
			Log.error("Link Not Found !");
			throw (e);
		}
		return element;
	}
	
	public static WebElement PayrollforNorthAmericaLink() throws Exception {
		try {
			//Thread.sleep(1000);
			element = driver.findElement(By.id("fldra_HC_NORTH_AMERICAN_PAYROLL"));
			System.out.println(element);
			Log.info("Select Payroll for NortAmerica");
			Utils.waitForElement(element);
		} catch (Exception e) {
			System.out.println(element);
			Log.error("Link Not Found !");
			throw (e);
		}
		return element;
	}
	
	public static WebElement PayrollProcessLink() throws Exception {
		try {
			//Thread.sleep(1000);
			element = driver.findElement(By.id("fldra_HC_PROCESS_PAYROLL_CAN"));
			System.out.println(element);
			Log.info("Select PayrollProcessing CAN");
			Utils.waitForElement(element);
		} catch (Exception e) {
			System.out.println(element);
			Log.error("PayrollProcessing Link Not Found !");
			throw (e);
		}
		return element;
	}
	
	public static WebElement ProducePayrollLink() throws Exception {
		try {
			//Thread.sleep(1000);
			element = driver.findElement(By.id("fldra_HC_CALCULATE_AND_CONFIRM1"));
			System.out.println(element);
			Log.info("Produce Payroll");
			Utils.waitForElement(element);
		} catch (Exception e) {
			System.out.println(element);
			Log.error("Produce Payroll not Found !");
			throw (e);
		}
		return element;
	}
	
	//crefli_PW_OFFCYCLE_RUN_GBL
	public static WebElement MoveCriticalErrorToOffCycle() throws Exception {
		try {
			
			element = driver.findElement(By.id("crefli_PW_RCTL_EROFF_GBL"));
			System.out.println(element);
			Log.info("Select link MoveCriticalErrorToOffCycle");
			Utils.waitForElement(element);
		} catch (Exception e) {
			System.out.println(element);
			Log.error("MoveCriticalErrorToOffCycle Not Found !");
			throw (e);
		}
		return element;
	}

	public static WebElement ReportingTool() throws Exception {
		try {
			
			element = driver.findElement(By.id("fldra_PT_REPORTING_TOOLS"));
			System.out.println(element);
			Log.info("Select link Reporting Tool");
			Utils.waitForElement(element);
		} catch (Exception e) {
			System.out.println(element);
			Log.error("Reporting Tool  Not Found !");
			throw (e);
		}
		return element;
	}
	
	public static WebElement Query() throws Exception {
		try {
			
			element = driver.findElement(By.id("PT_QUERY"));
			System.out.println(element);
			Log.info("Select link Query");
			Utils.waitForElement(element);
		} catch (Exception e) {
			System.out.println(element);
			Log.error("Query link  Not Found !");
			throw (e);
		}
		return element;
	}
	
	public static WebElement QueryViewer() throws Exception {
		try {
			
			element = driver.findElement(By.id("crefli_PT_QUERY_VIEWER_GBL"));
			System.out.println(element);
			Log.info("Select link QueryViewer");
			Utils.waitForElement(element);
		} catch (Exception e) {
			System.out.println(element);
			Log.error("QueryViewer link  Not Found !");
			throw (e);
		}
		return element;
	}


	public static WebElement CalculatePayroll() throws Exception {
		try {
			
			element = driver.findElement(By.id("crefli_HC_RUNCTL_PAY_CALC_CAN"));
			System.out.println(element);
			Log.info("Select link Calculate Payroll");
			Utils.waitForElement(element);
		} catch (Exception e) {
			System.out.println(element);
			Log.error("Calculate Payroll Not Found !");
			throw (e);
		}
		return element;
	}

	//fldra_HC_REVIEW_PROCESSING_MESSAGES1
	public static WebElement ReviewProcessMessages() throws Exception {
		try {
			//Thread.sleep(1000);
			element = driver.findElement(By.id("fldra_HC_REVIEW_PROCESSING_MESSAGES1"));
			System.out.println(element);
			Log.info("Review Process ErrorMessages focused ");
			Utils.waitForElement(element);
		} catch (Exception e) {
			System.out.println(element);
			Log.error("Review Process ErrorMessages not Found !");
			throw (e);
		}
		return element;
	}

	public static WebElement ReviewErrorMessages() throws Exception {
		try {
			//Thread.sleep(1000);
			element = driver.findElement(By.id("crefli_HC_PAY_MESSAGES_CAN"));
			System.out.println(element);
			Log.info("ReviewErrorMessages focused");
			Utils.waitForElement(element);
		} catch (Exception e) {
			System.out.println(element);
			Log.error("Review Process ErrorMessages not Found !");
			throw (e);
		}
		return element;
	}

	public static WebElement 	ConfirmUtility() throws Exception {
		try {
			//Thread.sleep(1000);
			element = driver.findElement(By.id("crefli_PW_CONFIRM_UTILITY"));
			System.out.println(element);
			Log.info("ConfirmUtility  focused");
			Utils.waitForElement(element);
		} catch (Exception e) {
			System.out.println(element);
			Log.error("ConfirmUtility not Found !");
			throw (e);
		}
		return element;
	}

	//PW_PROCESSES
	
	//fldra_PW_TUC
	
	//crefli_PW_TUC_RUN_GBL
	public static WebElement PWProcess() throws Exception {
		try {
			//Thread.sleep(1000);
			element = driver.findElement(By.id("PW_PROCESSES"));
			System.out.println(element);
			Log.info("PW Process focused");
			Utils.waitForElement(element);
		} catch (Exception e) {
			System.out.println(element);
			Log.error("PW Process not Found !");
			throw (e);
			
		}
		return element;
	}
	
	public static WebElement TaxUpdateCompare() throws Exception {
		try {
			//Thread.sleep(1000);
			element = driver.findElement(By.id("fldra_PW_TUC"));
			System.out.println(element);
			Log.info("Taxupdate Compre Utility focused");
			Utils.waitForElement(element);
		} catch (Exception e) {
			System.out.println(element);
			Log.error("Taxupdate Compre Utility not Found !");
			throw (e);
		}
		return element;
	}
	
	public static WebElement TaxupdateSnapShort() throws Exception {
		try {
			//Thread.sleep(1000);
			element = driver.findElement(By.id("crefli_PW_TUC_RUN_GBL"));
			System.out.println(element);
			Log.info("Taxupdate Snapshort focused");
			Utils.waitForElement(element);
		} catch (Exception e) {
			System.out.println(element);
			Log.error("Taxupdate Snapshort  not Found !");
			throw (e);
		}
		return element;
	}
	
	//crefli_HC_PAY_MESSAGES_CAN
	public static WebElement SearchResult() throws Exception {
		try {
			//UIHelper.findIFrame(driver, By.id("#ICSearch"));
			Thread.sleep(1000);
			element = driver.findElement(By.xpath("//*[contains(text(),'Search Results')]"));
			
			System.out.println(element);
			Log.info("Search Button selcted ");
			Utils.waitForElement(element);
		} catch (Exception e) {
			System.out.println(element);
			Log.error("Search Button Not Found !");
			throw (e);
		}
		
		
		return element;
	}

	public static WebElement SearchButton() throws Exception {
		try {
			//UIHelper.findIFrame(driver, By.id("#ICSearch"));
			//Thread.sleep(1000);
			element = driver.findElement(By.id("#ICSearch"));
			System.out.println(element);
			Log.info("Search Button selcted ");
			//Utils.waitForElement(element);
		} catch (Exception e) {
			System.out.println(element);
			Log.error("Search Button Not Found !");
			throw (e);
		}
		
		
		return element;
	}
	
	public static WebElement Errortext() throws Exception {
		try {
			
			element = driver.findElement(By.xpath("//*[contains(text(),'No matching values were found')]"));
			System.out.println(element);
			Log.info("Run Control ID Doesnot Exist  ");
			Utils.waitForElement(element);
		} catch (Exception e) {
			System.out.println(element);
			Log.error("Run Control ID Found !");
			throw (e);
		}
		
		return element;
	}

	public static WebElement FirstRunControlID() throws Exception {
		try {
			
			UIHelper.findIFrame(driver, By.id("SEARCH_RESULT1"));
			element = driver.findElement(By.id("SEARCH_RESULT1"));
			System.out.println(element);
			Log.info("Selection First Runcontrol ID");
			Utils.waitForElement(element);
		} catch (Exception e) {
			System.out.println(element);
			Log.error("Run Control ID Found !");
			throw (e);
		}
		
		return element;
	}

	public static WebElement AddnewRUNCTR() throws Exception {
		try {
		
			element = driver.findElement(By.xpath("//*[contains(text(),'Add a New Value')]"));
			System.out.println(element);
			Log.info("Add new value selected ");
			Utils.waitForElement(element);
		} catch (Exception e) {
			System.out.println(element);
			Log.error("Add New value button didn't clicked  !");
			throw (e);
		}
		
		return element;
	}
	




		

	
	
}
		
		// Load Paysheet Transactions link
	
		
	/*
	 * public static WebElement loadTimeLabor() { // TODO Auto-generated method stub
	 * return null; }
	 */
		// Load Paysheet Transactions link
		