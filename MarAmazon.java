package week2day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MarAmazon {
	public static void main(String[] args) throws InterruptedException, IOException {

		// we have to call WDM for browser driver

		//launch the browser chrome

		//Load the URL

		// Maximize the window
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//Type "Bags" in the Search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
		Thread.sleep(3000);
		//select bags for boys
		driver.findElement(By.xpath("//span[text()=' for boys']/parent::div")).click();
		//driver.findElement(By.xpath("(//div[@role=\"button\"])[3]")).click();
		//printing total entries

		String Total = driver.findElement(By.xpath("//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]/span")).getText(); 
		String replaceAll = Total.replaceAll("\\D","");
		System.out.println(replaceAll);


		Thread.sleep(5000);
		//select American tourister
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		Thread.sleep(5000);
		//Deal of the day color
		WebElement Colorofdeal = driver.findElement(By.xpath("(//span[text()='Limited time deal'])[1]"));
		String color = Colorofdeal.getCssValue("color");
		System.out.println(color);
		//deal driver.findElement(By.xpath("(//span[text()='Zipline'])[1]")).cl
		//select poland
		//driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		//printing number entries comaparing peding 
		String Total1 = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small']/child::span)[1]")).getText();
		System.out.println(Total1);
		String replaceAll1 = Total1.replaceAll("\\D","");
		System.out.println(replaceAll1);
		//compare previous results and current results 
		if(Integer.parseInt(Total1)< Integer.parseInt(Total))
		{System.out.println("results have got reduced after filter");
		}
		//select sortby
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Sort by:']/parent::span")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Newest Arrivals")).click();
		//Find first items name and price
String findElement = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base'][1]")).getText();
System.out.println(findElement);
String text = driver.findElement(By.className("a-price-whole")).getText();
System.out.println(text);

//click on first element
driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal'][1]/parent::a")).click();
//Check price on redirected page
String text1 = driver.findElement(By.className("a-price-whole")).getText();
System.out.println(text1);
//Verify Price 1 and price 2 are same 
if(text.equals(text1))
{System.out.println("Equals");
}
else {System.out.println("Not equals");}
//screenshot
File source = driver.getScreenshotAs(OutputType.FILE);
File dest =new File("amazon1.png");
FileUtils.copyFile(source, dest);
	}
}
