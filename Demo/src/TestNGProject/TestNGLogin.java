package TestNGProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGLogin {
WebDriver driver;
	
	@BeforeMethod
	public void setup() {		
		System.setProperty("webdriver.chrome.driver", "D:\\Mateen Work Java\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		login();
		
	}
	@Test
	public void verifyloginmail() {
		
		String account = driver.findElement(By.className("account")).getText();
		Assert.assertEquals(account, "Mateen.5276@gmail.com"); 
	}
	
	@AfterTest
	public void logout()
	{
		driver.findElement(By.className("ico-logout")).click();
		driver.quit();
	}
	
	
	public void login() {
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("Mateen.5276@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Abcd1234");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	}
}
