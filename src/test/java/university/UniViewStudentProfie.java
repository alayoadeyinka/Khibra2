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
 
public class UniViewStudentProfie extends UniversityUtility{
	 
		
	@BeforeMethod
    public void setUp1() throws Exception {
	  log.info("START=UniViewStudentProfie--------------------------------------------------------------");

	  UniversityUtilityclass();
    
    	
    		
}
	
	
	  @SuppressWarnings("rawtypes")
	@Test
	
	public void testUniViewStudentProfie() throws Exception {
	    
		  
			  try {
			    	 
		    	  String filePath = System.getProperty("user.dir");
			 	  FileInputStream fis = new FileInputStream(filePath+"/config/Testdata.xlsx");
		   
				    XSSFWorkbook workbook = new XSSFWorkbook(fis); 
					  
					  XSSFSheet sheets = workbook.getSheet("University");
			 
					  
					  Row name = sheets.getRow(7);
					  Cell cell2 = name.getCell(1);
					  String Name  = cell2.getStringCellValue();
					  
					
					  
					  driver.findElement(By.xpath(objectrepo.getProperty("MenuDropdown")));	 
					  log.info("Menu Dropdown Available");
					  Thread.sleep(2000);
					  driver.findElement(By.xpath(objectrepo.getProperty("StudentsMenu"))).click();	 
					  log.info("Students Menu   Clicked ");
			     Thread.sleep(2000);
			     
			     
			     driver.findElement(By.xpath(objectrepo.getProperty("StudentSubTitle")));	 
			     
			     driver.findElement(By.xpath(objectrepo.getProperty("ByNameRadio"))).click();	 
				  log.info("By Name Radio     Clicked ");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath(objectrepo.getProperty("ByNameTextbox"))).clear();  
		    
		    driver.findElement(By.xpath(objectrepo.getProperty("ByNameTextbox"))).sendKeys(Name);   
		    log.info("Correct Name Entered  ");
		    driver.findElement(By.xpath(objectrepo.getProperty("SearchButton"))).click();
		    log.info("Search Button Clicked  ");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath(objectrepo.getProperty("StudentRowImage"))).click();
		    log.info("First Row of Student Selected  ");
		    Thread.sleep(2000);
		     driver.findElement(By.xpath(objectrepo.getProperty("StudentRowImage")));	 

		    driver.findElement(By.xpath(objectrepo.getProperty("BackButton"))).click();
		    log.info("Back Button Clicked  ");
		    
		    driver.findElement(By.xpath(objectrepo.getProperty("ByNameRadio"))).click();	 
			  log.info("By Name Radio     Clicked ");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath(objectrepo.getProperty("ByNameTextbox"))).clear();  
	    
	    driver.findElement(By.xpath(objectrepo.getProperty("ByNameTextbox"))).sendKeys(Name);   
	    log.info("Correct Name Entered  ");
	    driver.findElement(By.xpath(objectrepo.getProperty("SearchButton"))).click();
	    log.info("Search Button Clicked  ");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath(objectrepo.getProperty("StudentRowImage"))).click();
	    log.info("First Row of Student Selected  ");
	    Thread.sleep(2000);
	    
	    
	     driver.findElement(By.xpath(objectrepo.getProperty("StudNameProfile")));	 
	     driver.findElement(By.xpath(objectrepo.getProperty("StudUniversityProfile")));	 
	     driver.findElement(By.xpath(objectrepo.getProperty("StudDegreeMajor")));	 
	     driver.findElement(By.xpath(objectrepo.getProperty("UniqueIDText")));	 
	     driver.findElement(By.xpath(objectrepo.getProperty("StudOverview")));	 
	     driver.findElement(By.xpath(objectrepo.getProperty("StudExperience")));	 
	     driver.findElement(By.xpath(objectrepo.getProperty("StudSkills")));	 

	     driver.findElement(By.xpath(objectrepo.getProperty("StudLanguage")));	 
	     driver.findElement(By.xpath(objectrepo.getProperty("StudBusinessCard")));	 

	    
	     
	     log.info("Student Name, Degree, Major , ID, Overview, Experience, Skils and Language Validated ");
 
		    
		   
			    log.info("End TEST-------------------------- UniViewStudentProfie------------------------");     
	    
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
