package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class CONTACTS {

    private final Page page;


    public CONTACTS(Page page) {
        this.page = page;
    }

    public void ENTER_FIRST_NAME() {
        Locator firstnamefield = page.getByLabel("First Name");
         firstnamefield.fill("sadfafasf");
    }

    public void enterPassword(String password) {
        page.fill("#password", password);
    }
}
