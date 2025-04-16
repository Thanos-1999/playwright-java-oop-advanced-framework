package base;

import com.microsoft.playwright.*;
import config.ConfigReader;
import factory.BrowserFactory;
import io.qameta.allure.Allure;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayInputStream;
import java.nio.file.Paths;

public class BaseTest {
    protected Playwright playwright;
    protected Browser browser;
    protected BrowserContext context;
    protected Page page;

    @BeforeEach
    public void setup() {
        playwright = Playwright.create();
        browser = BrowserFactory.getBrowser(playwright);
        context = browser.newContext();
        page = context.newPage();

    }


    @AfterEach
    public void tearDown() {
        if (browser != null) browser.close();
        if (playwright != null) playwright.close();
    }


    public void takeScreenshot(String name) {
        if (page != null) {
            byte[] screenshot = page.screenshot(new Page.ScreenshotOptions().setFullPage(true));
            Allure.addAttachment(name, "image/png", new ByteArrayInputStream(screenshot), ".png");
        }
    }

}








