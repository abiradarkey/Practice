import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
c
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abiradar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("2+2");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		//clicking on some button
		driver.findElement(By.id("input")).click();
//		driver.findElement(By.id("guns")).calculatorTextBox.getText();
		
		
		
	}

}
