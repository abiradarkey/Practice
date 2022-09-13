
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Fileupload {
	
	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\abiradar\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
//	driver.get("https://nervgh.github.io/pages/angular-file-upload/examples/simple/");
	driver.get("https://qa.platform.xbotapps.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//	String projectPath = System.getProperty("user.dir");
//	driver.findElement(By.id("uploadfile")).sendKeys(projectPath+"\\Files\\word.docx");
//	driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\abiradar\\Desktop\\word.docx");
	driver.findElement(By.xpath("//input[@class='mat-input-element mat-form-field-autofill-control ng-pristine ng-valid cdk-text-field-autofill-monitored ng-touched']")).sendKeys("C:\\Users\\abiradar\\Desktop\\word.docx");
	
	Thread.sleep(1000);
	
	
	}
	}

