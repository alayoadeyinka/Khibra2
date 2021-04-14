 package students;

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

import utils.LoginUtility;
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
 
public class StudentChangePersonalInfo extends LoginUtility{
	 
		
	@BeforeMethod
    public void setUp1() throws Exception {
	  log.info("START=StudentChangePersonalInfo--------------------------------------------------------------");

	  Loginutilityclass();
    
    	
    		
}
	
	
	  @SuppressWarnings("rawtypes")
	@Test
	
	public void testStudentChangePersonalInfo() throws Exception {
	     try {
	    	 String filePath = System.getProperty("user.dir");
		 	  FileInputStream fis = new FileInputStream(filePath+"/config/Testdata.xlsx");
			    XSSFWorkbook workbook = new XSSFWorkbook(fis); 			  
				  XSSFSheet sheets = workbook.getSheet("Students");
	 	  
				  Row fname = sheets.getRow(3);
				  Cell cell1 = fname.getCell(1);
				  String Fname  = cell1.getStringCellValue();
				  
				  
				  Row mname = sheets.getRow(4);
				  Cell cell2 = mname.getCell(1);
				  String Mname  = cell2.getStringCellValue();
				  
				  Row lname = sheets.getRow(5);
				  Cell cell3 = lname.getCell(1);
				  String Lname  = cell3.getStringCellValue();
				  
				  Row dob = sheets.getRow(6);
				  Cell cell4 = dob.getCell(1);
				  String DOB  = cell4.getStringCellValue();
				  
				  
				  
				  
				  
	    	 
	    	  driver.findElement(By.xpath(objectrepo.getProperty("MenuDropdown"))).click();	 
			  log.info("Menu Dropdown Clicked");
			  driver.findElement(By.xpath(objectrepo.getProperty("MyAccountMenu"))).click();	 
			  log.info("My Account Selected");
			  
			  driver.findElement(By.xpath(objectrepo.getProperty("MyAccountHeader")));
			 
			 
			  driver.findElement(By.xpath(objectrepo.getProperty("AccountPersonalInfoTab"))).click();
              Thread.sleep(2000);
			  driver.findElement(By.xpath(objectrepo.getProperty("AccountFnameBox"))).clear();
			  driver.findElement(By.xpath(objectrepo.getProperty("AccountFnameBox"))).sendKeys(Fname);
			  
			  driver.findElement(By.xpath(objectrepo.getProperty("AccountMnameBox"))).clear();
			  driver.findElement(By.xpath(objectrepo.getProperty("AccountMnameBox"))).sendKeys(Mname);
			 
			  driver.findElement(By.xpath(objectrepo.getProperty("AccountLnameBox"))).clear();
			  driver.findElement(By.xpath(objectrepo.getProperty("AccountLnameBox"))).sendKeys(Lname);
			  
			  driver.findElement(By.xpath(objectrepo.getProperty("AccountDOBBox"))).clear();
			  driver.findElement(By.xpath(objectrepo.getProperty("AccountDOBBox"))).sendKeys(DOB);
			  
			  
		   driver.findElement(By.xpath(objectrepo.getProperty("AccountGenderDrop"))).click();
		   driver.findElement(By.xpath(objectrepo.getProperty("SaveButton"))).click();
	    Thread.sleep(2000);
	   driver.findElement(By.xpath(objectrepo.getProperty("PersonalInfoSuccessMessage")));

			  

			  log.info("personal Details changed and updated successfully");

		 
					 
			  
			  
			  
			  
			    log.info("End TEST-------------------------- StudentChangePersonalInfo------------------------");     
	    
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
