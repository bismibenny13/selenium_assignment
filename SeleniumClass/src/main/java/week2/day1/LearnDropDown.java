package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

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
		
		//dropdown
		WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropDown=new Select(source);
		dropDown.selectByIndex(3);
		
		WebElement MarketCampaign=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marktdd=new Select(MarketCampaign);
		marktdd.selectByVisibleText("Automobile");
		
		WebElement ownership=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownershipdd=new Select(ownership);
		ownershipdd.selectByValue("OWN_CCORP");	
		
		WebElement industry=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industrydd=new Select(industry);
		industrydd.selectByIndex(6);
		
		WebElement currency=driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select currencydd=new Select(currency);
		currencydd.selectByValue("ALL");
		
		driver.findElement(By.name("submitButton")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
		

	}

	

}
