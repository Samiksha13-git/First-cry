package Firstcry;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class homepage {
	String driverpath = "C:\\Users\\Samiksha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();

	@BeforeTest
		void navigate() {
		driver.get("https://firstcrystore.in/");
		driver .manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test(priority = 1)
	void next_icon() {
		WebElement NI = driver.findElement(By.xpath("//span[@class='carousel-control-next-icon']"));
        NI.click();
	}
	
	@Test(priority = 2)
	void before_icon() {
		WebElement BI = driver.findElement(By.xpath("//span[@class='carousel-control-prev-icon']"));
        BI.click();
	}
	
	@Test(priority = 3)
	void zero_one() {
		WebElement Z = driver.findElement(By.xpath("//div[@class='shop-by-age-container']//a[1]"));
        Z.click();
        
	}

}
