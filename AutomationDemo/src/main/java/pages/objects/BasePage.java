package pages.objects;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import environment.EnvironmentData;
import executionstatus.ExecutionStatus;
import utilities.BaseClass;
import utilities.Constant;
import utilities.Log;
import utilities.UIHelper;
import utilities.Utils;

public class BasePage extends BaseClass {

	public static final String RUN_CONTROL_ID_ID = "PRCSRUNCNTL_RUN_CNTL_ID";
	public static final String CASE_SENSITIVE_CHK_BOX_ID = "#ICMatchCase";
	public static final String RUN_CONTROL_ID_OP_ID = "PRCSRUNCNTL_RUN_CNTL_ID$op";
	public static final String SEARCH_BUTTON_ID = "#ICSearch";
	public static final String CLEAR_BUTTON_ID = "#ICClear";
	public static final String SEARCH_RESULT_ELEMENT_PARTIAL_ID = "trQRY_VIEWERS_WRK$0_row";
	public static final String SEARCH_RESULT_ID = "win0divSEARCHRESULT";
	public static final String SEARCH_RESULT_RUN_CTR_ID = "SEARCH_RESULT1";
	public static final String ADD_NEW_VALUE_TAB_XPATH = "//*[@id=\"PSTAB\"]/table/tbody/tr/td[2]/a";
	public static final String RUN_BUTTON_ID = "PRCSRQSTDLG_WRK_LOADPRCSRQSTDLGPB";
	public static final String lATEST_PROCESS_DETAIL_ID = "PRCSDETAIL_BTN$0";
	public static final String VIEW_LOG_TRACE_ID = "PMN_DERIVED_INDEX_BTN";
	public static final String PROCESS_CHK_BOX_ID = "PRCSRQSTDLG_WRK_SELECT_FLAG$0";
	public static final String RETURN_SEARCH_BUTTON_ID = "#ICList";
	public static final String SAVE_BUTTON_ID = "#ICSave";
	public static final String RETURN_BUTTON_ID = "#ICCancel";
	public static final String CANCEL_BUTTON_ID = "#ICCancel";
	public static final String lATEST_PROCESS_NAME_ID = "JOBDETAIL_BTN$0";
	public static final String LATEST_PROCESS_DETAIL_PARTIAL_ID = "#ICSetFieldPMN_PRCSLISTTREE.TREECTLEVENT.S";
	public static final String LOG_FILE_LINK_PARTIAL_ID = "URL$";
	public static final String PROCESS_NAME_ID = "CDM_LIST_VW_PRCSNAME";
	public static final String NEXT_PAGE_BUTTON_ID = "#ICNextPage";
	public static final String SIGN_IN_BUTTON ="a[@id='nav-link-accountList']/span[2]";
	
	private WebElement element = null;
	private List<WebElement> elements = null;
	
	public BasePage(WebDriver driver) {
		super(driver);
	}
	
	public WebElement runCtrIDTxtBox() throws Exception {
		UIHelper.findIFrame(driver, By.name(RUN_CONTROL_ID_ID));
		element = getElementByID(RUN_CONTROL_ID_ID);
		Log.info("Select RunControlID: " + element);
		return element;
	}
	
	public WebElement runCtrIDOpSelect() throws Exception {
		element = getElementByID(RUN_CONTROL_ID_OP_ID);
		Select opSelect = new Select(element);
		opSelect.getFirstSelectedOption();
		Log.info("Run CtrID Op selected: " + element);
		return element;
	}
	
	public WebElement caseSensitiveChkBox() throws Exception {
		element = getElementByID(CASE_SENSITIVE_CHK_BOX_ID);
		Log.info("Case Sensitive Check Box selected: " + element);
		return element;
	}
	
	public void clickCaseSensitiveChkBox() throws Exception {
		WebElement element = caseSensitiveChkBox();
		if(!element.isSelected()) {
			element.click();
		}
	}
	
	public WebElement searchButton() throws Exception {
		element = getElementByID(SEARCH_BUTTON_ID);
		Log.info("Search Button selected: " + element);
		return element;
	}
	
	public WebElement clearButton() throws Exception {
		UIHelper.findIFrame(driver, By.name(CLEAR_BUTTON_ID));
		element = getElementByID(CLEAR_BUTTON_ID);
		Log.info("Clear Button selected: " + element);
		return element;
	}
	
