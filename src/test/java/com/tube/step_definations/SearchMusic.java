package com.tube.step_definations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SearchMusic {
    WebDriver driver;
    @Given("User on the youtube landing page")
    public void userOnTheYoutubeLandingPage() {

        System.setProperty("webdriver.chrome.driver","D:\\Personal documents\\automation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
    }

    @When("user input the song on the search button")
    public void userInputTheSongOnTheSearchButton() {
        driver.findElement(By.name("search_query")).sendKeys("He touched me by joey");


    }

    @And("user click submit")
    public void userClickSubmit() {
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElement(By.id("search-icon-legacy")).click();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string")).click();
        driver.manage().timeouts().implicitlyWait(7000,TimeUnit.SECONDS);

        //driver.findElement(By.id("ad-text:2w")).click();
    }

    @Then("the songs will be played")
    public void theSongsWillBePlayed() {
        System.out.println("Song is playing");
    }
}
