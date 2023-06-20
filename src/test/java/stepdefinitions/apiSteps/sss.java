package stepdefinitions.apiSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.LessonNamePojo;
import pojos.LessonProgramCreatePojo;
import pojos.lessonProgramPojo;

import java.util.List;

import static base_urls.SchoolManagement_BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class sss {
    Response response;
    //essonProgramPojo expectedData;
    //LessonName lessonName;

    /*
           public class LessonName
        {
            public int lessonId { get; set; }
            public string lessonName { get; set; }
            public int creditScore { get; set; }
            public bool compulsory { get; set; }
        }

        public class Root
        {
            public int lessonProgramId { get; set; }
            public string startTime { get; set; }
            public string stopTime { get; set; }
            public List<LessonName> lessonName { get; set; }
            public string day { get; set; }
        }


    /*
        @Given("Kullanici getRequest gonderir response alir")
        public void kullanici_get_request_gonderir_response_alir() {




            lessonNamePojo=new LessonNamePojo();
            lessonNamePojo.setLessonId(26);
            lessonNamePojo.setLessonName("FranceBiologie");
            lessonNamePojo.setCreditScore(21);
            lessonNamePojo.setCompulsory(true);


            lesson1 = new ArrayList<>();
            lesson1.add(lessonNamePojo);

            lessonProgramPojo=new lessonProgramPojo();

          //  lessonProgramPojo.setLessonProgramId(20);
            lessonProgramPojo.setStartTime("12:12:00");
            lessonProgramPojo.setStopTime("15:15:00");
            lessonProgramPojo.setLessonName(lesson1);
            lessonProgramPojo.setDay("SUNDAY");


            expectedData=new LessonProgramCreatePojo();

            expectedData.setObject(lessonProgramPojo);
            expectedData.setMessage("Created Lesson Program");
            expectedData.setHttpStatus("CREATED");

            System.out.println("expectedData" + expectedData);



            response = given(spec).get("{first}/{second}");
           // response.prettyPrint();
            JsonPath jsonPath = response.jsonPath();
            String actuStartTime=jsonPath.getList("object.findAll{it.lessonProgramId==307}.startTime").get(0).toString();
            System.out.println(actuStartTime);
             //assertEquals(expectedData.getObject().getStartTime(),actuStartTime);


        }


    */
    @Given("Kullanici getRequest gonderir by {string} response alir")
    public void kullaniciGetRequestGonderirByResponseAlir(String arg0) {
        spec.pathParams("first", "lessonPrograms", "second", "getAll");
        response = given(spec).get("{first}/{second}");
       // response.prettyPrint();



        //assertEquals(expectedData.getObject().getStartTime(),actuStartTime);


    }




    @Then("Kullanici ExpectedData olusturur  startTime={string}")
    public void kullaniciExpectedDataOlustururStartTime(String arg0) {


    }


    @Then("Kullanici ExpectedData olusturur  startTime={string} stopTime={string}lessonId={string}lessonName={string}creditScore={string}compulsory={string}")
    public void kullaniciExpectedDataOlustururStartTimeStopTimeLessonIdLessonNameCreditScoreCompulsory(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) {

        JsonPath jsonPath=response.jsonPath();

       //String a=jsonPath.getList("object.findAll{it.lessonProgramId==913}.startTime").get(0).toString();
        //System.out.println(a);
       // body("lessonProgramId.reverse()[0]",equalTo(913));
       // response.prettyPrint();
        response.then().
        body("lessonName[0].lessonId[0]",equalTo(2)).
                body("lessonName[0].lessonName[0]",equalTo("CALCULUS")).
                body("lessonName[0].creditScore[0]",equalTo(6)).
                body("lessonName[0].compulsory[0]",equalTo(false)).
                body("lessonProgramId[0]",equalTo(2)).
                body("startTime[0]",equalTo("10:00:00")).
                body("stopTime[0]",equalTo("12:00:00"))


     ;
        //response.prettyPrint();
        //.body("lessonName[0].lessonId[0]",equalTo(2));
    }
}
