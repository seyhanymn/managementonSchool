package hooks;



import io.cucumber.java.Before;


import static base_urls.SchoolManagement_BaseUrl.schoolsetupViceDean;

public class Hooks {

    @Before()
    public void beforeApi(){
        schoolsetupViceDean();
    }
}
