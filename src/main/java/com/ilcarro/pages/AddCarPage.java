package com.ilcarro.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCarPage extends BasePage{
    public AddCarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="pickUpPlace")
    WebElement cityInput;
    @FindBy(css= "[class='address-data']")
    WebElement location;

    public AddCarPage enterLocation(String city) {
        type(cityInput, city);
        pause(1000);
        location.sendKeys(Keys.DOWN);
        location.sendKeys(Keys.ENTER);
        return this;
    }

    @FindBy(id="make")
    WebElement manufactureInput;
    @FindBy(id="model")
    WebElement modelInput;
    @FindBy(id="year")
    WebElement yearInput;
    @FindBy(id="fuel")
    WebElement fuelInput;
    @FindBy(xpath = "[value='\"Petrol\"']")
    WebElement fuelField;

    @FindBy(id="seats")
    WebElement seatsInput;
    @FindBy(id="class")
    WebElement carClassInput;
    @FindBy(id="serialNumber")
    WebElement serialNumberInput;
    @FindBy(id="price")
    WebElement priceInput;

    public AddCarPage enterValidData(String manufacture, String model, String year, String fuel, String seats, String carClass, String serialNumber, String price) {
    type(manufactureInput, manufacture);
    type(modelInput, model);
    type(yearInput, year);
    click(fuelInput);
    fuelField.sendKeys(fuel);
    fuelField.sendKeys(Keys.ENTER);
    type(seatsInput, seats);
    type(carClassInput, carClass);
    type(serialNumberInput, serialNumber);
    type(priceInput, price);
    return this;
    }

    @FindBy(id="about")
    WebElement aboutText;
    public AddCarPage enterAbout(String text) {
        type(aboutText, text);
        return this;
    }

    /*@FindBy (css = "[for='photos']")
    WebElement addPhotos;
    public AddCarPage enterPhotosCar(String photo) {
        type(addPhotos, photo);
        return this;
    }*/

    @FindBy(css = "[type='submit']")
    WebElement submit;
    public AddCarPage clickOnSubmitButton() {
        click(submit);
        return this;
    }

    @FindBy(xpath = "//h1[.='Car added']")
    WebElement submitMessage;
    public AddCarPage submitMessageCarSuccessAdded(String message) {
        assert submitMessage.getText().contains(message);
        return this;
    }
}
















