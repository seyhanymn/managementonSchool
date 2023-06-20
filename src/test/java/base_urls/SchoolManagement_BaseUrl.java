package base_urls;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import static utilities.AuthenticationSchoolManagement.generateToken;
public class SchoolManagement_BaseUrl {

    public static RequestSpecification spec;

    /*public static void schoolsetupAdmin(){

        spec=new RequestSpecBuilder().setContentType(ContentType.JSON).
                addHeader("Authorization",generateToken("485424698","Admin"))
                .setBaseUri("http://209.38.244.227").build();
    }
    public  static void schoolsetupTeacher(){
        spec=new RequestSpecBuilder().setContentType(ContentType.JSON).
                addHeader("Authorization",generateToken("Team03team","Nihal03"))
                .setBaseUri("http://209.38.244.227").build();
    }
    public  static void schoolsetupStudent(){
        spec=new RequestSpecBuilder().setContentType(ContentType.JSON).
                addHeader("Authorization",generateToken("Team03team","idil03"))
                .setBaseUri("http://209.38.244.227").build();
    }

    public  static void schoolsetupDean(){
        spec=new RequestSpecBuilder().setContentType(ContentType.JSON).
                addHeader("Authorization",generateToken("Team03team","Hatice03"))
                .setBaseUri("http://209.38.244.227").build();
    }*/
    public  static void schoolsetupViceDean(){
        spec=new RequestSpecBuilder().setContentType(ContentType.JSON).
                addHeader("Authorization",generateToken("12345678","hasan123"))
                .setBaseUri("http://164.92.252.42:8080/").build();
    }





}

