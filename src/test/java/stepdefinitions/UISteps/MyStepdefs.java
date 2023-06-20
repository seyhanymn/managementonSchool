package stepdefinitions.UISteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.ViceDEanPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class MyStepdefs {
 ReusableMethods reusableMethods=new ReusableMethods();
 Actions actions=new Actions(Driver.getDriver());
public static String lesson;
 public static String semester;
 public static String day;
 public static String startTime;
 public static String stopTime;
   ViceDEanPages viceDEanPages=new ViceDEanPages();
    @When("Kullanici managementonschools adresine gider")
    public void kullaniciManagementonschoolsAdresineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));;
    }

    @Then("Kullanici UserName butonuna tiklar")
    public void kullaniciUserNameButonunaTiklar() throws InterruptedException {
    viceDEanPages.viceDeanUserName.click();
    Thread.sleep(2000);

    }


    @Then("Kullanici  Password butonuna tiklarr")
    public void kullaniciPasswordButonunaTiklarr() throws InterruptedException {
        viceDEanPages.viceDeanpassword.click();
     Thread.sleep(2000);

    }

    @Then("Kullanici UserName butonunun altına,Password ButonununAltında Required yazısını gördügünü dogrular")
    public void kullaniciUserNameButonununAltınaPasswordButonununAltındaRequiredYazısınıGördügünüDogrular() throws InterruptedException {

        Assert.assertTrue(viceDEanPages.viceDeanUserNameRequired.isDisplayed());

        Thread.sleep(2000);

    }

    @Then("Kullanici gecerli  UserName girer")
    public void kullaniciGecerliUserNameGirer() {

     viceDEanPages.viceDeanUserName.sendKeys("hasan123");

    }

    @Then("Kullanici gecerli  Password girer")
    public void kullaniciGecerliPasswordGirer() throws InterruptedException {
     viceDEanPages.viceDeanpassword.sendKeys("12345678");
     Thread.sleep(2000);
    }


    @Then("Kullanici login butonuna tıklar")
    public void kullaniciLoginButonunaTıklar() {
     viceDEanPages.viceDeanpassLoginButton.click();
    }


 @Then("Kullanici Lesson Program butonuna tiklar")
 public void kullaniciLessonProgramButonunaTiklar() throws InterruptedException {
    Thread.sleep(2000);
    reusableMethods.clickWithJS(viceDEanPages.viceDeanLessonProgramButton);
 }



 @Then("Kullnici Choose Lessons Butonuna tiklar bir ders ,Dönem, Gün Start Time ,Stop Time secer")
 public void kullniciChooseLessonsButonunaTiklarBirDersDönemGünStartTimeStopTimeSecer() throws InterruptedException {

  Thread.sleep(2000);
 lesson="Math";
  viceDEanPages.viceDeanChooseLessonButton.click();
  actions.sendKeys(lesson);
  actions.sendKeys(Keys.ENTER).perform();
  semester="FALL_SEMESTER";
  Select select2=new Select(viceDEanPages.viceDeanChooseDönemButton);
  select2.selectByVisibleText(semester);
  day="MONDAY";

     Thread.sleep(2000);
     Select select4=new Select(viceDEanPages.viceDeanChooseDayButton);
     select4.selectByVisibleText(day);
  startTime="12:12";


//Select select3=new Select(viceDEanPages.viceDeanChooseStartTimeButton);
//select3.selectByIndex(1);
  reusableMethods.clickWithJS(viceDEanPages.viceDeanChooseStartTimeButton);
  viceDEanPages.viceDeanChooseStartTimeButton.sendKeys(startTime);

  stopTime="14:14";

  reusableMethods.clickWithJS(viceDEanPages.viceDeanChooseStopimeButton);
  viceDEanPages.viceDeanChooseStopimeButton.sendKeys(stopTime);



}





 @Then("Kullnici submit butonuna tiklar")
 public void kullniciSubmitButonunaTiklar() {

     reusableMethods.clickWithJS(viceDEanPages.viceDeanSubbmitButton);

 }

 @And("Kullnici Created Lesson Program yazisinin görüldügünü dogrular")
 public void kullniciCreatedLessonProgramYazisininGörüldügünüDogrular() {
     Assert.assertTrue(viceDEanPages.viceDeanLessonProgramCreated.isDisplayed());
 }
}
