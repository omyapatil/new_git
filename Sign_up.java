package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sign_up {

public static void main(String[] args) throws InterruptedException 
{
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","C:\\Users\\mindsdet140\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.urbanladder.com");
	
	driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
	driver.findElement(By.xpath("//a[@class='signup-link authentication_popup']")).click();
	
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("#spree_user_email")).click();
	driver.findElement(By.cssSelector("#spree_user_email")).sendKeys("omkarpatil7173@gmail.com");
	driver.findElement(By.xpath("(//input[@id='spree_user_password'])[2]")).click();
	driver.findElement(By.xpath("(//input[@id='spree_user_password'])[2]")).sendKeys("omkar@1999");
	
	driver.findElement(By.xpath("(//input[@name='commit'])[2]")).click();
	Thread.sleep(2000);
	driver.close();
}

}
