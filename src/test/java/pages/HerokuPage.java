package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Herkupage {
    public Herkupage(){
    }
    @FindBy(xpath = "//button[.='Add Element']")
    public WebElement addElementButton;

    @FindBy(xpath = "//button[@class='added-manually']")
    public WebElement deleteButton;
}
