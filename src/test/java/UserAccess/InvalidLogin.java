 package UserAccess;

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
 
public class InvalidLogin extends utility{
	 
		
	 
	
	 @BeforeMethod
	    public void setUp1() throws Exception {
		  log.info("START=InvalidLogin--------------------------------------------------------------");

	    	utilityclass();
	    
	    	
	    		
}
	  @SuppressWarnings("rawtypes")
	@Test
	
	public void testInvalidLogin() throws Exception {
		  
		  try{
		  String filePath = System.getProperty("user.dir");
	 	  FileInputStream fis = new FileInputStream(filePath+"/config/Testdata.xlsx");
   
		    XSSFWorkbook workbook = new XSSFWorkbook(fis); 
			  
			  XSSFSheet sheets = workbook.getSheet("Credentials");
			  
			  
			  Row invalidEmail = sheets.getRow(1);
			  Cell cell1 = invalidEmail.getCell(1);
			  String InvalidEmail  = cell1.getStringCellValue();
			  
			  Row invalidPass = sheets.getRow(2);
			  Cell cell2 = invalidPass.getCell(1);
			  String InvalidPass  = cell2.getStringCellValue();
			  
			  
			  Row wrongEmail = sheets.getRow(3);
			  Cell cell3 = wrongEmail.getCell(1);
			  String WrongEmail  = cell3.getStringCellValue();
			  
			  
			  Row wrongPass= sheets.getRow(4);
			  Cell cell4 = wrongPass.getCell(1);
			  String WrongPass  = cell4.getStringCellValue();
			  
			 
		 
		    driver.findElement(By.xpath(objectrepo.getProperty("LoginButton"))).click();
		     
		    log.info("Login Button Clicked without entering any details  ");
		     
		    Thread.sleep(2000);
		    driver.findElement(By.xpath(objectrepo.getProperty("EmptyEmailAlert")));
		    driver.findElement(By.xpath(objectrepo.getProperty("EmptyPasswordAlert")));
		    Thread.sleep(2000);
		    log.info("Appopraite Error message displayed  ");
		    
  driver.findElement(By.xpath(objectrepo.getProperty("LoginEmailTextBox"))).sendKeys(InvalidEmail);
  driver.findElement(By.xpath(objectrepo.getProperty("LoginPasswordTextBox"))).sendKeys(InvalidPass);
  Thread.sleep(2000);
  log.info("Invalid Email and Password entered   ");
  driver.findElement(By.xpath(objectrepo.getProperty("InvalidEmailAlert")));
  driver.findElement(By.xpath(objectrepo.getProperty("InvalidPasswordAlert")));
  Thread.sleep(2000);
  log.info("Appopraite Error message displayed  ");
  
   
  driver.findElement(By.xpath(objectrepo.getProperty("LoginEmailTextBox"))).clear();
  driver.findElement(By.xpath(objectrepo.getProperty("LoginPasswordTextBox"))).clear();
  Thread.sleep(2000);
  driver.findElement(By.xpath(objectrepo.getProperty("LoginEmailTextBox"))).sendKeys(WrongEmail);
  driver.findElement(By.xpath(objectrepo.getProperty("LoginPasswordTextBox"))).sendKeys(WrongPass);
  Thread.sleep(2000);
  driver.findElement(By.xpath(objectrepo.getProperty("LoginButton"))).click();
  Thread.sleep(2000);
  driver.findElement(By.xpath(objectrepo.getProperty("WrongSignInAlert")));

  log.info("All error message validated for invalid login  ");

		    
 log.info("End TEST-------------------------- Invalid Login------------------------");     
 
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
