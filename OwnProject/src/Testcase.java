import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcase {
public WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C://Users//195300//Documents//eclipse//new version//chromedriver.exe");

		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?hl=en&passive=true&continue=https%3A%2F%2Fwww.google.com%2Fsearch%3Fq%3Dgmail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
	}
	
	@Test
	public void test1() {
		driver.findElement(By.xpath("//*[@id=\'identifierId\']")).sendKeys("khawwafathima");
		driver.findElement(By.id("identifierNext")).click();
		driver.findElement(By.xpath("//*[@id='password\']/div[1]/div/div[1]/input")).sendKeys("Farisha@23");
		//*[@id="identifierNext"]/div/button/span
	}

	@Test
	public void test2() {
		driver.findElement(By.xpath("//*[@id=\':1k\']")).click();
	}
	
	@AfterMethod
	public void teardown() {
		System.out.println("clik on unread mail");
	}
}
