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

public class S12_Thirdparty_WorkFlow_PositiveScenario extends Generic_function{


    static int s;
    static String str;
    static boolean value;

    @Given("launches url for third party workflow")
    public void launches_url_for_third_party_workflow()  throws IOException {
        try {
            browser_launch();
            s= Dataiter();
            browser_wait(120000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("landing_page_of_thirdparty");

        }

    }
    @When("navigate to welcome page")
    public void navigate_to_welcome_page() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("navigated_welcomepage"))).getText();
            Assert.assertEquals(str,td_reader("welcome_page_title"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("navigate to welcome page");

        }
    }
    @Then("able to click on login button for third party workflow")
    public void able_to_click_on_login_button_for_third_party_workflow() throws IOException {
        try {
            click("first_login");
            Thread.sleep(3000);
            browser_wait(1000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_login_button_of_thirdparty");

        }

    }


    @Then("check that thirdparty lands on the login page")
    public void check_that_thirdparty_lands_on_the_login_page()  throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("login_title"))).getText();
            Assert.assertEquals(str,td_reader("login_title"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("login_page_of_thirdparty");

        }

    }


    @When("Third party enters valid email and password")
    public void third_party_enters_valid_email_and_password() throws InterruptedException, IOException {
        try {
            driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("sir_third",0));
            Thread.sleep(3000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("email_of_thirdparty");
        }
        try {
            driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("login_password",0));
            Thread.sleep(2000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("password_of_thirdparty");
        }
    }

    @Then("hits login button and lands on third party dashboard")
    public void hits_login_button_and_lands_on_third_party_dashboard() throws IOException {
        try {
            click("login");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_login");

        }

    }
    @When("validate that thirdparty lands on their welcomepage")
    public void validate_that_thirdparty_lands_on_their_welcomepage() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("thirdparty_dash_title"))).getText();
            Assert.assertEquals(str,td_reader("thirdparty_dash_title"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty lands on their welcomepage");

        }
    }
    @When("click on create application button in the third party and view the page")
    public void click_on_create_application_button_in_the_third_party_and_view_the_page() throws IOException {
        try {
            click("create_app");
            Thread.sleep(2000);
            browser_wait(1000);
            //value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
            //Assert.assertEquals(true,value);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_first_app_creation");

            str= driver.findElement(By.xpath(OR_reader("create_apph"))).getText();
            Assert.assertEquals(str,td_reader("create_apph"));
        }
    }

    @Then("enter all the fiels in the first application")
    public void enter_all_the_fiels_in_the_first_application() throws IOException {
        try {
            //String app = RandomStringUtils.randomAlphabetic(8);
            //driver.findElement(By.xpath(OR_reader( "app_name"))).sendKeys(app);
            Random randomGeneratorapp1 = new Random();
            int randomInt = randomGeneratorapp1.nextInt(1000);
            driver.findElement(By.xpath(OR_reader( "app_name"))).sendKeys("applicationz"+ randomInt );

            Random randomGeneratordo = new Random();
            int randomIntdo1 = randomGeneratordo.nextInt(1000);
            driver.findElement(By.xpath(OR_reader( "auth_do"))).sendKeys("app"+ randomIntdo1 +".cornell.edu");

            String appdes1 = RandomStringUtils.randomAlphabetic(8);
            driver.findElement(By.xpath(OR_reader( "app_des"))).sendKeys(appdes1);

            Random randomGenerator = new Random();
            int randomIntem = randomGenerator.nextInt(1000);
            driver.findElement(By.xpath(OR_reader( "app_em"))).sendKeys("app"+ randomIntem +"@gmail.com");

            String appli1 = RandomStringUtils.randomAlphabetic(8);
            driver.findElement(By.xpath(OR_reader( "app_li"))).sendKeys(appli1);

            String appterms1 = RandomStringUtils.randomAlphabetic(8);
            driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(appterms1);

            //driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(td_reader("app_terms",0));
            str= driver.findElement(By.xpath(OR_reader("query_limit"))).getText();
            Assert.assertEquals(str,td_reader("query_limit"));
            click("query_limit");
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_first_application_deatails");
        }
    }

    @Then("click on save button for creationg the first application")
    public void click_on_save_button_for_creationg_the_first_application() throws IOException {
        try {
            click("create");
            browser_wait(1000);
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_first_app_creation_save");
        }}

    @Then("after the creation of first application hits on the xpath button")
    public void after_the_creation_of_first_application_hits_on_the_xpath_button() throws IOException {
        try {
            click("xsymbol");
            Thread.sleep(1000);
            browser_wait(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_first_app_creation_into_button");

            //throw new io.cucumber.java.PendingException();
        }
    }

    @Then("go back to the dashboard after the creation of first application")
    public void go_back_to_the_dashboard_after_the_creation_of_first_application() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("thirdparty_dashboard"))).getText();
            Assert.assertEquals(str,td_reader("thirdparty_dashboard"));

        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_first_app_creation_go_to_the_dashboard");
        }
    }

    @When("click on create application button for creating the second application")
    public void click_on_create_application_button_for_creating_the_second_application() throws IOException {
        try {
            click("create_app");
            Thread.sleep(3000);
            browser_wait(1000);
            //value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
            //Assert.assertEquals(true,value);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_second_app_creation");

            str= driver.findElement(By.xpath(OR_reader("create_apph"))).getText();
            Assert.assertEquals(str,td_reader("create_apph"));
        }
    }
    @Then("we enter the all required fields for creating the second application")
    public void we_enter_the_all_required_fields_for_creating_the_second_application() throws IOException {
        try {
            //String app = RandomStringUtils.randomAlphabetic(8);
            //driver.findElement(By.xpath(OR_reader( "app_name"))).sendKeys(app);
            Random randomGeneratorapp1 = new Random();
            int randomInt = randomGeneratorapp1.nextInt(1000);
            driver.findElement(By.xpath(OR_reader( "app_name"))).sendKeys("applicationx"+ randomInt );

            Random randomGeneratordo = new Random();
            int randomIntdo1 = randomGeneratordo.nextInt(1000);
            driver.findElement(By.xpath(OR_reader( "auth_do"))).sendKeys("app"+ randomIntdo1 +".cornell.edu");

            String appdes1 = RandomStringUtils.randomAlphabetic(8);
            driver.findElement(By.xpath(OR_reader( "app_des"))).sendKeys(appdes1);

            Random randomGenerator = new Random();
            int randomIntem = randomGenerator.nextInt(1000);
            driver.findElement(By.xpath(OR_reader( "app_em"))).sendKeys("app"+ randomIntem +"@gmail.com");

            String appli1 = RandomStringUtils.randomAlphabetic(8);
            driver.findElement(By.xpath(OR_reader( "app_li"))).sendKeys(appli1);

            String appterms1 = RandomStringUtils.randomAlphabetic(8);
            driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(appterms1);

            //driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(td_reader("app_terms",0));
            str= driver.findElement(By.xpath(OR_reader("query_limit1"))).getText();
            Assert.assertEquals(str,td_reader("query_limit1"));
            click("query_limit1");
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_second_application_deatails");
        }
    }

    @Then("click on save button for creating the second application")
    public void click_on_save_button_for_creating_the_second_application() throws IOException {
        try {
            click("create");
            browser_wait(3000);
            Thread.sleep(5000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_second_app_creation_save");
        }}

    @Then("hits on the xpath button after creating the second application")
    public void hits_on_the_xpath_button_after_creating_the_second_application() throws IOException {
        try {
            click("xsymbol");
            Thread.sleep(3000);
            browser_wait(5000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_second_app_creation_into_button");

            //throw new io.cucumber.java.PendingException();
        }
    }


    @Then("go back to the dashboard after creating the second application")
    public void go_back_to_the_dashboard_after_creating_the_second_application() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("thirdparty_dashboard"))).getText();
            Assert.assertEquals(str,td_reader("thirdparty_dashboard"));

        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_second_app_creation_go_to_the_dashboard");
        }
    }
    @When("click on create application button for creating the third application")
    public void click_on_create_application_button_for_creating_the_third_application() throws IOException {
        try {
            click("create_app");
            Thread.sleep(1000);
            browser_wait(3000);
            //value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
            //Assert.assertEquals(true,value);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_third_app_creation");

            str= driver.findElement(By.xpath(OR_reader("create_apph"))).getText();
            Assert.assertEquals(str,td_reader("create_apph"));
        }
    }

    @Then("we enter the all required fieldss for creating the third application")
    public void we_enter_the_all_required_fieldss_for_creating_the_third_application() throws IOException {
        try {
            //String app = RandomStringUtils.randomAlphabetic(8);
            //driver.findElement(By.xpath(OR_reader( "app_name"))).sendKeys(app);
            Random randomGeneratorapp1 = new Random();
            int randomInt = randomGeneratorapp1.nextInt(1000);
            driver.findElement(By.xpath(OR_reader( "app_name"))).sendKeys("applicationy"+ randomInt );

            Random randomGeneratordo = new Random();
            int randomIntdo1 = randomGeneratordo.nextInt(1000);
            driver.findElement(By.xpath(OR_reader( "auth_do"))).sendKeys("app"+ randomIntdo1 +".cornell.edu");

            String appdes1 = RandomStringUtils.randomAlphabetic(8);
            driver.findElement(By.xpath(OR_reader( "app_des"))).sendKeys(appdes1);

            Random randomGenerator = new Random();
            int randomIntem = randomGenerator.nextInt(1000);
            driver.findElement(By.xpath(OR_reader( "app_em"))).sendKeys("app"+ randomIntem +"@gmail.com");

            String appli1 = RandomStringUtils.randomAlphabetic(8);
            driver.findElement(By.xpath(OR_reader( "app_li"))).sendKeys(appli1);

            String appterms1 = RandomStringUtils.randomAlphabetic(8);
            driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(appterms1);

            //driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(td_reader("app_terms",0));
            str= driver.findElement(By.xpath(OR_reader("query_limit1"))).getText();
            Assert.assertEquals(str,td_reader("query_limit1"));
            click("query_limit1");
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_third_application_deatails");
        }
    }

    @Then("click on save button after creating the third application")
    public void click_on_save_button_after_creating_the_third_application() throws IOException {
        try {
            click("create");
            browser_wait(3000);
            Thread.sleep(5000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_third_app_creation_save");
        }}


    @Then("hits on the xpath button after creating the third application")
    public void hits_on_the_xpath_button_after_creating_the_third_application() throws IOException {
        try {
            click("xsymbol");
            Thread.sleep(3000);
            browser_wait(5000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_third_app_creation_into_button");

            //throw new io.cucumber.java.PendingException();
        }
    }

    @Then("go back to the dashboard after creating the third application")
    public void go_back_to_the_dashboard_after_creating_the_third_application() throws IOException  {
        try {
            str= driver.findElement(By.xpath(OR_reader("thirdparty_dashboard"))).getText();
            Assert.assertEquals(str,td_reader("thirdparty_dashboard"));

        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_third_app_creation_go_to_the_dashboard");
        }


    }
    @When("click on create application button for creating the fourth application")
    public void click_on_create_application_button_for_creating_the_fourth_application() throws IOException {
        try {
            click("create_app");
            Thread.sleep(1000);
            browser_wait(3000);
            //value = driver.findElement(By.xpath(OR_reader( "logout"))).isDisplayed();
            //Assert.assertEquals(true,value);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_fourth_app_creation");

            str= driver.findElement(By.xpath(OR_reader("create_apph"))).getText();
            Assert.assertEquals(str,td_reader("create_apph"));
        }

    }

    @Then("we enter the all required fieldss for creating the fourth application")
    public void we_enter_the_all_required_fieldss_for_creating_the_fourth_application() throws IOException {
        try {
            //String app = RandomStringUtils.randomAlphabetic(8);
            //driver.findElement(By.xpath(OR_reader( "app_name"))).sendKeys(app);
            Random randomGeneratorapp1 = new Random();
            int randomInt = randomGeneratorapp1.nextInt(1000);
            driver.findElement(By.xpath(OR_reader( "app_name"))).sendKeys("applicationm"+ randomInt );

            Random randomGeneratordo = new Random();
            int randomIntdo1 = randomGeneratordo.nextInt(1000);
            driver.findElement(By.xpath(OR_reader( "auth_do"))).sendKeys("app"+ randomIntdo1 +".cornell.edu");

            String appdes1 = RandomStringUtils.randomAlphabetic(8);
            driver.findElement(By.xpath(OR_reader( "app_des"))).sendKeys(appdes1);

            Random randomGenerator = new Random();
            int randomIntem = randomGenerator.nextInt(1000);
            driver.findElement(By.xpath(OR_reader( "app_em"))).sendKeys("app"+ randomIntem +"@gmail.com");

            String appli1 = RandomStringUtils.randomAlphabetic(8);
            driver.findElement(By.xpath(OR_reader( "app_li"))).sendKeys(appli1);

            String appterms1 = RandomStringUtils.randomAlphabetic(8);
            driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(appterms1);

            //driver.findElement(By.xpath(OR_reader( "app_terms"))).sendKeys(td_reader("app_terms",0));
            str= driver.findElement(By.xpath(OR_reader("query_limit1"))).getText();
            Assert.assertEquals(str,td_reader("query_limit1"));
            click("query_limit1");
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_fourth_application_deatails");
        }
    }



    @Then("click on save button after creating the fourth application")
    public void click_on_save_button_after_creating_the_fourth_application() throws IOException {
        try {
            click("create");
            browser_wait(3000);
            Thread.sleep(5000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_fourth_app_creation_save");
        }}



    @Then("hits on the xpath button after creating the fourth application")
    public void hits_on_the_xpath_button_after_creating_the_fourth_application() throws IOException {
        try {
            click("xsymbol");
            Thread.sleep(3000);
            browser_wait(5000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_fourth_app_creation_into_button");

            //throw new io.cucumber.java.PendingException();
        }
    }


    @Then("go back to the dashboard after creating the fourth application")
    public void go_back_to_the_dashboard_after_creating_the_fourth_application() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("thirdparty_dashboard"))).getText();
            Assert.assertEquals(str,td_reader("thirdparty_dashboard"));

        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_fourth_app_creation_go_to_the_dashboard");
        }
    }
    @When("third party hits on the pending button in the thirdparty landing apge")
    public void third_party_hits_on_the_pending_button_in_the_thirdparty_landing_apge() throws IOException {
        try {
            click("thirdparty_pending_dashboard");
            browser_wait(3000);
            Thread.sleep(5000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_pending_dashboard");
        }}

    @Then("third party click on the pending button to see all pending applications")
    public void third_party_click_on_the_pending_button_to_see_all_pending_applications() throws IOException {
        try {
            click("thirdparty_pending_dashboard_appli");
            browser_wait(1000);
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_pending_dashboard_applications");
        }
    }
    @Then("check that thirdparty successfully navigated to the pendinglist of applications or not")
    public void check_that_thirdparty_successfully_navigated_to_the_pendinglist_of_applications_or_not() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("pending_navigation"))).getText();
            Assert.assertEquals(str,td_reader("pending_navigation"));

        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("check_that_thirdparty_successfully_navigated_to_the_pendinglist_of_applications_or_not");
        }
    }

    @When("click on the deleted button")
    public void click_on_the_deleted_button() throws IOException {
        try {
            click("cm_third_pending_last_delete");
            browser_wait(1000);
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_delete_application");
        }
    }

    @When("click on the confirm button")
    public void click_on_the_confirm_button() throws IOException {
        try {
            click("thirdparty_confirm");
            browser_wait(1000);
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_delete_confirm");
        }
    }

    @Then("the application deleted sucessfully")
    public void the_application_deleted_sucessfully() throws IOException {
        try {
            click("thirdparty_pending_dashboard_appli");
            browser_wait(1000);
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_deleted_sucessfully");
        }
    }
    @When("click on the edited button")
    public void click_on_the_edited_button() throws IOException {
        try {
            click("cm_third_pending_last_edit");
            browser_wait(1000);
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_application_edition");
        }
    }

    @Then("sucessfully navigated to the edited page")
    public void sucessfully_navigated_to_the_edited_page() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("thirdparty_edition_navigation_page"))).getText();
            Assert.assertEquals(str,td_reader("thirdparty_edition_navigation_page"));

        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_navigated_to_edited_page");
        }
    }

    @Then("third party able to edited the application")
    public void third_party_able_to_edited_the_application() throws IOException {
        try {
            backspace("app_name");
            Thread.sleep(1000);
            Random randomGeneratorapp1 = new Random();
            int randomInt = randomGeneratorapp1.nextInt(1000);
            driver.findElement(By.xpath(OR_reader( "app_name"))).sendKeys("secondapplication"+ randomInt );
            Thread.sleep(1000);
            backspace("app_do");
            Thread.sleep(1000);
            Random randomGeneratordoedit = new Random();
            int randomIntdoedit = randomGeneratordoedit.nextInt(1000);
            driver.findElement(By.xpath(OR_reader( "auth_do"))).sendKeys("app"+ randomIntdoedit +".example.com");
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_edited_application_name");
        }
    }
