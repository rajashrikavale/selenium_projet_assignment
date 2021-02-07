package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.qameta.allure.Step;

public class LoginPage extends BaseClass {
	WebDriver mdriver;

	@FindBy(xpath = "//*[@id='email']")
	private WebElement email;

	@FindBy(xpath = "//*[@id='password']")
	private WebElement password;

	@FindBy(xpath = "//*[@id='sign_in']")
	private WebElement loginbutton;

	public LoginPage(WebDriver driver) throws IOException {

		mdriver = driver;
		PageFactory.initElements(driver, this);

	}

	@Step("Entering credentials into application")
	public void enteringCredential() {

		email.sendKeys(prop.getProperty("email"));
		password.sendKeys(prop.getProperty("password"));

		loginbutton.click();

	}

}
