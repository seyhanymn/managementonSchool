package stepdefinitions.apiSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static base_urls.SchoolManagement_BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class VicveDeanContactMessage {
    Response response;




    @Given("Kullanici getRequest gonderir by  response alir")
    public void kullaniciGetRequestGonderirByResponseAlir() {

        spec.pathParams("first", "contactMessages", "second", "getAll");
        response = given(spec).get("{first}/{second}");
        response.prettyPrint();
    }

    @Then("Kullanici ExpectedData olusturur  name={string} email={string}subject={string}message={string}date={string}")
    public void kullaniciExpectedDataOlustururNameEmailSubjectMessageDate(String arg0, String arg1, String arg2, String arg3, String arg4) {
        response.then().
                body("content[0].name",equalTo("Keren")).
                body("content[0].email",equalTo("Mathew@gmail.com")).
                body("content[0].subject",equalTo("O! she doth teach the torches to burn bright.")).
                body("content[0].message",equalTo("To be, or not to be: that is the question.")).
                body("content[0].date",equalTo("2023-05-05"));

    }
}
