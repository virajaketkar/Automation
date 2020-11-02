package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.gson.Gson;

import executionstatus.DataHolder;
import executionstatus.EmployeeErr;
import executionstatus.ExecutionStatus;

public abstract class UIHelper {
	
	WebElement el;
	private final static String execStatusResFile = Utils.getProperties().getProperty("jsonDataFolder") + "Paymod_Pilot_ExecStatusRes.json";
	private final static String execStatusFile = Utils.getProperties().getProperty("jsonDataFolder") + "Paymod_Pilot_ExecStatus.json";
	
	public WebElement findElement() {
		return el;
	}
	
	public By getObjectLocator(WebDriver dr, String framename) {
		
		
		return null;
	}
	
	public static void switchIFrame(WebDriver dr, String framename) {
		
		try {
			//Thread.sleep(5000);
			System.out.println("Entering Iframe function");
			List<WebElement> NoOfFr = dr.findElements(By.tagName("iframe"));
			System.out.println("No of Iframes"+NoOfFr.size());
			
			for(WebElement el: NoOfFr) {
				System.out.println("Selected Iframe"+ el.getAttribute("name"));
				
				if(el.getAttribute("name").matches(framename)) {
					dr.switchTo().frame(el);
					System.out.println("Switched to frame"+ framename);
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception in iframe"+e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	public static int findIFrame(WebDriver dr, By locator) {
		
		try {
			Thread.sleep(1000);
			System.out.println("Entering Iframe function");
			List<WebElement> NoOfFr = dr.findElements(By.tagName("iframe"));
		    System.out.println("No of Iframes"+NoOfFr.size());
			
			for(WebElement el: NoOfFr) {
				System.out.println("Selected Iframe"+ el.getAttribute("name"));
				dr.switchTo().frame(el);
				Integer noOfElements = dr.findElements(locator).size();
				System.out.println("No of elements found"+ noOfElements);
			
				if(noOfElements>0) {
					//System.out.println("Switched to iframe"+ el.getAttribute("name"));
					return 1;
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception in iframe"+e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}
	
	public static List<String> getExecutionStatusandMessage(String TCName) {

		Gson gson = new Gson();
		List<String> result = new ArrayList<String>();
		try {
		
			//public static final Type ExecutionStatus_TYPE = new TypeToken<ExecutionStatus<List>>() {}.getType();
			//BufferedReader br = new BufferedReader(new FileReader("C:\\Phoenix Automation\\src\\Paymod_Pilot_ExecStatusRes.json"));
			BufferedReader br = new BufferedReader(new FileReader(execStatusResFile));
			DataHolder dh = gson.fromJson(br, DataHolder.class);
			br.close();
			for(ExecutionStatus es: dh.ExecutionStat) {
				System.out.println(es.getTCName());
				es.setStatus("Completed");
				if(es.getTCName().contentEquals(TCName)) {
					result.add(0, es.getStatus());
					result.add(1, es.getMessage());
					System.out.println("Result values "+ result.get(0) + ","+ result.get(1));
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	
	}
	
	public static void updateExecutionStatus(String TCName, String Result) {

		Gson gson = new Gson();

		System.out.println("Updating status of TC "+TCName+ "with result"+ Result);
		try {
		
			//public static final Type ExecutionStatus_TYPE = new TypeToken<ExecutionStatus<List>>() {}.getType();
			//BufferedReader br = new BufferedReader(new FileReader("C:\\Phoenix Automation\\src\\Paymod_Pilot_ExecStatusRes.json"));
			//BufferedReader br = new BufferedReader(new FileReader("C:\\Phoenix Automation\\src\\Paymod_Pilot_ExecStatusRes.json"));
			BufferedReader br = new BufferedReader(new FileReader(execStatusResFile));
			DataHolder dh = gson.fromJson(br, DataHolder.class);
			br.close();
			for(ExecutionStatus es: dh.ExecutionStat) {
				//System.out.println(es.getTCName());
				//es.setStatus("Completed");
				if(es.getTCName().contentEquals(TCName)) {
					System.out.println("Updating execution status from "+ es.getStatus() + " to "+ Result);
					es.setStatus(Result);
				}
			}
		
			String opjson = gson.toJson(dh);
			
			try {
				   //write converted json data to a file named "CountryGSON.json"
				   //FileWriter writer = new FileWriter("C:\\Phoenix Automation\\src\\Paymod_Pilot_ExecStatusRes.json");
				   FileWriter writer = new FileWriter(execStatusResFile);
				   writer.write(opjson);
				   writer.close();
				  
			} catch (IOException e) {
			   e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public static void updateMessage(String TCName, String Message) {

		Gson gson = new Gson();

		try {
		
			//public static final Type ExecutionStatus_TYPE = new TypeToken<ExecutionStatus<List>>() {}.getType();
			//BufferedReader br = new BufferedReader(new FileReader("C:\\Phoenix Automation\\src\\Paymod_Pilot_ExecStatusRes.json"));
			BufferedReader br = new BufferedReader(new FileReader(execStatusResFile));
			DataHolder dh = gson.fromJson(br, DataHolder.class);
			br.close();
			for(ExecutionStatus es: dh.ExecutionStat) {

				if(es.getTCName().contentEquals(TCName)) {
					System.out.println("Updating Message status from "+ es.getMessage() + " to "+ Message);
					es.setMessage(Message);
				}
			}
		
			String opjson = gson.toJson(dh);
			
			try {
				   //write converted json data to a file named "CountryGSON.json"
				   //FileWriter writer = new FileWriter("C:\\Phoenix Automation\\src\\Paymod_Pilot_ExecStatusRes.json");
				   FileWriter writer = new FileWriter(execStatusResFile);
				   writer.write(opjson);
				   writer.close();
				  
			} catch (IOException e) {
			   e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public static void updateErrorMessages(String TCName, List<EmployeeErr> emperrlist) {

		Gson gson = new Gson();

		try {
		
			//public static final Type ExecutionStatus_TYPE = new TypeToken<ExecutionStatus<List>>() {}.getType();
			//BufferedReader br = new BufferedReader(new FileReader("C:\\Phoenix Automation\\src\\Paymod_Pilot_ExecStatusRes.json"));
			BufferedReader br = new BufferedReader(new FileReader(execStatusResFile));
			DataHolder dh = gson.fromJson(br, DataHolder.class);
			br.close();
			for(ExecutionStatus es: dh.ExecutionStat) {

				if(es.getTCName().contentEquals(TCName)) {
					/*
					for(EmployeeErr eer:es.ErrorList) {
						eer.
					}
					*/
					
					es.setErrorList(emperrlist);
					System.out.println("Updated to errorlist"+emperrlist);
				}
			}
		
			String opjson = gson.toJson(dh);
			
			try {
				   //write converted json data to a file named "CountryGSON.json"
				   //FileWriter writer = new FileWriter("C:\\Phoenix Automation\\src\\Paymod_Pilot_ExecStatusRes.json");
				   FileWriter writer = new FileWriter(execStatusResFile);
				   writer.write(opjson);
				   writer.close();
				  
			} catch (IOException e) {
			   e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	public static void initExecutiontoNA() {

		Gson gson = new Gson();

		try {
		
			//public static final Type ExecutionStatus_TYPE = new TypeToken<ExecutionStatus<List>>() {}.getType();
			//BufferedReader br = new BufferedReader(new FileReader("C:\\Phoenix Automation\\src\\Paymod_Pilot_ExecStatusRes.json"));
			BufferedReader br = new BufferedReader(new FileReader(execStatusResFile));
			DataHolder dh = gson.fromJson(br, DataHolder.class);
			br.close();
			for(ExecutionStatus es: dh.ExecutionStat) {
				System.out.println("TC Name"+es.getTCName());
				System.out.println("Updating execution status from "+ es.getStatus() + " to NA");
				System.out.println("Updating message status from "+ es.getMessage() + " to NA");
				System.out.println("Updating error list to null ");
				es.setStatus("NA");
				es.setMessage("NA");
				es.setErrorList(null);
			}
		
			String opjson = gson.toJson(dh);
			
			try {
				   //write converted json data to a file named "CountryGSON.json"
				   //FileWriter writer = new FileWriter("C:\\Phoenix Automation\\src\\Paymod_Pilot_ExecStatusRes.json");
				   FileWriter writer = new FileWriter(execStatusResFile);
				   writer.write(opjson);
				   writer.close();
				  
			} catch (IOException e) {
			   e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	
	public static void readJSON() {
		Gson gson = new Gson();
		
		try {
		
			//BufferedReader br = new BufferedReader(new FileReader("C:\\Paymod_Pilot_ExecStatusRes.json"));
			BufferedReader br = new BufferedReader(new FileReader(execStatusResFile));
			ExecutionStatus es = gson.fromJson(br, ExecutionStatus.class);
			System.out.println(es.getTCName()+es.getStatus()+es.getMessage());
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void readMainJSON() {
		Gson gson = new Gson();
		
		try {
		
			//public static final Type ExecutionStatus_TYPE = new TypeToken<ExecutionStatus<List>>() {}.getType();
			//BufferedReader br = new BufferedReader(new FileReader("C:\\Paymod_Pilot_ExecStatus.json"));
			BufferedReader br = new BufferedReader(new FileReader(execStatusFile));
			ExecutionStatus[] dh = gson.fromJson(br, ExecutionStatus[].class);
			br.close();
			//System.out.println(es.getTCName()+es.getStatus()+es.getMessage());
			System.out.println("Value of dataholder"+ dh[0].getTCName()+dh[1].getTCName());
			dh[0].setStatus("Completed");
			
			String opjson = gson.toJson(dh);
			
			try {
				   //write converted json data to a file named "CountryGSON.json"
				   //FileWriter writer = new FileWriter("C:\\Paymod_Pilot_ExecStatus.json");
				   FileWriter writer = new FileWriter(execStatusFile);
				   writer.write(opjson);
				   writer.close();
				  
			} catch (IOException e) {
			   e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void readComplexMainJSON() {
		Gson gson = new Gson();
		
		try {
		
			//public static final Type ExecutionStatus_TYPE = new TypeToken<ExecutionStatus<List>>() {}.getType();
			//BufferedReader br = new BufferedReader(new FileReader("C:\\Paymod_Pilot_ExecStatusRes.json"));
			BufferedReader br = new BufferedReader(new FileReader(execStatusResFile));
			DataHolder dh = gson.fromJson(br, DataHolder.class);
			br.close();
			for(ExecutionStatus es: dh.ExecutionStat) {
				System.out.println(es.getTCName());
				es.setStatus("Completed");
				
				for(EmployeeErr ee: es.getErrorList()) {
					System.out.println("Error messages"+ee.getEmployeeID()+ee.getPayrunErrorMessage());
				}
			}
			
			//System.out.println(es.getTCName()+es.getStatus()+es.getMessage());
			//System.out.println("Value of dataholder"+ dh[0].getTCName()+dh[1].getTCName());
			//dh[0].setStatus("Completed");
			
			//List<ExecutionStatus> es = dh.getExecutionStatus();
			//System.out.println("Es size"+dh.getname());
			//System.out.println("Es size"+dh.getExecutionStatus().size());
			
			
			String opjson = gson.toJson(dh);
			
			try {
				   //write converted json data to a file named "CountryGSON.json"
				   //FileWriter writer = new FileWriter("C:\\Paymod_Pilot_ExecStatusRes.json");
				   FileWriter writer = new FileWriter(execStatusResFile);
				   writer.write(opjson);
				   writer.close();
				  
			} catch (IOException e) {
			   e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
