package utilities;

import java.io.File;

public class Constant {

	
	public static final String Path_TestData = "src/main/java/data/configdata";
	public static final String Path_LoginData = "src/main/java/data/configdata";
	public static final String Path_TempData = "src/main/java/data";
	
	
	static File path_TestData = new File(Path_TestData);
	static File path_TempData = new File(Path_TempData);
	
	public static final String File_TestData = "ConfigData.xlsx";
//	public static final String File_TempData = "configdataCopy of ConfigData_Sanity.xlsx";
	public static final String File_LoginData = "Login.xlsx";
	public static final String File_UserAccessTestData = "UserAccess.xlsx";

	public static File fileTestData() {
		File file_TestData = new File(path_TestData, File_TestData);
		return file_TestData;
	}
	
	
	
	
	public static File File_LoginData() {
		File file_LoginData = new File(path_TestData, File_LoginData);
		return file_LoginData;
	}
public static File fileUserAccessTestData() {
		
		File userAccessFileData = new File(Path_TestData, File_UserAccessTestData );
	
		return userAccessFileData;
	}
	
//Test Data Sheet Columns
	public static final int TestCaseName = 0;
	public static final int QueryID = 1;
	public static final int Description= 2;
	public static final int Username = 3;
	public static final int Password = 4;
	public static final int S34Manager2UserId= 34;
	
	public static final int UserProfile = 5;
	//public static final int AssertionValue = 5;
	public static final int Result= 6;
	public static final int FirstName = 7;
	public static final int LastName = 8 ;
	public static final int BirthCountry = 9 ;
	//public static final int Province =10;
	public static final int TRCCode =10;
	
	public static final int JoinQueryRecord= 11;
	
	//EmployeeID T&L EnterTime Sheet Manager Selfservice 
	public static final int EmpID = 12;
	public static final int Day1  = 13;
	public static final int Day2 = 14;
	public static final int Day3 = 15;
	public static final int Day4 = 16;
	public static final int Day5 = 17;
	public static final int Day6 = 18;
	public static final int TimeFT = 19;
	public static final int NewHREmp = 20;
	public static final int YearEndEmp = 21;
	public static final int CalenderYear = 22;
	public static final int BoxAmount = 23 ;
	public static final int CorrectedAmount =24;
	public static final int BoxNumber =25;
	public static final int SeqNo = 26;
	public static final int DescriptionTRC = 27;
	public static final int DrivedEmployee =28;
	public static final int WeekEnterTime = 29;
	public static final int ExceptionID = 30;
	public static final int S34ManagerTimeSheet = 31;
	//public static final int TimeException = 32;
	public static final int TLSuperUserRole = 32;
	public static final int RoleCriteria = 33;
	public static final int S34ManagerID = 34;
	public static final int EffectiveDate =35;
	public static final int QueryID1 = 36;
	public static final int PayGroup = 37;
	public static final int TaxLocation  =38;
	public static final int BU = 39;
	
	//Data on tempEmp tab
		public static final int TempEmpId = 0;
		public static final int TimeException =1;
		public static final int S34ID = 2;
		public static final int S34ManagerName =3;
		public static final int TesterID =4;
		public static final int PWD =5;
		public static final int TempFirstName =6;
		public static final int TempLastName =7;
		public static final int TempUserID=8;
		public static final int TempBU = 9;
		public static final int TempEMP = 10;
		
		//tempDataFile
		public static final int TestCase= 0;
		public static final int EmployeeID= 1;
		public static final int S34 = 2;
		
	//CR5601
		
			

		public static final int BU1 =0;
		public static final int JobCode1 =1;
		public static final int BargainingUnite=2;
		public static final int Empcat =3;
		public static final int EmpSubCat =4;
		public static final int EmpSubCat2 =5;
		public static final int SalaryAdmin =6;
		public static final int Grade =7;
		public static final int Action =8;
		public static final int Reason =9;

		
		
		
		
		
	
	//Security Role path
	
	public static final String nonS34ManagerRole  = "src/main/java/data/textData/nonS34ManagerRole.xlsx";
	
	// Path for Data folder
	
	public static final String TL_DATA_FOLDER ="tl/TLData.xlsx";
	
