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
 
public class StudentSignUpwithCID extends utility{
	 
		
	@BeforeMethod
    public void setUp1() throws Exception {
	  log.info("START=StudentSignUpwithCID--------------------------------------------------------------");

	  utilityclass();
    
    	
    		
}
	
	
	  @SuppressWarnings("rawtypes")
	@Test
	
	public void testStudentSignUpwithCID() throws Exception {
	     
		  try{
			  
			  
			  String filePath = System.getProperty("user.dir");
		 	  FileInputStream fis = new FileInputStream(filePath+"/config/Testdata.xlsx");
	   
			    XSSFWorkbook workbook = new XSSFWorkbook(fis); 
				  
				  XSSFSheet sheets = workbook.getSheet("SignUp");
				  
				  
				  Row fname = sheets.getRow(1);
				  Cell cell1 = fname.getCell(1);
				  String Fname  = cell1.getStringCellValue();
				  
				  Row mname = sheets.getRow(13);
				  Cell cell2 = mname.getCell(1);
				  String Mname  = cell2.getStringCellValue();
				  
				  Row lname = sheets.getRow(2);
				  Cell cell3 = lname.getCell(1);
				  String Lname  = cell3.getStringCellValue();
				  
				  Row dob = sheets.getRow(14);
				  Cell cell4 = dob.getCell(1);
				  String DOB  = cell4.getStringCellValue();
				  
				  Row uniname = sheets.getRow(12);
				  Cell cell5 = uniname.getCell(1);
				  String Uniname  = cell5.getStringCellValue();
				  
				  Row wrongcivil = sheets.getRow(16);
				  Cell cell6 = wrongcivil.getCell(1);
				  String Wrongcivil  = cell6.getStringCellValue();
				  
				  Row civil = sheets.getRow(15);
				  Cell cell7 = civil.getCell(1);
				  String Civil  = cell7.getStringCellValue();
				  
				  Row email = sheets.getRow(17);
				  Cell cell8 = email.getCell(1);
				  String Email  = cell8.getStringCellValue();
				  
				  Row password = sheets.getRow(18);
				  Cell cell9 = password.getCell(1);
				  String Password  = cell9.getStringCellValue();
				  
				  Row studID = sheets.getRow(19);
				  Cell cell10 = studID.getCell(1);
				  String StudID  = cell10.getStringCellValue();
				  
				  
				  
				  Thread.sleep(2000);
				  driver.findElement(By.xpath(objectrepo.getProperty("SignUpButton"))).click();	 
				  log.info("SignUp Button Clicked ");
				  Thread.sleep(2000);
	   driver.findElement(By.xpath(objectrepo.getProperty("Percentagecomplete1")));	 

				  
				  
		  driver.findElement(By.xpath(objectrepo.getProperty("FirstNameTextbox"))).sendKeys(Fname);	 
		  driver.findElement(By.xpath(objectrepo.getProperty("MiddleNameTextbox"))).sendKeys(Mname);	 
		  driver.findElement(By.xpath(objectrepo.getProperty("LastNameTextbox"))).sendKeys(Lname);	 
		  driver.findElement(By.xpath(objectrepo.getProperty("DOBTextbox"))).sendKeys(DOB);	 

				  
		  WebElement t=driver.findElement(By.xpath(objectrepo.getProperty("GenderDropdown")));
	      //Select class for dropdown
	      Select select = new Select(t);
	      // select an item with text visible
	      select.selectByVisibleText("Male");
 
  driver.findElement(By.xpath(objectrepo.getProperty("NextButton"))).click();	 
		 Thread.sleep(2000);
	 log.info("First Name , Last Name, DOB , Gender Entered and Next Button Clicked ");
	 
	  driver.findElement(By.xpath(objectrepo.getProperty("Percentagecomplete2"))).click();	
	  log.info("Page 2 Opened ");
	 driver.findElement(By.xpath(objectrepo.getProperty("YesButton"))).click();	 
	 Thread.sleep(2000);
	 
driver.findElement(By.xpath(objectrepo.getProperty("UniversityNameTextbox"))).sendKeys(Uniname);	 
	 Thread.sleep(2000);	
	 driver.findElement(By.xpath(objectrepo.getProperty("DropFirstOption"))).click();	 
 	
	 	
	 driver.findElement(By.xpath(objectrepo.getProperty("SearchCivilIcon"))).click();	 
	 Thread.sleep(2000);
	 log.info("Search button clicked without entering civil id  ");
	 driver.findElement(By.xpath(objectrepo.getProperty("InvalidCivilError")));	 
	 Thread.sleep(2000);
	 log.info(" No Civil ID Found is displayed ");
	 driver.findElement(By.xpath(objectrepo.getProperty("CivilNumberTextBox"))).sendKeys(Wrongcivil);	 
	 Thread.sleep(2000);
	 
	 
	 driver.findElement(By.xpath(objectrepo.getProperty("SearchCivilIcon"))).click();	 
	 Thread.sleep(2000);
	 log.info("Wrong Civil Entered and Search button is clicked ");
	 driver.findElement(By.xpath(objectrepo.getProperty("InvalidCivilError")));	 
	 Thread.sleep(2000);
	 log.info(" No Civil ID Found is displayed ");
	 driver.findElement(By.xpath(objectrepo.getProperty("CivilNumberTextBox"))).clear();	 
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath(objectrepo.getProperty("CivilNumberTextBox"))).sendKeys(Civil);	 
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath(objectrepo.getProperty("SearchCivilIcon"))).click();	 
	 Thread.sleep(2000);
	 log.info("Right Civil Entered and Search button is clicked ");
	 driver.findElement(By.xpath(objectrepo.getProperty("CivilResultFound")));	 
	 Thread.sleep(2000);
	 
	 log.info(" Civil ID Found is displayed ");
	 driver.findElement(By.xpath(objectrepo.getProperty("NextButton"))).click();	 
	 Thread.sleep(2000);
	 log.info("Next Button Clicked ");

	 
	 driver.findElement(By.xpath(objectrepo.getProperty("UniEmailTextbox"))).sendKeys(Email);	 
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath(objectrepo.getProperty("UniPasswordTextbox"))).sendKeys(Password);	 
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath(objectrepo.getProperty("StudentIDNumberTextbox"))).sendKeys(StudID);	 
	 Thread.sleep(2000);
	 
	 
	  
	 driver.findElement(By.xpath(objectrepo.getProperty("CreateAccountButton"))).click();	 
	 Thread.sleep(2000);
	 log.info(" Uni Email, Password , ID and Create Account Button Clicked ");

	  
	 driver.findElement(By.xpath(objectrepo.getProperty("AlmostThereText")));	 
	 driver.findElement(By.xpath(objectrepo.getProperty("ConfirmationLinkText")));	 

	 driver.findElement(By.xpath(objectrepo.getProperty("ResendConfirmationLink")));	 

	 log.info(" Account Created Successfully and confirmation texts displayed ");
				  
				  
			    log.info("End TEST-------------------------- StudentSignUpwithCID------------------------");     
	    
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
