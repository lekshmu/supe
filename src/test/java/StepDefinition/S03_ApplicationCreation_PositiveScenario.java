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
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Actions;

import Reusable_Functions.Generic_function;
//import groovyjarjarantlr4.v4.runtime.atn.SemanticContext.OR;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
//import net.serenitybdd.screenplay.ui.Select;
//import net.serenitybdd.screenplay.ui.Select;
//import org.openqa.selenium.support.ui.Select;

public class S03_ApplicationCreation_PositiveScenario extends Generic_function {
    static int s;
    static String str;
    static boolean value;

    /* Validate the welcome page of internal developer page */
    @Given("launches url for checking the internal developer work flow")
    public void launches_url_for_checking_the_internal_developer_work_flow() throws IOException {
        try {
            browser_launch();
            s = Dataiter();
            browser_wait(120000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("launches_url_in_internal_developer_work_flow");

        }
    }

    @Then("int dev successfully navigated to the welcome page")
    public void int_dev_successfully_navigated_to_the_welcome_page() throws IOException, InterruptedException {
        try {
            str = driver.findElement(By.xpath(OR_reader("navigated_welcomepage"))).getText();
            Assert.assertEquals(str, td_reader("welcome_page_title"));
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("int dev successfully navigated to the welcome page");
            Thread.sleep(5000);
            browser_wait(3000);
        }
    }

    @When("click on login button for checking int dev workflow")
    public void click_on_login_button_for_checking_int_dev_workflow() throws IOException {

        try {
            click("first_login");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click on login button for checking int dev workflow");

        }

    }

    @Then("check that internal developer lands on the login page successfully")
    public void check_that_internal_developer_lands_on_the_login_page_successfully() throws IOException {
        try {
            str = driver.findElement(By.xpath(OR_reader("login_title"))).getText();
            Assert.assertEquals(str, td_reader("login_title"));
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("check_that_internal_developer_lands_on_the_login_page_successfully");

        }

    }

    /* Validate internaldeveloper logins with valid credentials */
    @When("internaldeveloper enters valid email and password")
    public void internaldeveloper_enters_valid_email_and_password() throws InterruptedException, IOException {
        try {
            driver.findElement(By.xpath(OR_reader("login_email"))).sendKeys(td_reader("appcreation_internal_email", 0));
            Thread.sleep(3000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("email_of_internaldeveloper");
        }
        try {
            driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("appcreation_internal_pass", 0));
            Thread.sleep(2000);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            takeScreenShot("password_of_internaldevelopers");
        }
    }

    @And("hits login button and lands on internaldeveloper page")
    public void hits_login_button_and_lands_on_internaldeveloper_page() throws IOException {
        try {
            click("login");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internadeveloper_login");
        }
    }

    @Then("check internaldeveloper in the  landing page or not")
    public void check_internaldeveloper_in_the_landing_page_or_not() throws IOException {
        try {
            str = driver.findElement(By.xpath(OR_reader("internal_loginpage_first_title"))).getText();
            Assert.assertEquals(str, td_reader("internal_loginpage_first_title"));
            Thread.sleep(5000);
            browser_wait(3000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal_loginpage_first_title_checking");
        }
    }

    /* Internal developer able to click on the create application button and successfully navigated to the page	*/
    @When("internal developer click on create application button")
    public void internal_developer_click_on_create_application_button() throws IOException {
        try {
            click("internal_create_app_button");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internadeveloper_click_create_application_button_click");
        }
    }

    @Then("internaldeveloper sucessfully land on the create application page")
    public void internaldeveloper_sucessfully_land_on_the_create_application_page() throws IOException {
        try {
            str = driver.findElement(By.xpath(OR_reader("internal_create_app_page"))).getText();
            Assert.assertEquals(str, td_reader("internal_create_app_page"));

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internaldeveloper_sucessfully navigated_to_the_create_application_page");
        }
    }

    @And("checking the dashboard button in menus")
    public void checking_the_dashboard_button_in_menus() throws IOException {
        try {
            str = driver.findElement(By.xpath(OR_reader("int_dash"))).getText();
            Assert.assertEquals(str, td_reader("int_dash"));

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("checking the dashboard button in menus");

        }
    }

    @And("checking the sandbox button in menus")
    public void checking_the_sandbox_button_in_menus() throws IOException {
        try {
            str = driver.findElement(By.xpath(OR_reader("int_sandbox"))).getText();
            Assert.assertEquals(str, td_reader("int_sandbox"));

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("checking the sandbox button in menus");
        }
    }

    /* Validate internal developer able to create first application */
    @When("int dev enter the all required fields")
    public void int_dev_enter_the_all_required_fields() throws IOException, InterruptedException {
        try {
            String app = RandomStringUtils.randomAlphabetic(10);
            driver.findElement(By.xpath(OR_reader("app_name"))).sendKeys(app);

            Random randomGenerator1 = new Random();
            int randomInt1 = randomGenerator1.nextInt(1000);
            driver.findElement(By.xpath(OR_reader("auth_do"))).sendKeys("app" + randomInt1 + ".cornell.edu");

            String app1 = RandomStringUtils.randomAlphabetic(8);
            driver.findElement(By.xpath(OR_reader("app_des"))).sendKeys(app1);

            Random randomGenerator = new Random();
            int randomInt = randomGenerator.nextInt(1000);
            driver.findElement(By.xpath(OR_reader("app_em"))).sendKeys("app" + randomInt + "@gmail.com");

            String app2 = RandomStringUtils.randomAlphabetic(8);
            driver.findElement(By.xpath(OR_reader("app_li"))).sendKeys(app2);

            String app3 = RandomStringUtils.randomAlphabetic(8);
            driver.findElement(By.xpath(OR_reader("app_terms"))).sendKeys(app3);

            //driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(td_reader("app_terms",0));
            str = driver.findElement(By.xpath(OR_reader("query_limit"))).getText();
            Assert.assertEquals(str, td_reader("query_limit"));
            click("query_limit");
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("int dev enter the all required fields");
        }
    }

    @And("click on save button")
    public void click_on_save_button() throws Exception {
        try {
            click("create");
            browser_wait(3000);
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internaldeveloper_first_app_creation_save");
        }
    }

    @Then("application created successfully")
    public void application_created_successfully() throws Exception {
        try {
            str = driver.findElement(By.xpath(OR_reader("app_created_validation msg"))).getText();
            Assert.assertEquals(str, td_reader("app_created_validation msg"));
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("application created successfully");
        }
    }

    @And("close the window")
    public void close_the_window() throws IOException, InterruptedException {
        try {


            click("xsymbol");
            Thread.sleep(3000);
            browser_wait(5000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("close the window");
        }
    }

    @And("successfully go back the dashboard page")
    public void successfully_go_back_the_dashboard_page() throws IOException {
        try {
            str = driver.findElement(By.xpath(OR_reader("int_dash"))).getText();
            Assert.assertEquals(str, td_reader("int_dash"));
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("successfully go back dashboard page");
        }
    }
    /* Validate internal developer able to create second application */
    @When("click on create application button in second time")
    public void click_on_create_application_button_in_second_time() throws IOException {
        try {
            click("internal_create_app_button");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click on create application button in second time");
        }
    }

    @And("int dev enter the data for second application")
    public void int_dev_enter_the_data_for_second_application() throws IOException, InterruptedException {
        try {
            String app = RandomStringUtils.randomAlphabetic(10);
            driver.findElement(By.xpath(OR_reader("app_name"))).sendKeys(app);

            Random randomGenerator1 = new Random();
            int randomInt1 = randomGenerator1.nextInt(1000);
            driver.findElement(By.xpath(OR_reader("auth_do"))).sendKeys("app" + randomInt1 + ".cornell.edu");

            String app1 = RandomStringUtils.randomAlphabetic(8);
            driver.findElement(By.xpath(OR_reader("app_des"))).sendKeys(app1);

            Random randomGenerator = new Random();
            int randomInt = randomGenerator.nextInt(1000);
            driver.findElement(By.xpath(OR_reader("app_em"))).sendKeys("app" + randomInt + "@gmail.com");

            String app2 = RandomStringUtils.randomAlphabetic(8);
            driver.findElement(By.xpath(OR_reader("app_li"))).sendKeys(app2);

            String app3 = RandomStringUtils.randomAlphabetic(8);
            driver.findElement(By.xpath(OR_reader("app_terms"))).sendKeys(app3);

            //driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(td_reader("app_terms",0));
            str = driver.findElement(By.xpath(OR_reader("query_limit"))).getText();
            Assert.assertEquals(str, td_reader("query_limit"));
            click("query_limit");
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("int dev enter the data for second application");
        }
    }

    @And("click on save button for second application")
    public void click_on_save_button_for_second_application() throws Exception {
        try {
            click("create");
            browser_wait(3000);
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click on save button for second application");
        }
    }

    @Then("second application created successfully")
    public void second_application_created_successfully() throws Exception {
        try {
            str = driver.findElement(By.xpath(OR_reader("app_created_validation msg"))).getText();
            Assert.assertEquals(str, td_reader("app_created_validation msg"));
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("second application created successfully");
        }
    }

    @And("close the application created window")
    public void close_the_application_created_window() throws IOException, InterruptedException {
        try {


            click("xsymbol");
            Thread.sleep(3000);
            browser_wait(5000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("close the application created window");
        }
    }

    @And("go back to the home page")
    public void go_back_to_the_home_page() throws IOException {
        try {
            str = driver.findElement(By.xpath(OR_reader("int_dash"))).getText();
            Assert.assertEquals(str, td_reader("int_dash"));
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("go back to the home page");
        }
    }

    /* Validate internal developer able to create third application */
    @When("click on create application button in third time")
    public void click_on_create_application_button_in_third_time() throws IOException {
        try {
            click("internal_create_app_button");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click on create application button in third time");
        }
    }
    @And("int dev enter the data for third application")
    public void int_dev_enter_the_data_for_third_application() throws IOException, InterruptedException {
        try {
            String app = RandomStringUtils.randomAlphabetic(10);
            driver.findElement(By.xpath(OR_reader("app_name"))).sendKeys(app);

            Random randomGenerator1 = new Random();
            int randomInt1 = randomGenerator1.nextInt(1000);
            driver.findElement(By.xpath(OR_reader("auth_do"))).sendKeys("app" + randomInt1 + ".cornell.edu");

            String app1 = RandomStringUtils.randomAlphabetic(8);
            driver.findElement(By.xpath(OR_reader("app_des"))).sendKeys(app1);

            Random randomGenerator = new Random();
            int randomInt = randomGenerator.nextInt(1000);
            driver.findElement(By.xpath(OR_reader("app_em"))).sendKeys("app" + randomInt + "@gmail.com");

            String app2 = RandomStringUtils.randomAlphabetic(8);
            driver.findElement(By.xpath(OR_reader("app_li"))).sendKeys(app2);

            String app3 = RandomStringUtils.randomAlphabetic(8);
            driver.findElement(By.xpath(OR_reader("app_terms"))).sendKeys(app3);

            //driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(td_reader("app_terms",0));
            str = driver.findElement(By.xpath(OR_reader("query_limit"))).getText();
            Assert.assertEquals(str, td_reader("query_limit"));
            click("query_limit");
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("int dev enter the data for third application");
        }
    }

    @And("click on save button for third application")
    public void click_on_save_button_for_third_application() throws Exception {
        try {
            click("create");
            browser_wait(3000);
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internaldeveloper_third_app_creation_save");
        }
    }

    @Then("third application created successfully")
    public void third_application_created_successfully() throws Exception {
        try {
            str = driver.findElement(By.xpath(OR_reader("app_created_validation msg"))).getText();
            Assert.assertEquals(str, td_reader("app_created_validation msg"));
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("third application created successfully");
        }
    }

    @And("close the window which are coming after application creation")
    public void close_the_window_which_are_coming_after_application_creation() throws IOException, InterruptedException {
        try {


            click("xsymbol");
            Thread.sleep(3000);
            browser_wait(5000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("close the window which are coming after application creation");
        }
    }

    @And("go back to the home page successfully")
    public void go_back_to_the_home_page_successfully() throws IOException {
        try {
            str = driver.findElement(By.xpath(OR_reader("int_dash"))).getText();
            Assert.assertEquals(str, td_reader("int_dash"));
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("go back to the home page successfully");
        }
    }

    /* Validate the created applications are in the pending list */
    @When("internal developer click on the pending button")
    public void internal_developer_click_on_the_pending_button() throws IOException, InterruptedException {

        try {
            click("pending");
            Thread.sleep(5000);
            browser_wait(7000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal developer click on the pending button");
        }
    }

    @Then("successfully go to the pending list")
    public void successfully_go_to_the_pending_list() throws IOException {
        try {
            str = driver.findElement(By.xpath(OR_reader("internal_check_pending_first"))).getText();
            Assert.assertEquals(str, td_reader("internal_check_pending_first"));
            //throw new io.cucumber.java.PendingException();s
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internaldeveloper_check_the_pendinglist_at_the_first_time_sucessfull");
        }
    }

    /* validate internal developer able to logout after creating the applications */
    @When("internal developer click on the logout dropdown button")
    public void internal_developer_click_on_the_logout_dropdown_button() throws IOException {
        try {
            click("so1");

            Thread.sleep(3000);
            browser_wait(5000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal developer click on the logout dropdown button");
        }
    }

    @When("internal developer click on the signout button")
    public void internal_developer_clicks_the_signout_button() throws IOException {
        try {
            click("so2");
            Thread.sleep(3000);
            browser_wait(5000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("internal developer click on the signout button");
        }
    }

    @Then("verify internal developer logout successfully")
    public void verify_internal_developer_clicks_the_signout_button() throws IOException {
        try {
            str = driver.findElement(By.xpath(OR_reader("logout_successs"))).getText();
            Assert.assertEquals(str, td_reader("logout_successs"));
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("verify internal developer logout successfully");
        }
    }

    /* Validate Compliance manager able to login */
    @When("compliance manager click on the login button")
    public void compliance_manager_click_on_the_login_button() throws IOException {
        try {
            click("first_login");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("compliance manager click on the login button");

        }
    }

    @Then("compliance manager lands on login page")
    public void compliance_manager_lands_on_login_page() throws IOException {
        try {

            str = driver.findElement(By.xpath(OR_reader("login_title"))).getText();
            Assert.assertEquals(str, td_reader("login_title"));
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("compliance manager lands on login page");

        }
    }

    /* Validate complance manger able to login */
    @When("compliance manager enters valid email and password")
    public void compliance_manager_enters_valid_email_and_password() throws InterruptedException, IOException {
        try {
            driver.findElement(By.xpath(OR_reader("login_email"))).sendKeys(td_reader("appcreation_complaince_email", 0));
            Thread.sleep(3000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("email_of_cm_internal");
        }
        try {
            driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("appcreation_complaince_pass", 0));
            Thread.sleep(2000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("password_of_cm_internal");
        }
    }

    @And("hits login button and lands on compliance manager page")
    public void hits_login_button_and_lands_on_compliance_manager_page() throws IOException {
        try {
            click("login");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("hits login button and lands on compliance manager page");

        }

    }

    /* Validate that created applications listed in the pending list of compliance manager */
    @When("compliance manager click on the pending button")
    public void compliance_manager_click_on_the_pending_button() throws IOException, InterruptedException {
        try {
            click("pending");
            Thread.sleep(5000);
            browser_wait(7000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("compliance manager click on the pending button");

        }

    }

    @Then("able to see the applications in the pending list")
    public void able_to_see_the_applications_in_the_pending_list() throws IOException {
        try {
            str = driver.findElement(By.xpath(OR_reader("cm_third_first_app_dash"))).getText();
            Assert.assertEquals(str, td_reader("cm_third_first_app_dash"));

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("able to see the applications in the pending list");
        }
    }

    /* Validate cm can approve the pending applications */
    @When("click on the created applications")
    public void click_on_the_created_applications() throws IOException, InterruptedException {
        try {
            //click("checking1");
            click("last_appli");
            Thread.sleep(5000);
            browser_wait(7000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_internal_created_applications");
        }
    }


    @Then("approve the applications")
    public void approve_the_applications1() throws IOException {
        try {

            WebElement approve = driver.findElement(By.xpath("//*[contains(text(),'Approve Request')]"));
            //click("approve");
            approve.click();
            throw new io.cucumber.java.PendingException();
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("approve_the_internal_created_applications");

        }
    }

    @When("click on the Approve list")
    public void click_on_the_Approve_list() throws IOException, InterruptedException {
        try {
            click("approved");
            Thread.sleep(5000);
            browser_wait(7000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("approve_the_internal_created_applications");

        }
    }
    /* cm able to deny the application and view in the deny list */

    @When("click on the pending list")
    public void click_on_the_pending_list() throws IOException, InterruptedException {
        try {
            click("pending2");
            Thread.sleep(5000);
            browser_wait(7000);


        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("deny_the_internal_created_applications");

        }
    }


    @And("click pending application for denying")
    public void click_pending_application_for_denying() throws IOException, InterruptedException {
        try {
            //click("checking1");
            click("last_appli");
            Thread.sleep(5000);
            browser_wait(7000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_pending_application_for_denying_the_internal_applications");

        }

    }

    @Then("deny the application")
    public void deny_the_application() throws InterruptedException, IOException {
        try {
            click("deny");

            Thread.sleep(5000);
            browser_wait(7000);
            // throw new io.cucumber.java.PendingException();
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("denying_the_internal_created_applications");

        }
    }

    @When("click on the approve button")
    public void click_on_the_approve_button() throws IOException, InterruptedException {


        try {
            click("approve1");
            Thread.sleep(3000);
            browser_wait(1000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("cm_internal_check_approve");

            //str= driver.findElement(By.xpath(OR_reader("org_title"))).getText();
            //Assert.assertEquals(str,td_reader("org_title"));
        }

    }

    @And("click on the deny button")
    public void click_on_the_deny_button() throws IOException, InterruptedException {

        try {
            click("deny1");
            Thread.sleep(5000);
            browser_wait(7000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("cm_internal_check_deny");

        }
    }

    @And("click on the dashboard of compliance")
    public void click_on_the_dashboard_of_compliance() throws IOException, InterruptedException {
        try {


            click("dashboardd");
            Thread.sleep(5000);
            browser_wait(7000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("cm_internal_check__approval_deny_go_back_dashboard");

        }
    }

    /* Validate user can after approving the application  */
    @When("cm sign logout")
    public void cm_sign_logout() throws IOException {
        try {
            click("so1");

            Thread.sleep(3000);
            browser_wait(5000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("cm_internal_signout");
        }
    }


    @Then("cm log out")
    public void cm_log_out() throws IOException {
        try {
            click("so2");

            Thread.sleep(3000);
            browser_wait(5000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("cm_internal_logout");
        }
    }
    /* Validate internal developer login again */
    @When("int dev able to click on login button again")
    public void int_dev_able_to_click_on_login_button_again() throws IOException {
        try {
            click("first_login");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("second_internaldeveloper_app_creation_login_button");
        }

    }


    @Then("int dev lands on login page")
    public void int_dev_lands_on_login_page() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("login_title"))).getText();
            Assert.assertEquals(str,td_reader("login_title"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("int dev lands on login page");

        }
    }
    /* Login as an internal developer */
    @When("given the valid email and password")
    public void given_the_valid_email_and_password() throws InterruptedException, IOException {
        try {
            driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("appcreation_internal_email",0));
            Thread.sleep(3000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("secondtime_email_of_internaldeveloper");
        }
        try {
            driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("appcreation_internal_pass",0));
            Thread.sleep(2000);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            takeScreenShot("second_time_password_of_internaldevelopers");
        }
    }


    @And("hits login button and lands on superadmin pagee")
    public void hits_login_button_and_lands_on_superadmin_pagee() throws IOException {
        try {
            click("login");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("second_internadeveloper_login");
        }
    }
    /* int dev check that the applications */
    @When("click on the pending button")
    public void click_on_the_pending_button() throws IOException, InterruptedException {
        try{
            click("pending");

            Thread.sleep(5000);
            browser_wait(7000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("second_internadeveloper_pending_checking");
        }

    }

    @And("click on the approve button in int dev")
    public void click_on_the_approve_button_in_int_dev() throws IOException, InterruptedException {


        try {
            click("approve1");
            Thread.sleep(3000);
            browser_wait(1000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("second_time_internal_approve_checking");


        }

    }
    @Then("click on the deny button in int dev")
    public void click_on_the_deny_button_in_int_dev() throws IOException, InterruptedException {
        try{
            click("deny1");

            Thread.sleep(5000);
            browser_wait(7000);
            //throw new io.cucumber.java.PendingException();
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("second_time_internal_deny_checking");


        }}
    @And("click on the dashboard of int dev")
    public void click_on_the_dashboard_of_int_dev() throws IOException, InterruptedException {
        try {
            click("dashboardd");
            Thread.sleep(5000);
            browser_wait(7000);
            driver.close();
            //throw new io.cucumber.java.PendingException();
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("second_time_goback_to_the_dashboard");


        }
    }
}




