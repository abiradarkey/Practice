import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\abiradar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("abittt@kdg.com");
	driver.findElement(By.name("pass")).sendKeys("devi");
	driver.findElement(By.name("login")).sendKeys("login");
	driver.findElement(By.xpath("//*[@id=\"facebook\"]/body")).click();
	driver.findElement(By.xpath("//*[@id=\"u_0_d_Kj\"]")).click();
	driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).click();
	
}

}