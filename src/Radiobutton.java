import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abiradar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.singaporeair.com/en_UK/au/home#/book/bookflight");
	WebElement radio2 = driver.findElement(By.id("redeemFlights"));
	WebElement radio1 = driver.findElement(By.id("bookFlights"));
	radio2.click();
	System.out.println(radio1.isSelected());
	System.out.println(radio2.isSelected());
	
	}
	

}
