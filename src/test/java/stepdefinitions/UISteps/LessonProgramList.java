package stepdefinitions.UISteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ViceDEanPages;

public class LessonProgramList {
    ViceDEanPages viceDEanPages=new ViceDEanPages();
    @Then("Listede Olusturulan ders gorulur")
    public void listedeOlusturulanDersGorulur() throws InterruptedException {


        Thread.sleep(2000);


         Assert.assertTrue(viceDEanPages.viceDeanLessonList.getText().contains(MyStepdefs.lesson));
        Assert.assertTrue(viceDEanPages.viceDeanLessonList.getText().contains(MyStepdefs.day));

    }


}
