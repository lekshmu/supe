package StepDefinition;
import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;

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
import io.cucumber.java.en.And;
//import net.serenitybdd.screenplay.ui.Select;
//import net.serenitybdd.screenplay.ui.Select;
//import org.openqa.selenium.support.ui.Select;

public class S10_ComplianceManager_Sandbox_PositiveScenario extends Generic_function {

    static String myapi;
    int s;
    static String str;
    static boolean value;
    private CharSequence my;
    //@Given("launches urll")

    /* Verify compliance manager able to click on the login button */

    @Given("compliance manager launches the url")
    public void compliance_manager_launches_the_url() throws IOException {
        try {
            browser_launch();
            s= Dataiter();
            browser_wait(120000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("compliance manager launches the url");

        }
    }

    @Then("compliance manager successfully navigated to welcome page")
    public void compliance_manager_successfully_navigated_to_welcome_page() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("common_login_title"))).getText();
            Assert.assertEquals(str,td_reader("common_login_title"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_login_button_of_pricelist_complaince");

        }

    }
    @When("compliance manager clicks on login button")
    public void compliance_manager_clicks_on_login_button() throws IOException {
        try {
            click("first_login");
            Thread.sleep(3000);
            browser_wait(1000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("compliance manager clicks on login button");

        }

    }

    @And("compliance manager lands on the login page")
    public void compliance_manager_lands_on_the_login_page() throws IOException {
        try{
            str= driver.findElement(By.xpath(OR_reader("login_title"))).getText();
            Assert.assertEquals(str,td_reader("login_title"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("compliance manager lands on the login page");

        }

    }
    /* Verify compliance manager can successfully login */

    @When("compliance manager enters the login id and password")
    public void compliance_manager_enters_the_login_id_and_password() throws InterruptedException {
        try {
            driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("login_emaill",0));
            Thread.sleep(3000);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("login_passwordd",0));
            Thread.sleep(2000);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @And("compliance manager hits on the login button")
    public void compliance_manager_hits_on_the_login_button() throws IOException {
        try {
            click("login");
            Thread.sleep(4000);
            browser_wait(2000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("compliance manager hits on the login button");

        }


    }

    @Then("compliance manager navigated to home page successfully")
    public void compliance_manager_navigated_to_home_page_successfully() throws InterruptedException, IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("com_land"))).getText();
            Assert.assertEquals(str,td_reader("com_land"));
            Thread.sleep(5000);
            browser_wait(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("compliance manager navigated to the home page successfully");
        }
    }
    /* Verify sandbox is working for pending applications */

    @Then("compliance manager click on pending button")
    public void compliance_manager_click_on_pending_button() throws IOException, InterruptedException {
        try{
            click("pending");
            Thread.sleep(3000);
            browser_wait(5000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("compliance manager click on pending button");

        }

    }

    @Then("click the pending application")
    public void click_the_pending_application() throws IOException, InterruptedException {
        try{
            click("last_appli");
            Thread.sleep(3000);
            browser_wait(5000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click on the pending application");

        }

    }

    @And("copy the api key for pending application")
    public void copy_the_api_key_for_pending_application() throws IOException {
        try{
            myapi = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div[2]/div[1]/div[13]/div/div[2]/div")).getText();
            System.out.println(myapi);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("copy the api key for pending application");

        }

    }

    @Then("close the application window")
    public void close_the_application_window() throws IOException, InterruptedException {
        try{
            click("api_xsymbol");
            Thread.sleep(3000);
            browser_wait(5000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("close_the_application_window");

        }

    }

    @When("compliance manager click the sandbox")
    public void compliance_manager_click_the_sandbox() throws InterruptedException, IOException {
        try{
            click("sandbox2");
            Thread.sleep(3000);
            browser_wait(5000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("compliance manager click the sandbox");

        }

    }

    @And("compliance manager click the authorize button")
    public void compliance_manager_click_the_authorize_button() throws IOException, InterruptedException {
        try{
            click("authorize");
            Thread.sleep(3000);
            browser_wait(5000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("compliance manager click the authorize button");

        }

    }

    @And("give the api key")
    public void give_the_api_key() throws IOException, InterruptedException {
        try{
            System.out.println(myapi);
            driver.findElement(By.xpath(OR_reader("api_input"))).sendKeys(myapi);
            Thread.sleep(2000);
            browser_wait(1000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("give the api key");

        }

    }

    @And("compliance manager click authorize button after giving api key")
    public void compliance_manager_click_authorize_button_after_giving_api_key() throws IOException, InterruptedException {
        try{
            click("authorize1");
            Thread.sleep(3000);
            browser_wait(5000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("compliance manager click authorize button");

        }

    }
    @Then("close the window in compliance manager")
    public void close_the_window_in_compliance_manager() throws IOException, InterruptedException {
        try{
            click("close");
            Thread.sleep(1000);
            browser_wait(3000);
            scrolldown();
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("close the window");

        }

    }
    @When("click the encounter resource")
    public void click_the_encounter_resource() throws IOException, InterruptedException {
        try{
            scrolldown();
            Thread.sleep(1000);
            click("encounter");
            Thread.sleep(1000);
            browser_wait(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click the encounter resource");

        }

    }
    @And("click on the try it out button")
    public void click_on_the_try_it_out_button() throws IOException, InterruptedException {
        try{
            click("try_it_out1");
            Thread.sleep(1000);
            browser_wait(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click on the try it out button");

        }

    }
    @And("give the tenant value")
    public void give_the_tenant_value() throws IOException, InterruptedException {
        try{
            driver.findElement(By.xpath(OR_reader( "sand_input1"))).sendKeys(td_reader("sand_value",0));
            Thread.sleep(2000);
            browser_wait(1000);//scrolldown();
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("give the tenant value");

        }

    }

    @Then("click on the execute button")
    public void click_on_the_execute_button() throws IOException, InterruptedException {
        try{
            click("execute1");
            scrolldown();
            Thread.sleep(5000);
            browser_wait(7000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click on the execute button");

        }

    }

    @Then("verify the encounter sandbox success msg")
    public void verify_the_encounter_sandbox_success_msg() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("sandbox_success_encounter"))).getText();
            Assert.assertEquals(str,td_reader("sandbox_success_response"));
            //value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
            //Assert.assertEquals(true,value);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("encounter sandbox success msg");
        }
    }
    @When("compliance manager click the immunization")
    public void compliance_manager_click_the_immunization() throws IOException, InterruptedException {
        try{
            click("immunization_cm");
            Thread.sleep(1000);
            browser_wait(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("compliance manager click the immunization");
        }
    }

    @And("click on the try it out button for immunization")
    public void click_on_the_try_it_out_button_for_immunization() throws IOException, InterruptedException {
        try{
            click("immunization_try_it_out");
            //scrolldown();
            Thread.sleep(1000);
            browser_wait(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click on the try it out button for immunization");
        }
    }

    @And("give the tenant value for immunization")
    public void give_the_tenant_value_for_immunization() throws IOException, InterruptedException {
        try{
            driver.findElement(By.xpath(OR_reader("immunization_tenet"))).sendKeys(td_reader("sand_value",0));
            Thread.sleep(2000);
            browser_wait(1000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("give the tenant value for immunization");
        }
    }

    @And("click the execute button for checking immunization")
    public void click_the_execute_button_for_checking_immunization() throws IOException, InterruptedException {
        try{
            click("immunization_execute");
            scrolldown();
            Thread.sleep(9000);
            browser_wait(7000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click the execute button for checking immunization");
        }
    }

    @Then("verify for immunization response")
    public void verify_for_immunization_response() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("sandbox_success_immu"))).getText();
            Assert.assertEquals(str,td_reader("sandbox_success_response"));
            //value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
            //Assert.assertEquals(true,value);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("verify for immunization getting success response");
        }
    }
    @When("compliance manager click the provider directory field")
    public void compliance_manager_click_the_provider_directory_field() throws IOException, InterruptedException {
        try{
            click("cm_pe_provider_directory");
            Thread.sleep(3000);
            browser_wait(5000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("compliance manager click the provider directory field");
        }
    }

    @Then("click on the authorize button in provider directory")
    public void click_on_the_authorize_button_in_provider_directory() throws IOException, InterruptedException {
        try{
            click("cm_pe_provider_directory_authorize");
            Thread.sleep(3000);
            browser_wait(5000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("compliance manager click the provider directory field");
        }
    }

    @And("give the api in provider directory")
    public void give_the_api_in_provider_directory() throws IOException, InterruptedException {
        try{
            System.out.println(myapi);
            driver.findElement(By.xpath(OR_reader("cm_pe_provider_directory_api"))).sendKeys(myapi);
            Thread.sleep(2000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("give the api in provider directory");
        }
    }

    @And("click the authorize button in provider directory")
    public void click_the_authorize_button_in_provider_directory() throws IOException, InterruptedException {
        try{
            click("cm_pe_provider_directory_authorize1");
            Thread.sleep(3000);
            browser_wait(5000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("give the api in provider directory");
        }
    }


    @And("close the authorize window")
    public void close_the_authorize_window() throws IOException, InterruptedException {
        try {
            click("cm_pe_provider_directory_into");
            Thread.sleep(3000);
            browser_wait(5000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("close the authorize window");
        }
    }
    @When("click on the endpoints resource in provider directory")
    public void click_on_the_endpoints_resource_in_provider_directory() throws IOException, InterruptedException {
        try{
            click("cm_pe_provider_directory_endpoints");
            Thread.sleep(3000);
            browser_wait(5000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_endpoints_resource_in_provider_directory");
        }
    }

    @Then("click on the try it out button in provider directory")
    public void click_on_the_try_it_out_button_in_provider_directory() throws IOException, InterruptedException {
        try{
            click("cm_pe_provider_directory_tryit");
            Thread.sleep(3000);
            browser_wait(5000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click on the try it out button in provider directory");
        }}

    @And("give the tenant value for endpoints resource")
    public void give_the_tenant_value_for_endpoints_resource() throws IOException, InterruptedException {
        try{
            driver.findElement(By.xpath(OR_reader("cm_pe_provider_directory_tenat"))).sendKeys(td_reader("sand_value",0));
            Thread.sleep(2000);
            browser_wait(1000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("give the tenant value for endpoints resource");
        }
    }

    @And("click on the execute button in provider directory")
    public void click_on_the_execute_button_in_provider_directory() throws IOException, InterruptedException {
        try{
            click("cm_pe_provider_directory_execute");
            scrolldown();
            Thread.sleep(9000);
            browser_wait(7000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click on the execute button in provider directory");
        }
    }
    @And("check the sandbox response")
    public void check_the_sandbox_response() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("sandbox_success_endpoints"))).getText();
            Assert.assertEquals(str,td_reader("sandbox_success_response"));
            //value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
            //Assert.assertEquals(true,value);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("check the sandbox response");
        }
    }
    @When("click on the application cmsa")
    public void click_on_the_application_cmsa() throws IOException, InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        click("applications_cmsa");
        Thread.sleep(5000);
        browser_wait(7000);
    }
    @Then("click on the approved application cmsa")
    public void click_on_the_approved_application_cmsa() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        //click("caap");
        //Thread.sleep(5000);
        //browser_wait(7000);
        //throw new io.cucumber.java.PendingException();
        //}
        try {
            click("approve1cmsa");
            Thread.sleep(3000);
            browser_wait(1000);
            //value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
            //Assert.assertEquals(true,value);
        } catch (Exception e) {
            //e.printStackTrace();
            //takeScreenShot("login_positive_clicks_on_login");

            //str= driver.findElement(By.xpath(OR_reader("org_title"))).getText();
            //Assert.assertEquals(str,td_reader("org_title"));
        }

    }

    @Then("click on the first applications cmsa")
    public void click_on_the_first_applications_cmsa() throws IOException {
        //click("com-san-app");
        click("com_ap_last_app");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    @Then("get the api key cmm second")
    public void get_the_api_key_cmm_second() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        myapi = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div[2]/div[1]/div[13]/div/div[2]/div")).getText();
        System.out.println(myapi);
    }

    @Then("close the applications cmm scecond")
    public void close_the_applications_cmm_scecond() throws IOException, InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        click("api_xsymbol");
        Thread.sleep(3000);
        browser_wait(5000);
        //
        // throw new io.cucumber.java.PendingException();s
    }

    @When("click on the sandbox cm scecond")
    public void click_on_the_sandbox_cm_scecond() throws IOException, InterruptedException {
        click("sandbox2");
        Thread.sleep(3000);
        browser_wait(5000);
        //throw new io.cucumber.java.PendingException();
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Then("click on the authorize cm scecond")
    public void click_on_the_authorize_cm_scecond() throws IOException, InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        click("authorize");
        Thread.sleep(500);
        browser_wait(1000);
        //throw new io.cucumber.java.PendingException();
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Then("give the value cm scecond")
    public void give_the_value_cm_scecond() throws IOException, InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        //throw new io.cucumber.java.PendingException();
        //driver.findElement(By.id("api_input")).sendKeys(Keys.CONTROL+"v");
        System.out.println(myapi);
        driver.findElement(By.xpath(OR_reader("api_input"))).sendKeys(myapi);

        //WebElement a=driver.findElement(By.xpath("//input[@placeholder='TENANT']"));
        //a.sendKeys(myOrderText);

        //driver.findElement(By.xpath(OR_reader( "api_input"))).sendKeys(td_reader("api_value",0));
        //driver.findElement(By.xpath("//input[@placeholder='TENANT']")).sendKeys(td_reader("api_value",0));
        Thread.sleep(2000);
        browser_wait(1000);

    }

    @Then("click on the authorize1 cm scecond")
    public void click_on_the_authorize1_cm_scecond() throws IOException, InterruptedException {
        click("authorize1");
        Thread.sleep(1000);
        browser_wait(3000);
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Then("click on the into button cm scecond")
    public void click_on_the_into_button_cm_scecond() throws IOException, InterruptedException {
        click("close");
        //scrolldown();
        Thread.sleep(1000);
        browser_wait(2000);
        // scrolldown();
        // browser_wait(1000);
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @When("click on the encounter cm scecond")
    public void click_on_the_encounter_cm_scecond() throws InterruptedException, IOException {
        click("condition");
        Thread.sleep(1000);
        browser_wait(3000);
// Write code here that turns the phrase above into concrete actions
//throw new io.cucumber.java.PendingException();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Then("click on the try it out cm scecond")
    public void click_on_the_try_it_out_cm_scecond() throws IOException, InterruptedException {
        click("condition-try-it-out");
        Thread.sleep(1000);
        browser_wait(3000);
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Then("give the text cm scecond")
    public void give_the_text_cm_scecond() throws IOException, InterruptedException {
        driver.findElement(By.xpath(OR_reader( "condition-tenet"))).sendKeys(td_reader("sand_value",0));
        Thread.sleep(500);
        browser_wait(1000);//scrolldown();
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        //driver.findElement (By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div[4]/section/div/span/div/div/div/span[36]/div/div[2]/div/div[1]/div[2]/div/table/tbody/tr[1]/td[2]/input")).sendKeys(Keys.chord(Keys.CONTROL, "v"));
        //driver.findElement (By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div/
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @Then("click on the execute cm  scecond")
    public void click_on_the_execute_cm_scecond() throws IOException, InterruptedException {
        click("condition-execute");
        scrolldown();
        Thread.sleep(7000);
        browser_wait(9000);
        //scrolldown();

        //throw new io.cucumber.java.PendingException();
    }
    @When("click on the patient cm api")
    public void click_on_the_patient_cm_api() throws IOException, InterruptedException {
        click("patient_cm_api");
        //scrolldown();
        Thread.sleep(1000);
        browser_wait(3000);

    }

    @Then("click on the try it out patient cm")
    public void click_on_the_try_it_out_patient_cm() throws IOException, InterruptedException {
        click("patient_cm_try_it_out");
        //scrolldown();
        Thread.sleep(1000);
        browser_wait(3000);
    }

    @Then("give the text patient cm")
    public void give_the_text_patient_cm() throws InterruptedException, IOException {
        driver.findElement(By.xpath(OR_reader("patient_cm_tenat"))).sendKeys(td_reader("sand_value",0));
        Thread.sleep(2000);
        browser_wait(1000);
    }

    @Then("click on the execute patient cm")
    public void click_on_the_execute_patient_cm() throws IOException, InterruptedException {
        click("patient_complaince_execute");
        scrolldown();
        Thread.sleep(9000);
        browser_wait(7000);
    }

    @When("click on the sandbox cm ap provider directory")
    public void click_on_the_sandbox_cm_ap_provider_directory() throws IOException, InterruptedException {
        click("cm_ap_provider_directory");
        Thread.sleep(3000);
        browser_wait(5000);
    }

    @Then("click on the authorize cm ap provider directory")
    public void click_on_the_authorize_cm_ap_provider_directory() throws IOException, InterruptedException {
        click("cm_ap_provider_directory_authorize");
        Thread.sleep(3000);
        browser_wait(5000);
    }

    @Then("give the value cm ap provider directory")
    public void give_the_value_cm_ap_provider_directory() throws InterruptedException, IOException {
        System.out.println(myapi);
        driver.findElement(By.xpath(OR_reader("cm_ap_provider_directory_api"))).sendKeys(myapi);

        //WebElement a=driver.findElement(By.xpath("//input[@placeholder='TENANT']"));
        //a.sendKeys(myOrderText);

        //driver.findElement(By.xpath(OR_reader( "api_input"))).sendKeys(td_reader("api_value",0));
        //driver.findElement(By.xpath("//input[@placeholder='TENANT']")).sendKeys(td_reader("api_value",0));
        Thread.sleep(2000);
        browser_wait(1000);
    }

    @Then("click on the authorize1 cm ap provider directory")
    public void click_on_the_authorize1_cm_ap_provider_directory() throws IOException, InterruptedException {
        click("cm_ap_provider_directory_authorize1");
        Thread.sleep(3000);
        browser_wait(5000);
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    @Then("click on the into button cm ap provider directory")
    public void click_on_the_into_button_cm_ap_provider_directory() throws IOException, InterruptedException {
        click("cm_ap_provider_directory_into");
        Thread.sleep(3000);
        browser_wait(5000);
    }


    @When("click on the endpoints cm ap provider directory healthcareservice")
    public void click_on_the_endpoints_cm_ap_provider_directory_healthcareservice() throws IOException, InterruptedException {
        click("cm_ap_provider_directory_healthcareservices");
        Thread.sleep(3000);
        browser_wait(5000);
    }

    @Then("click on the try it out cm ap provider directory healthcareservice")
    public void click_on_the_try_it_out_cm_ap_provider_directory_healthcareservice() throws IOException, InterruptedException {
        click("cm_ap_provider_directory_tryit");
        Thread.sleep(3000);
        browser_wait(5000);
    }

    @Then("give the text provider cm ap directory healthcareservice")
    public void give_the_text_provider_cm_ap_directory_healthcareservice() throws IOException, InterruptedException {
        driver.findElement(By.xpath(OR_reader("cm_ap_provider_directory_tenat"))).sendKeys(td_reader("sand_value",0));
        Thread.sleep(2000);
        browser_wait(1000);
    }

    @Then("click on the execute cm ap provider directory healthcareservice")
    public void click_on_the_execute_cm_ap_provider_directory_healthcareservice() throws IOException, InterruptedException {
        click("cm_ap_provider_directory_execute");
        scrolldown();
        Thread.sleep(9000);
        browser_wait(7000);
    }



    @Then("go back to the dashobard complaince secondd")
    public void go_back_to_the_dashobard_complaince_secondd() throws IOException {
        click("dashboardd");// Write code here that turns the phrase above into concrete actions
        //  throw new io.cucumber.java.PendingException();
    }



}

