package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AmazonStepdefinitions {
    AmazonPage amazonPage=new AmazonPage();
    @Given("kullanici Amazon ana sayfasina gider")
    public void kullanici_amazon_ana_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @Then("arama kutusuna Nutella yazar ve enter tusuna basar")
    public void arama_kutusuna_nutella_yazar_ve_enter_tusuna_basar() {
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
    }
    @Then("arama sonuclarinin Nutellla icerdigini test eder")
    public void arama_sonuclarinin_nutellla_icerdigini_test_eder() {
        String expectedIceric="Nutella";
        String actulIcerik=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actulIcerik.contains(expectedIceric));

    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }


    @When("arama kutusuna Java yazar ve enter tusuna basar")
    public void aramaKutusunaJavaYazarVeEnterTusunaBasar() {
        amazonPage.aramaKutusu.sendKeys("Java"+ Keys.ENTER);
    }

    @Then("arama sonuclarinin Java icerdigini test eder")
    public void aramaSonuclarininJavaIcerdiginiTestEder() {
        String expectedIceric="Java";
        String actulIcerik=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actulIcerik.contains(expectedIceric));
    }

    @When("arama kutusuna Apple yazar ve enter tusuna basar")
    public void aramaKutusunaAppleYazarVeEnterTusunaBasar() {
        amazonPage.aramaKutusu.sendKeys("Apple"+ Keys.ENTER);
    }

    @Then("arama sonuclarinin Apple icerdigini test eder")
    public void aramaSonuclarininAppleIcerdiginiTestEder() {
        String expectedIceric="Apple";
        String actulIcerik=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actulIcerik.contains(expectedIceric));
    }


    @Then("amazonda {string} icin arama yapar")
    public void amazondaIcinAramaYapar(String aranacakKelime) {
        amazonPage.aramaKutusu.sendKeys(aranacakKelime+ Keys.ENTER);
    }

    @And("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String bulunanKelime) {
        String actulIcerik=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actulIcerik.contains(bulunanKelime));
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int beklenecekSaniye) {
        ReusableMethods.bekle(beklenecekSaniye);
    }
    @Given("kullanici {string} anasayfasina gider")
    public void kullanici_anasayfasina_gider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }
    @Then("{string} sayfasina gittigini test eder")
    public void sayfasina_gittigini_test_eder(String istenenUrl) {
        String actualtUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl=ConfigReader.getProperty(istenenUrl);
        Assert.assertEquals(expectedUrl,actualtUrl);
    }
    @When("{int}.urune gider")
    public void urune_gider(Integer istenenIndex) {
        amazonPage.istenenUrunElementi(istenenIndex).click();

    }
    @Then("urun isminin {string} icerdigini test eder")
    public void urun_isminin_icerdigini_test_eder(String arananKelime) {
String actualUrunIsimi=amazonPage.ilkUrunIsimElementi.getText();

Assert.assertTrue(actualUrunIsimi.contains(arananKelime));

    }
}