	public List<WebElement> searchResults() throws Exception {
		//elements = driver.findElements(By.xpath("//*[starts-with(@id, '" + SEARCH_RESULT_ELEMENT_PARTIAL_ID + "')]"));
		element = getElementByXpath("//*[starts-with(@id, '" + SEARCH_RESULT_ELEMENT_PARTIAL_ID + "')]");
		Log.info("Search Results list displayed: " + elements);
		return elements;
	}
	
	public WebElement runCtrIDSearchResult() throws Exception {
		element = getElementByID(SEARCH_RESULT_ID);
		Log.info(" Run Control ID Search Result displayed: " + element);
		return element;
	}
	
	public boolean noMatchFound() throws Exception {
		if(runCtrIDSearchResult().getText().equalsIgnoreCase(Constant.No_Matching_Found)) {
			Log.info("No Match Found for Run Control ID. ");
			return true;
		}
		Log.info("Match Found for Run Control ID. ");
		return false;
	}
	
	public WebElement addNewValueTab() throws Exception {
		element = getElementByXpath(ADD_NEW_VALUE_TAB_XPATH);
		Log.info("Add new value tab selected: " + element);
		return element;
	}
	
	public WebElement addButton() throws Exception {
		element = getElementByID(SEARCH_BUTTON_ID);
		Log.info("Add Button selected: " + element);
		return element;
	}
	
	public void addNewRunCtrID(String runCtrID) throws Exception {
		addNewValueTab().click();
		addButton().click();	
	}
	
	public WebElement getFirstRunCtrID() throws Exception {
		element = getElementByID(SEARCH_RESULT_RUN_CTR_ID);
		Log.info("Selection First Runcontrol ID: " + element);
		return element;
	}
	
	public WebElement runButton() throws Exception {
		UIHelper.findIFrame(driver, By.name(RUN_BUTTON_ID));
		element = getElementByID(RUN_BUTTON_ID);
		Log.info("Run button:  " + element);
		return element;
	}
	
	
	public WebElement latestProcessDetail() throws Exception {
		element = getElementByID(lATEST_PROCESS_DETAIL_ID);
		Log.info("Latest process detail button clicked: " + element);
		Utils.waitForElement(element);
		return element;
	}
	
	public WebElement viewLogTrace() throws Exception {
		element = getElementByID(VIEW_LOG_TRACE_ID);
		Log.info("View Log Trace button clicked: " + element);
		Utils.waitForElement(element);
		return element;
	}
	
	public void clickLatestProcessDetail() throws Exception {
		latestProcessDetail().click();
		Log.info("Latest Process Detail button clicked ");
	}
	
	public void clickViewLogTrace() throws Exception {
		viewLogTrace().click();
		Log.info("View Log Trace button clicked ");
	}
	
	public WebElement processCheckBox() throws Exception {
		element = getElementByID(PROCESS_CHK_BOX_ID);
		Log.info("Process Check Box: " + element);
		return element;
	}
	
	public void clickProcessCheckBox() throws Exception {
		WebElement element = processCheckBox();
		if(!element.isSelected()) {
			element.click();
			Log.info("Process Check Box checked: " + element);
		}
	}
	
	public WebElement returnSearchButton() throws Exception {
		element = getElementByID(RETURN_SEARCH_BUTTON_ID);
		Log.info("Return Search button found: " + element);
		return element;
	}
	
	public void clickReturnSearchButton() throws Exception {
		returnSearchButton().click();
	}
	
	public WebElement saveButton() throws Exception {
		element = getElementByID(SAVE_BUTTON_ID);
		Log.info("Save Button selected: " + element);
		return element;
	}
	
	public WebElement returnButton() throws Exception {
		UIHelper.findIFrame(driver, By.id(RETURN_BUTTON_ID));
		element = getElementByID(RETURN_BUTTON_ID);
		Log.info("Return button found: " + element);
		return element;
	}
	
	public void clickReturnButton() throws Exception {
		returnButton().click();
	}
	
	public WebElement cancelButton() throws Exception {
		UIHelper.findIFrame(driver, By.id(CANCEL_BUTTON_ID));
		element = getElementByID(CANCEL_BUTTON_ID);
		Log.info("Cancel button found: " + element);
		return element;
	}
	
