import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class deletebot {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\abiradar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://qa.platform.xbotapps.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.id("input")).sendKeys("abiradar@keypoint-tech.com");
	driver.findElement(By.name("signInPassword")).sendKeys("devi");
    driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/form/div/button")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//mat-icon[@title='New Bot']")).click();
    driver.findElement(By.xpath("//input[@name='bot-name']")).sendKeys("te7p45");
    driver.findElement(By.id("mat-input-2")).sendKeys("testkt");
    driver.findElement(By.xpath("//button[@class='cs-upload-button ng-star-inserted cs-confirm-button']")).click();
    driver.findElement(By.xpath("//button[@class='cs-upload-button cs-confirm-button ng-star-inserted']")).click();
    driver.findElement(By.xpath("//div[@class='cs-sidenav-icon cs-sidenav-icon-settings']")).click();
    Thread.sleep(4000);
    driver.findElement(By.xpath("//span[contains(text(),'Delete')]")).click();
    Thread.sleep(4000);
    //driver.findElement(By.xpath("//span[contains(text(),'Delete')]")).click();
    driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/create-bot-dialog-template/div/mat-dialog-actions[2]/button/span[1]")).click();
    
	}
}
