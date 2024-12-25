package Firstcry;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class toys {
	String driverpath = "C:\\Users\\Samiksha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();

	@BeforeTest
		void navigate() {
		driver.get("https://firstcrystore.in/");
		driver .manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
  
	@Test(priority = 1)
	void account() {
		WebElement A = driver.findElement(By.xpath("//span[normalize-space()='Account']"));
        A.click();
	}
	
	@Test(priority = 2)
	void email() {
		WebElement E = driver.findElement(By.xpath("//input[@type=\"email\"]"));
        E.sendKeys("hello123@gmail.com");
	}
	
	@Test(priority = 3)
	void password() {
		WebElement P = driver.findElement(By.xpath("//input[@type=\"password\"]"));
        P.sendKeys("Manual@123");
	}
	
	@Test(priority =4)
	void login() throws InterruptedException {
		WebElement L = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        L.click();
        Thread.sleep(2000);
        Alert o=driver.switchTo().alert();
        o.accept();
	}
	
	@Test(priority = 5)
	void toys() {
		WebElement T = driver.findElement(By.xpath("(//div[@class=\"top-age hover-product-list y-gap\"])[1]"));
        T.click();
	}
	
	@Test(priority = 6)
	void prongo_educational() {
		WebElement P = driver.findElement(By.xpath("//li[normalize-space()='Prongo Educational']"));
        P.click();
	}
	
	@Test(priority = 7)
	void add_to_cart() {
		WebElement C = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/div[1]/a[1]/button[1]"));
        C.click();
	}
	
	@Test(priority = 8)
	void add() {
		WebElement AC = driver.findElement(By.xpath("//button[@class=\"btn btn-primary px-3\"]"));
        AC.click();
	}
	
	@Test(priority = 9)
	void proceed_to_checkout() throws InterruptedException {
		WebElement P = driver.findElement(By.xpath("//a[@href=\"#/proceedtocheckout\"]"));
        P.click();
        Thread.sleep(2000);
        driver.navigate().refresh();
	}
	
	@Test(priority = 10)
	void first_name() {
		WebElement F = driver.findElement(By.xpath("//input[@placeholder=\"John\"]"));
        F.sendKeys("Samiksha");
	}
  
	@Test(priority = 11)
	void last_name() {
		WebElement L = driver.findElement(By.xpath("//input[@placeholder=\"Doe\"]"));
        L.sendKeys("Mehta");
	}
	
	@Test(priority = 12)
	void e_mail() {
		WebElement E = driver.findElement(By.xpath("//input[@placeholder=\"example@email.com\"]"));
        E.sendKeys("hello123@gmail.com");
     }
	
	@Test(priority = 13)
	void mobile_no() {
		WebElement M = driver.findElement(By.xpath("//input[@placeholder=\"+123 456 789\"]"));
        M.sendKeys("9334582882");
	}
	
	@Test(priority = 14)
	void address() {
		WebElement AD = driver.findElement(By.xpath("(//input[@placeholder=\"123 Street\"])[1]"));
        AD.sendKeys("Street2");
	}
	
	@Test(priority = 15)
	void address_line() {
		WebElement AL = driver.findElement(By.xpath("//input[@name=\"addressLine2\"]"));
        AL.sendKeys("Street 2");
     }
	
	@Test(priority = 16)
	void city() {
		WebElement C = driver.findElement(By.xpath("//input[@name=\"city\"]"));
        C.sendKeys("Muzaffarpur");
	}

	@Test(priority = 17)
	void state() {
		WebElement S = driver.findElement(By.xpath("//input[@name=\"state\"]"));
        S.sendKeys("Bihar");
	}

	@Test(priority = 18)
    void zip_code() {
		WebElement Z = driver.findElement(By.xpath("//input[@name=\"zipCode\"]"));
        Z.sendKeys("843113");
    }

	@Test(priority = 19)
     void cash_on_delivery() {
 		WebElement COD = driver.findElement(By.xpath("//input[@id='directcheck']"));
        COD.click();
     }
}



