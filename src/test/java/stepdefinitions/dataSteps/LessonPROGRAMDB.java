package stepdefinitions.dataSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class LessonPROGRAMDB {
    ResultSet resultSet;
    Connection connection;
    Statement statement;
    @Given("dataBase Olustur olustur")
    public void databaseOlusturOlustur() throws SQLException {

        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM public.lesson_program WHERE id = 421");

        resultSet.next();
    }

    @Then("Olusan programi dogrula")
    public void olusanProgramiDogrula() throws SQLException {

        assertEquals("MONDAY", resultSet.getString("day"));
        assertEquals("12:12:00", resultSet.getString("start_time"));
        assertEquals("14:14:00", resultSet.getString("stop_time"));
        assertEquals("2", resultSet.getString("education_term_id"));
    }
}
