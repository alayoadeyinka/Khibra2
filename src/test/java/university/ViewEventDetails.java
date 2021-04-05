 package university;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static org.hamcrest.CoreMatchers.*;
import static org.testng.Assert.assertEquals;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;

import utils.UniversityUtility;
import utils.log;
import utils.utility;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.io.FileNotFoundException;
 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class ViewEventDetails extends UniversityUtility{
	 
		
	@BeforeMethod
    public void setUp1() throws Exception {
	  log.info("START=UniversityViewEventDetails--------------------------------------------------------------");

	  UniversityUtilityclass();
    
    	
    		
}
	
	
	  @SuppressWarnings("rawtypes")
	@Test
	
	public void testViewEventDetails() throws Exception {
	     
try{
 
			  
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(objectrepo.getProperty("MenuDropdown"))).click(); 
			  log.info("Menu Dropdown Available");
			   Thread.sleep(2000);
	  driver.findElement(By.xpath(objectrepo.getProperty("EventsHubMenuDropdown"))).click();	 
			  log.info("EventsHubMenu Button Clicked ");
	     Thread.sleep(4000);
	     
	     driver.findElement(By.xpath(objectrepo.getProperty("ScheduledEventTab"))).click();	 
		  log.info("Scheduled Event Tab Selected ");
    Thread.sleep(2000);
	     
    driver.findElement(By.xpath(objectrepo.getProperty("UpcomingEventTab"))).click();	 
	  log.info("Upcoming EventTab Selected ");
Thread.sleep(2000);
driver.findElement(By.xpath(objectrepo.getProperty("VirtualText"))); 
driver.findElement(By.xpath(objectrepo.getProperty("ViewEventTitle"))); 
driver.findElement(By.xpath(objectrepo.getProperty("ViewEventTime")));

log.info("Event Dates, Title and Time Validated ");

driver.findElement(By.xpath(objectrepo.getProperty("ViewEventTitle"))).click();
Thread.sleep(2000);

driver.findElement(By.xpath(objectrepo.getProperty("BackButton"))); 
driver.findElement(By.xpath(objectrepo.getProperty("VirtualText")));
driver.findElement(By.xpath(objectrepo.getProperty("VVEventTitle"))); 
 
driver.findElement(By.xpath(objectrepo.getProperty("OrganizedBy"))); 
driver.findElement(By.xpath(objectrepo.getProperty("OrganizedTime")));
driver.findElement(By.xpath(objectrepo.getProperty("EventsOverview"))).click();
Thread.sleep(2000);


  
driver.findElement(By.xpath(objectrepo.getProperty("InviteEventButton")));

driver.findElement(By.xpath(objectrepo.getProperty("EditEventButton")));
log.info("Event Overivew Page Validated  ");




if(!driver.findElements(By.xpath("//a[contains(.,'RSVPs')]")).isEmpty()){
	  
	driver.findElement(By.xpath(objectrepo.getProperty("EventRSVPTab"))).click();
	Thread.sleep(2000);
	log.info("RSVP TAB clicked  ");

	driver.findElement(By.xpath(objectrepo.getProperty("SearchEventRSVP")));
	driver.findElement(By.xpath(objectrepo.getProperty("InterestedEmployers")));
	driver.findElement(By.xpath(objectrepo.getProperty("EventStudentandAlumni")));
	driver.findElement(By.xpath(objectrepo.getProperty("AllButton")));
	driver.findElement(By.xpath(objectrepo.getProperty("PendingButton")));
	driver.findElement(By.xpath(objectrepo.getProperty("GoingButton")));
	driver.findElement(By.xpath(objectrepo.getProperty("RequestedButton")));
	driver.findElement(By.xpath(objectrepo.getProperty("RejectedButton")));
	log.info("RSVP Page elemenets validated  ");
		 
		  
		 
	}else{
		 log.info("No RSVP Section "); 
		 
	}



driver.findElement(By.xpath(objectrepo.getProperty("EventSessionsTab"))).click();
Thread.sleep(2000);
log.info("Sessions TAB Clicked ");

driver.findElement(By.xpath(objectrepo.getProperty("MySessions")));
driver.findElement(By.xpath(objectrepo.getProperty("EmployersSession")));


driver.findElement(By.xpath(objectrepo.getProperty("MySessions"))).click();
driver.findElement(By.xpath(objectrepo.getProperty("EventDay1")));
driver.findElement(By.xpath(objectrepo.getProperty("MySessionHeader")));

driver.findElement(By.xpath(objectrepo.getProperty("EventSessionsTab"))).click();
Thread.sleep(2000);

driver.findElement(By.xpath(objectrepo.getProperty("EmployersSession"))).click();


driver.findElement(By.xpath(objectrepo.getProperty("EmployersSessionHeader")));

log.info("Event Sessions Page Validated  ");

driver.findElement(By.xpath(objectrepo.getProperty("EventAnalyticsTab"))).click();
log.info("Analytics TAB clicked  ");





			    log.info("End TEST-------------------------- ViewEventDetails------------------------");     
	    
			    log.info("END=PASSED");
			 	   

					  } 
				  
						  catch (Exception e) {
							  log.info("END=FAILED");
							  AssertJUnit.fail(e.getMessage());
							  
						}
				  
					  }
      

 
      

 
  
  
  
  @AfterMethod //AfterMethod annotation - This method executes after every test execution
  public void screenShot(ITestResult result){
  //using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
  if(ITestResult.FAILURE==result.getStatus()){
  try{
  // To create reference of TakesScreenshot
  TakesScreenshot screenshot=(TakesScreenshot)driver;
  // Call method to capture screenshot
  File src=screenshot.getScreenshotAs(OutputType.FILE);
  // Copy files to specific location 
  // result.getName() will return name of test case so that screenshot name will be same as test case name
  FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"/screenshots/"+result.getName()+new SimpleDateFormat("yyyyMMddhhmm").format(new Date())+".jpg"));

  System.out.println("Successfully captured a screenshot");
  }catch (Exception e){
  System.out.println("Exception while taking screenshot "+e.getMessage());
  } 
  }
  driver.quit();
  }
  
  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }
  
  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	   
 
  
}
