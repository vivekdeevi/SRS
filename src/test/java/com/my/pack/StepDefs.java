package com.my.pack;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefs {

	public static WebDriver driver;
	public Scenario s;

	@Before
	public void method(Scenario x) {
		this.s = x;
	}

	@Given("^launch amazon site$")
	public void method1() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		s.write("application launched");
	}

	@Then("^username is \"(.*)\" and password is \"(.*)\"$")
	public void method2(String uname, String pass) {
		
			try {
				driver.findElement(By.xpath("//*[text()='Hello. Sign in']")).click();

				driver.findElement(By.id("ap_email")).sendKeys(uname);
				driver.findElement(By.id("ap_passwordd")).sendKeys(pass);
				driver.findElement(By.id("signInSubmit")).click();
				s.write("logged into amzon application");
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		
	}

	@Then("^search for product \"([^\"]*)\"$")
	public void search_for_product(String arg1) throws Throwable {

		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys(arg1, Keys.ENTER);

		driver.findElement(By.xpath("//*[@id='result_0']/descendant::a[1]")).click();

		ArrayList<String> a = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(a.get(1));
		
        //clicking buy option and select address
		driver.findElement(By.xpath("//*[@id='buy-now-button']")).click();

		driver.findElement(By.xpath("//*[@id='address-book-entry-0']/div[2]/span/a")).click();
        
		//Check cash on delivery option is availble or not
		WebElement button = driver.findElement(By.xpath("//*[@value='cashOnDeliveryCash']"));
		if (button.isEnabled()) {
			System.out.println("the button is enabled");
		} else {
			System.out.println("cash on delivery option is disabled for " + arg1);
			s.write("cash on delivery option is disabled for " + arg1);
		}

	}

	@And("^close browser$")
	public void close_browser() {
		try {
			driver.quit();
			s.write("browser has been closed");
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}

}
