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
 
public class UniversityDashboard extends UniversityUtility{
	 
		
	@BeforeMethod
    public void setUp1() throws Exception {
	  log.info("START=UniversityDashboard--------------------------------------------------------------");

	  UniversityUtilityclass();
    
    	
    		
}
	
	
	  @SuppressWarnings("rawtypes")
	@Test
	
	public void testUniversityDashboard() throws Exception {
	     
try{
			  
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(objectrepo.getProperty("MenuDropdown")));	 
			  log.info("Menu Dropdown Available");
			  driver.findElement(By.xpath(objectrepo.getProperty("UniDashboardMenu"))).click();	 
			  log.info("Dashboard Button Clicked ");
	     Thread.sleep(2000);
 
			  driver.findElement(By.xpath(objectrepo.getProperty("DashboardHeader")));	 
			  driver.findElement(By.xpath(objectrepo.getProperty("AlumniLabel")));	 
			  driver.findElement(By.xpath(objectrepo.getProperty("EnrolledIcon")));	 
			  driver.findElement(By.xpath(objectrepo.getProperty("InterviewedIcon")));	 
			  driver.findElement(By.xpath(objectrepo.getProperty("HiredIcon")));	 
			  driver.findElement(By.xpath(objectrepo.getProperty("EnrolledCount")));	
  String EnrolledCount=  driver.findElement(By.xpath(objectrepo.getProperty("EnrolledCount"))).getText()  ;   
    	      log.info("Enrolled Count is ");
    	      log.info(EnrolledCount);
    	      Thread.sleep(1000);
			  
    	      
    	      
    	      
    	      driver.findElement(By.xpath(objectrepo.getProperty("EnrolledStudentsChart")));	
			  
			  driver.findElement(By.xpath(objectrepo.getProperty("EnrolledLabel")));	 

			  driver.findElement(By.xpath(objectrepo.getProperty("InterviewedCount")));	 
			  
			  String InterviewedCount=  driver.findElement(By.xpath(objectrepo.getProperty("InterviewedCount"))).getText()  ;   
    	      log.info("Interviewed Count is ");
    	      log.info(InterviewedCount);
    	      Thread.sleep(1000);
			  
			  
			  
			  
			  
			  driver.findElement(By.xpath(objectrepo.getProperty("IntervewedLabel")));	 
			  driver.findElement(By.xpath(objectrepo.getProperty("HiredCount")));	
			  String HiredCount=  driver.findElement(By.xpath(objectrepo.getProperty("HiredCount"))).getText()  ;   
    	      log.info("Hired Count is ");
    	      log.info(HiredCount);
    	      Thread.sleep(1000);
			  
			  
			  
			  driver.findElement(By.xpath(objectrepo.getProperty("HiredLabel")));	 

			  driver.findElement(By.xpath(objectrepo.getProperty("PerMonthDropdown")));	 
 			  
			  log.info("All Dashboard Elements Validated ");
			  
			  
			  
			 
			  
				 



			    log.info("End TEST-------------------------- UniversityDashboard------------------------");     
	    
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
