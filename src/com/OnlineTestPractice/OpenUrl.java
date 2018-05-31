package com.OnlineTestPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenUrl {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Chromedriverforselenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(30000);
		driver.get("https://www.ia.ca");

		driver.findElement(By.xpath("//*[@id='nav-secondaire']/div[1]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id='nav-secondaire']/div[1]/ul/li[4]/ul/li[1]/section/ul/li[1]/a")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// This will scroll down till the element is found
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		driver.findElement(By.xpath("//*[@id='main']/div[2]/div[4]/div[1]/div[2]/a")).click();

		WebElement dragElementFrom = driver.findElement(By.xpath("//*[@id='form_calculateur_versements']/div[2]/div/div[2]/div/div[1]/div[13]"));
		// To Move jQuery slider by 100 pixel offset using dragAndDropBy method
		// of Actions class.
		new Actions(driver).dragAndDropBy(dragElementFrom, 100, 0).build().perform();
		Thread.sleep(5000);

		// After 5 seconds, This will Move jQuery slider by 100 pixel offset
		// using the combination of clickAndHold, moveByOffset and release
		// methods of Actions class.
		new Actions(driver).clickAndHold(dragElementFrom).moveByOffset(100, 0).release().perform();
		
		
		
		
		WebElement dragElementFrom1 = driver.findElement(By.xpath("//*[@id='zone_mise_de_fonds']/div/div[2]/div/div[1]/div[15]"));
		// To Move jQuery slider by 100 pixel offset using dragAndDropBy method
		// of Actions class.
		new Actions(driver).dragAndDropBy(dragElementFrom1, 50, 0).build().perform();
		Thread.sleep(5000);

		// After 5 seconds, This will Move jQuery slider by 50 pixel offset
		// using the combination of clickAndHold, moveByOffset and release
		// methods of Actions class.
		new Actions(driver).clickAndHold(dragElementFrom1).moveByOffset(50, 0).release().perform();
		
		
		/*new Select(driver.findElement(By.xpath("//*[@id='form_calculateur_versements']/div[4]/div[1]/div/div[2]/span"))).selectByVisibleText("15 years");
		new Select(driver.findElement(By.xpath("//*[@id='form_calculateur_versements']/div[5]/div[2]/span"))).selectByVisibleText("weekly");*/
		
		// select value from span.
		WebElement errormsgforoldpass = driver.findElement(By.xpath("//*[@id='form_calculateur_versements']/div[4]/div[1]/div/div[2]/span"));
		WebElement errormsgforoldpass1 = driver.findElement(By.xpath("//*[@id='form_calculateur_versements']/div[5]/div[2]/span"));

		//Getting the text of the web element.    
		String erroldmsg = errormsgforoldpass.getText();
		String erroldmsg1 = errormsgforoldpass1.getText();

		//Printing the text of the web element.
		System.out.println("errormsg->"+erroldmsg);
		System.out.println("errormsg1->"+erroldmsg1);
		Thread.sleep(5000);
		
		
		//driver.findElement(By.xpath("//*[@id='TauxInteret']")).sendKeys("5%");
	    driver.findElement(By.xpath("//*[@id='btn_calculer']")).click();
	 driver.findElement(By.xpath("//*[@id='btn_calculer']")).click();
	 
	 driver.close();
}
}




