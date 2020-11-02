package executionstatus;

public class EmployeeErr {
	private String employeeID;
	private String payGroup;
	private String payPeriodEndDate;
	private String company;
	private String offCycle;
	private String payrunErrorMessage;
	
	public String getPayrunErrorMessage() {
		return payrunErrorMessage;
	}
	
	public void setPayrunErrorMessage(String payrunErrorMessage) {
		this.payrunErrorMessage = payrunErrorMessage;
	}
	
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getPayGroup() {
		return payGroup;
	}

	public void setPayGroup(String payGroup) {
		this.payGroup = payGroup;
	}

	public String getPayPeriodEndDate() {
		return payPeriodEndDate;
	}

	public void setPayPeriodEndDate(String payPeriodEndDate) {
		this.payPeriodEndDate = payPeriodEndDate;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getOffCycle() {
		return offCycle;
	}

	public void setOffCycle(String offCycle) {
		this.offCycle = offCycle;
	}
	
}
