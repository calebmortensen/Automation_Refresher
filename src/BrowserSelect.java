import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSelect {

	public static void main(String[] args) {
		
		String browserName ="edge";
		
		WebDriver driver = null;
		
		if(browserName.equals("edge")){
			
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			driver = new EdgeDriver();
			
			}else if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver(); driver = new ChromeDriver();
			
			}else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");	
			driver = new FirefoxDriver();
			
		} /*
			 * else if(browserName.equals("opera")) {
			 * System.setProperty("webdriver.opera.driver", "./drivers/operadriver.exe");
			 * driver = new OperaDriver();
			 */
			
			driver.manage().window().maximize();
			driver.get("http://tutorialsninja.com/demo");
			driver.findElement(By.name("search")).sendKeys("HP");
			driver.findElement(By.className("input-group-btn")).click();
		
	}

}