//@Then("third party edit the domain")
//public void third_party_edit_the_domain() throws IOException {
    //try {

    // backspace("app_do");
    //Thread.sleep(1000);
    //Random randomGeneratordoedit = new Random();
    //int randomIntdoedit = randomGeneratordoedit.nextInt(1000);
    //driver.findElement(By.xpath(OR_reader( "auth_do"))).sendKeys("app"+ randomIntdoedit +".example.com");
    //}catch (Exception e) {
    //e.printStackTrace();
    //takeScreenShot("thirdparty_edited_application_domain");
//}
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
//}

    @Then("click on the updated button")
    public void click_on_the_updated_button() throws IOException {
        try {
            click("thirdparty_updation");
            browser_wait(1000);
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_updated");
        }
    }

    @Then("sucessfully navigated to the pending list of the third party")
    public void sucessfully_navigated_to_the_pending_list_of_the_third_party() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("thirdparty_Applications"))).getText();
            Assert.assertEquals(str,td_reader("thirdparty_Applications"));

        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_after_updated_dashboard");
        }
    }
    @When("thirdparty click on the approved list")
    public void thirdparty_click_on_the_approved_list() throws IOException {
        try {
            click("thirdparty_approved_list_checking");
            browser_wait(1000);
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_approvedlist_checking");
        }
    }

    @Then("navigated to the approved page")
    public void navigated_to_the_approved_page() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("thirdparty_Applications"))).getText();
            Assert.assertEquals(str,td_reader("thirdparty_Applications"));

        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_approved_list_navigated_sucessfully");
        }
    }

    @Then("click on the denied list")
    public void click_on_the_denied_list() throws IOException {
        try {
            click("thirdparty_denied_list_checking");
            browser_wait(1000);
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_denied_list_click");
        }
    }

    @Then("navigated to the denied page")
    public void navigated_to_the_denied_page() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("thirdparty_Applications"))).getText();
            Assert.assertEquals(str,td_reader("thirdparty_Applications"));

        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_sucessfully_navigated_to_the_denied_list");
        }
    }

    @When("click on the thirdparty dashboard")
    public void click_on_the_thirdparty_dashboard() throws IOException {
        try {
            click("click_thirdparty_dashboard");
            browser_wait(1000);
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_dashboard_clicking");
        }
    }

    @Then("sucessfully navigated to the thirdparty dashboard")
    public void sucessfully_navigated_to_the_thirdparty_dashboard() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("thirdparty_dashboard"))).getText();
            Assert.assertEquals(str,td_reader("thirdparty_dashboard"));

        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_sucessfully_navigated_to_the_dashboard_after_checking_list");
        }
    }

    @Then("click on the thirdparty pricelist")
    public void click_on_the_thirdparty_pricelist() throws IOException {
        try {
            click("click_thirdparty_pricelist");
            browser_wait(1000);
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_click_on_the_pricelist");
        }
    }

    @Then("sucessfully navigated to the third party pricelist")
    public void sucessfully_navigated_to_the_third_party_pricelist() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("thirdparty_pricelist_dashboard"))).getText();
            Assert.assertEquals(str,td_reader("thirdparty_pricelist_dashboard"));

        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_sucessfully_navigated_to_the_preice_list");
        }
    }
    @When("click on the search button in the third party")
    public void click_on_the_search_button_in_the_third_party() throws IOException {
        try {
            click("thirdparty_search_lobs");
            browser_wait(1000);
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_click_the_search_button_of_the_pricelist");
        }
    }

    @Then("thirdparty can give any data for searching")
    public void thirdparty_can_give_any_data_for_searching() throws IOException {
        try{

            driver.findElement(By.xpath(OR_reader( "thirdparty_search_lobs"))).sendKeys(td_reader("thirdparty_search_lobs",0));
            Thread.sleep(1000);
            browser_wait(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_click_the_search_lobs");
        }
    }

    @Then("click the corresponding pricelist of the thirdparty")
    public void click_the_corresponding_pricelist_of_the_thirdparty() throws IOException {
        try{
            click("thirdparty_view_price_list");
            browser_wait(1000);
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_click_the_data");
        }
    }

    @Then("click the any of the prise list file in the thirdparty")
    public void click_the_any_of_the_prise_list_file_in_the_thirdparty() throws IOException {
        try{
            click("thirdparty_any_price_list");
            browser_wait(1000);
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_download_first_price_list");
        }
    }

    @Then("click on the second download button of pricelist")
    public void click_on_the_second_download_button_of_pricelist() throws IOException {
        try{
            click("thirdparty_any_price_list2");
            browser_wait(1000);
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_dback_to_dashboard");
        }
    }

    @Then("go back to the price list dashboard of the third party")
    public void go_back_to_the_price_list_dashboard_of_the_third_party() throws IOException {
        try{
            click("thirdparty_price_list_dashboard");

            Thread.sleep(3000);
            browser_wait(5000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_dback_to_dashboard");
        }
    }
    @When("third party signout")
    public void third_party_signout() throws IOException {
        try{
            click("so1");

            Thread.sleep(3000);
            browser_wait(5000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_signout");
        }
    }

    @Then("thirdparty logout")
    public void thirdparty_logout() throws IOException {
        try{
            click("so2");

            Thread.sleep(3000);
            browser_wait(5000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("thirdparty_logout");
        }
    }
    @When("able to click on login button for  approving denying the third paty applications")
    public void able_to_click_on_login_button_for_approving_denying_the_third_paty_applications() throws IOException {
        try {
            click("first_login");
            Thread.sleep(3000);
            browser_wait(1000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_login_button_for_approving_the_third_paty_applicationss");

        }

    }

    //@Then("lands on login page for  approving denying the third paty applications")
//public void lands_on_login_page_for_approving_denying_the_third_paty_applications()
    @Then("lands on login page for  approving the third paty applications")
    public void lands_on_login_page_for_approving_the_third_paty_applications() throws IOException {
        try {

            str= driver.findElement(By.xpath(OR_reader("login_title"))).getText();
            Assert.assertEquals(str,td_reader("login_title"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("lands_on_login_page_for_approving_the_third_paty_applicationss");

        }
    }

    @When("complaince manager give valid email and password for approving denying the third paty applications")
    public void complaince_manager_give_valid_email_and_password_for_approving_the_third_paty_applications() throws IOException, InterruptedException {
        try {
            driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("sir_com",0));
            Thread.sleep(3000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("email_of_cm_thirdparty");
        }
        try {
            driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("login_password",0));
            Thread.sleep(2000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("password_of_cm_thirdparty");
        }
    }

    @Then("hits login button and lands on complaince Manager page for  approving denying the third paty applications")
    public void hits_login_button_and_lands_on_complaince_manager_page_for_approving_denying_the_third_paty_applications() throws IOException {
        try {
            click("login");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot(" hits_login_button_and_lands_on_complaince_manager_page_for_approving_the_third_paty_applicationss");

        }
    }

    @When("complaince manager click on the pending button for  approving the third paty applications for consideration")
    public void complaince_manager_click_on_the_pending_button_for_approving_the_third_paty_applications_for_consideration() throws IOException {
        try {
            click("cm_third_pending");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("complaince_manager_click_on_the_pending_button_for_approving_the_third_paty_applicationss");

        }
    }

    @Then("able to see the applications in the pending list for  approving the third paty applications")
    public void able_to_see_the_applications_in_the_pending_list_for_approving_the_third_paty_applications() throws IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("cm_third_first_app_dash"))).getText();
            Assert.assertEquals(str,td_reader("cm_third_first_app_dash"));

        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("able_to_see_the_applications_in_the_pending_list_for_approving_the_third_paty_applicationss");
        }
    }

    @When("click on the thirdparty created applications")
    public void click_on_the_thirdparty_created_applications() throws IOException {
        try {
            click("last_appli");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_thirdparty_created_applications");

        }
    }

    @Then("approve the  third party created applications")
    public void approve_the_third_party_created_applications() throws IOException {
        try {
            click("cm_third_first_application_approve");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("approve_the_third_party_created_applications");

        }
    }

//@When("click on the Approve list for checking the third party created applications")
//public void click_on_the_approve_list_for_checking_the_third_party_created_applications() {

////}

//@Then("view the thirdparty created approved application")
//public void view_the_thirdparty_created_approved_application() {
    // Write code here that turns the phrase above into concrete actions
    // throw new io.cucumber.java.PendingException();
//}

    @When("cm click on the pending list for denying the third party created applications")
    public void cm_click_on_the_pending_list_for_denying_the_third_party_created_applications() throws IOException {
        try {
            click("cm_third_click_pending_for_deny");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_on_the_pending_list_for_denying_the_third_party_created_applications");

        }
    }

    @Then("click pending application for denying the thirdparty cm applications")
    public void click_pending_application_for_denying_the_thirdparty_cm_applications() throws IOException {
        try {
            click("last_appli");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click_pending_application_for_denying_the_thirdparty_applications");

        }
    }

    @Then("deny the thirdparty cm created application")
    public void deny_the_thirdparty_cm_created_application() throws IOException {
        try {
            click("cm_third_deny_button");
            Thread.sleep(5000);
            browser_wait(7000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("deny_the_thirdparty_created_application");

        }
    }

    @When("click on the approve button for denying")
    public void click_on_the_approve_button_for_denying() throws IOException {
        try {
            //click("cm_third_approve_list");
            click("approve1");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("cm_third_see_the_approved_list");

        }
    }

    @Then("click on the cm deny button for third party created applications")
    public void click_on_the_cm_deny_button_for_third_party_created_applications() throws IOException {
        try {
            click("cm_third_deny_list");
            //click("deny1");
            Thread.sleep(5000);
            browser_wait(7000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("cm_third_see_the_deny_list");

        }
    }
    @Then("check cm dashboard")
    public void check_cm_dashboard() throws IOException {

//@When("cm sign out after considering the third party applications")
//public void cm_sign_out_after_considering_the_third_party_applications() throws IOException {
        try {
            click("cm_third_dashboardd");
            Thread.sleep(5000);
            browser_wait(7000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("go_back_cm_dash");

        }
        //throw new io.cucumber.java.PendingException();
    }
    @When("cm sign out after considering the third party applications")
    public void cm_sign_out_after_considering_the_third_party_applications() throws IOException {
        try {
            click("so1");
            Thread.sleep(5000);
            browser_wait(7000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("cm_third_go_back1");

        }
        //throw new io.cucumber.java.PendingException();
    }

    @Then("cm log out after considering approving denying the third party applications")
    public void cm_log_out_after_considering_approving_denying_the_third_party_applications() throws IOException {
        try {
            click("so2");
            Thread.sleep(5000);
            browser_wait(7000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("cm_third_go_back2");

        }
    }

    @When("thirdparty can again  click on login button")
    public void thirdparty_can_again_click_on_login_button() throws IOException {
        try {
            click("first_login");
            Thread.sleep(3000);
            browser_wait(1000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("cm_third_click_login_button");

        }
    }

    @Then("thirdparty can again lands on login page")
    public void thirdparty_can_again_lands_on_login_page() throws InterruptedException, IOException {
        try {
            str= driver.findElement(By.xpath(OR_reader("login_title"))).getText();
            Assert.assertEquals(str,td_reader("login_title"));
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("login_page_of_cm_thirdparty");

        }
    }

//@When("hits login button and lands on third party dashboardd")
//public void hits_login_button_and_lands_on_third_party_dashboardd() throws IOException {
    //try {
    //click("login");
    //Thread.sleep(3000);
    //browser_wait(1000);
    //} catch (Exception e) {
    //e.printStackTrace();
    //takeScreenShot("cm_thirdparty_login");

    //}
//}

    @When("thirdparty again given the valid email and password")
    public void thirdparty_again_given_the_valid_email_and_password() throws IOException, InterruptedException {
        try {
            driver.findElement(By.xpath(OR_reader( "login_email"))).sendKeys(td_reader("sir_third",0));
            Thread.sleep(3000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("email_of_cm_thirdparty");
        }
        try {
            driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("login_password",0));
            Thread.sleep(2000);
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("password_of_cm_thirdparty");
        }
    }

    @When("thirdparty again  hits login button and lands on superadmin page")
    public void thirdparty_again_hits_login_button_and_lands_on_superadmin_page() throws IOException {
        try {
            click("login");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("cm_thirdparty_login");

        }
    }

    @When("thirdparty check the pending button")
    public void thirdparty_check_the_pending_button() throws IOException {
        try {
            click("pending");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("cm_third_pending_check");

        }
    }

    @When("thirdparty check the approve button")
    public void thirdparty_check_the_approve_button() throws IOException {
        try {
            click("approve1");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("cm_third_approve_check");

        }
    }

    @Then("thirdparty cm check the deny button")
    public void thirdparty_cm_check_the_deny_button()  throws IOException {
        try {
            click("deny1");
            Thread.sleep(3000);
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("cm_third_denied_check");

        }
    }

    @Then("then thirdparty go back to the dashboard")
    public void then_thirdparty_go_back_to_the_dashboard() throws IOException {
        try {
            click("dashboard");
            Thread.sleep(3000);
            browser_wait(1000);
            driver.close();
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("third_cm_dashboard");

        }

    }}