	public static final String CONFIG_DATA_FOLDER = "src/main/java/data/configdata/";
	public static final String EXCEL_DATA_FOLDER = "src/main/java/data/exceldata/";
	public static final String TEST_FILE_DATA_FOLDER = "src/main/java/data/testfiledata/";
	public static final String SCREENSHOTS_FOLDER = "test-output/Phoenix/screenshots/";
	public static final String EXTENT_REPORT_FOLDER = "test-output/Phoenix/extentReport/";
	public static final String TEST_OUTPUT_FOLDER = "test-output/Phoenix/";
	
	public static final String ENVIRONMENT_EXCEL_FILE = "src/main/java/data/configdata/Environments.xlsx";
	public static final String I125_EXCEL_FILE = "payroll/I125_PayrollProcess_PensionDeficiencyFile.xlsx";
	//public static final String QUERY_VIEWER_EXCEL_FILE = "payroll/QueryViewerQuery.xlsx";
	public static final String QUERY_VIEWER_EXCEL_FILE = "payroll/CopyOfQueryViewerQuery.xlsx";
	public static final String CONFIRM_UTILITY_EXCEL_FILE = "payroll/E122_PayrollProcess_ConfirmUtilityQuery.xlsx";
	public static final String LOAD_RETRO_PAY_EXCEL_FILE = "payroll/LoadRetroPay.xlsx";
	public static final String LOAD_RETRO_DEDS_EXCEL_FILE = "payroll/LoadRetroDeds.xlsx";
	public static final String CONFIG_EXCEL_FILE = "Config.xlsx";
	public static final String EMP_ERROR_LIST_EXCEL_FILE = "EmpErrorList";
	public static final String CHECK_EARNINGS_DATE_EXCEL_FILE = "payroll/CheckEarningsDateQuery.xlsx";
	public static final String CHECK_NO_EARNINGS_EXCEL_FILE = "payroll/CheckNoEarningsQuery.xlsx";
	public static final String CNV_ON_PAY_CHECK_EXCEL_FILE = "payroll/CNVOnPayCheckQuery.xlsx";
	public static final String CNV_ON_PAY_EARNINGS_EXCEL_FILE = "payroll/CNVOnPayEarningsQuery.xlsx";
	public static final String MISS_EMPL_WAGLES_EXCEL_FILE = "payroll/MissEmplWaglesQuery.xlsx";
	public static final String OK_TO_PAY_NULL_EXCEL_FILE = "payroll/OKToPayNullQuery.xlsx";
	public static final String PAY_CHECK_NO_EARNINGS_EXCEL_FILE = "payroll/PayCheckNoEarningsQuery.xlsx";
	public static final String SEP_CHECK_EXCEL_FILE = "payroll/SepCheckQuery.xlsx";
	public static final String BALANCE_PERIOD_EXCEL_FILE = "payroll/BalancePeriodQuery.xlsx";
	public static final String FIND_OUT_QSTI_EXCEL_FILE = "payroll/FindOutQSTIQuery.xlsx";
	public static final String CITEXM_DIFFERENCE_EXCEL_FILE = "payroll/CitexmDifferenceQuery.xlsx";
	public static final String BEN_PROG_RECORD_EXCEL_FILE = "payroll/BenProgRecordQuery.xlsx";
	public static final String HIR_EFFDT_NO_MATCH_NAMES_EXCEL_FILE = "payroll/HirEffDateNoMatchNamesQuery.xlsx";
	public static final String E76_QUERY_CHECK_EXCEL_FILE = "payroll/E76QueryChecksQuery.xlsx";
	public static final String CREATE_PAY_RUN_ID_EXCEL_FILE = "payroll/CreatePayRunID.xlsx";
	public static final String PAY_CALENDAR_TABLE_EXCEL_FILE = "payroll/PayCalendarTable.xlsx";
	public static final String PRESHEET_AUDIT_REPORT_EXCEL_FILE = "payroll/PresheetAuditReport.xlsx";
	public static final String CREATE_PAYSHEETS_EXCEL_FILE = "payroll/E84_PayrollProcess_CreatePaysheets.xlsx";
	public static final String LOAD_TIME_LABOR_EXCEL_FILE = "tl/LoadTimeLabor.xlsx";
	public static final String LOAD_PAYSHEET_TRANSACTIONS_EXCEL_FILE = "payroll/LoadPaysheetTransactions.xlsx";
	public static final String CALCULATE_PAYROLL_EXCEL_FILE = "payroll/CalculatePayroll.xlsx";
	public static final String CALCULATE_PAYROLL_FINAL_EXCEL_FILE = "payroll/CalculatePayrollFinal.xlsx";
	public static final String CALCULATE_PAYROLL_QUERY_EXCEL_FILE = "payroll/CalculatePayrollQuery.xlsx";
	public static final String REVIEW_PAYROLL_ERROR_MESSAGES_EXCEL_FILE = "payroll/ReviewPayrollErrorMessages.xlsx";
	public static final String LOAD_PAYSHEET_TRANSACTION_QUERY_EXCEL_FILE = "payroll/LoadPaysheetTransactionsQuery.xlsx";
	public static final String PRECONFIRM_AUDIT_REPORT_EXCEL_FILE = "payroll/PreconfirmAuditReport.xlsx";
	public static final String CONFIRM_PAYROLL_EXCEL_FILE = "payroll/ConfirmPayroll.xlsx";
	public static final String NEGATIVE_NET_UPDATE_EXCEL_FILE = "payroll/E76_PayrollProcess_NegativeNetUpdate.xlsx";
	public static final String MOVE_CRITICAL_ERROR_TO_OFFCYCLE_EXCEL_FILE = "payroll/E85_PayrollProcess_MoveCriticalErrorToOffCycle.xlsx";
	public static final String PRECALCULATION_AUDIT_REPORT_EXCEL_FILE = "payroll/PrecalculationAuditReport.xlsx";
	public static final String CORE_PAYROLL_PROCESS_EXCEL_FILE = "payroll/CorePayrollProcess.xlsx";
	public static final String CHECK_CHEQUE_NET_LT_2_EXCEL_FILE = "payroll/CheckChequeNetLT2Query.xlsx";
	
