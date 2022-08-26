package StepDefinition;

import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class S14_InternalDeveloper_Sandbox_NegativeScenario extends Generic_function{

    static String myapi;

    static int s;
    static String str;
    static boolean value;

    @Given("internal developer launch the url for checking the sandbox negative scenarios")
    public void internal_developer_launch_the_url_for_checking_the_sandbox_negative_scenarios() throws IOException {
        try {
            browser_launch();
            s= Dataiter();
            browser_wait(120000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_launch_the_url_for_checking_the_sandbox_negative_scenarios");

        }

    }

    @When("internal developer click on the login button without entering the email and password")
    public void internal_developer_click_on_the_login_button_without_entering_the_email_and_password() throws IOException {
        try {
            click("first_login");
            Thread.sleep(3000);
            browser_wait(1000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_click_on_the_login_button_without_entering_the_email_and_password");

        }
    }

    @When("internal developer check that the user lands on the login page for checking the sandbox negative scenarios")
    public void internal_developer_check_that_the_user_lands_on_the_login_page_for_checking_the_sandbox_negative_scenarios() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("login_title"))).getText();
            Assert.assertEquals(str,td_reader("login_title"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_check_that_the_user_lands_on_the_login_page_for_checking_the_sandbox_negative_scenarios");

        }
    }
    @Then("click on the first login part in internal developer the sandbox negative scenarios")
    public void click_on_the_first_login_part_in_internal_developer_the_sandbox_negative_scenarios() throws IOException {
        try {
            click("login");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_first_login_part_in_internal_developer_the_sandbox_negative_scenarios");

        }
    }
    @Then("validation message is displiayed for the internal developer sandbox negative login")
    public void validation_message_is_displiayed_for_the_internal_developer_sandbox_negative_login() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("validation_msg"))).getText();
            Assert.assertEquals(str,td_reader("validation_msg"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("validation_message_is_displiayed_for_the_internal_developer_sandbox_negative_login");

        }
    }

    @When("internal developer enters invalid email id and invalid password in the login page in sandbox negative scenarios")
    public void internal_developer_enters_invalid_email_id_and_invalid_password_in_the_login_page_in_sandbox_negative_scenarios() throws IOException, InterruptedException {
        try {
            driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("internal_developer_negative_invalid_email",0));
            Thread.sleep(3000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("invalid_email_of_internaldeveloper_sandbox_negative_scenarios");
        }
        try {
            driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("internal_developer_negative_invalid_pass",0));
            Thread.sleep(2000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("invalid_password_of_internaldeveloper_sandbox_negative_scenarios");
        }
    }

    @Then("internal developer click on the login button after entering invalid email id and invalid password in sandbox negative scenarios")
    public void internal_developer_click_on_the_login_button_after_entering_invalid_email_id_and_invalid_password_in_sandbox_negative_scenarios() throws IOException {
        try {
            click("login");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_click_on_the_login_button_after_entering_invalid_email_id_and_invalid_password_in_sandbox_negative_scenarios");

        }
    }

    @Then("internal developer negative login check the validation msg is displayed or not in sandbox negative scenarios")
    public void internal_developer_negative_login_check_the_validation_msg_is_displayed_or_not_in_sandbox_negative_scenarios() throws IOException, InterruptedException {
        try {
            str= driver.findElement(By.xpath(OR_reader("validation_msg"))).getText();
            Assert.assertEquals(str,td_reader("validation_msg"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_negative_login_check_the_validation_msg_is_displayed_or_not_in_sandbox_negative_scenarios");
            Thread.sleep(1000);
            browser_wait(500);
        }
    }

    @When("internal developer sandbox negative scenarios enters valid email id and invalid password in the login page")
    public void internal_developer_sandbox_negative_scenarios_enters_valid_email_id_and_invalid_password_in_the_login_page() throws IOException, InterruptedException {
        try {
            driver.findElement(By.xpath(OR_reader( "login_email"))).clear();
            driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("sir_third",0));
            Thread.sleep(3000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_sandbox_negative__enters_valid_email_id_and_invalid_password_in_the_login_page");
        }
        try {
            driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("internal_developer_negative_invalid_pass",0));
            Thread.sleep(2000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_sandbox_negative_logins_invalid_password_valid_emai_in_the_login_page");
        }
    }

    @Then("internal developer sandbox negative scenarios click on the login button after entering valid email id and invalid password")
    public void internal_developer_sandbox_negative_scenarios_click_on_the_login_button_after_entering_valid_email_id_and_invalid_password() throws IOException {
        try {
            click("login");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_sandbox_negative_scenarios_click_on_the_login_button_after_entering_valid_email_id_and_invalid_password");

        }
    }

    @Then("internal developer sandbox negative scenarios check the validation msg is displayed or not after entering valid email id and invalid password")
    public void internal_developer_sandbox_negative_scenarios_check_the_validation_msg_is_displayed_or_not_after_entering_valid_email_id_and_invalid_password() throws IOException, InterruptedException {
        try {
            str= driver.findElement(By.xpath(OR_reader("validation_msg"))).getText();
            Assert.assertEquals(str,td_reader("validation_msg"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_sandbox_negative_scenarios_check_the_validation_msg_is_displayed_or_not_after_entering_valid_email_id_and_invalid_password");
            Thread.sleep(1000);
            browser_wait(500);
        }
    }

    @When("internal developer enters invalid email id and valid password in sandbox negative scenarios login page")
    public void internal_developer_enters_invalid_email_id_and_valid_password_in_sandbox_negative_scenarios_login_page() throws IOException, InterruptedException {
        try {
            driver.findElement(By.xpath(OR_reader( "login_email"))).clear();
            driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("internal_developer_negative_invalid_email",0));
            Thread.sleep(3000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("invalid_email_valid_pass_of_sandbox_negative_scenarios_login_page");
        }
        try {
            driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("login_password",0));
            Thread.sleep(2000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("valid_password_invalid_email_of_sandbox_negative_scenarios_login_page");
        }
    }

    @Then("internal developer click on the login button after entering invalid email id and valid password in sandbox negative scenarios")
    public void internal_developer_click_on_the_login_button_after_entering_invalid_email_id_and_valid_password_in_sandbox_negative_scenarios() throws IOException {
        try {
            click("login");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal developer click on the login button after entering invalid email id and valid password in sandbox negative scenarios");

        }
    }

    @Then("internal developer check the validation msg is displayed or not after entering invalid email id and valid password in sandbox negative scenarios")
    public void internal_developer_check_the_validation_msg_is_displayed_or_not_after_entering_invalid_email_id_and_valid_password_in_sandbox_negative_scenarios() throws IOException, InterruptedException {
        try {
            str= driver.findElement(By.xpath(OR_reader("validation_msg"))).getText();
            Assert.assertEquals(str,td_reader("validation_msg"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_check_the_validation_msg_is_displayed_or_not_after_entering_invalid_email_id_and_valid_password_in_sandbox_negative_scenarios");
            Thread.sleep(1000);
            browser_wait(500);
        }
    }

    @When("internal developer enters valid email id and valid password in sandbox negative scenarios login page")
    public void internal_developer_enters_valid_email_id_and_valid_password_in_sandbox_negative_scenarios_login_page() throws InterruptedException {
        try {
            driver.findElement(By.xpath(OR_reader( "login_email"))).clear();
            driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("sir_third",0));
            Thread.sleep(3000);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("login_password",0));
            Thread.sleep(2000);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @Then("internal developer click on the login button after entering valid email id and valid password in sandbox negative scenarios")
    public void internal_developer_click_on_the_login_button_after_entering_valid_email_id_and_valid_password_in_sandbox_negative_scenarios() throws IOException {
        try {
            click("login");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_click_on_the_login_button_after_entering_valid_email_id_and_valid_password_in_sandbox_negative_scenarios");

        }
    }
    @When("click on the create application button in internal developer sandbox negative scenarios")
    public void click_on_the_create_application_button_in_internal_developer_sandbox_negative_scenarios() throws IOException {
        try {
            click("create_app");
            Thread.sleep(3000);
            browser_wait(3000);
            //value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
            //Assert.assertEquals(true,value);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_create_application_button_in_internal_developer_sandbox_negative_scenarios");
        }
    }

    @Then("lands on the create application page in  internal developer sandbox negative scenarios")
    public void lands_on_the_create_application_page_in_internal_developer_sandbox_negative_scenarios() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("internal_create_app_heading"))).getText();
            Assert.assertEquals(str,td_reader("internal_create_app_heading"));
            //value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
            //Assert.assertEquals(true,value);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("lands on the create application page in  internal developer sandbox negative scenarios");
        }
    }

    @Then("able to fill the fiels and left some fields are blank in internal developer sandbox negative scenarios")
    public void able_to_fill_the_fiels_and_left_some_fields_are_blank_in_internal_developer_sandbox_negative_scenarios() throws IOException {
        try {
            //String app = RandomStringUtils.randomAlphabetic(8);
            //driver.findElement(By.xpath(OR_reader( "app_name"))).sendKeys(app);
            //Random randomGeneratorapp1 = new Random();
            //int randomInt = randomGeneratorapp1.nextInt(1000);
            //driver.findElement(By.xpath(OR_reader( "app_name"))).sendKeys("First Application"+ randomInt );

            Random randomGeneratordo = new Random();
            int randomIntdo1 = randomGeneratordo.nextInt(1000);
            driver.findElement(By.xpath(OR_reader( "auth_do"))).sendKeys("app"+ randomIntdo1 +".cornell.edu");

            String appdes1 = RandomStringUtils.randomAlphabetic(8);
            driver.findElement(By.xpath(OR_reader( "app_des"))).sendKeys(appdes1);

            Random randomGenerator = new Random();
            int randomIntem = randomGenerator.nextInt(1000);
            driver.findElement(By.xpath(OR_reader( "app_em"))).sendKeys("first"+ randomIntem +"@gmail.com");

            String appli1 = RandomStringUtils.randomAlphabetic(8);
            driver.findElement(By.xpath(OR_reader( "app_li"))).sendKeys(appli1);

            //String appterms1 = RandomStringUtils.randomAlphabetic(8);
            //driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(appterms1);

            //driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(td_reader("app_terms",0));
            //str= driver.findElement(By.xpath(OR_reader("query_limit"))).getText();
            //Assert.assertEquals(str,td_reader("query_limit"));
            ////click("query_limit");
            Thread.sleep(2000);
            browser_wait(1000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("able_to_fill_the_fiels_and_left_some_fields_are_blank_in_internal_developer_sandbox_negative_scenarios");
        }
    }

    @Then("click on the create application button in the third party negative  internal developer sandbox negative scenarios")
    public void click_on_the_create_application_button_in_the_third_party_negative_internal_developer_sandbox_negative_scenarios() throws IOException {
        try {
            click("create");
            Thread.sleep(3000);
            browser_wait(3000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("lands on the create application page in  internal developer sandbox negative scenarios");
        }
    }
    @When("internal developer fill all mandatory fields in sandbox negative scenarios")
    public void internal_developer_fill_all_mandatory_fields_in_sandbox_negative_scenarios() throws IOException {
        try{
            Random randomGeneratorapp1 = new Random();
            int randomInt = randomGeneratorapp1.nextInt(1000);
            driver.findElement(By.xpath(OR_reader( "app_name"))).sendKeys("Second Application"+ randomInt );

            String appterms1 = RandomStringUtils.randomAlphabetic(8);
            driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(appterms1);

            //driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(td_reader("app_terms",0));
            str= driver.findElement(By.xpath(OR_reader("query_limit"))).getText();
            Assert.assertEquals(str,td_reader("query_limit"));
            click("query_limit");
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal developer fill all mandatory fields in sandbox negative scenarios");
        }

    }

    @Then("click on application ceation in the sandbox negative scenarios")
    public void click_on_application_ceation_in_the_sandbox_negative_scenarios() throws IOException {
        try {
            click("create");
            Thread.sleep(3000);
            browser_wait(3000);
            //value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
            //Assert.assertEquals(true,value);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_application_ceation_in_the_sandbox_negative_scenarios");
        }
    }

    @Then("close the window presented in the application creation in sandbox negative scenarios")
    public void close_the_window_presented_in_the_application_creation_in_sandbox_negative_scenarios() throws IOException {
        try{
            click("xsymbol");

            Thread.sleep(3000);
            browser_wait(5000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("close_the_window_presented_in_the_application_creation_in_sandbox_negative_scenarios");
        }}

    @When("click on the create application button to check that with an invalid email id application is created or not in sandbox negative scenarios")
    public void click_on_the_create_application_button_to_check_that_with_an_invalid_email_id_application_is_created_or_not_in_sandbox_negative_scenarios() throws IOException {
        try {
            click("create_app");
            Thread.sleep(3000);
            browser_wait(3000);
            //value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
            //Assert.assertEquals(true,value);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_create_application_button_to_check_that_with_an_invalid_email_id_application_is_created_or_not_in_sandbox_negative_scenarios");
        }
    }

    @Then("lands on the create application page in  sandbox negative scenarios")
    public void lands_on_the_create_application_page_in_sandbox_negative_scenarios() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("internal_create_app_heading"))).getText();
            Assert.assertEquals(str,td_reader("internal_create_app_heading"));
            //value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
            //Assert.assertEquals(true,value);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("lands_on_the_create_application_page_in_sandbox_negative_scenarios");
        }
    }

    @Then("tries to create application with invalid email format in sandbox negative scenarios")
    public void tries_to_create_application_with_invalid_email_format_in_sandbox_negative_scenarios() throws IOException {
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
            driver.findElement(By.xpath(OR_reader( "app_em"))).sendKeys("invalid"+ randomIntem +"gmail.com");

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
            takeScreenShot("tries_to_create_application_with_invalid_email_format_in_sandbox_negative_scenarios");
        }
    }

    @Then("internal developer click on the save button with an invalid email id in sandbox negative scenarios")
    public void internal_developer_click_on_the_save_button_with_an_invalid_email_id_in_sandbox_negative_scenarios() throws IOException {
        try {
            click("create");
            Thread.sleep(3000);
            browser_wait(3000);
            //value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
            //Assert.assertEquals(true,value);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_click_on_the_save_button_with_an_invalid_email_id_in_sandbox_negative_scenarios");
        }
    }

    @When("internal developer giving valid email id in sandbox negative scenarios")
    public void internal_developer_giving_valid_email_id_in_sandbox_negative_scenarios() throws IOException {
        try {
            backspace("app_em");
            Thread.sleep(1000);
            Random randomGenerator = new Random();
            int randomIntem = randomGenerator.nextInt(1000);
            driver.findElement(By.xpath(OR_reader( "app_em"))).sendKeys("valid"+ randomIntem +"@gmail.com");
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_giving_valid_email_id_in_sandbox_negative_scenarios");
        }
    }

    @Then("internal developer click on save button after giving the valid email id in sandbox negative scenarios")
    public void internal_developer_click_on_save_button_after_giving_the_valid_email_id_in_sandbox_negative_scenarios() throws IOException {
        try {
            click("create");
            Thread.sleep(3000);
            browser_wait(3000);
            //value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
            //Assert.assertEquals(true,value);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_click_on_save_button_after_giving_the_valid_email_id_in_sandbox_negative_scenarios");
        }
    }

    @Then("internal developer click on the cancel button after the application is created")
    public void internal_developer_click_on_the_cancel_button_after_the_application_is_created() throws IOException {
        try{
            click("xsymbol");

            Thread.sleep(3000);
            browser_wait(5000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_click_on_the_cancel_button_after_the_application_is_created");
        }
    }
    @When("internal developer click on the sanbox in the dasboard'")
    public void internal_developer_click_on_the_sanbox_in_the_dasboard() throws IOException {
        try{
            click("sandbox1");
            Thread.sleep(3000);
            browser_wait(5000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_click_on_the_sanbox_in_the_dasboard");
        }
    }

    @Then("check that internal developer is sucessfully navigated to thee sandboxpage")
    public void check_that_internal_developer_is_sucessfully_navigated_to_thee_sandboxpage() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("internal_dashboard_sandbox_navigation_page"))).getText();
            Assert.assertEquals(str,td_reader("internal_dashboard_sandbox_navigation_page"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("check_that_internal_developer_is_sucessfully_navigated_to_thee_sandboxpage");

        }
    }

    @Then("click on the authorize button in the sandbox dasboard")
    public void click_on_the_authorize_button_in_the_sandbox_dasboard() throws IOException {
        try{
            click("authorize");
            Thread.sleep(3000);
            browser_wait(5000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_authorize_button_in_the_sandbox_dasboard");
        }
    }

    @Then("give the invalid api key in the available authorizations page")
    public void give_the_invalid_api_key_in_the_available_authorizations_page() throws IOException {
        try {
            driver.findElement(By.xpath(OR_reader( "api_input"))).sendKeys(td_reader("invalid_api",0));
            Thread.sleep(1000);
            browser_wait(3000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("give_the_invalid_api_key_in_the_available_authorizations_page");
        }}

    @Then("click the authorize button in the available authorizations page")
    public void click_the_authorize_button_in_the_available_authorizations_page() throws IOException {
        try {
            click("authorize1");
            Thread.sleep(1000);
            browser_wait(3000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_the_authorize_button_in_the_available_authorizations_page");
        }
    }

    @Then("click on the cross button in internal available authorizations page")
    public void click_on_the_cross_button_in_internal_available_authorizations_page() throws IOException {
        try {
            click("close");

            Thread.sleep(1000);
            browser_wait(2000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_cross_button_in_internal_available_authorizations_page");
        }
    }
    @When("click on the allergyintolerance")
    public void click_on_the_allergyintolerance() throws IOException {
        try {
            click("internal_allergyintolerance");
            Thread.sleep(1000);
            browser_wait(3000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_allergyintolerance");
        }
    }

    @Then("click on the try it out button inside the allergyintolerance")
    public void click_on_the_try_it_out_button_inside_the_allergyintolerance() throws IOException {
        try {
            click("internal_allergyintolerance_try_it_out");
            Thread.sleep(1000);
            browser_wait(3000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_try_it_out_button_inside_the_allergyintolerance");
        }
    }

    @Then("give any text inside the tenat field")
    public void give_any_text_inside_the_tenat_field() throws IOException {
        try {
            driver.findElement(By.xpath(OR_reader( "internal_allergyintolerance_tenant_field"))).sendKeys(td_reader("internal_allergyintolerance_tenant_field_value",0));
            Thread.sleep(1000);
            browser_wait(3000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("give_any_text_inside_the_tenat_field");
        }
    }

    @Then("click on the execute button inside the allergyintolerance")
    public void click_on_the_execute_button_inside_the_allergyintolerance() throws IOException {
        try {
            click("internal_allergyintolerance_execute");
            scrolldown();
            Thread.sleep(5000);
            browser_wait(7000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_execute_button_inside_the_allergyintolerance");
        }
    }
    @When("click on the applications in the dasbord")
    public void click_on_the_applications_in_the_dasbord() throws IOException {
        try {
            click("internal_dashboard_applications");
            Thread.sleep(1000);
            browser_wait(3000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_applications_in_the_dasbord");
        }
    }


    @Then("click on the any one of the pending application")
    public void click_on_the_any_one_of_the_pending_application()   throws IOException {
        try {
            click("last_app");
            Thread.sleep(1000);
            browser_wait(3000);
            scrolldown();
            browser_wait(3000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_any_one_of_the_pending_application");
        }

    }

    @Then("get the valid api key")
    public void get_the_valid_api_key() throws IOException {
        try {
            myapi = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div[2]/div[1]/div[13]/div/div[2]/div")).getText();
            System.out.println(myapi);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("get the valid api key");
        }
    }

    @Then("after getting the valid api key close that application")
    public void after_getting_the_valid_api_key_close_that_application() throws IOException {
        try {
            click("api_xsymbol");
            Thread.sleep(3000);
            browser_wait(5000);
            browser_wait(3000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("after_getting_the_valid_api_key_close_that_application");
        }
    }

    @When("click on the sandbox in the dashbord for giving the valid api key")
    public void click_on_the_sandbox_in_the_dashbord_for_giving_the_valid_api_key() throws IOException {
        try{
            click("sandbox1");
            Thread.sleep(3000);
            browser_wait(5000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_sandbox_in_the_dashbord_for_giving_the_valid_api_key");
        }
    }

    @Then("click on the authorize for giving the valid api key")
    public void click_on_the_authorize_for_giving_the_valid_api_key() throws IOException {
        try{
            click("authorize");
            Thread.sleep(3000);
            browser_wait(5000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_authorize_for_giving_the_valid_api_key");
        }
    }

    @Then("give the valid api key")
    public void give_the_valid_api_key() throws IOException {
        try{
            System.out.println(myapi);
            driver.findElement(By.xpath(OR_reader("api_input"))).sendKeys(myapi);
            Thread.sleep(2000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("give_the_valid_api_key");
        }
    }

    @Then("click on the authorize1 after giving the valid api key")
    public void click_on_the_authorize1_after_giving_the_valid_api_key() throws IOException {
        try {
            click("authorize1");
            Thread.sleep(1000);
            browser_wait(3000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_authorize1_after_giving_the_valid_api_key");
        }
    }

    @Then("click on the into button after giving the valid api key")
    public void click_on_the_into_button_after_giving_the_valid_api_key() throws IOException {
        try {
            click("close");

            Thread.sleep(1000);
            browser_wait(2000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_into_button_after_giving_the_valid_api_key");
        }
    }

    @When("click on the allergyintolerance after giving the valid api key")
    public void click_on_the_allergyintolerance_after_giving_the_valid_api_key() throws IOException {
        try {
            click("internal_allergyintolerance");
            Thread.sleep(1000);
            browser_wait(3000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_allergyintolerance_after_giving_the_valid_api_key");
        }
    }

    @Then("click on the try it out button inside the allergyintolerance after giving the valid api key")
    public void click_on_the_try_it_out_button_inside_the_allergyintolerance_after_giving_the_valid_api_key() throws IOException {
        try {
            click("internal_allergyintolerance_try_it_out");
            Thread.sleep(1000);
            browser_wait(3000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_try_it_out_button_inside_the_allergyintolerance_after_giving_the_valid_api_key");
        }
    }

    @Then("click on the execute button and check it with out giving the tenant value")
    public void click_on_the_execute_button_and_check_it_with_out_giving_the_tenant_value() throws IOException {
        try {
            click("internal_allergyintolerance_execute");
            Thread.sleep(3000);
            browser_wait(5000);
            scrolldown();
            browser_wait(3000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_execute_button_and_check_it_with_out_giving_the_tenant_value");
        }
    }

    @When("click on the tenant field for giving the tenant value")
    public void click_on_the_tenant_field_for_giving_the_tenant_value() throws IOException {
        try {
            driver.findElement(By.xpath(OR_reader( "internal_allergyintolerance_tenant_field"))).sendKeys(td_reader("internal_allergyintolerance_tenant_field_value",0));
            Thread.sleep(3000);
            browser_wait(5000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_tenant_field_for_giving_the_tenant_value");
        }
    }

    @Then("click the execute button after giving the valid tenant value")
    public void click_the_execute_button_after_giving_the_valid_tenant_value() throws IOException {
        try {
            click("internal_allergyintolerance_execute");
            Thread.sleep(5000);
            browser_wait(7000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_the_execute_button_after_giving_the_valid_tenant_value");
        }
    }
    @When("click the provider directory presented in the internaldeveloper sandbox")
    public void click_the_provider_directory_presented_in_the_internaldeveloper_sandbox() throws IOException {
        try {
            click("internal_pe_provider_directory");
            Thread.sleep(3000);
            browser_wait(5000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_the_provider_directory_presented_in_the_internaldeveloper_sandbox");
        }
    }

    @Then("click on the authorize field in the internaldeveloper sandbox negative scenario")
    public void click_on_the_authorize_field_in_the_internaldeveloper_sandbox_negative_scenario() throws IOException {
        try {
            click("internal_pe_provider_directory_authorize");
            Thread.sleep(1000);
            browser_wait(3000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_authorize_field_in_the_internaldeveloper_sandbox_negative_scenario");
        }
    }

    @Then("give the valid api key in that field in the internal developer negative")
    public void give_the_valid_api_key_in_that_field_in_the_internal_developer_negative() throws IOException {
        try {
            System.out.println(myapi);
            driver.findElement(By.xpath(OR_reader("internal_pe_provider_directory_api"))).sendKeys(myapi);

            //WebElement a=driver.findElement(By.xpath("//input[@placeholder='TENANT']"));
            //a.sendKeys(myOrderText);

            //driver.findElement(By.xpath(OR_reader( "api_input"))).sendKeys(td_reader("api_value",0));
            //driver.findElement(By.xpath("//input[@placeholder='TENANT']")).sendKeys(td_reader("api_value",0));
            Thread.sleep(2000);
            browser_wait(1000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("give_the_valid_api_key_in_that_field_in_the_internal_developer_negative");
        }
    }

    @Then("click on the authorize button after giving the valid api key for checking the sandbox negative scenario")
    public void click_on_the_authorize_button_after_giving_the_valid_api_key_for_checking_the_sandbox_negative_scenario() throws IOException {
        try {

            click("internal_pe_provider_directory_authorize1");
            Thread.sleep(3000);
            browser_wait(5000);
            // Write code here that turns the phrase above into concrete actions
            //throw new io.cucumber.java.PendingException();

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_authorize_button_after_giving_the_valid_api_key_for_checking_the_sandbox_negative_scenario");
        }
    }

    @Then("click on the into button after giving the invalid api key")
    public void click_on_the_into_button_after_giving_the_invalid_api_key() throws IOException {
        try {
            click("internal_pe_provider_directory_into");
            Thread.sleep(3000);
            browser_wait(5000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_into_button_after_giving_the_invalid_api_key");
        }
    }

    @When("click on the insurance internal provider directory for checking the sandbox negative scenario")
    public void click_on_the_insurance_internal_provider_directory_for_checking_the_sandbox_negative_scenario() throws IOException {
        try {
            click("internal_pe_provider_directory_insurance");
            Thread.sleep(3000);
            browser_wait(5000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_insurance_internal_provider_directory_for_checking_the_sandbox_negative_scenario");
        }
    }

    @Then("click on the try it out internal provider directory for checking the sandbox negative scenario")
    public void click_on_the_try_it_out_internal_provider_directory_for_checking_the_sandbox_negative_scenario() throws IOException {
        try {
            click("internal_pe_provider_directory_tryit");
            Thread.sleep(3000);
            browser_wait(5000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_try_it_out_internal_provider_directory_for_checking_the_sandbox_negative_scenario");
        }
    }

//@Then("give the tenant value for hitting sandbox APIs for checking the sandbox negative scenario")
//public void give_the_tenant_value_for_hitting_sandbox_ap_is_for_checking_the_sandbox_negative_scenario() {
    // Write code here that turns the phrase above into concrete actions
    // throw new io.cucumber.java.PendingException();
//}

    @Then("click on the executebute button in the internal provider directory for checking the sandbox negative scenario")
    public void click_on_the_executebute_button_in_the_internal_provider_directory_for_checking_the_sandbox_negative_scenario() throws IOException {
        try {
            click("internal_pe_provider_directory_execute");
            scrolldown();
            Thread.sleep(9000);
            browser_wait(7000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_executebute_button_in_the_internal_provider_directory_for_checking_the_sandbox_negative_scenario");
        }
    }
    @When("internal developer click on the tenant field for giving the tenant  value")
    public void internal_developer_click_on_the_tenant_field_for_giving_the_tenant_value() throws IOException {
        try {
            driver.findElement(By.xpath(OR_reader("internal_pe_provider_directory_tenat"))).sendKeys(td_reader("sand_value",0));
            Thread.sleep(2000);
            browser_wait(1000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_click_on_the_tenant_field_for_giving_the_tenant_value");
        }
    }

    @Then("internal developer click the execute button after giving the valid tenant value")
    public void internal_developer_click_the_execute_button_after_giving_the_valid_tenant_value() throws IOException {
        try {
            click("internal_pe_provider_directory_execute");
            scrolldown();
            Thread.sleep(9000);
            browser_wait(7000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_click_the_execute_button_after_giving_the_valid_tenant_value");
        }
    }
    @When("internal developer click the applications in dashboard for copying the valid api key")
    public void internal_developer_click_the_applications_in_dashboard_for_copying_the_valid_api_key() throws IOException {
        try {
            click("applications");
            scrolldown();
            Thread.sleep(5000);
            browser_wait(7000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_click_the_applications_in_dashboard_for_copying_the_valid_api_key");
        }
    }

    @Then("internal developer click approve")
    public void internal_developer_click_approve() throws IOException {
        try {
            click("approve1");
            Thread.sleep(3000);
            browser_wait(1000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_click_approve");
        }
    }

    @Then("internal developer click on the any one of the approved application  application")
    public void internal_developer_click_on_the_any_one_of_the_approved_application_application() throws IOException {
        try {
            click("inte_ap_last_app");
            Thread.sleep(3000);
            browser_wait(1000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_click_on_the_any_one_of_the_approved_application_application");
        }}
    @Then("internal developer copy the valid api key of the approved application")
    public void internal_developer_copy_the_valid_api_key_of_the_approved_application() throws IOException {
        try {
            myapi = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div[2]/div[1]/div[13]/div/div[2]/div")).getText();
            System.out.println(myapi);
            Thread.sleep(3000);
            browser_wait(1000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_copy_the_valid_api_key_of_the_approved_application");
        }
    }

    @Then("after that internal developer close that application")
    public void after_that_internal_developer_close_that_application() throws IOException {
        try {
            click("api_xsymbol");
            Thread.sleep(3000);
            browser_wait(1000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("after_that_internal_developer_close_that_application");
        }}



    @When("internal developer click on the sandbox in the dashbord for giving the valid api key of the approved application")
    public void internal_developer_click_on_the_sandbox_in_the_dashbord_for_giving_the_valid_api_key_of_the_approved_application() throws IOException {
        try {
            click("sandbox1");
            Thread.sleep(3000);
            browser_wait(5000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_click_on_the_sandbox_in_the_dashbord_for_giving_the_valid_api_key_of_the_approved_application");
        }
    }

    @Then("internal developer click on the authorize for giving the valid api key")
    public void internal_developer_click_on_the_authorize_for_giving_the_valid_api_key() throws IOException {

        try {
            click("authorize");
            Thread.sleep(1000);
            browser_wait(3000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_click_on_the_authorize_for_giving_the_valid_api_key");
        }
    }

    @Then("internal developer give the valid approved application api key")
    public void internal_developer_give_the_valid_approved_application_api_key() throws IOException {
        try {
            System.out.println(myapi);
            driver.findElement(By.xpath(OR_reader("api_input"))).sendKeys(myapi);

            //WebElement a=driver.findElement(By.xpath("//input[@placeholder='TENANT']"));
            //a.sendKeys(myOrderText);

            //driver.findElement(By.xpath(OR_reader( "api_input"))).sendKeys(td_reader("api_value",0));
            //driver.findElement(By.xpath("//input[@placeholder='TENANT']")).sendKeys(td_reader("api_value",0));
            Thread.sleep(2000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_give_the_valid_approved_application_api_key");
        }
    }

    @Then("internal developer click on the authorize1 after giving the valid api key of the approved application")
    public void internal_developer_click_on_the_authorize1_after_giving_the_valid_api_key_of_the_approved_application() throws IOException {
        try {
            click("authorize1");
            Thread.sleep(1000);
            browser_wait(3000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_click_on_the_authorize1_after_giving_the_valid_api_key_of_the_approved_application");
        }
    }

    @Then("internal developer click on the into button after giving the valid api key of the approved application")
    public void internal_developer_click_on_the_into_button_after_giving_the_valid_api_key_of_the_approved_application() throws IOException {
        try {
            click("close");
            //scrolldown();
            Thread.sleep(1000);
            browser_wait(2000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_click_on_the_into_button_after_giving_the_valid_api_key_of_the_approved_application");
        }
    }

    @When("internal developer click on the device after giving the valid api key")
    public void internal_developer_click_on_the_device_after_giving_the_valid_api_key() throws IOException {
        try {
            click("device-zf");
            Thread.sleep(1000);
            browser_wait(3000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_click_on_the_device_after_giving_the_valid_api_key");
        }
    }

    @Then("internal developer click on the try it out button inside the device after giving the valid api key")
    public void internal_developer_click_on_the_try_it_out_button_inside_the_device_after_giving_the_valid_api_key() throws IOException {
        try {
            click("device-try");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_click_on_the_try_it_out_button_inside_the_device_after_giving_the_valid_api_key");
        }
    }



    @Then("internal developer click on the execute button of the device resorce and check it with out giving the tenant value")
    public void internal_developer_click_on_the_execute_button_of_the_device_resorce_and_check_it_with_out_giving_the_tenant_value() throws IOException {
        try {
            click("device-execute");
            scrolldown();
            Thread.sleep(7000);
            //scrolldown();
            browser_wait(9000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_click_on_the_execute_button_of_the_device_resorce_and_check_it_with_out_giving_the_tenant_value");
        }
    }

    @When("internal developer click on the tenant field for giving the tenant value and checking the sandbox working")
    public void internal_developer_click_on_the_tenant_field_for_giving_the_tenant_value_and_checking_the_sandbox_working() throws IOException {
        try {
            driver.findElement(By.xpath(OR_reader( "device-tenat"))).sendKeys(td_reader("sand_value",0));
            Thread.sleep(1000);
            browser_wait(3000);//scrolldown();
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_click_on_the_tenant_field_for_giving_the_tenant_value_and_checking_the_sandbox_working");
        }
    }

    @Then("internal developer click the execute button of the device resouce")
    public void internal_developer_click_the_execute_button_of_the_device_resouce() throws IOException {
        try {
            click("device-execute");
            scrolldown();
            Thread.sleep(7000);
            //scrolldown();
            browser_wait(9000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_click_the_execute_button_of_the_device_resouce");
        }
    }



    @When("internal developer click on the signout field")
    public void internal_developer_click_on_the_signout_field() throws IOException {
        try{
            click("so1");

            Thread.sleep(3000);
            browser_wait(5000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_click_on_the_signout_field");
        }
    }

    @Then("internal developer click the logout field")
    public void internal_developer_click_the_logout_field() throws IOException {
        try{
            click("so2");

            Thread.sleep(3000);
            browser_wait(5000);
            driver.close();
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_developer_click_the_logout_field");
        }
    }


}
