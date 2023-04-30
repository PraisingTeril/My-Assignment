import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContact {

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
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Praising");
		driver.findElement(By.id("lastNameField")).sendKeys("Teril");
		driver.findElement(By.name("submitButton")).click();
		String fname = driver.findElement(By.id("viewContact_firstName_sp")).getText();
		System.out.println(fname);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(4000);
		driver.close();
	}

}
