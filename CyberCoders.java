/*
 * Selenium Webdriver - Simple Project
 * Specifically designed for Jobs at CyberCoders
 * Designed and Developed by: Samuel Benison Email-(samuel.jeyarajvictor@mavs.uta.edu)
 */

package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CyberCoders {

	public static void main(String[] args) throws InterruptedException {
		
		// Open Firefox browser and maximize
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		// Load the company website
		driver.get("http://www.cybercoders.com/");
		Thread.sleep(5000);
		
		// Click on Jobs link in top left
		WebElement jobLink;
		jobLink = driver.findElement(By.linkText("Jobs"));
		jobLink.click();
		
		// Time to wait while loading
		Thread.sleep(5000);	
		
		// Action to search for interested job
		WebElement searchBox1, searchBox2;
		searchBox1 = driver.findElement(By.id("global-search-terms"));
		searchBox1.sendKeys("QA Automation Engineer");
		searchBox2 = driver.findElement(By.id("global-search-location"));
		searchBox2.sendKeys("San Diego, CA");
		searchBox2.submit();
		
		Thread.sleep(5000);
		
		// Action to open the specified job
		WebElement jobSeleniumLink;
		jobSeleniumLink = driver.findElement(By.linkText("QA Automation Test Engineer - Selenium"));
		jobSeleniumLink.click();
		
		Thread.sleep(5000);
		
		// Action to open the recruiter's page
		WebElement recruiterLink;
		recruiterLink = driver.findElement(By.linkText("Ben Stehle"));
		recruiterLink.click();
		
		Thread.sleep(5000);
		
		// Action to show more fun facts about the recruiter
		WebElement funFactsLink;
		funFactsLink = driver.findElement(By.linkText("Show more fun facts"));
		funFactsLink.click();
		
		Thread.sleep(11500);
		
		// To close the Firefox Browser
		driver.quit();

	}

}
