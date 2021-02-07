package Test;

import java.io.IOException;

import org.testng.annotations.Test;

import Pages.LoginPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class LoginTest extends BaseTest {
	@Description("This is login test")
	@Severity(SeverityLevel.BLOCKER)
	@Story("OHM-01 - Login to the application")
	@Test
	public void login() throws IOException {
		LoginPage lp = new LoginPage(driver);
		lp.enteringCredential();

	}

}
