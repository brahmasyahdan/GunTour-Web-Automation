package GunTour.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

public class GuidePage extends PageObject {

    @Managed
    WebDriver driver = getDriver();


    private final By mustDoClimberTittle = By.xpath("//*[@id=\"root\"]/div/div/section[2]/p[1]");
    private final By importantFileTittle = By.xpath("//*[@id=\"root\"]/div/div/section[3]/p[1]");
    private final By climberDeclarationLetterButton = By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div/a/div");
    private final By parentsStatementLetterButton = By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/p/div/div/a/div");
    private final By healthDeclarationLetterButton = By.xpath("//*[@id=\"root\"]/div/div/div/div/div[3]/p/div/div/a/div");
    private final By garbageFormButton = By.xpath("//*[@id=\"root\"]/div/div/div/div/div[4]/p/div/div/a/div");

    public void wait(int wait) {
        try {
            sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isMustDoClimberTittleVisible(){
        return driver.findElement(mustDoClimberTittle).isDisplayed();
    }

    public boolean isImportantFileTittleVisible() {
        return driver.findElement(importantFileTittle).isDisplayed();
    }

    public void clickDeclarationLetterButton(){
        driver.findElement(climberDeclarationLetterButton).click();
        wait(5000);
    }

    public void clickParentStatementLetterButton(){
        driver.findElement(parentsStatementLetterButton).click();
        wait(5000);
    }

    public void clickHealthDeclarationLetterButton(){
        driver.findElement(healthDeclarationLetterButton).click();
        wait(5000);
    }

    public void clickGarbageFormButton(){
        driver.findElement(garbageFormButton).click();
        wait(5000);
    }
}
