import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Mateen Work Java\\Softwares\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");

	}

}
