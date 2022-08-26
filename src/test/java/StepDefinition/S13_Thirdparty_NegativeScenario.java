package StepDefinition;
import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;
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

public class S13_Thirdparty_NegativeScenario extends Generic_function{
    static int s;
    static String str;
    static boolean value;

    @Given("launch the url for checking the thirdparty logins")
    public void launch_the_url_for_checking_the_thirdparty_logins() throws IOException {
        try {
            browser_launch();
            s= Dataiter();
            browser_wait(120000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("landing_page_of_thirdparty_negative");

        }
    }

    @When("click on the login button for checking third party loginn")
    public void click_on_the_login_button_for_checking_third_party_loginn() throws IOException {
        try {
            click("first_login");
            Thread.sleep(3000);
            browser_wait(1000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_login_button_of_thirdparty_negative");

        }
    }

    @When("check that the user lands on the login page successfully for checking third party loginn")
    public void check_that_the_user_lands_on_the_login_page_successfully_for_checking_third_party_loginn() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("login_title"))).getText();
            Assert.assertEquals(str,td_reader("login_title"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("login_page_of_thirdparty_negative");

        }
    }

    @Then("click on the first login part")
    public void click_on_the_first_login_part() throws IOException {
        try {
            click("login");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_login");

        }

    }
    @Then("validation message is displiayedd")
    public void validation_message_is_displiayedd() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("third_party_negative_login_validation_msg"))).getText();
            Assert.assertEquals(str,td_reader("third_party_negative_login_validation_msg"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_login_validation_msgg");

        }
    }
    @When("third party enters invalid email id and invalid password in the login page")
    public void third_party_enters_invalid_email_id_and_invalid_password_in_the_login_page() throws IOException, InterruptedException {
        try {
            driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("third_party_negative_invalid_email",0));
            Thread.sleep(3000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("invalid_email_of_thirdparty_negative");
        }
        try {
            driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("third_party_negative_invalid_email",0));
            Thread.sleep(2000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("invalid_password_of_thirdparty_negative");
        }
    }

    @Then("click on the login button after entering invalid email id and invalid password")
    public void click_on_the_login_button_after_entering_invalid_email_id_and_invalid_password() throws IOException {
        try {
            click("login");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_login_giving_invalid_email_invalid_pass");

        }
    }

    @Then("check the validation msg is displayed or not")
    public void check_the_validation_msg_is_displayed_or_not() throws IOException, InterruptedException {
        try {
            str= driver.findElement(By.xpath(OR_reader("third_party_negative_login_validation_msg"))).getText();
            Assert.assertEquals(str,td_reader("third_party_negative_login_validation_msg"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_login_validation_msgg_giving_invalid_email_invalid_pass");
            Thread.sleep(1000);
            browser_wait(500);
        }

    }
    @When("third party enters valid email id and invalid password in the login page")
    public void third_party_enters_valid_email_id_and_invalid_password_in_the_login_page() throws InterruptedException, IOException {
        try {
            driver.findElement(By.xpath(OR_reader( "login_email"))).clear();
            driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("sir_third",0));
            Thread.sleep(3000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("valid_email_of_thirdparty_negative_login");
        }
        try {
            driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("third_party_negative_invalid_pass",0));
            Thread.sleep(2000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("invalid_password_of_thirdparty_negative_login");
        }
    }

    @Then("click on the login button after entering valid email id and invalid password")
    public void click_on_the_login_button_after_entering_valid_email_id_and_invalid_password() throws IOException {
        try {
            click("login");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_login_giving_valid_email_invalid_pass");

        }
    }

    @Then("check the validation msg is displayed or not after entering valid email id and invalid password")
    public void check_the_validation_msg_is_displayed_or_not_after_entering_valid_email_id_and_invalid_password() throws IOException, InterruptedException {
        try {
            str= driver.findElement(By.xpath(OR_reader("third_party_negative_login_validation_msg"))).getText();
            Assert.assertEquals(str,td_reader("third_party_negative_login_validation_msg"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_login_validation_msgg_giving_valid_email_invalid_pass");
            Thread.sleep(1000);
            browser_wait(500);
        }
    }
    @When("third party enters invalid email id and valid password in the login page")
    public void third_party_enters_invalid_email_id_and_valid_password_in_the_login_page() throws InterruptedException, IOException {
        try {
            driver.findElement(By.xpath(OR_reader( "login_email"))).clear();
            driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("third_party_negative_invalid_email",0));
            Thread.sleep(3000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("invalid_email_valid_pass_of_thirdparty_negative_login");
        }
        try {
            driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("login_password",0));
            Thread.sleep(2000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("valid_pass_invalid_email_of_thirdparty_negative_login");
        }
    }

    @Then("click on the login button after entering invalid email id and valid password")
    public void click_on_the_login_button_after_entering_invalid_email_id_and_valid_password() throws IOException {
        try {
            click("login");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_login_giving_invalid_email_valid_pass");

        }
    }

    @Then("check the validation msg is displayed or not after entering invalid email id and valid password")
    public void check_the_validation_msg_is_displayed_or_not_after_entering_invalid_email_id_and_valid_password() throws IOException, InterruptedException {
        try {
            str= driver.findElement(By.xpath(OR_reader("third_party_negative_login_validation_msg"))).getText();
            Assert.assertEquals(str,td_reader("third_party_negative_login_validation_msg"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_login_validation_msgg_giving_invalid_email_valid_pass");
            Thread.sleep(1000);
            browser_wait(500);
        }
    }
    @When("third party enters valid email id and valid password in the login page thirdparty negative")
    public void third_party_enters_valid_email_id_and_valid_password_in_the_login_page_thirdparty_negative() throws InterruptedException, IOException {
        try {
            driver.findElement(By.xpath(OR_reader( "login_email"))).clear();
            driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("sir_third",0));
            Thread.sleep(3000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("valid_email_valid_pass_of_thirdparty_negative");
        }
        try {
            driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("login_password",0));
            Thread.sleep(2000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("valid_password_valid_email_of_thirdparty_negative");
        }
    }

    @Then("click on the login button after entering valid email id and valid password thirdparty negative")
    public void click_on_the_login_button_after_entering_valid_email_id_and_valid_password_thirdparty_negative() throws IOException {
        try {
            click("login");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_login_giving_valid_email_valid_pass");

        }
    }


    @When("click on the create application button in third party negative page")
    public void click_on_the_create_application_button_in_third_party_negative_page() throws IOException {
        try {
            click("third_party_create_app_button");
            Thread.sleep(2000);
            browser_wait(1000);
            //value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
            //Assert.assertEquals(true,value);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_click_creation_application_button");

            //str= driver.findElement(By.xpath(OR_reader("create_apph"))).getText();
            //Assert.assertEquals(str,td_reader("create_apph"));
        }
    }

    @Then("lands on the create application page in third party negative")
    public void lands_on_the_create_application_page_in_third_party_negative() throws IOException, InterruptedException {
        try {
            str= driver.findElement(By.xpath(OR_reader("third_party_negative_app_create_page"))).getText();
            Assert.assertEquals(str,td_reader("third_party_negative_app_create_page"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_create_application");
            Thread.sleep(1000);
            browser_wait(500);
        }
    }

    @Then("able to fill the fiels and left some fields are blank")
    public void able_to_fill_the_fiels_and_left_some_fields_are_blank() throws IOException {
        try {
            //String app = RandomStringUtils.randomAlphabetic(8);
            //driver.findElement(By.xpath(OR_reader( "app_name"))).sendKeys(app);
            Random randomGeneratorapp1 = new Random();
            int randomInt = randomGeneratorapp1.nextInt(1000);
            driver.findElement(By.xpath(OR_reader( "app_name"))).sendKeys("First Application"+ randomInt );

            //Random randomGeneratordo = new Random();
            // int randomIntdo1 = randomGeneratordo.nextInt(1000);
            // driver.findElement(By.xpath(OR_reader( "auth_do"))).sendKeys("app"+ randomIntdo1 +".cornell.edu");

            String appdes1 = RandomStringUtils.randomAlphabetic(8);
            driver.findElement(By.xpath(OR_reader( "app_des"))).sendKeys(appdes1);

            Random randomGenerator = new Random();
            int randomIntem = randomGenerator.nextInt(1000);
            driver.findElement(By.xpath(OR_reader( "app_em"))).sendKeys("first"+ randomIntem +"@gmail.com");

            //  String appli1 = RandomStringUtils.randomAlphabetic(8);
            //driver.findElement(By.xpath(OR_reader( "app_li"))).sendKeys(appli1);

            //String appterms1 = RandomStringUtils.randomAlphabetic(8);
            //driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(appterms1);

            //driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(td_reader("app_terms",0));
            str= driver.findElement(By.xpath(OR_reader("query_limit"))).getText();
            Assert.assertEquals(str,td_reader("query_limit"));
            click("query_limit");
            Thread.sleep(2000);
            browser_wait(1000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_application_creation");
        }
    }

    @Then("click on the create application button in the third party negative")
    public void click_on_the_create_application_button_in_the_third_party_negative() throws IOException {
        try {
            click("create");
            browser_wait(1000);
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_first_app_click_create_button");
        }
    }
    @When("thirdparty user fill all mandatory fields")
    public void thirdparty_user_fill_all_mandatory_fields() throws IOException {
        try{
            Random randomGeneratordo = new Random();

            int randomIntdo1 = randomGeneratordo.nextInt(1000);
            driver.findElement(By.xpath(OR_reader( "auth_do"))).sendKeys("app"+ randomIntdo1 +".cornell.com");

            String appli1 = RandomStringUtils.randomAlphabetic(8);
            driver.findElement(By.xpath(OR_reader( "app_li"))).sendKeys(appli1);

            String appterms1 = RandomStringUtils.randomAlphabetic(8);
            driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(appterms1);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_fill_all_fields_application_creation");
        }
    }

    @Then("click on application ceation in the thirdparty negative")
    public void click_on_application_ceation_in_the_thirdparty_negative() throws IOException {
        try {
            click("create");
            browser_wait(1000);
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_first_app_click_create_button_after_entering_all_fields");
        }
    }

    @Then("close the window presented in the application creation")
    public void close_the_window_presented_in_the_application_creation() throws IOException, InterruptedException {
        try {
            click("thirdparty_application_cancel_cross_button");
            browser_wait(1000);
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_click_cancel_after_entering_all_fields");
            browser_wait(1000);
            Thread.sleep(3000);
        }
    }
    @When("click on the create application button to check that with an invalid email id application is created or not")
    public void click_on_the_create_application_button_to_check_that_with_an_invalid_email_id_application_is_created_or_not() throws IOException {
        try {
            click("third_party_create_app_button");
            browser_wait(1000);
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_create_application_button_to_check_that_with_an_invalid_email_id_applications_is_created_or_not");
        }
    }

    @Then("lands on the create application page in third party negative scenarios")
    public void lands_on_the_create_application_page_in_third_party_negative_scenarios() throws IOException, InterruptedException {
        try {
            str= driver.findElement(By.xpath(OR_reader("third_party_negative_app_create_page"))).getText();
            Assert.assertEquals(str,td_reader("third_party_negative_app_create_page"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("lands_on_the_create_application_page_in_third_party_negative_scenarios");
            Thread.sleep(1000);
            browser_wait(500);
        }
    }
    @Then("tries to create application with invalid email format")
    public void tries_to_create_application_with_invalid_email_format() throws IOException {
        try {
            //String app = RandomStringUtils.randomAlphabetic(8);
            //driver.findElement(By.xpath(OR_reader( "app_name"))).sendKeys(app);
            Random randomGeneratorapp1 = new Random();
            int randomInt = randomGeneratorapp1.nextInt(1000);
            driver.findElement(By.xpath(OR_reader( "app_name"))).sendKeys("First Application"+ randomInt );

            Random randomGeneratordo = new Random();
            int randomIntdo1 = randomGeneratordo.nextInt(1000);
            driver.findElement(By.xpath(OR_reader( "auth_do"))).sendKeys("app"+ randomIntdo1 +".cornell.edu");

            String appdes1 = RandomStringUtils.randomAlphabetic(8);
            driver.findElement(By.xpath(OR_reader( "app_des"))).sendKeys(appdes1);

            Random randomGenerator = new Random();
            int randomIntem = randomGenerator.nextInt(1000);
            driver.findElement(By.xpath(OR_reader( "app_em"))).sendKeys("first"+ randomIntem +"gmail.com");

            String appli1 = RandomStringUtils.randomAlphabetic(8);
            driver.findElement(By.xpath(OR_reader( "app_li"))).sendKeys(appli1);

            String appterms1 = RandomStringUtils.randomAlphabetic(8);
            driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(appterms1);

            //driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(td_reader("app_terms",0));
            str= driver.findElement(By.xpath(OR_reader("query_limit"))).getText();
            Assert.assertEquals(str,td_reader("query_limit"));
            click("query_limit");
            Thread.sleep(2000);
            browser_wait(1000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_application_creation_with_invalid_email_formats");
        }
    }

    @Then("thirdparty click on the save button with an invalid email id")
    public void thirdparty_click_on_the_save_button_with_an_invalid_email_id() throws IOException {
        try {
            click("create");
            browser_wait(1000);
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_click_on_the_save_button_with_an_invalid_email_id");
        }
    }

    @When("third party giving valid email id")
    public void third_party_giving_valid_email_id() throws IOException {
        try {
            backspace("app_em");
            Thread.sleep(1000);
            Random randomGenerator = new Random();
            int randomIntem = randomGenerator.nextInt(1000);
            driver.findElement(By.xpath(OR_reader( "app_em"))).sendKeys("new"+ randomIntem +"@gmail.com");
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_try_to_give_valid_email_id");
        }
    }

    @Then("click on save button after giving the valid email id")
    public void click_on_save_button_after_giving_the_valid_email_id() throws IOException {
        try {
            click("create");
            browser_wait(1000);
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_save_button_after_giving_the_valid_email_id");
        }
    }

    @Then("click on the cancel button after the application is created")
    public void click_on_the_cancel_button_after_the_application_is_created() throws IOException, InterruptedException {
        try {
            click("thirdparty_application_cancel_cross_button");
            browser_wait(1000);
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_cancel_button_after_the_application_is_created");

        }

    }
    @When("thirdparty click one pending list of applicatons")
    public void thirdparty_click_one_pending_list_of_applicatons() throws IOException {
        try {
            click("cm_third_pending");
            browser_wait(1000);
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_click_on_the_pendinglist_of_applications_in_the_dashboard");
        }
    }

    @Then("click the edit button of the last created applications")
    public void click_the_edit_button_of_the_last_created_applications() throws IOException {
        try {
            click("cm_third_pending_last_edit");
            browser_wait(1000);
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_click_on_the_last+apppending_in_the_dashboard");
        }
    }

    @Then("tried to remove any one of the field")
    public void tried_to_remove_any_one_of_the_field() throws IOException {
        try {
            backspace("app_li");
            //Thread.sleep();
            Thread.sleep(2000);
            browser_wait(1000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_try_to_remove_any_one_of_the_field_in_the_edit");
        }
    }

    @Then("click on the update button and check that the application is created or not")
    public void click_on_the_update_button_and_check_that_the_application_is_created_or_not() throws IOException {
        try {
            click("thirdparty_negative_update");
            Thread.sleep(2000);
            browser_wait(1000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_try_to_click_on_the_update_button");
        }
    }
    @When("thirdparty give the valid data")
    public void thirdparty_give_the_valid_data() throws IOException, InterruptedException {
        try {
            Random randomGeneratorapp1 = new Random();

            int randomInt = randomGeneratorapp1.nextInt(1000);
            driver.findElement(By.xpath(OR_reader( "app_li"))).sendKeys("secondapplication"+ randomInt );
            Thread.sleep(2000);
            browser_wait(1000);
        }  catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_try_to_give_valid_data_in_the_edit_field");
        }
    }

    @Then("click the updated buttion in the thirdparty negative")
    public void click_the_updated_buttion_in_the_thirdparty_negative() throws IOException {
        try {
            click("thirdparty_negative_update");
            Thread.sleep(2000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_try_to_click_on_the_update_button_in_the_edit_field");
        }
    }
    @When("click on the thirdparty negative scenario dashboard")
    public void click_on_the_thirdparty_negative_scenario_dashboard() throws IOException {
        try {
            click("click_thirdparty_dashboard");
            browser_wait(1000);
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_dashboard_clicking");
        }
    }

    @Then("sucessfully navigated to the thirdparty negative scenario dashboard")
    public void sucessfully_navigated_to_the_thirdparty_negative_scenario_dashboard() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("thirdparty_dashboard"))).getText();
            Assert.assertEquals(str,td_reader("thirdparty_dashboard"));

        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_scenario_sucessfully_navigated_to_the_dashboard_after_checking_list");
        }
    }

    @Then("click on the thirdparty negative scenario pricelist")
    public void click_on_the_thirdparty_negative_scenario_pricelist() throws IOException {
        try {
            click("click_thirdparty_pricelist");
            browser_wait(1000);
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_scenario_click_on_the_pricelist");
        }
    }

    @Then("sucessfully navigated to the third party negative scenario pricelist")
    public void sucessfully_navigated_to_the_third_party_negative_scenario_pricelist() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("thirdparty_pricelist_dashboard"))).getText();
            Assert.assertEquals(str,td_reader("thirdparty_pricelist_dashboard"));

        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_scenario_sucessfully_navigated_to_the_preice_list");
        }
    }
    @When("click on the search button in the third party negative scenario")
    public void click_on_the_search_button_in_the_third_party_negative_scenario() throws IOException {
        try {
            click("thirdparty_search_lobs");
            browser_wait(1000);
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_scenario_click_the_search_button_of_the_pricelist");
        }
    }

    @Then("thirdparty can give invalid data for searching negative scenario")
    public void thirdparty_can_give_invalid_data_for_searching_negative_scenario() throws IOException {
        try{

            driver.findElement(By.xpath(OR_reader( "thirdparty_search_lobs"))).sendKeys(td_reader("third_party_negative_invalid_search",0));
            Thread.sleep(1000);
            browser_wait(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_scenario_click_the_search_lobs");

        }
    }
    @When("clear the search field in the third party negative scenario")
    public void clear_the_search_field_in_the_third_party_negative_scenario() throws IOException {
        try {
            backspace("thirdparty_search_lobs");
            Thread.sleep(1000);

        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_edited_scenario_valid_data");
        }
    }

    @Then("thirdparty can give valid data for searching negative scenario")
    public void thirdparty_can_give_valid_data_for_searching_negative_scenario() throws IOException {
        try{

            driver.findElement(By.xpath(OR_reader( "thirdparty_search_lobs"))).sendKeys(td_reader("thirdparty_search_lobs",0));
            Thread.sleep(1000);
            browser_wait(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_scenario_click_the_search_lobs_giving_valid_search_data");
        }
    }

    @Then("click the corresponding pricelist of the thirdparty negative scenario")
    public void click_the_corresponding_pricelist_of_the_thirdparty_negative_scenario() throws IOException {
        try{
            click("thirdparty_view_price_list");
            browser_wait(1000);
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_click_the_pricelist");
        }}


    @Then("click the any of the prise list file in the thirdparty negative scenario")
    public void click_the_any_of_the_prise_list_file_in_the_thirdparty_negative_scenario() throws IOException {
        try{
            click("thirdparty_any_price_list");
            browser_wait(1000);
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_scenario_download_first_price_list");
        }
    }

    @Then("click on the second download button of pricelist negative scenario")
    public void click_on_the_second_download_button_of_pricelist_negative_scenario() throws IOException {
        try{
            click("thirdparty_any_price_list2");
            browser_wait(1000);
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_scenario_click_second_pricelist");
        }
    }

    @Then("go back to the price list dashboard of the third party negative scenario")
    public void go_back_to_the_price_list_dashboard_of_the_third_party_negative_scenario() throws IOException {
        try{
            click("thirdparty_price_list_dashboard");

            Thread.sleep(3000);
            browser_wait(5000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_scenario_back_to_dashboard");
        }
    }

    @When("third party negative scenario signout")
    public void third_party_negative_scenario_signout() throws IOException {
        try{
            click("so1");

            Thread.sleep(3000);
            browser_wait(5000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_scenario_signout");
        }
    }

    @Then("thirdparty negative scenario logout")
    public void thirdparty_negative_scenario_logout() throws IOException  {
        try{
            click("so2");

            Thread.sleep(3000);
            browser_wait(5000);
            driver.close();
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_negative_scenario_logout");
        }
    }
}



