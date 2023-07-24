package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bismi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Benny");
		
		WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropDown=new Select(source);
		dropDown.selectByVisibleText("Employee");
		
		WebElement MarketCampaign=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marktdd=new Select(MarketCampaign);
		marktdd.selectByValue("9001");
		
		WebElement ownership=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownershipdd=new Select(ownership);
		ownershipdd.selectByIndex(5);
		
		WebElement country=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select countrydd=new Select(country);
		countrydd.selectByVisibleText("India");
		
		driver.findElement(By.name("submitButton")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
	

	}

}
