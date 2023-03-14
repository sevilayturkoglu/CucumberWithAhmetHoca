package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoqaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class DemoqaStepDefinitions {
    DemoqaPage demoqaPage=new DemoqaPage();
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(25));
    @Given("kullanici {string} anasayfaya gider")
    public void kullanici_anasayfaya_gider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }
    @Then("Alerts sekmesine tiklar")
    public void alerts_sekmesine_tiklar() {

      Actions actions=new Actions(Driver.getDriver());
      actions.sendKeys(Keys.PAGE_DOWN).perform();
    demoqaPage.alertBtn.click();

    }
    @Then("ustten ikinci click me butonuna basar")
    public void ustten_ikinci_click_me_butonuna_basar() {
      ReusableMethods.bekle(3);
     demoqaPage.clickMe.click();

    }
    @Then("Allert in gorunur olmasini bekler")
    public void allert_in_gorunur_olmasini_bekler() {
        wait.until(ExpectedConditions.alertIsPresent());
    }
    @Then("Allert uzerindeki yazinin {string} oldugunu test eder")
    public void allert_uzerindeki_yazinin_oldugunu_test_eder(String alertText) {
       String actualText= Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(alertText,actualText);
    }
    @Then("Ok diyerek alerti kapatir")
    public void ok_diyerek_alerti_kapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }
}
