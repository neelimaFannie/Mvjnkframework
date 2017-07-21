package com.fanniemae.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fanniemae.base.TestBase;



public class SDET_Login_TesCase  extends TestBase {
	
   @Test
   
   public void tc_loginTestCase(){
	   
	   System.out.println("************Start**********************8");
	   click("id_LoginBtn");
	   type("xpath_User", "test@sdettraining.com");
	   type("xpath_pwd" ,"test");
	   click("xpath_BottomLoginButton");
	 
	      Assert.assertEquals("", "");
   }
 

}