	// Browser Type
	public static final String Browser_Chrome = "Chrome";
	public static final String Browser_Firefox = "Firefox";
	public static final String Browser_IE = "IE";
	
	public static final String Success = "Success";
	public static final String Fail = "Fail";
	public static final String Skip = "Skip";
	public static final String No_Success = "No Success";
	public static final String Posted = "Posted";
	public static final int Log_Time_Out_In_Seconds = 300;
	public static final int Max_Counter = 500;
	
	// Query Viewer Search By
	public static final String Search_By_Access_Group_Name = "Access Group Name";
	public static final String Search_By_Description = "Description";
	public static final String Search_By_Folder_Name = "Folder Name";
	public static final String Search_By_Owner = "Owner";
	public static final String Search_By_Query_Name = "Query Name";
	public static final String Search_By_Type = "Type";
	public static final String Search_By_Uses_Field_Name = "Uses Field Name";
	public static final String Search_By_Uses_Record_Name = "Uses Record Name";
	
	// Query Viewer Query Name
	public static final String E87_Query_Validation_SR = "PW_PY_QA_R1_B_TAX_WITH_1H2";
	public static final String E87_Query_Validation = "PW_PY_QA_R1_40A_1H2";
	public static final String PW_PY_QA_R1_RPY_LOAD_ABEND = "PW_PY_QA_R1_RPY_LOAD_ABEND";
	public static final String PW_PY_QA_R1_CHECK_NO_EARNS = "PW_PY_QA_R1_CHECK_NO_EARNS";
	public static final String No_Matching_Found = "No matching values were found.";
	public static final String View_All = "View All";
	
	public static final String Supplier_Deduction_File = "Supplier Deduction File";
	public static final String I125_Log_Successful_Message = 
			" Emplid         Employee Name                           Pay End Date      Staging DEDCD      PS DEDCD   Amount      Message\n" + 
			"  \n" + " \n" + 
			"************************************************************************************************************************";
	public static final String Change_Retro_Pay_Process_Flag_Log_Successful_Message = "Retro Pay Undo ended at";
	public static final String Load_Retro_Pay_To_Paysheets_Log_Successful_Message = "0 transactions in error.";
	public static final String Load_Retro_Deds_To_Paysheets_Log_Successful_Message = "0 transactions in error.";
	public static final String Confirm_Utility_Log_Check_Earnings_Date_Successful_Message = "Rows Affected: 0";
	public static final String Rows_Affected_Message = "Rows Affected: ";
	public static final String Audit_Report_Log_Successful_Message = "Error Records:      ";
	
	public static final String FILE_EXT_LOG = ".log";
	public static final String FILE_EXT_STDOUT = ".stdout";
	public static final String FILE_EXT_TXT = ".txt";
	public static final String FILE_EXT_CSV = ".csv";
	public static final String FILE_EXT_PDF = ".pdf";
	public static final String FILE_EXT_OUT = ".out";
	
}
