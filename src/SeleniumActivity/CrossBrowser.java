package SeleniumActivity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void VerifyTitle(String browserName){
		if(browserName.equalsIgnoreCase("firefox")){
		driver = new FirefoxDriver();
		
		
	}
		else if(browserName.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul Sinha\\Downloads\\Software\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("http://www.learn-automation.com");

System.out.print(driver.getTitle());

driver.quit();


}
	}
}
