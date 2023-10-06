import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Synchronization {
	public static void main(String[] arg) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		driver.get("https://google.com");
		//driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		//driver.findElement(By.id("age")).sendKeys(Keys.PAGE_DOWN);
		
		WebElement srcBox = driver.findElement(By.className("gLFyf"));
		srcBox.sendKeys("Maven");
		Thread.sleep(10000);
		List<WebElement> items =driver.findElements(By.xpath(("//ul[@role='listbox')[1]//li//descendant::div")));
        System.out.println("no of elements "+items.size());
        for(int i=0;i<items.size();i++) {
        	System.out.println(items.get(i).getText());
        	
        }
		//				actions.moveToElement(inp).perform();
//				String str=driver.findElement(By.cssSelector("div.ui-tooltip-content")).getText();
//				System.out.println("str "+str);
				driver.quit();
		
		
	}
}
