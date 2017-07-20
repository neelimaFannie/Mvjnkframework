package com.fanniemae.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fanniemae.base.TestBase;



public class SDET_Login_TesCase  extends TestBase {
	
   @Test
   
   public void tc_loginTestCase(){
	   
	   click("id_LoginBtn");
	   type("xpath_User", "FM-SDET");
	     type("id_pwd" ,"Hexaware");
	      click("id_BottomLoginButton");
	 
	      Assert.assertEquals("", "");
   }
 

}
