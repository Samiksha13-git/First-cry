package Firstcry;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class diapers {
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
		WebElement E = driver.findElement(By.xpath("//input[@name=\"email\"]"));
        E.sendKeys("hello123@gmail.com");
	}

	@Test(priority = 3)
	void password() {
		WebElement P = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        P.sendKeys("Manual@123");
	}
	
	@Test(priority = 4)
	void sign_in() throws InterruptedException {
		WebElement S = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        S.click();
	    Thread.sleep(2000);
        Alert o=driver.switchTo().alert();
        o.accept();
	}
	
	@Test(priority = 5)
	void diapers() {
		WebElement D = driver.findElement(By.xpath("//div[@class='categories-container']//div[3]"));
        D.click();
	}
	
	@Test(priority = 6)
	void many_poko_pants() {
		WebElement M = driver.findElement(By.xpath("//li[normalize-space()='Mamy Poko Pants xxxl']"));
        M.click();
	}
	
	@Test(priority = 7)
	void add_to_cart() {
		WebElement AC = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/div[1]/a[1]/button[1]"));
        AC.click();
    }
	
	@Test(priority = 8)
	void add_product() {
		WebElement AP = driver.findElement(By.xpath("//a[@href=\"#/productcart\"]"));
        AP.click();
	}
	
	@Test(priority = 9)
	void proceed_to_checkout() throws InterruptedException {
		WebElement PTC = driver.findElement(By.xpath("//a[@href=\"#/proceedtocheckout\"]"));
        PTC.click();
        Thread.sleep(2000);
	    driver.navigate().refresh();
	}
 	
    @Test(priority = 10)
	void first_name() {
		WebElement FN = driver.findElement(By.xpath("//input[@name=\"firstName\"]"));
        FN.sendKeys("Samiksha");
	}
    
    @Test(priority = 11)
    void last_name() {
		WebElement LN = driver.findElement(By.xpath("//input[@name=\"lastName\"]"));
        LN.sendKeys("Mehta");
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
		WebElement AD = driver.findElement(By.xpath("//input[@name=\"addressLine1\"]"));
        AD.sendKeys("Street 1");
    }
    
    @Test(priority = 15)
	 void address_line() {
			WebElement AL = driver.findElement(By.xpath("//input[@name=\"addressLine2\"]"));
            AL.sendKeys("Street 3");
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
    void submit_address_details() {
 		WebElement SAD = driver.findElement(By.xpath("//button[@class='edit-submit-btn']"));
        SAD.click();
    }
	
}
