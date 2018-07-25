/**
 * 
 */
package Com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.crm.qa.Base.TestBase;

/**
 * @author guptaav
 *
 */
public class LoginPage extends TestBase {
	
	
	@FindBy(name="username")
	 WebElement Username;
	
	@FindBy(xpath="//input[@type='password']")
	 WebElement Password;
	
	@FindBy(xpath="//input[@class='btn btn-small']")
	WebElement Loginbutton;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	 WebElement FreeCRMLogo;
	
	@FindBy(xpath="//td[contains(text(),'User: Avi Gupta')]")
	WebElement VerifyCorrectAccountAccessLabel;
	
	
	
	
	public LoginPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	
	public  String  GetFreeCRMTitle(){
		
		 return driver.getTitle();
	}
	
	

	public  boolean FreeCRMLogo(){
		
		return FreeCRMLogo.isDisplayed();
		
	}
	
	public  void Login(String un,String pwd) throws InterruptedException{
		
		Username.sendKeys(un);
		Password.sendKeys(pwd);
		Thread.sleep(2000);
		Loginbutton.click();
		
	}
	
	public boolean VerifyCorrectAccountAccessLabel(){
		
	return VerifyCorrectAccountAccessLabel.isDisplayed();
		
	}
	
	
	
	
	
	
	
	
	
	

}
