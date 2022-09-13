import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdemo  {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abiradar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.snapchat.com/en-GB");
	//driver.findElement(By.id("alertBox")).click();
	//Alert simpleAlert = driver.switchTo().alert();
	driver.switchTo().alert().accept();
	
	
//System.out.println(simpleAlert.getText());
	Thread.sleep(5000);
	//simpleAlert.accept();	
	}

}
