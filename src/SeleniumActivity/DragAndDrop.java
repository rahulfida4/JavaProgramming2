package SeleniumActivity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		Actions act = new Actions(driver);
		
		
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		
		WebElement drop = driver.findElement(By.id("droppable"));
		
		act.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();
		
		Thread.sleep(3000);
		
		act.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(3000);
		
		
		
		driver.quit();
		
		
		
		
		
		
				
		 
		
		
		
		
		
		
		
	}

}
