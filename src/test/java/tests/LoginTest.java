package tests;

import base.BaseTest;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.CONTACTS;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest extends BaseTest {

    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void testLogin() {
        try {
            Allure.step("Open the login page");
            page.navigate("https://practicetestautomation.com/practice-test-login/");

            Allure.step("Initialize the LoginPage object");
            LoginPage loginPage = new LoginPage(page);

            Allure.step("Enter username");
            loginPage.enterUsername("testuser");

            Allure.step("Enter password");
            loginPage.enterPassword("testpass");

            Allure.step("Click the sign-in button");
            loginPage.clickSignIn();

        } catch (AssertionError | Exception e) {
            takeScreenshot("Fail to Login");
            throw e;
        }
    }
}

