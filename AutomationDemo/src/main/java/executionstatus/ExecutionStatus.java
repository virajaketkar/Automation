package executionstatus;

import java.util.List;



public class ExecutionStatus {
	
	private String tcName;
	private String status;
	private String message;
	private List<EmployeeErr> errorList;
	private List<String> empIdList;
	private String logFileLink;
	//private QueryInputParameterData inputParameter;

	public String getTCName() {
		return tcName;
	}
	
	public void setTCName(String tcName) {
		this.tcName = tcName;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public List<EmployeeErr> getErrorList() {
		return errorList;
	}

	public void setErrorList(List<EmployeeErr> errorList) {
		this.errorList = errorList;
	}

	public String getLogFileLink() {
		return logFileLink;
	}

	public void setLogFileLink(String logFileLink) {
		this.logFileLink = logFileLink;
	}
	
	public List<String> getEmpIdList() {
		return empIdList;
	}

	public void setEmpIdList(List<String> empIdList) {
		this.empIdList = empIdList;
	}

	
	
}
