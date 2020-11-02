package executionstatus;

import utilities.UIHelper;

public class TCDriver {

	public static void main(String args[]) {
	
		//UIHelper.updateExecutionStatus("CalculatePayroll", "test");
		//UIHelper.readJSON();
		UIHelper.readComplexMainJSON();
		System.out.println("\n\n\n");
		
		/*
		try {
		
			JsonParser parser = new JsonParser();
			JsonObject TCObject = (JsonObject) parser.parse(new FileReader("C:\\Selenium\\paymod_automation_ws\\paymod_pilot\\Datapool\\Paymod_Pilot_ExecStatus.json"));
			
			String name = TCObject.get("name").getAsString();
			
			System.out.println("Name field from JSON"+name);
			
			JsonArray TCArray = TCObject.getAsJsonArray("ExecutionStatus");
			
			for (JsonElement pa : TCArray) {
			    JsonObject paymentObj = pa.getAsJsonObject();
			    //String tcName = paymentObj.get("TCName").getAsString();
			    //String Env = paymentObj.get("Env").getAsString();
			    System.out.println("Number of data elements for the array"+paymentObj.keySet().size());
			    Set<String> keySet= paymentObj.keySet();
			    
			    for(String datalist: keySet) {
			    	System.out.println(datalist + " has value" + paymentObj.get(datalist));
			    }
			    
			    
			    /*
			    JsonObject Data = paymentObj.getAsJsonObject()
			    		Data.get
			    for(JsonElement dt: Data) {
			    	JsonObject dataobj = dt.getAsJsonObject();
			    	String value = dataobj.
			    }
			    */
			    //System.out.println(tcName+Env);
		/*
			}
			
			
			
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
	}

}
