package pages;

import com.microsoft.playwright.Page;


import com.microsoft.playwright.*;

public class LoginPage {

    private final Locator usernameInput;
    private final Locator passwordInput;
    private final Locator signInButton;

    public LoginPage(Page page) {
        this.usernameInput = page.locator("#username");
        this.passwordInput = page.locator("#password");
        this.signInButton = page.locator(".btn");
    }

    public void enterUsername(String username) {
        usernameInput.fill(username);
    }

    public void enterPassword(String password) {
        passwordInput.fill(password);
    }

    public void clickSignIn() {
        signInButton.click();
    }
}
