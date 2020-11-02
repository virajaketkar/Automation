package environment;

import java.io.File;

public class Drivers {
	
    public static File ieDriverDetails()
    {
    	File driverDir = new File("src");
		File driver = new File(driverDir, "IEDriverServer.exe");
		return driver;
    }
    
    public static File chromeDriverDetails()
    {
    	File driverDir = new File("src");
		File driver = new File(driverDir, "chromedriver.exe");
		return driver;
    }
    
    public static File geckoDriverDetails()
    {
    	File driverDir = new File("src");
		File driver = new File(driverDir, "geckodriver.exe");
		return driver;
    }
    
}
