package utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtils {

    // This is the data provider from Excel
	@DataProvider(name = "getDataFromExcel")
    public static Object[][] getDataFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER);
    }
	
	
	@DataProvider(name = "getTLData")
    public static Object[][] getTLData() throws Exception {
		return ExcelUtils.getExcelData(Constant.TL_DATA_FOLDER);
    }
	
	@DataProvider(name = "getI125FileFromExcel")
    public static Object[][] getI125FileNameFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.I125_EXCEL_FILE);
    }
	
	@DataProvider(name = "getQueryViewerQueries")
    public static Object[][] getQueryViewerQueriesFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.QUERY_VIEWER_EXCEL_FILE);
		//return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + "payroll/QueryViewerQuery.xlsx");
    }
	
	@DataProvider(name = "getConfirmUtilityQueries")
    public static Object[][] getConfirmUtilityQueriesFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.CONFIRM_UTILITY_EXCEL_FILE);
    }

	@DataProvider(name = "getRetroPay")
    public static Object[][] getRetroPayFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.LOAD_RETRO_PAY_EXCEL_FILE);
    }
	
	@DataProvider(name = "getRetroDeds")
    public static Object[][] getRetroDedsFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.LOAD_RETRO_DEDS_EXCEL_FILE);
    }
	
	@DataProvider(name = "getCheckEarningsDateQuery")
    public static Object[][] getCheckEarningsDateQueryFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.CHECK_EARNINGS_DATE_EXCEL_FILE);
    }
	
	@DataProvider(name = "getCheckNoEarningsQuery")
    public static Object[][] getCheckNoEarningsQueryFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.CHECK_NO_EARNINGS_EXCEL_FILE);
    }
	
	@DataProvider(name = "getCNVOnPayCheckQuery")
    public static Object[][] getCNVOnPayCheckQueryFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.CNV_ON_PAY_CHECK_EXCEL_FILE);
    }
	
	@DataProvider(name = "getCNVOnPayEarningsQuery")
    public static Object[][] getCNVOnPayEarningsQueryFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.CNV_ON_PAY_EARNINGS_EXCEL_FILE);
    }
	
	@DataProvider(name = "getMissEmplWaglesQuery")
    public static Object[][] getPreSheetAuditQueryFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.MISS_EMPL_WAGLES_EXCEL_FILE);
    }
	
	@DataProvider(name = "getOKToPayNullQuery")
    public static Object[][] getOKToPayNullQueryFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.OK_TO_PAY_NULL_EXCEL_FILE);
    }
	
	@DataProvider(name = "getPayCheckNoEarningsQuery")
    public static Object[][] getPayCheckNoEarningsQueryFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.PAY_CHECK_NO_EARNINGS_EXCEL_FILE);
    }
	
	@DataProvider(name = "getSepCheckQuery")
    public static Object[][] getPSepCheckQueryFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.SEP_CHECK_EXCEL_FILE);
    }
	
	@DataProvider(name = "getCheckBalancePeriodQuery")
    public static Object[][] getCheckBalancePeriodQueryFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.BALANCE_PERIOD_EXCEL_FILE);
    }
	
	@DataProvider(name = "getFindOutQSTIQuery")
    public static Object[][] getFindOutQSTIQueryFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.FIND_OUT_QSTI_EXCEL_FILE);
    }
	
	@DataProvider(name = "getCitexmDifferenceQuery")
    public static Object[][] getCitexmDifferenceQueryFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.CITEXM_DIFFERENCE_EXCEL_FILE);
    }
	
	@DataProvider(name = "getBenProgRecordQuery")
    public static Object[][] getBenProgRecordQueryFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.BEN_PROG_RECORD_EXCEL_FILE);
    }
	
    @DataProvider(name = "getHirEffDateNoMatchNamesQuery")
    public static Object[][] getHirEffDateNoMatchNamesQueryFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.HIR_EFFDT_NO_MATCH_NAMES_EXCEL_FILE);
    }
    
    @DataProvider(name = "getE76QueryChecksQuery")
    public static Object[][] getE76QueryChecksQueryFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.E76_QUERY_CHECK_EXCEL_FILE);
    }
    
    @DataProvider(name = "getCreatePayRunID")
    public static Object[][] getPayRunTableFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.CREATE_PAY_RUN_ID_EXCEL_FILE);
    }
    
    @DataProvider(name = "getPayCalendarTable")
    public static Object[][] getPayCalendarTableFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.PAY_CALENDAR_TABLE_EXCEL_FILE);
    }
    
    @DataProvider(name = "getPresheetAuditReport")
    public static Object[][] getPresheetAuditReportFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.PRESHEET_AUDIT_REPORT_EXCEL_FILE);
    }
    
    @DataProvider(name = "getCreatePaysheets")
    public static Object[][] getCreatePaysheetsFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.CREATE_PAYSHEETS_EXCEL_FILE);
    }
    
    @DataProvider(name = "getLoadTimeLabor")
    public static Object[][] getLoadTimeLaborFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.LOAD_TIME_LABOR_EXCEL_FILE);
    }
    
    @DataProvider(name = "getLoadPaysheetTransactions")
    public static Object[][] getLoadPaysheetTransactionsFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.LOAD_PAYSHEET_TRANSACTIONS_EXCEL_FILE);
    }
    
    @DataProvider(name = "getCalculatePayroll")
    public static Object[][] getCalculatePayrollInitFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.CALCULATE_PAYROLL_EXCEL_FILE);
    }
    
    @DataProvider(name = "getCalculatePayrollFinal")
    public static Object[][] getCalculatePayrollFinalFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.CALCULATE_PAYROLL_FINAL_EXCEL_FILE);
    }
    
    @DataProvider(name = "getCalculatePayrollQuery")
    public static Object[][] getCalculatePayrollQueryFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.CALCULATE_PAYROLL_QUERY_EXCEL_FILE);
    }
    
    @DataProvider(name = "getReviewPayrollErrorMessages")
    public static Object[][] getReviewPayrollErrorMessagesFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.REVIEW_PAYROLL_ERROR_MESSAGES_EXCEL_FILE);
    }
    
    @DataProvider(name = "getLoadPaysheetTransactionsQuery")
    public static Object[][] getLoadPaysheetTransactionsQueryFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.LOAD_PAYSHEET_TRANSACTION_QUERY_EXCEL_FILE);
    }
    
    @DataProvider(name = "getPreconfirmAuditReport")
    public static Object[][] getPreconfirmAuditReportFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.PRECONFIRM_AUDIT_REPORT_EXCEL_FILE);
    }
    
    @DataProvider(name = "getConfirmPayroll")
    public static Object[][] getConfirmPayrollFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.CONFIRM_PAYROLL_EXCEL_FILE);
    }
    
    @DataProvider(name = "getNegativeNetUpdate")
    public static Object[][] getNegativeNetUpdateFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.NEGATIVE_NET_UPDATE_EXCEL_FILE);
    }
    
    @DataProvider(name = "getMoveCriticalErrorToOffCycle")
    public static Object[][] getMoveCriticalErrorToOffCycleFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.MOVE_CRITICAL_ERROR_TO_OFFCYCLE_EXCEL_FILE);
    }
    
    @DataProvider(name = "getPrecalculationAuditReport")
    public static Object[][] getPrecalculationAuditReportFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.PRECALCULATION_AUDIT_REPORT_EXCEL_FILE);
    }
    
    @DataProvider(name = "getCorePayrollProcess")
    public static Object[][] getCorePayrollProcessFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.CORE_PAYROLL_PROCESS_EXCEL_FILE);
    }
    
    @DataProvider(name = "getCheckChequeNetLT2Query")
    public static Object[][] getCheckChequeNetLT2QueryFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.EXCEL_DATA_FOLDER + Constant.CHECK_CHEQUE_NET_LT_2_EXCEL_FILE);
    }
    
	// This is the data provider for configuration from Excel
	@DataProvider(name = "getConfigFromExcel")
    public static Object[][] getConfigFromExcel() throws Exception {
		return ExcelUtils.getExcelData(Constant.CONFIG_DATA_FOLDER + Constant.CONFIG_EXCEL_FILE);
    }
	
    // This is the data provider from data class
    @DataProvider(name = "getDataFromClass")
    public static Object[][] getDataFromClass() throws Exception {
    	return new Object[][]{
            {"tiger"},
            {"lion"},
            {"monkey"},
    	};
    }

    // This is the data provider from JSON
    @DataProvider(name = "getDataFromJSON")
    public static Object[][] getDataFromJSON() throws Exception {
    	return null;
    }

    // This is the data provider from database
    @DataProvider(name = "getDataFromDB")
    public static Object[][] getDataFromDB() throws Exception {
    	return null;
    }
    
}
