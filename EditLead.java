package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//
			
			//* 1	Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Aart");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		System.out.println(driver.getTitle());
		
		/*
		 * String text =
		 * driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		 * System.out.println(text);
		 */
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Pvt");
		driver.findElement(By.name("submitButton")).click();
		
	//	driver.close();
		
		/**
		 * 2 Enter the username 3 Enter the password 4 Click Login 5 Click crm/sfa link
		 * 6 Click Leads link 7 Click Find leads 8 Enter first name 9 Click Find leads
		 * button 10 Click on first resulting lead 11 Verify title of the page 12 Click
		 * Edit 13 Change the company name 14 Click Update 15 Confirm the changed name
		 * appears 16 Close the browser (Do not log out)
		 */

	}

}
