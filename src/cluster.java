import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cluster {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\abiradar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://qa.platform.xbotapps.com/");
	driver.findElement(By.id("input")).sendKeys("abiradar@keypoint-tech.com");
	driver.findElement(By.name("signInPassword")).sendKeys("devi");
    driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/form/div/button")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//mat-icon[@title='New Bot']")).click();
    driver.findElement(By.xpath("//input[@name='bot-name']")).sendKeys("tessstt112");
    driver.findElement(By.id("mat-input-2")).sendKeys("tessssstkt");
    driver.findElement(By.xpath("//button[@class='cs-upload-button ng-star-inserted cs-confirm-button']")).click();
    driver.findElement(By.xpath("//button[@class='cs-upload-button cs-confirm-button ng-star-inserted']")).click();
    //word cluster
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[@title='Word Clusters']")).click();
    driver.findElement(By.xpath("//span[@class='add-first-entity-text']")).click();
    driver.findElement(By.xpath("//input[@id='entity-name']")).sendKeys("tester");
    driver.findElement(By.id("reference_0")).sendKeys("tester");
    driver.findElement(By.xpath("//*[@id=\"synonym_0\"]")).sendKeys("testyyer");
    driver.findElement(By.xpath("//*[@id=\"synonym_0\"]")).sendKeys(Keys.RETURN);
    driver.findElement(By.xpath("//*[@id=\"synonym_0\"]")).sendKeys("ffooogger");
    driver.findElement(By.xpath("//*[@id=\"synonym_0\"]")).sendKeys(Keys.RETURN);
    //driver.findElement(By.xpath("//input[@id='entity-name']")).sendKeys("tester");
    
    
	}
}