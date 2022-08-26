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


public class S06_Internal_Developer_Pricelist_NegaiveScenario extends Generic_function {
    static int s;
    static String str;
    static boolean value;
    /* Internal Developer is not able to sigh in when email and Password fields are blank */

    @Given("internal developer launch url in pricelist neagive scenario")
    public void internal_developer_launch_url_in_pricelist_neagive_scenario() throws IOException {
        try {
            browser_launch();
            s= Dataiter();
            browser_wait(120000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("launch_the_url_for_checking_the_internal_developer_negative_login");

        }
    }

    @When("internal developer clicks login button in pricelist neagive scenario")
    public void internal_developer_clicks_login_button_in_pricelist_neagive_scenario() throws IOException {
        try {
            click("first_login");
            Thread.sleep(3000);
            browser_wait(1000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_login_button_for_checking_internal_developer_negative_login");

        }
    }

    @When("internal developer lands on the login page in pricelist neagive scenario")
    public void internal_developer_lands_on_the_login_page_in_pricelist_neagive_scenario() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("login_title"))).getText();
            Assert.assertEquals(str,td_reader("login_title"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("check_that_the_user_lands_on_the_login_page_successfully_for_checking_the_internal_developer_negative_login");

        }
    }

    @Then("internal developer clicks sigh in button in pricelist neagive scenario")
    public void internal_developer_clicks_sigh_in_button_in_pricelist_neagive_scenario() throws IOException {
        try {
            click("login");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_first_login_part_in_internal_developer_negative_login");

        }
    }

