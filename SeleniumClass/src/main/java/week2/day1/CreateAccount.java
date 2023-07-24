package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@name='groupNameLocal']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Leaftaps");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("3000000000");
		
		WebElement industry=driver.findElement(By.name("industryEnumId"));
		Select industrydd=new Select(industry);
		industrydd.selectByIndex(3);
		
		WebElement ownership=driver.findElement(By.name("ownershipEnumId"));
		Select ownershipdd=new Select(ownership);
		ownershipdd.selectByVisibleText("S-Corporation");
		
		WebElement source=driver.findElement(By.name("dataSourceId"));
		Select sourcedd=new Select(source);
		sourcedd.selectByValue("LEAD_EMPLOYEE");
		
		WebElement Mrtcamp=driver.findElement(By.id("marketingCampaignId"));
		Select marktCampdd=new Select(Mrtcamp);
		marktCampdd.selectByIndex(6);
		
		WebElement state=driver.findElement(By.name("generalStateProvinceGeoId"));
		Select statedd=new Select(state);
		statedd.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Ignoring Duplicates')]")).click();
		driver.switchTo().alert().accept();
		String S=driver.getTitle();
		System.out.println(S);
		//driver.close();

	}

}
