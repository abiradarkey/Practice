import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abiradar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement (By.name("firstname")).sendKeys("radha");
		driver.findElement (By.name("lastname")).sendKeys("sudha");
		driver.findElement (By.name("reg_email__")).sendKeys("abiradar@keypoint-tech.com");
		driver.findElement (By.name("reg_email_confirmation__")).sendKeys("abiradar@keypoint-tech.com");
		driver.findElement (By.name("reg_passwd__")).sendKeys("Pappa@90");
		driver.findElement (By.name("birthday_day")).sendKeys("1");
		driver.findElement (By.name("birthday_month")).sendKeys("april");
		driver.findElement (By.name("birthday_year")).sendKeys("1997");
		driver.findElement (By.name("birthday_year")).sendKeys("1997");
		driver.findElement (By.name("sex")).click();
		driver.findElement (By.name("websubmit")).sendKeys("sign Up");
			
	}

}
