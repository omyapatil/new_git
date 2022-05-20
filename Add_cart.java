package com;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_cart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\mindsdet140\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.urbanladder.com");
		 
		driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
		driver.findElement(By.xpath("//a[@class='login-link authentication_popup']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@id='spree_user_email'])[2]")).click();
		driver.findElement(By.xpath("(//input[@id='spree_user_email'])[2]")).sendKeys("omkarpatil7173@gmail.com");
		driver.findElement(By.xpath("(//input[@id='spree_user_password'])[3]")).click();
		driver.findElement(By.xpath("(//input[@id='spree_user_password'])[3]")).sendKeys("Omkar@1999");
		driver.findElement(By.xpath("//input[@id='ul_site_login']")).click();
		
		driver.findElement(By.xpath("(//a[@class='category'])[11]")).click();
		driver.findElement(By.xpath("//img[@alt='Study Tables Design']")).click();
		Thread.sleep(3000);
		
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTab.get(1));
		
		driver.findElement(By.xpath("(//div[@class='product_brand_name'])[3]")).click(); 
		Thread.sleep(3000);
		
		ArrayList<String> newTab1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTab1.get(2));
	
		driver.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();
		driver.findElement(By.xpath("//a[@class='link-color']")).click();
		driver.findElement(By.xpath("//input[@class='user-pincode']")).clear();
		driver.findElement(By.xpath("//input[@class='user-pincode']")).sendKeys("560057");
		driver.findElement(By.xpath("//button[@class='primary action-button btn-sm']")).click();
		driver.findElement(By.xpath("(//button[@name='checkout'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("order_ship_address_attributes_zipcode")).click();
		driver.findElement(By.id("order_ship_address_attributes_zipcode")).sendKeys("411002",Keys.TAB);
		driver.findElement(By.xpath("(//textarea[@placeholder='Address'])[1]")).clear();
		driver.findElement(By.xpath("(//textarea[@placeholder='Address'])[1]")).sendKeys("Pune,Maharashtra");
		driver.findElement(By.id("order_ship_address_attributes_firstname")).clear();
		driver.findElement(By.id("order_ship_address_attributes_firstname")).sendKeys("Omkar",Keys.TAB);
		driver.findElement(By.id("order_ship_address_attributes_lastname")).sendKeys(Keys.CLEAR,"Zambare",Keys.TAB);
		driver.findElement(By.id("order_ship_address_attributes_phone")).sendKeys("9075407173");
		driver.findElement(By.id("address-form-submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='text'])[1]")).click();
		driver.findElement(By.xpath("//a[@class='continueshop']")).click();
		driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
		driver.findElement(By.xpath("//a[@id='logout']")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}

}