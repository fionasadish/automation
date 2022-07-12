package gmail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	       WebElement user= driver.findElement(By.xpath("//input[@id='txtUsername']"));
	       user.sendKeys("Admin");
	       WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
	       password.sendKeys("admin123");
	       WebElement Login=driver.findElement(By.xpath("//input[@id='btnLogin']"));
	       Login.click();
	       driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
	     WebElement username=  driver.findElement(By.xpath("//input[@id='searchSystemUser_userName']"));
	     username.sendKeys("adash");
	     Select se = new Select(driver.findElement(By.xpath("//select[@id='searchSystemUser_userType']")));
	     se.selectByIndex(2);
	     WebElement user1=driver.findElement(By.xpath("//input[@id='searchSystemUser_employeeName_empName']"));
	     user1.sendKeys("Ananya Dash");
	     Select se1 =new Select(driver.findElement(By.xpath("//select[@name='searchSystemUser[status]']")));
	     se1.selectByIndex(0);
driver.quit();
	     
	     
	    
			
		

	}

}
