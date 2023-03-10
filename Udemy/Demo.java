import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.name("search")).sendKeys("HP");
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		if(driver.findElement(By.linkText("HP LP3065")).isDisplayed()) {
			System.out.println("Test Passed");
		}
	}

}
