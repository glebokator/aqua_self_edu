package project.pages;

import framework.pageElements.Button;
import org.openqa.selenium.By;
import static framework.logger.MyLogger.logger;

public class MainForm extends BaseForm {
    private Button mainPageBtn = new Button(By.id("//*[@id='cars-com-logo']"), "Main page button");
    private Button mobileAppBtn = new Button(By.xpath("//a[@data-linkname='mobile-app']"), "App button");
    private Button researchBtn = new Button(By.xpath("//nav/ul/li/a[@data-linkname='header-research']"), "Research button");

    public MainForm() {
        uniqueElement = mobileAppBtn ;
    }

    public void goToMainPage() {
        logger.debug("Going to main page");
        mainPageBtn.click();
    }

    public void goToResearch() {
        logger.debug("Going to research");
        researchBtn.waitAndClick();
    }
}