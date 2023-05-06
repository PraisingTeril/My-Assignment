package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class LearnDropdownBox {

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
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select option=new Select(source);
		option.selectByVisibleText("Employee");
		WebElement Marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select option2=new Select(Marketing);
		option2.selectByVisibleText("Automobile");
		WebElement Industry = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select option3=new Select(Industry);
		option3.selectByVisibleText("Corporation");
		Thread.sleep(1000);
		driver.findElement(By.name("submitButton")).click();
	}

}
