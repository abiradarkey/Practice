import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class appengine {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\abiradar\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	//Actions action = new Actions(driver); action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
	driver.get("https://qa.platform.xbotapps.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Actions ac = new Actions(driver);
	driver.findElement(By.id("input")).sendKeys("abiradar@keypoint-tech.com");
	driver.findElement(By.name("signInPassword")).sendKeys("devi");
    driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/form/div/button")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//mat-icon[@title='New Bot']")).click();
    driver.findElement(By.xpath("//input[@name='bot-name']")).sendKeys("te9545");
    driver.findElement(By.id("mat-input-2")).sendKeys("testkt");
    driver.findElement(By.xpath("//button[@class='cs-upload-button ng-star-inserted cs-confirm-button']")).click();
    driver.findElement(By.xpath("//button[@class='cs-upload-button cs-confirm-button ng-star-inserted']")).click();
    //app engine
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[@title='App engine']")).click();
    driver.findElement(By.xpath("//span[contains(text(),'Create App from scratch')]")).click();
    driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-app-engine-create-app-dialog/div/input")).sendKeys("road");
    driver.findElement(By.xpath("//button[@class='ml-auto mt-4 mat-focus-indicator mat-flat-button mat-button-base mat-primary']")).click();
    driver.findElement(By.xpath("//div[@class='ae-landing-page-existing-app']")).click();
  
    
    ArrayList tabs = new ArrayList (driver.getWindowHandles());
    driver.switchTo().window((String) tabs.get(1));
    Thread.sleep(3000);
    driver.findElement(By.xpath("//mat-icon[contains(text(),'add')]")).click();
    //driver.close();
    driver.findElement(By.xpath("//input[@type='text']")).clear();
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("roading");
    driver.findElement(By.xpath("//span[@class='mat-button-wrapper']")).click();
    //driver.findElement(By.xpath("//span[contains(text(),'New Field')]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("/html/body/app-root/div/app-engine-app-details/div/div[2]/div[2]/div[2]/span[2]/span")).click();
    driver.findElement(By.xpath("//div[@class='ng-star-inserted']")).click();
    driver.findElement(By.xpath("//div[@class='ag-cell ag-cell-auto-height ag-cell-value ag-cell-focus ag-cell-not-inline-editing']")).sendKeys("rama");
    
	}

}
