/**
 * 
 */
package Com.actitime.CreateCustomerTest;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * @author Asus-User
 *
 */
public class CreateCustomerTest {
	
	@Test
	public void CreateCustomerTest()
	{
		System.out.println("execute create customer");
	}
	
	@Test
	public void ModifyCustomerTest()
	{
		System.out.println("execute modify customer");
	}
	
	@Test
	public void DeleteCustomerTest()
	{
		System.out.println("execute delete customer");
		
	WebDriver driver=new FirefoxDriver();
	driver.get("http://gmail.com");
	driver.close();
		
		
	}
	
	
	
	

}
