import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupdo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abiradar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://omayo.blogspot.com/");
	Thread.sleep(3000);
	String projectPath = System.getProperty("user.dir");
	driver.findElement(By.xpath("//input[@id='uploadfile']")).sendKeys(projectPath+"\\Files\\1646729310135_Teams_integration_doc (6).docx");
	
	}
	
	

}
