import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpWait {
	public static void main(String[] arg) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		driver.get("http://uitestingplayground.com/ajax");
		driver.findElement(By.id("ajaxButton")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("p.bg-success")));
		String msg=driver.findElement(By.cssSelector("p.bg-success")).getText();
		System.out.println("message "+msg);
		driver.quit();
		
	}
}
