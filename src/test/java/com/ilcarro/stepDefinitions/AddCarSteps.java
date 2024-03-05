package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.AddCarPage;
import com.ilcarro.pages.LoginPage;
import com.ilcarro.pages.BasePage;
import com.ilcarro.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

import static com.ilcarro.pages.BasePage.driver;

public class AddCarSteps {

    @And("User clicks on the Let the car work")
    public void click_On_Let_Car_Work() {
        new HomePage(driver).clickOnLetCarWork();
    }
    @And("User enters Location")
    public void enter_Location() {
        new AddCarPage(driver).enterLocation("Haifa");
    }
    @And("User enters valid data")
    public void enter_Valid_Data() {
        new AddCarPage(driver).enterValidData("Audi", "sport Q7", "2022", "Petrol", "5", "sport", "IN 555 DD", "1000");
    }
    @And("User enters About")
    public void enter_About() {
        new AddCarPage(driver).enterAbout("Car is in good condition without defects");
    }
    /*@And("User enters Photos car")
    public void enter_Photos_Car() {
        new AddCarPage(driver).enterPhotosCar("C:/Tools/1.jpg");
    }*/
    @And("User clicks on Submit button")
    public void click_On_Submit_Button() {
        new AddCarPage(driver).clickOnSubmitButton();
    }
    @Then("User verifies Success message is displayed")
    public void verify_Success_Message() {
        new AddCarPage(driver).submitMessageCarSuccessAdded("");
    }
}


















