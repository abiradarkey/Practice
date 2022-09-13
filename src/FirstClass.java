import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abiradar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://qa.platform.xbotapps.com/");
	driver.findElement(By.id("input")).sendKeys("abiradar@keypoint-tech.com");
	driver.findElement(By.name("signInPassword")).sendKeys("devi");
	driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/form/div/button")).click();
	driver.findElement(By.xpath("//mat-icon[@title='New Bot']")).click();
	
	//create bot
	driver.findElement(By.name("bot-name")).sendKeys("testing776666");
	driver.findElement(By.id("mat-input-2")).sendKeys("autodettec");
	driver.findElement(By.xpath("//button[@class='cs-upload-button ng-star-inserted cs-confirm-button']")).click();
	driver.findElement(By.xpath("//button[@class='cs-upload-button cs-confirm-button ng-star-inserted']")).click();
	Thread.sleep(3000);
	//create flow
	driver.findElement(By.xpath("//button[@title='Add new flow']")).click();
    driver.findElement(By.xpath("//button[@aria-hidden='true']")).click();
	driver.findElement(By.xpath("//button[@title='Add new flow']")).click();
	driver.findElement(By.xpath("//input[@name='flow-name']")).sendKeys("testingss");
	driver.findElement(By.xpath("//input[@placeholder='Enter the Phrase']")).sendKeys("home");
	driver.findElement(By.xpath("//input[@placeholder='Enter the Phrase']")).sendKeys(Keys.RETURN);
	driver.findElement(By.xpath("//div[@class='cs-flow-actions-svg title']")).click();
	driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("hello");
	driver.findElement(By.xpath("//button[@class='flow-action-buttons change-color theme-background-color theme-border-color ng-star-inserted']")).click();
	//driver.findElement(By.xpath("//div[@class='cs-save-flow-svg']")).click();
    driver.findElement(By.xpath("//mat-icon[@class='mat-icon notranslate ng-tns-c5-1 material-icons mat-icon-no-color']")).click();
    driver.findElement(By.xpath("//input[@placeholder='Enter Message Here']")).sendKeys("floeing");
    driver.findElement(By.xpath("//mat-icon[@class='mat-icon notranslate mat-primary material-icons']")).click();

}
	
	
	
}