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

//import groovyjarjarantlr4.v4.runtime.atn.SemanticContext.OR;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import net.serenitybdd.screenplay.ui.Select;
//import net.serenitybdd.screenplay.ui.Select;
//import org.openqa.selenium.support.ui.Select;

public class S07_ComplianceManger_Pricelist_PositiveScenario extends Reusable_Functions.Generic_function {
    static String myapi;
    int s;
    static String str;
    static boolean value;
    private CharSequence my;
    /* Validate complaine manager can login with there valid credentials */
    @Given("cm launches url in price list")
    public void cm_launches_url_in_price_list() throws IOException {
        try {
            browser_launch();
            s= Dataiter();
            browser_wait(120000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("cm page");

        }
    }

    @When("cm successfully navigated to the welcome page")
    public void cm_successfully_navigated_to_the_welcome_page() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("common_login_title"))).getText();
            Assert.assertEquals(str,td_reader("common_login_title"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_login_button_of_pricelist_complaince");

        }

    }
    @Then("cm clicks on login button")
    public void cm_clicks_on_login_button() throws IOException {
        try {
            click("first_login");
            Thread.sleep(3000);
            browser_wait(1000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_login_button_of_pricelist_complaince");

        }

    }

    @Then("cm lands on the login page")
    public void cm_lands_on_the_login_page() throws IOException {
        try{
            str= driver.findElement(By.xpath(OR_reader("login_title"))).getText();
            Assert.assertEquals(str,td_reader("login_title"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_login_button_of_pricelist_complaince");

        }

    }
    /* Verify sandbox is working for pending applications */

    @When("complaince manager enters valid credentials")
    public void complaince_manager_enters_valid_credentials() throws InterruptedException, IOException {
        try {
            driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("login_emaill",0));
            Thread.sleep(3000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("enters_email_of_complaince_manager");
        }
        try {
            driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("login_passwordd",0));
            Thread.sleep(2000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("password_of_sandbox_complaince");
        }


    }

    @Then("hits login button and lands on complaince manager page for price list")
    public void hits_login_button_and_lands_on_complaince_manager_page_for_price_list() throws IOException {
        try {
            click("login");
            Thread.sleep(4000);
            browser_wait(2000);
            //value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
            //Assert.assertEquals(true,value);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("login_positive_clicks_on_login_pricelist_complaince");

            //str= driver.findElement(By.xpath(OR_reader("org_title"))).getText();
            //Assert.assertEquals(str,td_reader("org_title"));
        }

    }
    @Then("compliance manager successfully navigated to the page")
    public void compliance_manager_successfully_navigated_to_the_page() throws InterruptedException, IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("com_land"))).getText();
            Assert.assertEquals(str,td_reader("com_land"));
            Thread.sleep(5000);
            browser_wait(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("com page is or not");
        }
    }

    @When("click on the price list in the cm page")
    public void click_on_the_price_list_in_the_cm_page() throws IOException, InterruptedException {
        try {
            click("com_price");
            Thread.sleep(5000);
            browser_wait(7000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_pricelist_pricelist_complaince");
        }}

    @Then("validate navigated to the price list page of the cm")
    public void validate_navigated_to_the_price_list_page_of_the_cm() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("price_lob_title"))).getText();
            Assert.assertEquals(str,td_reader("price_lob_title"));
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("validate_navigated_to_the_price_list_page_of_the_cm_pricelist_complaince");
        }
    }
    @Then("click on the search button present in the complaince manager page")
    public void click_on_the_search_button_present_in_the_complaince_manager_page() throws IOException, InterruptedException {
        try{
            click("search_lobs");
            Thread.sleep(1000);
            browser_wait(3000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_search_button_present_in_the_complaince_manager_page_pricelist_complaince");
        }}

    @When("give any data for searching in the cm")
    public void give_any_data_for_searching_in_the_cm() throws IOException, InterruptedException {
        try{
            driver.findElement(By.xpath(OR_reader( "search_lobs"))).sendKeys(td_reader("complaince_search",0));
            Thread.sleep(1000);
            browser_wait(3000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("give_any_data_for_searching_in_the_cm_pricelist_complaince");
        }}
    @Then("click the corresponding complaince pricelist")
    public void click_the_corresponding_complaince_pricelist() throws IOException, InterruptedException {
        try{
            click("view_price_list_click");
            Thread.sleep(1000);
            browser_wait(3000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_the_corresponding_complaince_pricelist_pricelist_complaince");
        }}



    @Then("click the any of the prise list file of the complaince manager")
    public void click_the_any_of_the_prise_list_file_of_the_complaince_manager() throws IOException, InterruptedException {
        try {
            click("any_price_list");
            Thread.sleep(3000);
            browser_wait(5000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_the_any_of the_pricelist_complaince");
        }}

    @Then("click on the second download button")
    public void click_on_the_second_download_button() throws IOException, InterruptedException {
        try {
            click("any_price_list2");
            Thread.sleep(3000);
            browser_wait(5000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_second_download_button_pricelist_complaince");
        }}


    @Then("go back to the price list of the cm dashboard")
    public void go_back_to_the_price_list_of_the_cm_dashboard() throws IOException, InterruptedException {
        try{
            click("price_list_dashboard");
            Thread.sleep(5000);
            browser_wait(7000);
            driver.close();
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("go_back_to_the_price_list_of_the_cm_dashboard_pricelist_complaince");
        }}


}


