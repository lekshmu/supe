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
public class S08_ComplianceManager_Pricelist_negativeScenario extends Reusable_Functions.Generic_function {
    static int s;
    static String str;
    static boolean value;

    @Given("cm launch the url in pricelist negative scenarios")
    public void cm_launch_the_url_in_pricelist_negative_scenarios() throws IOException {
        try {
            browser_launch();
            s= Dataiter();
            browser_wait(120000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("cm launch the url in pricelist negative scenarios");

        }
    }
    @When("cm click the login button in pricelist negative scenarios")
    public void cm_click_the_login_button_in_pricelist_negative_scenarios() throws IOException {
        try {
            click("first_login");
            Thread.sleep(3000);
            browser_wait(1000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("cm click the login button in pricelist negative scenarios");

        }
    }
    @Then("cm successfully lands on sign in pricelist negative scenarios")
    public void cm_successfully_lands_on_sign_in_pricelist_negative_scenarios() throws IOException {
        try{
            str= driver.findElement(By.xpath(OR_reader("login_title"))).getText();

            Assert.assertEquals(str,td_reader("login_title"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("cm successfully lands on sign in pricelist negative scenarios");
        }}
    @Then("cm click sign in button in pricelist negative scenarios")
    public void cm_click_sign_in_button_in_pricelist_negative_scenarios() throws IOException {
        try {
            click("login");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("cm click sign in button in pricelist negative scenarios");

        }
    }
    @Then("cm check validation message in pricelist negative scenarios")
    public void cm_check_validation_message_in_pricelist_negative_scenarios() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("validation_msg"))).getText();
            Assert.assertEquals(str,td_reader("validation_msg"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("cm check validation message in pricelist negative scenarios");

        }
    }
    @When("cm enters invalid email id and invalid password in pricelist negative scenarios")
    public void cm_enters_invalid_email_id_and_invalid_password_in_pricelist_negative_scenarios() throws InterruptedException, IOException {
        try {
            driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("complince_manager_invalid_email",0));
            Thread.sleep(3000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("invalid_email_of_complaince_manager_pricelist_negative_scenarios");
        }
        try {
            driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("complince_manager_invalid_pass",0));
            Thread.sleep(2000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("cm enters invalid email id and invalid password in pricelist negative scenarios");
        }
    }
    @Then("cm click on the login button in the pricelist negative scenarios")
    public void cm_click_on_the_login_button_in_the_pricelist_negative_scenarios() throws IOException {
        try {
            click("login");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("cm click on the login button in the pricelist negative scenarios");

        }
    }
    @Then("cm check the validation msg in the pricelist negative scenarios")
    public void cm_check_the_validation_msg_in_the_pricelist_negative_scenarios() throws IOException, InterruptedException {
        try {
            str= driver.findElement(By.xpath(OR_reader("validation_msg"))).getText();
            Assert.assertEquals(str,td_reader("validation_msg"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("cm check the validation msg in the pricelist negative scenarios");
            Thread.sleep(1000);
            browser_wait(500);
        }
    }
    @When("cm enters valid email id and invalid password in pricelist negative scenarios")
    public void cm_enters_valid_email_id_and_invalid_password_in_pricelist_negative_scenarios() throws IOException, InterruptedException {
        try {
            driver.findElement(By.xpath(OR_reader( "login_email"))).clear();
            driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("login_emaill",0));
            Thread.sleep(3000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("valid_email_of_pricelist_complaince_negative");
        }
        try {
            driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("complince_manager_invalid_pass",0));
            Thread.sleep(2000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("invalid_password_of_pricelist_complaince_negative");
        }
    }
    @Then("cm click on the login button after entering valid email id and invalid password in the priselist negative")
    public void cm_click_on_the_login_button_after_entering_valid_email_id_and_invalid_password_in_the_priselist_negative() throws IOException {
        try {
            click("login");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("cm_click_on_the_login_button_after_entering_valid_email_id_and_invalid_password_in_the_priselist_negative");

        }
    }

    @Then("cm check the validation msg after entering valid email id and invalid password in the pricelist negative")
    public void cm_check_the_validation_msg_after_entering_valid_email_id_and_invalid_password_in_the_pricelist_negative() throws IOException, InterruptedException {
        try {
            str= driver.findElement(By.xpath(OR_reader("validation_msg"))).getText();
            Assert.assertEquals(str,td_reader("validation_msg"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("cm_check_the_validation_msg_after_entering_valid_email_id_and_invalid_password_in_the_pricelist_negative");
            Thread.sleep(1000);
            browser_wait(500);
        }
    }

    @When("cm enters invalid email id and valid password in the login page of the pricelist negative")
    public void cm_enters_invalid_email_id_and_valid_password_in_the_login_page_of_the_pricelist_negative() throws IOException, InterruptedException {
        try {
            driver.findElement(By.xpath(OR_reader( "login_email"))).clear();
            driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("complince_manager_invalid_email",0));
            Thread.sleep(3000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("invalid_email_valid_pass_of_pricelist_complaince_negative");
        }
        try {
            driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("complince_manager_invalid_pass",0));
            Thread.sleep(2000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("valid_pass_invalid_email_of_pricelist_complaince_negative");
        }
    }

    @Then("cm click on the login button after entering invalid email id and valid password in the pricelist negative")
    public void cm_click_on_the_login_button_after_entering_invalid_email_id_and_valid_password_in_the_pricelist_negative() throws IOException {
        try {
            click("login");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("cm_click_on_the_login_button_after_entering_invalid_email_id_and_valid_password_in_the_pricelist_negative");

        }
    }

    @Then("cm check the validation msg after entering invalid email id and valid password in the pricelist negative")
    public void cm_check_the_validation_msg_after_entering_invalid_email_id_and_valid_password_in_the_pricelist_negative() throws IOException, InterruptedException {
        try {
            str= driver.findElement(By.xpath(OR_reader("validation_msg"))).getText();
            Assert.assertEquals(str,td_reader("validation_msg"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("cm_check_the_validation_msg_after_entering_invalid_email_id_and_valid_password_in_the_pricelist_negative");
            Thread.sleep(1000);
            browser_wait(500);
        }
    }

    @When("cm enters valid email id and valid password in the login page in the pricelist negative")
    public void cm_enters_valid_email_id_and_valid_password_in_the_login_page_in_the_pricelist_negative() throws IOException, InterruptedException {
        try {
            driver.findElement(By.xpath(OR_reader( "login_email"))).clear();
            driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("login_emaill",0));
            Thread.sleep(3000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("valid_email_pass_of_pricelist_complaince_negatve");
        }
        try {
            driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("login_passwordd",0));
            Thread.sleep(2000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("valid_password_email_of_pricelist_complaince_negative");
        }
    }

    @Then("click on the login button after entering valid email id and valid password in the pricelist negative")
    public void click_on_the_login_button_after_entering_valid_email_id_and_valid_password_in_the_pricelist_negative() throws IOException {
        try {
            click("login");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_login_button_after_entering_valid_email_id_and_valid_password_in_the_pricelist_negative");

        }
    }
    @When("cm click on the price list in the pricelist negative")
    public void cm_click_on_the_price_list_in_the_pricelist_negative() throws IOException {
        try {
            click("complaince_pricelist");
            Thread.sleep(5000);
            browser_wait(7000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("cm_click_on_the_price_list_in_the_pricelist_negative");
        }
    }

    @Then("validate cm navigated to the price list page in the complince manager negative")
    public void validate_cm_navigated_to_the_price_list_page_in_the_complince_manager_negative() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("pricelist_title"))).getText();
            Assert.assertEquals(str,td_reader("pricelist_title"));
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("cm_navigated_to_the_price_list_page_in_the_complince_manager_negative");
        }
    }

    @When("click on the search button in the complince manager pricelist negative scenarios")
    public void click_on_the_search_button_in_the_complince_manager_pricelist_negative_scenarios() throws IOException {
        try{
            click("search_lobs");
            Thread.sleep(1000);
            browser_wait(3000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_search_button_in_the_complince_manager_pricelist_negative_scenarios");
        }
    }

    @Then("cm give any invalid data in the field of serching lob")
    public void cm_give_any_invalid_data_in_the_field_of_serching_lob() throws IOException {
        try{

            driver.findElement(By.xpath(OR_reader( "search_lobs"))).sendKeys(td_reader("invalid_search_data",0));
            Thread.sleep(1000);
            browser_wait(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("cm_give_any_invalid_data_in_the_field_of_serching_lob");

        }
    }

    @When("clear the search field in thecm pricelist negative scenarios")
    public void clear_the_search_field_in_thecm_pricelist_negative_scenarios() throws IOException {
        try {
            backspace("search_lobs");
            Thread.sleep(1000);

        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("clear_the_search_field_in_thecm_pricelist_negative_scenarios");
        }
    }

    @Then("cm can give valid data for searching the pricelist negative scenarios")
    public void cm_can_give_valid_data_for_searching_the_pricelist_negative_scenarios() throws IOException {
        try{

            driver.findElement(By.xpath(OR_reader( "search_lobs"))).sendKeys(td_reader("complaince_search",0));
            Thread.sleep(1000);
            browser_wait(3000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("cm_can_give_valid_data_for_searching_the_pricelist_negative_scenarios");
        }
    }

    @Then("click the corresponding pricelist of the cm pricelist negative scenarios")
    public void click_the_corresponding_pricelist_of_the_cm_pricelist_negative_scenarios() throws IOException {
        try{
            click("view_price_list_click");
            Thread.sleep(1000);
            browser_wait(3000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_the_corresponding_pricelist_of_the_cm_pricelist_negative_scenarios");
        }
    }

    @Then("click the any of the prise list file in the cm pricelist negative scenarios")
    public void click_the_any_of_the_prise_list_file_in_the_cm_pricelist_negative_scenarios() throws IOException {
        try {
            click("any_price_list");
            Thread.sleep(3000);
            browser_wait(5000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_the_any_of_the_prise_list_file_in_the_cm_pricelist_negative_scenarios");
        }
    }

    @Then("click on the second download button of cm pricelist negative scenarios")
    public void click_on_the_second_download_button_of_cm_pricelist_negative_scenarios() throws IOException {
        try {
            click("any_price_list2");
            Thread.sleep(3000);
            browser_wait(5000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_second_download_button_of_cm_pricelist_negative_scenarios");
        }
    }

    @Then("go back to the price list dashboard of the cm pricelist negative scenarios")
    public void go_back_to_the_price_list_dashboard_of_the_cm_pricelist_negative_scenarios() throws IOException {
        try{
            click("price_list_dashboard");
            Thread.sleep(5000);
            browser_wait(7000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("go_back_to_the_price_list_dashboard_of_the_cm_pricelist_negative_scenarios");
        }}

    @When("cm pricelist negative scenarios signout")
    public void cm_pricelist_negative_scenarios_signout() throws IOException {
        try{
            click("so1");

            Thread.sleep(3000);
            browser_wait(5000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("cm_pricelist_negative_scenarios_signout");
        }
    }

    @Then("cm pricelist negative scenarios logout")
    public void cm_pricelist_negative_scenarios_logout() throws IOException {
        try{
            click("so2");

            Thread.sleep(3000);
            browser_wait(5000);
            driver.close();
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("cm pricelist negative scenarios logout");




        }
    }


}












