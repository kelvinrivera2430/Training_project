package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {WebDriver driver;
@FindBy(name="email") //use @ to find annotations
WebElement userid;
@FindBy(name="pass")//call elements by global variable
WebElement password;
@FindBy(xpath="//*[@aria-label='Log In']")
WebElement LogInbutton;
@FindBy(linkText="Forgot account?")
WebElement forgotpass;
@FindBy(name="reset_action")
WebElement reset;
public Home (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void Emalilfield(String s) {// make method to use actions on elements
	userid.sendKeys("kar@gmail.com");
}
public void Passfield() {
	password.sendKeys("12345");
}
public void Loginbt () {
LogInbutton.click();
}
public void Forgotpassid(String s) {
forgotpass.click();
}
public void reset() {
reset.click();
}
public void Empty() {
	userid.clear();
	
}

}