	public void clickCancelButton() throws Exception {
		cancelButton().click();
	}
	
	public WebElement latestProcessName() throws Exception {
		element = getElementByID(lATEST_PROCESS_NAME_ID);
		Log.info("Latest Process Name clicked: " + element);
		Utils.waitForElement(element);
		return element;
	}
	
	public void clickLatestProcessName() throws Exception {
		latestProcessName().click();
		Log.info("Latest Process Name clicked ");
	}
	
	public String processName() throws Exception {
		element = getElementByID(PROCESS_NAME_ID);
		Log.info("Process Name: " + element);
		return element.getText();
	}
	
	public WebElement latestProcessDetail(int i) throws Exception {
		element = getElementByID(LATEST_PROCESS_DETAIL_PARTIAL_ID + i);
		Log.info("Latest process detail button clicked: " + element);
		Utils.waitForElement(element);
		return element;
	}
	
	public List<WebElement> latestProcessDetailList() throws Exception {
		return driver.findElements(By.xpath("//*[starts-with(@id, '" + LATEST_PROCESS_DETAIL_PARTIAL_ID + "')]"));
	}
	
	public String clickLatestProcessDetail(int i) throws Exception {
		WebElement element = latestProcessDetail(i);
		String logProcessName = element.getText();
		//logProcessName = logProcessName.substring(logProcessName.indexOf("-") + 2, logProcessName.indexOf(" Success"));
		element.click();
		Log.info("Latest Process Detail button clicked ");
		return logProcessName;
	}
	
	public String logFileDetail(String logFileName) throws Exception {
		int count = 1;
		logFileName = logFileName.replaceAll(" ", "%20");
		Set<String> windowHandles = driver.getWindowHandles();
		while(count <= 10) {
			for(String windowHandle : windowHandles) {
				driver.switchTo().window(windowHandle);
				String currentUrl = driver.getCurrentUrl();
				if(currentUrl.contains(logFileName)) {
					Log.info("Log file detail page displayed. ");
					Thread.sleep(5000);
					return driver.getPageSource();
				}
			}
			count++;
			Thread.sleep(5000);
		}
		Log.info("Log file detail page not displayed: " + count + " tries");
		return null;
	}
	
	public WebElement logFileLink(int j) throws Exception {
		element = getElementByID(LOG_FILE_LINK_PARTIAL_ID + j);
		Log.info("Log File link clicked:  " + element);
		return element;
	}
	
	public String logFileName(int j) throws Exception {
		String logFileName = logFileLink(j).getText();
		Log.info("Log file Name is: " + logFileName);
		return logFileName;
	}
	
	public void clickLogFile(int j) throws Exception {
		logFileLink(j).click();
		Log.info("Log file link clicked. ");
	}
	
	public List<WebElement> logFileList() throws Exception {
		return driver.findElements(By.xpath("//*[starts-with(@id, '" + LOG_FILE_LINK_PARTIAL_ID + "')]"));
	}
	
	public boolean nextPageButtonExists() throws Exception {
		return driver.findElements(By.id(NEXT_PAGE_BUTTON_ID)).size() > 0;
	}

	public WebElement nextPageButton() throws Exception {
		element = getElementByID(NEXT_PAGE_BUTTON_ID);
		Log.info("Next page Button: " + element);
		return element;
	}
	
	public void clickNextPageButton() throws Exception {
		nextPageButton().click();
	}
	
	public void verifyLogFile(String logFileName, String expectedResult, String unexpectedResult, ExecutionStatus executionStatus) throws Exception {
		String logFileSource = logFileDetail(logFileName);
		Log.info("Log file page source: " + logFileSource);
		if(logFileSource == null) {	
			Log.error("Can't find Log File.");
			executionStatus.setMessage("Can't find Log File.");
			executionStatus.setStatus(Constant.Fail);
		} else {
			if(expectedResult == null || !Utils.isEmpty(unexpectedResult)) {
				Log.error("Can't get expected Result or unexpected result found: " + unexpectedResult);			
				executionStatus.setMessage("Can't get expected Result or unexpected result found: " + unexpectedResult);
				executionStatus.setStatus(Constant.Fail);
			} else {
				if(expectedResult == "") {
					executionStatus.setStatus(Constant.Skip);
					executionStatus.setMessage("Expected result is not defined for the log file " + logFileName);
					Log.info("Expected result is not defined for the log file " + logFileName);
				} else if(logFileSource.contains(expectedResult)) {
					executionStatus.setStatus(Constant.Success);
					Log.info("Expected result found on the page: " + expectedResult);
				} else {
					Log.error("Expected result Not found on the page: " + expectedResult);			
					executionStatus.setMessage("Expected result Not found on the page: " + expectedResult);
					executionStatus.setStatus(Constant.Fail);
				}
			}
		}
	}
	
