package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://en-gb.facebook.com/");
driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
driver.findElement(By.name("firstname")).sendKeys("Praising");
driver.findElement(By.name("lastname")).sendKeys("Teril");
driver.findElement(By.name("reg_email__")).sendKeys("8754325511");
driver.findElement(By.id("password_step_input")).sendKeys("Dge254@");

WebElement Date = driver.findElement(By.id("day"));
Select drop1=new Select(Date);
drop1.selectByVisibleText("29");

WebElement Month = driver.findElement(By.id("month"));
Select drop2=new Select(Month);
drop2.selectByValue("3");

WebElement Year = driver.findElement(By.id("year"));
Select drop3=new Select(Year);
drop3.selectByVisibleText("1994");

driver.findElement(By.xpath("//input[@value='2']")).click();
	}

}
