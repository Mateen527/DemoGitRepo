package TestNGProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGWork {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {		
		System.setProperty("webdriver.chrome.driver", "D:\\Mateen Work Java\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();
		register();
}
	
	@Test
	public void verifyregistrationTest() {
		
		String result = driver.findElement(By.className("page-body")).getText();
		System.out.println("Registration successful");
		Assert.assertEquals(result, "Your registration completed"); 
		
		driver.quit();
	}
	
	public void register() {
		driver.findElement(By.xpath("//*[@id=\"gender-male\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Abdul6");
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Mateen6");
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("Mateen.526@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Abcd1234");
		driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("Abcd1234");
		driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
	}
}