	public void verifyProcessList(EnvironmentData env, ExecutionStatus executionStatus) throws Exception {
		List<WebElement> processDetailList = latestProcessDetailList();
		if(processDetailList != null) {
			for(int i = 2; i < processDetailList.size() + 2; i++) {
				clickLatestProcessDetail(i);
				verifyLogFileList(env, executionStatus);
				clickReturnButton();
				clickCancelButton();
			}
		}
	}
	
	public void verifyLogFileList(EnvironmentData env, ExecutionStatus executionStatus) throws Exception {
		clickViewLogTrace();
		String processName = processName();
		String expectedResult = null;
		String unexpectedResult = null;
		List<WebElement> logFileList = logFileList();
		for(int j = 0; j < logFileList.size()/2; j++) {
			String logFileName = logFileName(j);
			clickLogFile(j);
			String fileExt = logFileName.substring(logFileName.indexOf("."));
			expectedResult = getExpectedResult(processName, fileExt);
			unexpectedResult = getUnexpectedResult(processName, fileExt);
			if(!fileExt.equalsIgnoreCase(Constant.FILE_EXT_PDF) && !fileExt.equalsIgnoreCase(Constant.FILE_EXT_CSV)) {
				verifyLogFile(logFileName, expectedResult, unexpectedResult, executionStatus);
			}	
			if(executionStatus.getStatus().equalsIgnoreCase(Constant.Fail)) {
				return;
			}
			Set<String> windowHandles = driver.getWindowHandles();
			for(String windowHandle : windowHandles) {
				driver.switchTo().window(windowHandle);
				String currentUrl = driver.getCurrentUrl();
				if(env != null && currentUrl.contains("psp/" + env.getEnvName())) {
					driver.switchTo().defaultContent();
					break;
				}
			}
			UIHelper.findIFrame(driver, By.id(LOG_FILE_LINK_PARTIAL_ID + j));
		}
	}
	
