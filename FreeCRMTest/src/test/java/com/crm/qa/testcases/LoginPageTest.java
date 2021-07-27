package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	//Created Constructor 
 public LoginPageTest() {
	 super();
 }
     @BeforeMethod
	 public void setup(){
	 initilization(); 
	  loginpage = new LoginPage();
	 }
     
    @Test(priority=1)
   public void LoginPageTittleTest() {
    	String title = loginpage.validateloginpageTittle();
    	Assert.assertEquals(title, "COGMENTO");
    }
     
    @Test(priority=2)
    public void loginTest(){
    	homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
    }
       @AfterMethod
     public void teardown() {
    	 driver.quit();
     }
	 
 }
	
	
	
	
	
