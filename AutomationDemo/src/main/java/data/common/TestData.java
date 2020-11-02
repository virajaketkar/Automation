package data.common;

import java.util.HashMap;
import java.util.Map;

public class TestData {
	
	public static Map<String,String> commondata()
	{
		Map<String,String>data = new HashMap<String,String>();
		data.put("RunCtrID", "TEST133");
		data.put("data2","On-Cycle");
		data.put("PayrunID", "BW1808");
		data.put("TestName", "ReviewErrorMessages");
		data.put("TestName2", "E50A_AdjustPensionDeduction_Ret");
		data.put("TestName3", "E50B_AdjustPensionDeduction_Ret");
		data.put("TestName4", "E87_TransitionPaymentAdjustment");
		data.put("TestName5", "Query Viewer");
		return data;
	}
	
	
	public static Map<String,String> YearEnd()
	{
		Map<String,String>data = new HashMap<String,String>();
		data.put("COMPANY", "GOC");
		data.put("PAYGROUP","ARW");
		data.put("EmpId","010002626");
	//	data.put("EmpId","012978949");//010002626
			//093003412
		return data;
	}
	
	public static Map<String,String> RunAdmin()
	{
		Map<String,String>data = new HashMap<String,String>();
		data.put("ProcessDate", "");
		data.put("PAYGROUP","ARW");
		//data.put("EmpId","012978949");
		data.put("EmpId", "033369119");//Exception :PWTLX004
		return data;
	}
	
	
	
	public static Map<String,String> PayableTimeTRC()
	{
		Map<String,String>data = new HashMap<String,String>();
		data.put("StartDateES", "04/23/2018");
		data.put("EndDateES","05/14/2018");
		data.put("EmpId","067412459");
		return data;
	}
	
	public static Map<String,String> ApprovePayableTime()
	{
		Map<String,String>data = new HashMap<String,String>();
		data.put("StartDateMS", "10/01/2018");
		data.put("EndDateMS","11/22/2018");
		data.put("EmpId","017962439");
		return data;
	}
	
	
	
	
	

	public static Map<String,String> ViewPayableTimeMS()
	{
		Map<String,String>data = new HashMap<String,String>();
		data.put("StartDateMS", "01/09/2016");
		data.put("EndDateMS","01/10/2016");
		data.put("EmpId","013915053");
		return data;
	}
	
	
	public static Map<String,String> HR_AddPerson()
	{
		Map<String,String>data = new HashMap<String,String>();
		data.put("Prefix", "Ms");
		data.put("FSName", "Johan1");
		data.put("LSName" ,"Test");
		data.put("dob", "23/09/1986");
		data.put("Province","NS");
		data.put("country", "CAN");
		data.put("sex", "Male");
		data.put("AddrType", "Home");
		data.put("Add1", "55 Robie Street");
		data.put("City", "Halifax");
		data.put("Postalcode", "B4B0C5");
		data.put("PhoneType", "Mobile");
		data.put("Ph", "4389367890");
		data.put("EmailType", "Home");
		data.put("CheckList", "Hire");
		data.put("Mail", "abc@gmail.com");
		data.put("CompanyCode","GOC");
		data.put("DeptCode", "080201");
		data.put("JobCode","10200");
		data.put("BargainingUnit", "NA");
		data.put("PayGroup", "TR1");
		data.put("TaxLocation","CANAB");
		data.put("SalaryAdminPlan", "AOE");
		data.put("Grade", "01");
		
	
		return data;
	}
	
	public static Map<String,String> EnterTimeSheet()
	{
		Map<String,String>data = new HashMap<String,String>();
		data.put("EmpID", "010245502");//033369119 ,
		data.put("HoursDay1", "7.5");
		data.put("HoursDay2", "7.5");
		data.put("HoursDay3", "7.5");
		data.put("HoursDay4", "7.5");
		data.put("HoursDay5", "7.5");
		data.put("HoursDay6", "7.5");
	
		data.put("DateEntered", "07/16/2018");
		//data.put("", arg1)
		return data;
	}
	
	//010726918
	//010004939
	public static Map<String,String> QueryS34Manager()
	{
		Map<String,String>data = new HashMap<String,String>();
		data.put("QueryName", "AUDIT_PW_S34MGR");
		//data.put("", arg1)
		return data;
	}
	
	
	public static Map<String,String> ConfirmUtility()
	{
		Map<String,String>data = new HashMap<String,String>();
		data.put("RunCtrID", "SJ");
		data.put("PayrunID", "BW1808");
		data.put("On-OffCycle","N");
		data.put("Functinality", "S003_E50A_UPDATE_TAX_METHOD");
		//data.put("", arg1)
		return data;
	}
	public static Map<String,String> E87()
	{
		Map<String,String>data = new HashMap<String,String>();
		data.put("RunCtrID", "SJ");
		data.put("PayrunID", "BW1808");
	
		//data.put("", arg1)
		return data;
	}
	
	
	
	public static Map<String,String> ConfirmUtility1()
	{
		Map<String,String>data = new HashMap<String,String>();
		data.put("RunCtrID", "SJ");
		data.put("PayrunID", "BW1808");
		data.put("On-OffCycle","N");
		data.put("Functinality", "PW_PENSION_PSA_PENNY");
		//data.put("", arg1)
		return data;
	}
	public static Map<String,String> ConfirmUtility2()
	{
		Map<String,String>data = new HashMap<String,String>();
		data.put("PayrunID", "SJ");
		data.put("On-OffCycle","N");
		data.put("Functinality", "");
		//data.put("", arg1)
		return data;
	}
	public static Map<String,String> ConfirmUtility_E87()
	{
		Map<String,String>data = new HashMap<String,String>();
		data.put("PayrunID", "SJ");
		data.put("On-OffCycle","N");
		data.put("Functinality", "");
		//data.put("", arg1)
		return data;
	}
	public static Map<String,String> E87_QueryValidation()
	{
		Map<String,String>data = new HashMap<String,String>();
	
		data.put("SearchQueryDropdown","Query Name");
		data.put("Query", "P");
		//data.put("", arg1)
		return data;
	}
	
	public static Map<String,String> E87_QueryValidation_SR()
	{
		Map<String,String>data = new HashMap<String,String>();
		
		data.put("SearchValue","Query Name");
		data.put("Query", "");
		//data.put("", arg1)
		return data;
	}
	public static Map<String,String> Merge()
	{
		Map<String,String>data = new HashMap<String,String>();
		data.put("PayrunID", "SJ");
		data.put("On-OffCycle","N");
		data.put("Functinality", "");
		//data.put("", arg1)
		return data;
	}
	public static Map<String,String> E50A()
	{
		Map<String,String>data = new HashMap<String,String>();
		data.put("PayrunID", "");
		data.put("On-OffCycle","");
		data.put("ReportMode", "");
		//data.put("", arg1)
		return data;
	}
	

}