	// This method is to get expected result for all text log files based on the log process name and file extension 
	public String getExpectedResult(String processName, String fileExt) {
		String expectedResult = null;
		if(!Utils.isEmpty(fileExt) && !Utils.isEmpty(processName)) {
			if(fileExt.equalsIgnoreCase(Constant.FILE_EXT_LOG)) {
				if(processName.equalsIgnoreCase("PSPPSHUP")) {// Run Pyload process
					expectedResult = "Payroll Transaction Load ended at";
				}
				if(processName.equalsIgnoreCase("PSPPYBLD")) {// Run Create Paysheet process
					expectedResult = "PaySheets ended at";
				}
				if(processName.equalsIgnoreCase("PSPPYRUN")) {// Run Calculate Payroll process
					expectedResult = "Calculation ended at";
				}
				if(processName.equalsIgnoreCase("PAY034")) {// Presheet Audit Report process (PAY034)
					expectedResult = "Output Destination Type:      WEB";
				}
				if(processName.equalsIgnoreCase("PSPLDTL1")) {// Load Paysheet Transaction
					expectedResult = "Load Time & Labor to Payroll ended at";
				}
				if(processName.equalsIgnoreCase("PAY036")) {// Preconfirm Audit Report process (PAY036)
					expectedResult = "Report Name:                  PAY036";
				}
				if(processName.equalsIgnoreCase("PSPCNFRM")) {// Run Confirm Payroll process
					expectedResult = "Confirmation ended at";
				}
				if(processName.equalsIgnoreCase("PAY035")) {// Precalculation Audit Report process (PAY035)
					expectedResult = "Report Name:                  PAY035";
				}
			} else if(fileExt.equalsIgnoreCase(Constant.FILE_EXT_OUT)) {
				if(processName.equalsIgnoreCase("PAY034")) {// Presheet Audit Report process (PAY034)
					expectedResult = "Error Records:       0";
				}
				if(processName.equalsIgnoreCase("PAY035")) {// Precalculation Audit Report process (PAY035)
					expectedResult = "Error Records:       0";
				}
				if(processName.equalsIgnoreCase("PAY036")) {// Preconfirm Audit Report process (PAY036)
					expectedResult = "Error Records:       0";
				}
			} else if(fileExt.equalsIgnoreCase(Constant.FILE_EXT_STDOUT)) {
				expectedResult = "Application Engine program " + processName + " ended normally";
			} else if(fileExt.equalsIgnoreCase(Constant.FILE_EXT_TXT)) {
				if(processName.equalsIgnoreCase("PW_PYLD_UPDA")) {// Run Pyload process
					expectedResult = "EMPLID       RCD             COUNT\n \n \n \nEnd of report.";
				}
				if(processName.equalsIgnoreCase("PW_LD_PYLINE")) {// Run Pyload process
					expectedResult = "Count of Unsuccessful rows 0";
				}
				if(processName.equalsIgnoreCase("PW_S33_PCALC")) {// Run Calculate Payroll process
					expectedResult = "Process / Traitement :  / \n \n" +
							"*********************************************************************************************************************************************************************\n" +
							"                                                           End of Report/Fin du rapport";
				}
				if(processName.equalsIgnoreCase("PW_S33_STAT")) {// Run Confirm Payroll process
					expectedResult = "Process / Traitement :  / \n \n" +
							"*********************************************************************************************************************************************************************\n" +
							"                                                           End of Report/Fin du rapport";
				}
				if(processName.equalsIgnoreCase("PW_CONF_UTL")) {// Confirmation Utility process
					expectedResult = "Rows Affected: ";
				}
			} else {
				expectedResult = "";
			}
		}
		return expectedResult;
	}
	
	// This method is to get unexpected result for all text log files based on the log process name and file extension 
	public String getUnexpectedResult(String processName, String fileExt) {
		String unexpectedResult = null;
		if(!Utils.isEmpty(fileExt) && !Utils.isEmpty(processName)) {
			if(fileExt.equalsIgnoreCase(Constant.FILE_EXT_LOG)) {
				if(processName.equalsIgnoreCase("PSPPSHUP")) {// Run Pyload process
					unexpectedResult = "";
				}
				if(processName.equalsIgnoreCase("PSPPYBLD")) {// Run Create Paysheet process
					unexpectedResult = "";
				}
				if(processName.equalsIgnoreCase("PSPPYRUN")) {// Run Calculate Payroll process
					unexpectedResult = "";
				}
				if(processName.equalsIgnoreCase("PAY034")) {// Presheet Audit Report process (PAY034)
					unexpectedResult = "";
				}
				if(processName.equalsIgnoreCase("PSPLDTL1")) {// Load Paysheet Transaction
					unexpectedResult = "Failed to create an Off-Cycle Paysheet.";
				}
				if(processName.equalsIgnoreCase("PAY036")) {// Preconfirm Audit Report process (PAY036)
					unexpectedResult = "";
				}
			} else if(fileExt.equalsIgnoreCase(Constant.FILE_EXT_OUT)) {
				if(processName.equalsIgnoreCase("PAY034")) {// Presheet Audit Report process (PAY034)
					unexpectedResult = "";
				}
				if(processName.equalsIgnoreCase("PAY036")) {// Preconfirm Audit Report process (PAY036)
					unexpectedResult = "";
				}
			} else if(fileExt.equalsIgnoreCase(Constant.FILE_EXT_STDOUT)) {
				unexpectedResult = "";
			} else if(fileExt.equalsIgnoreCase(Constant.FILE_EXT_TXT)) {
				if(processName.equalsIgnoreCase("PW_PYLD_UPDA")) {// Run Pyload process
					unexpectedResult = "";
				}
				if(processName.equalsIgnoreCase("PW_LD_PYLINE")) {// Run Pyload process
					unexpectedResult = "";
				}
				if(processName.equalsIgnoreCase("PW_S33_PCALC")) {// Run Calculate Payroll process
					unexpectedResult = "";
				}
			} else {
				unexpectedResult = "";
			}
		}
		return unexpectedResult;
	}
}
	