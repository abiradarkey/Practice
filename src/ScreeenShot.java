import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreeenShot {

	public static WebDriver driver;
public static void main(String[] args) throws IOException {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\abiradar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

driver = new ChromeDriver();

driver.get("https://qa.platform.xbotapps.com/");

takeScreenshot("LoginPageCerina");

System.out.println("Screenshot taken");
}
private static void takeScreenshot(String filename)throws IOException {
	//step 1: Take screenshot and store it as file
	
	//Date thisDate = new Date();
	//SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YY");
	//System.out.println(dateFormat.format(thisDate));
	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("C:\\Users\\abiradar\\Pictures\\Screenshots"+filename+".png"));
	
	
	
}



}

