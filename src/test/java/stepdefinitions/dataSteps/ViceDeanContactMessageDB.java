package stepdefinitions.dataSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class ViceDeanContactMessageDB {

    ResultSet resultSet;
    Connection connection;
    Statement statement;
    @Given("data olustur")
    public void data_olustur() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM public.contact_message WHERE id = 735");

        resultSet.next();




    }



    @Then("Olusan contact message dogrula")
    public void olusanContactMessageDogrula() throws SQLException {
        assertEquals("2023-05-05", resultSet.getString("date"));
        assertEquals("Keren", resultSet.getString("name"));
        assertEquals("Mathew@gmail.com", resultSet.getString("email"));
        assertEquals("O! she doth teach the torches to burn bright.", resultSet.getString("subject"));
        assertEquals("To be, or not to be: that is the question.", resultSet.getString("message"));


    }
}
