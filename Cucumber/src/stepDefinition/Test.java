package stepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import Methods.Generic;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test {
public static WebDriver driver;
	
	Generic ge = new Generic();
	
	@Given("^values on the screen$") 
		public void HomePage() throws Throwable {
			driver = new FirefoxDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://www.mocks.com/example1");
	}

	@When("^User Navigate to screen$") 
		public void title() throws Throwable {
		Assert.assertEquals( driver.getTitle(), "Title of the Screen" ); 
	}

	@And("^right number of values appear$") 
		public void valuesappear() throws Throwable {
		Assert.assertEquals( driver.findElement(By.id(ge.problem_getPropertyvalue("value1"))).getText(), "$122,365.24" );
		Assert.assertEquals( driver.findElement(By.id(ge.problem_getPropertyvalue("value2"))).getText(), "$599.00" ); 
		Assert.assertEquals( driver.findElement(By.id(ge.problem_getPropertyvalue("value3"))).getText(), "$850,139.99" ); 
		Assert.assertEquals( driver.findElement(By.id(ge.problem_getPropertyvalue("value4"))).getText(), "$23,329.50" ); 
		Assert.assertEquals( driver.findElement(By.id(ge.problem_getPropertyvalue("value5"))).getText(), "$566.27" ); 
		
	}

	@Then("^values are verified$")
		public void valuesverify() throws Throwable {
		
		if (driver.findElement(By.id(ge.problem_getPropertyvalue("value1"))).getText().isEmpty()) {
			Assert.assertEquals( driver.findElement(By.id(ge.problem_getPropertyvalue("value1"))).getText(), "$122,365.24" );
			Assert.assertEquals( driver.findElement(By.id(ge.problem_getPropertyvalue("value2"))).getText(), "$599.00" ); 
			Assert.assertEquals( driver.findElement(By.id(ge.problem_getPropertyvalue("value3"))).getText(), "$850,139.99" ); 
			Assert.assertEquals( driver.findElement(By.id(ge.problem_getPropertyvalue("value4"))).getText(), "$23,329.50" ); 
			Assert.assertEquals( driver.findElement(By.id(ge.problem_getPropertyvalue("value5"))).getText(), "$566.27" ); 
		} else {
			System.out.println("Values are not matching");
		}
	}

	
	@Given("^values on the screen$") 
	public void HomePage1() throws Throwable {
		driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.mocks.com/example1");
}

	@When("^User Navigate to screen$") 
	public void title1() throws Throwable {
	Assert.assertEquals( driver.getTitle(), "Title of the Screen" ); 
}

			
	@And("^values greater than 0$") 
	public void greater() throws Throwable {
	Assert.assertTrue(Integer.parseInt(driver.findElement(By.id(ge.problem_getPropertyvalue("value1"))).getText())>0 );
	Assert.assertTrue(Integer.parseInt(driver.findElement(By.id(ge.problem_getPropertyvalue("value2"))).getText())>0 );
	Assert.assertTrue(Integer.parseInt(driver.findElement(By.id(ge.problem_getPropertyvalue("value3"))).getText())>0 );
	Assert.assertTrue(Integer.parseInt(driver.findElement(By.id(ge.problem_getPropertyvalue("value4"))).getText())>0 );
	Assert.assertTrue(Integer.parseInt(driver.findElement(By.id(ge.problem_getPropertyvalue("value5"))).getText())>0 );
}

	@Then("^values are verified$")
	public void valuesverify1() throws Throwable {
	
	if (driver.findElement(By.id(ge.problem_getPropertyvalue("value1"))).getText().isEmpty()) {
		Assert.assertEquals( driver.findElement(By.id(ge.problem_getPropertyvalue("value1"))).getText(), "$122,365.24" );
		Assert.assertEquals( driver.findElement(By.id(ge.problem_getPropertyvalue("value2"))).getText(), "$599.00" ); 
		Assert.assertEquals( driver.findElement(By.id(ge.problem_getPropertyvalue("value3"))).getText(), "$850,139.99" ); 
		Assert.assertEquals( driver.findElement(By.id(ge.problem_getPropertyvalue("value4"))).getText(), "$23,329.50" ); 
		Assert.assertEquals( driver.findElement(By.id(ge.problem_getPropertyvalue("value5"))).getText(), "$566.27" ); 
	} else {
		System.out.println("Values are not matching");
	}
}
	


	@Given("^values on the screen$") 
	public void HomePage2() throws Throwable {
		driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.mocks.com/example1");
}

	@When("^User Navigate to screen$") 
	public void title2() throws Throwable {
	Assert.assertEquals( driver.getTitle(), "Title of the Screen" ); 
}

	
	@And("^values are formatted as currencies$") 
	public void formatted() throws Throwable {
	Assert.assertTrue( driver.findElement(By.id(ge.problem_getPropertyvalue("value1"))).getText().contains("$") );
	Assert.assertTrue( driver.findElement(By.id(ge.problem_getPropertyvalue("value2"))).getText().contains("$") );
	Assert.assertTrue( driver.findElement(By.id(ge.problem_getPropertyvalue("value3"))).getText().contains("$") );
	Assert.assertTrue( driver.findElement(By.id(ge.problem_getPropertyvalue("value4"))).getText().contains("$") );
	Assert.assertTrue( driver.findElement(By.id(ge.problem_getPropertyvalue("value5"))).getText().contains("$") );
}
	
	@Then("^values are verified$")
	public void valuesverify2() throws Throwable {
	
	if (driver.findElement(By.id(ge.problem_getPropertyvalue("value1"))).getText().isEmpty()) {
		Assert.assertEquals( driver.findElement(By.id(ge.problem_getPropertyvalue("value1"))).getText(), "$122,365.24" );
		Assert.assertEquals( driver.findElement(By.id(ge.problem_getPropertyvalue("value2"))).getText(), "$599.00" ); 
		Assert.assertEquals( driver.findElement(By.id(ge.problem_getPropertyvalue("value3"))).getText(), "$850,139.99" ); 
		Assert.assertEquals( driver.findElement(By.id(ge.problem_getPropertyvalue("value4"))).getText(), "$23,329.50" ); 
		Assert.assertEquals( driver.findElement(By.id(ge.problem_getPropertyvalue("value5"))).getText(), "$566.27" ); 
	} else {
		System.out.println("Values are not matching");
	}
}
	

	@Given("^values on the screen$") 
	public void HomePage3() throws Throwable {
		driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.mocks.com/example1");
}

	@When("^User Navigate to screen$") 
	public void title3() throws Throwable {
	Assert.assertEquals( driver.getTitle(), "Title of the Screen" ); 
}
	
	@And("^total balance matches sum of values$") 
	public void balance() throws Throwable {
	int	v1 = Integer.parseInt(driver.findElement(By.id(ge.problem_getPropertyvalue("value1"))).getText());
	int	v2 = Integer.parseInt(driver.findElement(By.id(ge.problem_getPropertyvalue("value2"))).getText());
	int	v3 = Integer.parseInt(driver.findElement(By.id(ge.problem_getPropertyvalue("value3"))).getText());
	int	v4 = Integer.parseInt(driver.findElement(By.id(ge.problem_getPropertyvalue("value4"))).getText());
	int	v5 = Integer.parseInt(driver.findElement(By.id(ge.problem_getPropertyvalue("value5"))).getText());
		int total = v1+v2+v3+v4+v5;
	Assert.assertEquals( Integer.parseInt(driver.findElement(By.id(ge.problem_getPropertyvalue("total"))).getText()), total ); 
}
	
	
	@Then("^total balance is verified$")
	public void valuesverify3() throws Throwable {
	
	if (driver.findElement(By.id(ge.problem_getPropertyvalue("value1"))).getText().isEmpty()) {
		int	v1 = Integer.parseInt(driver.findElement(By.id(ge.problem_getPropertyvalue("value1"))).getText());
		int	v2 = Integer.parseInt(driver.findElement(By.id(ge.problem_getPropertyvalue("value2"))).getText());
		int	v3 = Integer.parseInt(driver.findElement(By.id(ge.problem_getPropertyvalue("value3"))).getText());
		int	v4 = Integer.parseInt(driver.findElement(By.id(ge.problem_getPropertyvalue("value4"))).getText());
		int	v5 = Integer.parseInt(driver.findElement(By.id(ge.problem_getPropertyvalue("value5"))).getText());
			int total = v1+v2+v3+v4+v5;
		Assert.assertEquals( driver.findElement(By.id(ge.problem_getPropertyvalue("value1"))).getText(), "$122,365.24" );
		Assert.assertEquals( driver.findElement(By.id(ge.problem_getPropertyvalue("value2"))).getText(), "$599.00" ); 
		Assert.assertEquals( driver.findElement(By.id(ge.problem_getPropertyvalue("value3"))).getText(), "$850,139.99" ); 
		Assert.assertEquals( driver.findElement(By.id(ge.problem_getPropertyvalue("value4"))).getText(), "$23,329.50" ); 
		Assert.assertEquals( driver.findElement(By.id(ge.problem_getPropertyvalue("value5"))).getText(), "$566.27" );
		Assert.assertEquals( Integer.parseInt(driver.findElement(By.id(ge.problem_getPropertyvalue("total"))).getText()), total );
	} else {
		System.out.println("Total Balance Values are not matching with the sum of the values on the screen");
	}
	}
	
	@Given("^values on the screen$") 
	public void HomePage4() throws Throwable {
		driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.mocks.com/example1");
}

	@When("^User Navigate to screen$") 
	public void title4() throws Throwable {
	Assert.assertEquals( driver.getTitle(), "Title of the Screen" ); 
}
	
	@Then("^results are displayed$")
	public void output() throws Throwable {
	
	if (1==2) {
		System.out.println("Output the results");
		System.out.println("The Value 1 on the page" +driver.findElement(By.id(ge.problem_getPropertyvalue("value1"))).getText());
		System.out.println("The Value 2 on the page" +driver.findElement(By.id(ge.problem_getPropertyvalue("value2"))).getText());
		System.out.println("The Value 3 on the page" +driver.findElement(By.id(ge.problem_getPropertyvalue("value3"))).getText());
		System.out.println("The Value 4 on the page" +driver.findElement(By.id(ge.problem_getPropertyvalue("value4"))).getText());
		System.out.println("The Value 5 on the page" +driver.findElement(By.id(ge.problem_getPropertyvalue("value5"))).getText());
		System.out.println("The Total Balance on the page" +driver.findElement(By.id(ge.problem_getPropertyvalue("total"))).getText());
		
	} else {
		System.out.println("Values are not displayed");
	}
	}
		
}