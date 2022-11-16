package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//a[text()='Register']")
	private WebElement Register_Link;
	
	@FindBy(xpath="//h1[text()='Register']")
	private WebElement Register_Text;
	
	@FindBy(xpath="(//a[contains(.,'Gift Cards')])[1]")
	private WebElement Giftcards_Menu;
	
	public WebElement getGiftcards_Menu() {
		return Giftcards_Menu;
	}

	
	public WebElement getRegister_Link() {
		return Register_Link;
	}

	public WebElement getRegister_Text() {
		return Register_Text;
	}

	public WebElement getGender_RadioButton() {
		return Gender_RadioButton;
	}

	public WebElement getFirstName_Textfeild() {
		return FirstName_Textfeild;
	}

	public WebElement getLastName_Textfeild() {
		return LastName_Textfeild;
	}

	public WebElement getEmail_Textfeild() {
		return Email_Textfeild;
	}

	public WebElement getPassword_textfeild() {
		return Password_textfeild;
	}

	public WebElement getConfirmPassword_Textfeild() {
		return ConfirmPassword_Textfeild;
	}

	public WebElement getRegister_Button() {
		return Register_Button;
	}

	@FindBy(id="gender-male")
	private WebElement Gender_RadioButton;
	
	@FindBy(id="FirstName")
	private WebElement FirstName_Textfeild;
	
	@FindBy(id="LastName")
	private WebElement LastName_Textfeild;
	
	@FindBy(id="Email")
	private WebElement Email_Textfeild;
	
	@FindBy(id="Password")
	private WebElement Password_textfeild;
	
	@FindBy(id="ConfirmPassword")
	private WebElement ConfirmPassword_Textfeild;
	
	@FindBy(id="register-button")
	private WebElement Register_Button;

}