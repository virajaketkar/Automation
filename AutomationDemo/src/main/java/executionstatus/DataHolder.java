package executionstatus;

import java.util.List;

public class DataHolder {
	String name;
	public List<ExecutionStatus> ExecutionStat;

	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public List<ExecutionStatus> getExecutionStatus(){
		return ExecutionStat;
	}
	
	public void setExecutionStatus(List<ExecutionStatus> ExecutionStat) {
		this.ExecutionStat = ExecutionStat;
	}
	
}
