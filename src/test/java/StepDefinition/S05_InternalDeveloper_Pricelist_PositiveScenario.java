package StepDefinition;
import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.Point;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Actions;

import Reusable_Functions.Generic_function;
//import groovyjarjarantlr4.v4.runtime.atn.SemanticContext.OR;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import net.serenitybdd.screenplay.ui.Select;
//import net.serenitybdd.screenplay.ui.Select;
//import org.openqa.selenium.support.ui.Select;

public class S05_InternalDeveloper_Pricelist_PositiveScenario extends Generic_function {
    static String myapi;
    int s;
    static String str;
    static boolean value;
    private CharSequence my;

    /* Validate Internal Developer can login with the given credentials */

    @Given("Internal Developer launches url for checking the price list")
    public void Internel_Developer_launches_url_for_checking_the_price_list() throws IOException {
        try {
            browser_launch();
            s= Dataiter();
            browser_wait(120000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("Int dev lanunching url");

        }

    }
    @When("Internal Developer successfully navigated to the welcome page")
    public void Internal_Developer_successfully_navigated_to_the_welcome_page() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("common_login_title"))).getText();
            Assert.assertEquals(str,td_reader("common_login_title"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("int dev welcome page navigation");

        }
    }
    @Then("Internal Developer clicks on login button")
    public void Internel_Developer_clicks_on_login_button() throws IOException {
        try {
            click("first_login");
            Thread.sleep(3000);
            browser_wait(1000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("int dev clicks login button");

        }

    }
    @Then("Internal Developer lands on the login page")
    public void Internel_Developer_lands_on_the_login_page() throws IOException {
        try{
            str= driver.findElement(By.xpath(OR_reader("login_title"))).getText();
            Assert.assertEquals(str,td_reader("login_title"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("int dev lands login page");

        }
    }
    /* Validate internal developer enters the email id and password */

    @When("Internal Developer enters valid email and password for checking the price list")
    public void Internal_Developer_enters_valid_email_and_password_for_checking_the_price_list() throws InterruptedException, IOException {
        try {
            driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("int_pricelist_login_email",0));
            Thread.sleep(3000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("email_of_pricelist_internal");
        }
        try {
            driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("int_pricelist_login_password",0));
            Thread.sleep(2000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("password_of_pricelist_internal");
        }

    }

    @When("Internal Developer clicks the sigh in button")
    public void Internal_Developer_clicks_the_sigh_in_button() throws IOException {
        try {

            click("login");
            Thread.sleep(4000);
            browser_wait(2000);
            //value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
            //Assert.assertEquals(true,value);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("int dev clicks the sigh in");
        }
    }
    @Then("successfully lands the users page")
    public void successfully_lands_the_users_page() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("internal_loginpage_first_title"))).getText();
            Assert.assertEquals(str,td_reader("internal_loginpage_first_title"));
            Thread.sleep(5000);
            browser_wait(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("int dev page in price list");
        }
    }
    /* Check the price list page */

    @When("click on the price list")
    public void click_on_the_price_list() throws IOException, InterruptedException {
        try{
            click("internal_pricelist");
            Thread.sleep(3000);
            browser_wait(5000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_pricelist_pricelist_internal");
        }}


    @Then("validate navigated to the price list page")
    public void validate_navigated_to_the_price_list_page() throws IOException {
        try{
            str= driver.findElement(By.xpath(OR_reader("pricelist_title"))).getText();

            Assert.assertEquals(str,td_reader("pricelist_title"));
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("validate_navigated_to_the_price_list_page_of_the_cm_pricelist_internal");
        }}
    @When("click on the search button")
    public void click_on_the_search_button() throws IOException, InterruptedException {
        try{
            click("search_lobs");
            Thread.sleep(1000);
            browser_wait(3000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_search_button_present_in_the_complaince_manager_page_pricelist_internal");
        }}

    @Then("give any data for searching")
    public void give_any_data_for_searching() throws IOException, InterruptedException {
        try {
            driver.findElement(By.xpath(OR_reader( "search_lobs"))).sendKeys(td_reader("search_data",0));
            Thread.sleep(1000);
            browser_wait(3000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("give_any_data_for_searching_in_the_cm_pricelist_internal");
        }}
    @Then("successfully navigated to the lob page")
    public void successfully_navigated_to_the_lob_page() throws IOException, InterruptedException {
        try{
            str= driver.findElement(By.xpath(OR_reader("price_lob_title"))).getText();
            Assert.assertEquals(str,td_reader("price_lob_title"));
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("successfully navigated to the lob page");
        }}
    /* giving valid data for searching in pricelist neagive scenario  */

    @Given("click the corresponding pricelist")
    public void click_the_corresponding_pricelist() throws IOException, InterruptedException {
        try {
            click("view_price_list_click");
            Thread.sleep(1000);
            browser_wait(3000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click the corresponding pricelist");
        }}

    @When("click the any of the prise list file")
    public void click_the_any_of_the_prise_list_file() throws IOException, InterruptedException {
        try{
            click("any_price_list");
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_the_any_of the_pricelist_internal");
        }}


    @Then("click on the next download button")
    public void click_on_the_next_download_button() throws IOException, InterruptedException {

        try {
            click("any_price_list2");

            Thread.sleep(3000);
            browser_wait(5000);
        }  catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_second_download_button_pricelist_internal");
        }}

    @Then("click the dashboard button in the menu")
    public void click_the_dashboard_button_in_the_menu() throws IOException, InterruptedException {

        try{
            click("price_list_dashboard");
            Thread.sleep(3000);
            browser_wait(5000);
            driver.close();
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click the dashboard button menu");
        }}


}




