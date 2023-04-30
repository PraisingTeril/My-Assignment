package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demosalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	Thread.sleep(1000);
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Praising");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Teril");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("PT");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Testing");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("A team leader provides guidance and instruction to a working group about a project or portfolio of projects.");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("praisingteril@gmail.com");
	driver.findElement(By.name("submitButton")).click();
	String title = driver.getTitle();
	System.out.println(title);
	
	}

}
