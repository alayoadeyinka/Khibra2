 package company;

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

import utils.EmployerUtility;
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
 
public class EmpUpdateSocialMediaProfile extends EmployerUtility{
	 
		
	@BeforeMethod
    public void setUp1() throws Exception {
	  log.info("START=EmpUpdateSocialMediaProfile--------------------------------------------------------------");

	  EmployerUtilityclass();
    
    	
    		
}
	
	
	  @SuppressWarnings("rawtypes")
	@Test
	
	public void testEmpUpdateSocialMediaProfile() throws Exception {
		  
		  
		  
		  
 try {
			  
	  String filePath = System.getProperty("user.dir");
 	  FileInputStream fis = new FileInputStream(filePath+"/config/Testdata.xlsx");

	    XSSFWorkbook workbook = new XSSFWorkbook(fis); 
		  
		  XSSFSheet sheets = workbook.getSheet("University");
		   
		  Row facebook = sheets.getRow(10);
		  Cell cell1 = facebook.getCell(1);
		  String Facebook  = cell1.getStringCellValue();
		  
		  Row instagram = sheets.getRow(11);
		  Cell cell2 = instagram.getCell(1);
		  String Instagram  = cell2.getStringCellValue();
		  
		  Row linkedin = sheets.getRow(12);
		  Cell cell3 = linkedin.getCell(1);
		  String Linkedin  = cell3.getStringCellValue();
		  
		  Row twitter = sheets.getRow(13);
		  Cell cell4 = twitter.getCell(1);
		  String Twitter  = cell4.getStringCellValue();
		  
		  
		  Row youtube = sheets.getRow(14);
		  Cell cell5 = youtube.getCell(1);
		  String Youtube  = cell5.getStringCellValue();
		  
		  Row website = sheets.getRow(9);
		  Cell cell6 = website.getCell(1);
		  String Website  = cell6.getStringCellValue();
		  
	     
			  driver.findElement(By.xpath(objectrepo.getProperty("EmployerProfileMenu"))).click();	 
			  log.info("Employer Profile MenuClicked");
			  Thread.sleep(2000);
			  
			  driver.findElement(By.xpath(objectrepo.getProperty("EmpEditSocialMediaIcon"))).click();	 
			  log.info("Edit  Social Media Icon Clicked");
			  Thread.sleep(2000);
	     
			  driver.findElement(By.xpath(objectrepo.getProperty("WebsiteTextbox"))).clear();
			   driver.findElement(By.xpath(objectrepo.getProperty("FacebookTextbox"))).clear(); 
			   driver.findElement(By.xpath(objectrepo.getProperty("EmpInstagramTextbox"))).clear();	 
			   driver.findElement(By.xpath(objectrepo.getProperty("LinkedInTextbox"))).clear();
			   driver.findElement(By.xpath(objectrepo.getProperty("TwitterTextbox"))).clear();
			   driver.findElement(By.xpath(objectrepo.getProperty("YoutubeTextbox"))).clear();
 			   
	 		   Thread.sleep(2000);
	 		   
	 		  driver.findElement(By.xpath(objectrepo.getProperty("WebsiteTextbox"))).sendKeys(Website); 
			   driver.findElement(By.xpath(objectrepo.getProperty("FacebookTextbox"))).sendKeys(Facebook);	 
			   driver.findElement(By.xpath(objectrepo.getProperty("EmpInstagramTextbox"))).sendKeys(Instagram);	 
			   driver.findElement(By.xpath(objectrepo.getProperty("LinkedInTextbox"))).sendKeys(Linkedin); 
			   driver.findElement(By.xpath(objectrepo.getProperty("TwitterTextbox"))).sendKeys(Twitter); 
			   driver.findElement(By.xpath(objectrepo.getProperty("YoutubeTextbox"))).sendKeys(Youtube);
			   Thread.sleep(2000);
			   log.info("All social Media accounts Updated ");
			   
			   driver.findElement(By.xpath(objectrepo.getProperty("SaveButton"))).click();	
			 	 Thread.sleep(2000);
			   log.info("SaveButton Button Clicked ");
			   
			   driver.getPageSource().contains(Website);
			   driver.getPageSource().contains(Facebook);
			   driver.getPageSource().contains(Instagram);
			   driver.getPageSource().contains(Linkedin);
			   driver.getPageSource().contains(Twitter);
			   driver.getPageSource().contains(Youtube);
			   
			   log.info("Website, Facebook, Instagram, LinkedIn, Twitter and Youtube Updated successfully ");
				  
				  
				  
			  
			  
			  
		   
			    log.info("End TEST--------------------------EmpUpdateSocialMediaProfile------------------------");     
	    
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