    @Then("validation message is displayed in pricelist neagive scenario")
    public void validation_message_is_displayed_in_pricelist_neagive_scenario() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("validation_msg"))).getText();
            Assert.assertEquals(str,td_reader("validation_msg"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("validation message is displiayed for the internal developer negative login");

        }
    }

    /* Internal Developer is not allowed to sighin with valid email and invalid password */

    @When("int dev enters invalid email id and invalid password in pricelist neagive scenario")
    public void int_dev_enters_invalid_email_id_and_invalid_password_in_pricelist_neagive_scenario() throws IOException, InterruptedException {
        try {
            driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("internal_developer_negative_invalid_email",0));
            Thread.sleep(3000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("invalid_email_of_internaldeveloper_negative");
        }
        try {
            driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("internal_developer_negative_invalid_pass",0));
            Thread.sleep(2000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("internal developer enters invalid  password");
        }
    }

    @Then("internal developer clicks signin button in pricelist neagive scenario")
    public void internal_developer_clicks_signin_button_in_pricelist_neagive_scenario() throws IOException {
        try {
            click("login");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal developer clicks signin button in pricelist neagive scenario");

        }
    }

    @Then("check the validation msg in pricelist neagive scenario")
    public void check_the_validation_msg_in_pricelist_neagive_scenario() throws IOException, InterruptedException {
        try {
            str= driver.findElement(By.xpath(OR_reader("validation_msg"))).getText();
            Assert.assertEquals(str,td_reader("validation_msg"));
        }catch (Exception e)
        {
            e.printStackTrace();
            takeScreenShot("check the validation msg in pricelist neagive scenario");
            Thread.sleep(1000);
            browser_wait(500);
        }
    }
    /* Validate that internal developer login with the valid credentials */

    @When("internal developer enters valid email id and invalid password in pricelist neagive scenario")
    public void internal_developer_enters_valid_email_id_and_invalid_password_in_pricelist_neagive_scenario() throws IOException, InterruptedException {
        try {
            driver.findElement(By.xpath(OR_reader( "login_email"))).clear();
            driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("int_pricelist_login_email",0));
            Thread.sleep(3000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_negative_logins_enters_valid_email_id_and_invalid_password_in_the_login_page");
        }
        try {
            driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("internal_developer_negative_invalid_pass",0));
            Thread.sleep(2000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_negative_logins_invalid_password_valid_emai_in_the_login_page");
        }
    }

    @Then("internal developer clicks sighin button after entering valid email id and invalid password")
    public void internal_developer_clicks_sighin_button_after_entering_valid_email_id_and_invalid_password() throws IOException {
        try {
            click("login");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_click_on_the_login_button_after_entering_valid_email_id_and_invalid_password");

        }
    }

    @Then("int dev check the validation msg in pricelist neagive scenario")
    public void int_dev_check_the_validation_msg_in_pricelist_neagive_scenario() throws IOException, InterruptedException {
        try {
            str= driver.findElement(By.xpath(OR_reader("validation_msg"))).getText();
            Assert.assertEquals(str,td_reader("validation_msg"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_check_the_validation_msg_is_displayed_or_not_after_entering_valid_email_id_and_invalid_password");
            Thread.sleep(1000);
            browser_wait(500);
        }
    }
    /* Validate that the internal developer is not allowed to login with invalid email and valid password */

    @When("internal developer enters invalid email in pricelist neagive scenario")
    public void internal_developer_enters_invalid_email_in_pricelist_neagive_scenario() throws InterruptedException, IOException {
        try {
            driver.findElement(By.xpath(OR_reader( "login_email"))).clear();
            driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("internal_developer_negative_invalid_email",0));
            Thread.sleep(3000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("invalid_email_valid_pass_of_thirdparty_negative_scenario");
        }
        try {
            driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("int_pricelist_login_password",0));
            Thread.sleep(2000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("valid_password_invalid_email_of_thirdparty_negative");
        }
    }

    @Then("internal developer click on the login button after entering invalid email")
    public void internal_developer_click_on_the_login_button_after_entering_invalid_email() throws IOException {
        try {
            click("login");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_click_on_the_login_button_after_entering_invalid_email_id_and_valid_password");

        }
    }

    @Then("check the validation msg after entering invalid email in pricelist neagive scenario")
    public void check_the_validation_msg_after_entering_invalid_email_in_pricelist_neagive_scenario() throws IOException, InterruptedException {
        try {
            str= driver.findElement(By.xpath(OR_reader("validation_msg"))).getText();
            Assert.assertEquals(str,td_reader("validation_msg"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_check_the_validation_msg_is_displayed_or_not_after_entering_invalid_email_id_and_valid_password");
            Thread.sleep(1000);
            browser_wait(500);
        }
    }
    /*Validate that internal developer login with the valid credentials  */

    @When("internal developer valid credentials in pricelist neagive scenario")
    public void internal_developer_valid_credentials_in_pricelist_neagive_scenario() throws InterruptedException {
        try {
            driver.findElement(By.xpath(OR_reader( "login_email"))).clear();
            driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("int_pricelist_login_email",0));
            Thread.sleep(3000);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("int_pricelist_login_password",0));
            Thread.sleep(2000);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    @Then("internal developer clicks sign in button in pricelist neagive scenario")
    public void internal_developer_clicks_sign_in_button_in_pricelist_neagive_scenario() throws IOException {
        try {
            click("login");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal developer clicks sign in button in pricelist neagive scenario");

        }
    }
    @Then("successfully navigated to users page in pricelist neagive scenario")
    public void successfully_navigated_to_users_page_in_pricelist_neagive_scenario() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("internal_loginpage_first_title"))).getText();
            Assert.assertEquals(str,td_reader("internal_loginpage_first_title"));
            Thread.sleep(5000);
            browser_wait(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("successfully navigated to users page in pricelist neagive scenario");

        }
    }
    /* Perfome invalid serch operation in Lobs */

    @When("clicks the price list button in pricelist neagive scenario")
    public void clicks_the_price_list_button_in_pricelist_neagive_scenario() throws IOException {
        try{
            click("internal_pricelist_negative_dash");
            Thread.sleep(3000);
            browser_wait(5000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_price_list_in_the_internal_developer_negative");
        }
    }

    @Then("navigated to price list in pricelist neagive scenario")
    public void navigated_to_price_list_in_pricelist_neagive_scenario() throws IOException {
        try{
            str= driver.findElement(By.xpath(OR_reader("pricelist_title"))).getText();

            Assert.assertEquals(str,td_reader("pricelist_title"));
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("validate_navigated_to_the_price_list_page_list_in_the_internal_developer_negative");
        }
    }

    @Then("click on the search button in pricelist neagive scenario")
    public void click_on_the_search_button_in_pricelist_neagive_scenario() throws IOException {
        try{
            click("search_lobs");
            Thread.sleep(1000);
            browser_wait(3000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click on the search button in pricelist neagive scenario");
        }
    }

    @Then("give any invalidata in pricelist neagive scenarios")
    public void give_any_invalidata_in_pricelist_neagive_scenarios() throws IOException {
        try{

            driver.findElement(By.xpath(OR_reader( "search_lobs"))).sendKeys(td_reader("invalid_search_data",0));
            Thread.sleep(1000);
            browser_wait(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("give any invalidata in pricelist neagive scenario");

        }
    }
    /* Perfome invalid serch operation in Lobs  */

    @When("clear the search field in pricelist neagive scenario")
    public void clear_the_search_field_in_pricelist_neagive_scenario() throws IOException {
        try {
            backspace("search_lobs");
            Thread.sleep(1000);

        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("clear the search field");
        }
    }

    @Then("give valid data for searching in pricelist neagive scenario")
    public void give_valid_data_for_searching_in_pricelist_neagive_scenario() throws IOException {

        try {
            driver.findElement(By.xpath(OR_reader( "search_lobs"))).sendKeys(td_reader("search_data",0));
            Thread.sleep(1000);
            browser_wait(3000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("give valid data for searching");
        }
    }

    @Then("clicks the serach button using valid data in pricelist neagive scenario")
    public void clicks_the_serach_button_using_valid_data_in_pricelist_neagive_scenario() throws IOException {
        try {
            click("view_price_list_click");
            Thread.sleep(1000);
            browser_wait(3000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("clicks_the_pricelist");
        }
    }

    @Then("successfully navigated lobs page in pricelist neagive scenario")
    public void successfully_navigated_lobs_page_in_pricelist_neagive_scenario() throws IOException {
        try{
            str= driver.findElement(By.xpath(OR_reader("price_list_de"))).getText();
            Assert.assertEquals(str,td_reader("price_list_de"));
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("successfully navigated to the lob page");
        }
    }
    /* downloading the file */
    @When("click the any of the prise list file in pricelist neagive scenario")
    public void click_the_any_of_the_prise_list_file_in_pricelist_neagive_scenario() throws IOException {
        try {
            click("any_price_list1");

            Thread.sleep(3000);
            browser_wait(5000);
        }  catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click the any of the prise list file");
        }}

    @Then("clicks the second download button in pricelist neagive scenario")
    public void clicks_the_second_download_button_in_pricelist_neagive_scenario() throws IOException {
        try {
            click("any_price_list2");

            Thread.sleep(3000);
            browser_wait(5000);
        }  catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click on the second download button");
        }}

    @Then("clicks the dashboard pricelist neagive scenario")
    public void clicks_the_dashboard_pricelist_neagive_scenario() throws IOException {

        try{
            click("price_list_dashboard");
            ;
            Thread.sleep(3000);
            browser_wait(5000);
            driver.close();
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("go back to the price list dashboard");
        }}



}




