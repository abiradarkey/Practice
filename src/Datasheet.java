import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datasheet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\abiradar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://qa.platform.xbotapps.com/");
		driver.findElement(By.id("input")).sendKeys("abiradar@keypoint-tech.com");
		driver.findElement(By.name("signInPassword")).sendKeys("devi");
	    driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/form/div/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//mat-icon[@title='New Bot']")).click();
	    driver.findElement(By.xpath("//input[@name='bot-name']")).sendKeys("te94556kj35");
	    driver.findElement(By.id("mat-input-2")).sendKeys("testkt");
	    driver.findElement(By.xpath("//button[@class='cs-upload-button ng-star-inserted cs-confirm-button']")).click();
	    driver.findElement(By.xpath("//button[@class='cs-upload-button cs-confirm-button ng-star-inserted']")).click();
		 driver.findElement(By.xpath("//div[@title='App engine']")).click();
		    driver.findElement(By.xpath("//span[contains(text(),'Create App from scratch')]")).click();
		    driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-app-engine-create-app-dialog/div/input")).sendKeys("road");
		    driver.findElement(By.xpath("//button[@class='ml-auto mt-4 mat-focus-indicator mat-flat-button mat-button-base mat-primary']")).click();
		    driver.findElement(By.xpath("//div[@class='ae-landing-page-existing-app']")).click();
		    ArrayList tabs = new ArrayList (driver.getWindowHandles());
		    driver.switchTo().window((String) tabs.get(1));
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//span[@title='Add DataSheet']")).click();
		    driver.findElement(By.xpath("//span[@class='mat-button-ripple mat-ripple']")).click();
		    driver.findElement(By.xpath("//div[@class='ag-cell ag-cell-auto-height ag-cell-value ag-cell-focus ag-cell-not-inline-editing']")).click();
		    driver.findElement(By.xpath("//div[@class='ag-cell ag-cell-auto-height ag-cell-value ag-cell-focus ag-cell-not-inline-editing']")).sendKeys("testing");
		    
	}

}
