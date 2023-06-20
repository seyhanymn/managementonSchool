package stepdefinitions.UISteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ViceDEanPages;
import utilities.ReusableMethods;


public class ViceDeanKullanıcılarınGönderdiğiMesajlarıGörebilmelidir {

    ViceDEanPages viceDEanPage=new ViceDEanPages();
    ReusableMethods reusableMethod=new ReusableMethods();
    @Then("Kullnanici menu butonuna tiklar")
    public void kullnaniciMenuButonunaTiklar() {
    reusableMethod.clickWithJS(viceDEanPage.viceDeanMenü);

    }

    @Then("Kullanici Contact Get All butonuna tiklar")
    public void kullaniciContactGetAllButonunaTiklar() {
        reusableMethod.clickWithJS(viceDEanPage.viceDeanContactGetAll);

    }

    @And("Contact message sayfasinda oldugunu dogrular")
    public void contactMessageSayfasindaOldugunuDogrular() {
        Assert.assertTrue(viceDEanPage.viceDeanContactMessage.isDisplayed());


    }

    @Then("Kullanici Name altinda  Massage yazarlari Listeler")
    public void kullaniciNameAltindaMassageYazarlariListeler() {

        System.out.println(viceDEanPage.viceDeanContactMessageName.getText());
        Assert.assertTrue(viceDEanPage.viceDeanContactMessageName.isDisplayed());

    }

    @Then("Kullanici Contact   Massage altinda  email adresleri Listeler")
    public void kullaniciContactMassageAltindaEmailAdresleriListeler() {
        System.out.println(viceDEanPage.viceDeanContactMessageEmail.getText());
        Assert.assertTrue(viceDEanPage.viceDeanContactMessageEmail.isDisplayed());

    }

    @Then("Kullanici  Contact   Massage altinda  Dateleri Listeler")
    public void kullaniciContactMassageAltindaDateleriListeler() {
        System.out.println(viceDEanPage.viceDeanContactMessageDate.getText());
        Assert.assertTrue(viceDEanPage.viceDeanContactMessageDate.isDisplayed());


    }

    @Then("Kullanici  Contact   Massage altinda  Subjet Listeler")
    public void kullaniciContactMassageAltindaSubjetListeler() {
        System.out.println(viceDEanPage.viceDeanContactMessageSubject.getText());
        Assert.assertTrue(viceDEanPage.viceDeanContactMessageSubject.isDisplayed());

    }

    @And("Kullanici Contact   Massage altinda gönderilen messagelerListeler")
    public void kullaniciContactMassageAltindaGönderilenMessagelerListeler() {
        System.out.println(viceDEanPage.viceDeanContactMessageMessag.getText());
        Assert.assertTrue(viceDEanPage.viceDeanContactMessageMessag.isDisplayed());
    }
}
