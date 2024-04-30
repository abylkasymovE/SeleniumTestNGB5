package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DirectoryPage extends BasePage {
    public DirectoryPage() {
        super(Driver.getDriver());
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]")
    public WebElement JobTitle;


    @FindBy(xpath = "//span[text()='HR Manager']")
    public WebElement hrManager;

    @FindBy(css = "button[type='submit']")
    public WebElement searchButton;

    @FindBy(css = "p[class='oxd-text oxd-text--p orangehrm-directory-card-subtitle --break-words']")
    public WebElement searchResult;


    public void verifyTest() {
        JobTitle.click();
        hrManager.click();
        searchButton.click();

    }


    @Override
    public void search(String ... parameters) {
        String emplyeeName = parameters[0];
        String jobTitle = parameters[1];
        String location = parameters[2];

        // search
    }
}
