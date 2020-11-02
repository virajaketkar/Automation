package environment;

public class EnvironmentData {
	
	String envName;
	String appUrl;
	String queryUrl;
	String reportUrl;
	String downloadFolder;
	
	public String getEnvName() {
		return envName;
	}
	public void setEnvName(String envName) {
		this.envName = envName;
	}
	public String getAppUrl() {
		return appUrl;
	}
	public void setAppUrl(String appUrl) {
		this.appUrl = appUrl;
	}
	public String getQueryUrl() {
		return queryUrl;
	}
	public void setQueryUrl(String queryUrl) {
		this.queryUrl = queryUrl;
	}
	public String getReportUrl() {
		return reportUrl;
	}
	public void setReportUrl(String reportUrl) {
		this.reportUrl = reportUrl;
	}
	public String getDownloadFolder() {
		return downloadFolder;
	}
	public void setDownloadFolder(String downloadFolder) {
		this.downloadFolder = downloadFolder;
	}
}
