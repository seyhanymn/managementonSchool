package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViceDEanPages {

    public ViceDEanPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath="//*[@id='username']")
    public WebElement viceDeanUserName;
    @FindBy(xpath="//*[@id='password']")
    public WebElement viceDeanpassword;
    @FindBy(xpath="(//*[@class='invalid-feedback'])[1]")
    public WebElement viceDeanUserNameRequired;


    @FindBy(xpath="(//*[@type='button'])[3]")
    public WebElement viceDeanpassLoginButton;



    @FindBy(xpath="//*[@id='controlled-tab-example-tab-lessonProgram']")
    public WebElement viceDeanLessonProgramButton;
    @FindBy(xpath="//*[@class=' css-13cymwt-control']")
    public WebElement viceDeanChooseLessonButton;



    @FindBy(xpath="//*[@id='educationTermId']")
    public WebElement viceDeanChooseDönemButton;
    @FindBy(xpath="//*[@class='mb-3 form-select']")
    public WebElement viceDeanChooseDayButton;
    @FindBy(xpath="//*[@id='startTime']")
    public WebElement viceDeanChooseStartTimeButton;

    @FindBy(xpath="//*[@id='stopTime']")
    public WebElement viceDeanChooseStopimeButton;
    @FindBy(xpath="(//*[@class='fw-semibold btn btn-primary btn-lg'])[3]")
    public WebElement viceDeanSubbmitButton;

    @FindBy(xpath="//*[text()='Created Lesson Program']")
    public WebElement viceDeanLessonProgramCreated;

    //US_11
    @FindBy(xpath="(//table[@class='table table-striped table-bordered table-hover'])[3]//tbody")
    public WebElement viceDeanLessonList;
    //US16


    @FindBy(xpath="//*[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement viceDeanMenü;

    @FindBy(xpath="//*[text()='Contact Get All']")
    public WebElement viceDeanContactGetAll;
    @FindBy(xpath="//*[text()='Contact Message']")
    public WebElement viceDeanContactMessage;
    @FindBy(xpath="//table/tbody/tr[1]")
    public WebElement viceDeanContactMessageNameEmailDateSubjectMessageSatir;

    @FindBy(xpath="//table/tbody/tr/td[1]")
    public WebElement viceDeanContactMessageName;
    @FindBy(xpath="//table/tbody/tr/td[2]")
    public WebElement viceDeanContactMessageEmail;

    @FindBy(xpath="//table/tbody/tr/td[3]")
    public WebElement viceDeanContactMessageDate;
    @FindBy(xpath="//table/tbody/tr/td[4]")
    public WebElement viceDeanContactMessageSubject;
    @FindBy(xpath="//table/tbody/tr/td[5]")
    public WebElement viceDeanContactMessageMessag;

}
