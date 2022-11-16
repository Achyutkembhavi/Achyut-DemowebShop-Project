package Tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLib.BaseTest;
import POMpages.RegisterPage;


public class RegisterTest extends BaseTest {
	
	@Test
	public void register() {
	//Clicking on the Register Link
    RegisterPage reg=new RegisterPage(driver);
    reg.getRegister_Link().click();
    Reporter.log("Clicking on the Register Link");
    assertTrue(reg.getRegister_Text().isDisplayed(),"Register link is not Clicking");
    
    //Clicking on the Gender Radio Button
    reg.getGender_RadioButton().click();
    Reporter.log("Clicking on the Gender male Radio Button");
    assertTrue(reg.getGender_RadioButton().isSelected(),"Gender radioButton is not Clicked");
          
    //Entering the Firstname into the Firstname Textfeild
    reg.getFirstName_Textfeild().sendKeys("Pavan Kalyan");
    Reporter.log("Entering the Firstname into the Firstname Textfeild");
//    String actualfirstname="Pavan Kalyan";
    WebElement Data = reg.getFirstName_Textfeild();
    String actualfirstname="Pavan Kalyan";
    String Expectedfirstname=Data.getAttribute("value");
    assertEquals(actualfirstname,Expectedfirstname,"First name is not entered in the Firstname Textfeild");
    
    //Entering the Lastname into the Lastname Textfeild
    reg.getLastName_Textfeild().sendKeys("raja");
    Reporter.log("Entering the Lasttname into the Lastname Textfeild");
    String actualLastname="raja";
    WebElement Data1 = reg.getLastName_Textfeild();
    String ExpectedLastname=Data1.getAttribute("value");
    assertEquals(actualLastname, ExpectedLastname,"Last name is not entered in the Lastname Textfeild ");
    
    //Entering the Email into the Email Textfeild
    reg.getEmail_Textfeild().sendKeys("pavankalyan@gmail.com");
    Reporter.log("Entering the Email into the Email Textfeild");
    String actualemail="pavankalyan@gmail.com";
    WebElement Data3 = reg.getEmail_Textfeild();
    String Expectedemail=Data3.getAttribute("value");
    assertEquals(actualemail, Expectedemail, "Email is not entered in the Email Textfeild");
    
    //Entering the Password into the Password Textfeild
    reg.getPassword_textfeild().sendKeys("shudhhha");
    Reporter.log("Entering the Password into the Password Textfeild");
    String actualpassword="shudhhha";
    WebElement Data4 = reg.getPassword_textfeild();
    String Expectedpassword=Data4.getAttribute("value");
    assertEquals(actualpassword, Expectedpassword, "password is not entered into the password Textfeild");
    
    
     //Entering the Password in Confirm Password Textfeild
    reg.getConfirmPassword_Textfeild().sendKeys("shudhhha");
    Reporter.log("Entering the password in Confirm Password");
    String actualre_password="shudhhha";
    WebElement Data5 = reg.getConfirmPassword_Textfeild();
    String Expectedre_password=Data5.getAttribute("value");
    assertEquals(actualre_password, Expectedre_password, "password is not entered into the Confirm password Textfeild");
	

	//Clicking on the Register Button
	reg.getRegister_Button().click();
	Reporter.log("Clicking on the Register Button");
	assertTrue(reg.getGiftcards_Menu().isDisplayed(),"Register Button is not Clicking");
	
	}
}
