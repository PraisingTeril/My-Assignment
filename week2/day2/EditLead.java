package week2.day2;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Praising");
		driver.findElement(By.id("ext-gen334")).click();
		driver.findElement(By.xpath("//a[text()='10509']")).click();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TestLeaf - Software Solutions");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
		System.out.println(text);
		
		if (text.contains("Software")){
			System.out.println("Name Changed");
		}
		else {
			System.out.println("Name Doesn't Changed");
			}
		Thread.sleep(5000);
		driver.close();
		}
	}


