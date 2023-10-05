import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip {
	public static void main(String[] arg){
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		driver.get("https://jqueryui.com/tooltip/");
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		driver.findElement(By.id("age")).sendKeys(Keys.PAGE_DOWN);
		
		WebElement inp = driver.findElement(By.id("age"));
				actions.moveToElement(inp).perform();
				String str=driver.findElement(By.cssSelector("div.ui-tooltip-content")).getText();
				System.out.println("str "+str);
				driver.quit();
		
		
	}

}
