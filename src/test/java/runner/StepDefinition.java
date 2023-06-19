package runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StepDefinition {
    WebDriver driver=null;

    @Given("^Open the Chrome and launch the application$")

    public void openTheChromeAndLaunchTheApplication() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromeDriver_v113\\chromeDriver\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://computer-database.gatling.io/");
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        Thread.sleep(2000);
        System.out.println("Chrome opened and application launched");
    }

    @When("^user enter computer name and click search button$")
    public void userEnterComputerNameAndClickSearchButton() throws InterruptedException {
        String locator_h1 = "(//h1)[2]";
        String locator_searchinput = "//input [@id='searchbox']";
        String locator_searchbutton = "//input [@id='searchsubmit']";


        WebElement element_searchinput = driver.findElement(By.xpath(locator_searchinput));
        WebElement element_searchbutton = driver.findElement(By.xpath(locator_searchbutton));

        element_searchinput.sendKeys("HP");
        element_searchbutton.click();
        Thread.sleep(3000);
        System.out.println("Computer name searched");
    }

    @Then("^H(\\d+) Header Message mentions word computers found$")
    public void hHeaderMessageMentionsWordComputersFound(int arg0) throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
        System.out.println("GoodBye");
    }
}

//This page gives the stepDefinition for cucumber file