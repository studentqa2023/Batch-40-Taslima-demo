package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


import com.pagefactory.MasterPageFactory;


public class LoginTest {

	MasterPageFactory mpf;
 
	
	public void getLogin() {
		
		WebDriverManager.chromedriver().setup();
		
	WebDriver driver = new ChromeDriver();

	//driver.manage().window().maximize();

	//driver.get("https://www.automationexercise.com/");

	//driver.navigate();
	driver.navigate().to("https://www.automationexercise.com/");


	driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();



	driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("rezwanislam857@gmail.com");



	 driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Boston2023");
	 
	 driver.findElement(By.xpath("(//button[@class='btn btn-default'])[1]")).click();

	 if(driver.findElement(By.xpath("//*[contains(text(),'Logout')]")).isDisplayed()){
	System.out.println("Login Success");	 
	 }
	else {
	 
	System.out.println("Login Failed"); 
	}

		}

}
