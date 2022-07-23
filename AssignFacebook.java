package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignFacebook {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//click on create New Account 
	driver.findElement(By.linkText("Create New Account")).click();
	driver.findElement(By.name("firstname")).sendKeys("Aarth");
	driver.findElement(By.name("lastname")).sendKeys("Jame");
	driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]")).sendKeys("9087587559");
	driver.findElement(By.id("password_step_input")).sendKeys("Aarthi123!");
	driver.findElement(By.xpath("//option[text()=\"1993\"]")).click();
	driver.findElement(By.xpath("//label[text()='Female']")).click();
	driver.findElement(By.name("websubmit")).click();
	

	//FaceBook:
	//================================
	// Step 1: Download and set the path 
	// Step 2: Launch the chromebrowser
	// Step 3: Load the URL https://en-gb.facebook.com/
	// Step 4: Maximise the window
	// Step 5: Add implicit wait
	// Step 6: Click on Create New Account button
	// Step 7: Enter the first name
	// Step 8: Enter the last name
	// Step 9: Enter the mobile number
	// Step 10: Enterthe password
	// Step 11: Handle all the three drop downs
	// Step 12: Select the radio button "Female" 
	           // ( A normal click will do for this step) 

}
}
