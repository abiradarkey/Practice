import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class google {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abiradar\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa.platform.xbotapps.com/");
		// TODO Auto-generated method stub

	}

}
