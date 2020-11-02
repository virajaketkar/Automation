package utilities;

import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriverService;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportUtils {

	static DesktopOptions options;
	static WiniumDriverService service;

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentTest testInfo;

	private static ExtentReports extent;
	private static ThreadLocal<ExtentTest> parentTest = new ThreadLocal<ExtentTest>();
	private static ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();

	public static void setup() {
		String fileName = new SimpleDateFormat("'extentReport_'yyyyMMddHHmmss'.html'").format(new Date());
		extent = ExtentManager.createInstance(Constant.EXTENT_REPORT_FOLDER + fileName);
		htmlReporter = new ExtentHtmlReporter(Constant.EXTENT_REPORT_FOLDER + fileName);
		extent.attachReporter(htmlReporter);

		extent.setSystemInfo("OS", "Windows");
		extent.setSystemInfo("Enivironment", "ISSCRT01");
		extent.setSystemInfo("Host", "Team Accelerators");
		htmlReporter.config().setTimeStampFormat("MMM dd,yyyy hh:mm:ss a zzz");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setDocumentTitle("IBM Test Automation Report");
		htmlReporter.config().setReportName("IBM Test Automation Report");
		htmlReporter.config().setTheme(Theme.STANDARD);
		String css = "	    .start-time, .category-status > .pass, .author-status > .pass {\r\n"
				+ "        background:  #1F70C1;\r\n" + "    }\r\n"
				+ "    .end-time, .category-status > .fail, .author-status > .fail {\r\n"
				+ "        background:  #1F70C1;\r\n" + "    }\r\n"
				+ ".grey.lighten-1{background-color:#1F70C1 !important}";
		htmlReporter.config().setCSS(css);

	}

	public synchronized static void createTest(String className) {
		ExtentTest parent = extent.createTest(className);
		parentTest.set(parent);
	}

	public synchronized static void createChildTest(Method method) {
		// String testName = method.getName();
		// testInfo = ExtentReportUtils.extent.createTest(className + "." + testName);
		ExtentTest child = parentTest.get().createNode(method.getName());
		test.set(child);
	}

	public synchronized static void reportResult(ITestResult result, String fileName) throws IOException {

		String output = // "User is: " + Utils.getProperties().getProperty("userID") + "\n" +
				"Environment is: " + Utils.getProperties().getProperty("environment");
		Markup markUp = MarkupHelper.createCodeBlock(output);
		test.get().info(markUp);

		if (result.getStatus() == ITestResult.FAILURE) {
			test.get().fail(result.getThrowable());
			test.get().addScreenCaptureFromPath("../screenshots/" + fileName);

		} else if (result.getStatus() == ITestResult.SKIP) {
			test.get().skip(result.getThrowable());
		} else {
			test.get().pass("Test passed");
		}

		extent.flush();
	}

	

	

}
