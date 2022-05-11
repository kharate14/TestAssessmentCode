package assessment.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Script {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Parmeshwar\\Desktop\\drivers\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String username="standard_user";
		String password = "secret_sauce";
		
		driver.get("https://www.saucedemo.com/"); 	// launching the test site
		
		System.out.println(driver.getTitle());		// getting the title of the launched website opened in chrome browser
		
		driver.findElement(By.id("user-name")).sendKeys(username);	//sending the username to the username field
		
		driver.findElement(By.id("password")).sendKeys(password);		// sending the password in the password field on the webpage
		
		driver.findElement(By.id("login-button")).click();	// clicking on the login button 
		

	}

}
