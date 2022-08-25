package StepDefinition;

import Reusable_Functions.Generic_function;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class S02_SuperAdmin_CRUD_negative_scenarios extends Generic_function {
    static int s;
    static String str, orgname;
    static boolean value;
    static String lobname;
    /* TC01 validate the super admin not able to signin with invalid credentials */

    @Given("launches the given welcome page url")
    public void launches_the_given_welcome_page_url() throws IOException {
        browser_launch();
        s = Dataiter();

        browser_wait(120000);


    }

    @Then("lands on welcome page")
    public void lands_on_welcome_page() throws IOException {
        browser_wait(5000);
        str = driver.findElement(By.xpath(OR_reader("welcome_page_title"))).getText();
        Assert.assertEquals(str, td_reader("welcome_page_title"));
//		value = driver.findElement(By.xpath(OR_reader("landing_logo"))).isDisplayed();
//		Assert.assertEquals(value, true);
//		Boolean logoPresent = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/img")).isDisplayed();
//		Assert.assertEquals(true, logoPresent);
    }

    @Then("clicks on Login button")
    public void clicks_on_login_button() throws IOException, InterruptedException {
        click("landing_login");
        Thread.sleep(5000);
        browser_wait(7000);
    }

    @Then("lands on users login")
    public void lands_on_users_login() throws IOException {
        str = driver.findElement(By.xpath(OR_reader("login_title"))).getText();
        Assert.assertEquals(str, td_reader("login_title"));
    }

    @When("super admin left all fields blank")
    public void super_admin_left_all_fields_blank() throws IOException, InterruptedException {

        /* Checks validation */
        driver.findElement(By.xpath(OR_reader("login_email"))).sendKeys("");
        //Thread.sleep(500);

        driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys("");
        //Thread.sleep(500);

        click("login");
        //Thread.sleep(1000);
        //browser_wait(1000);

    }

    @Then("verify validation message")
    public void verify_validation_message() throws IOException {
        str = driver.findElement(By.xpath("//*[@id=\"input-error\"]")).getText();
        String value1 = "Invalid username or password.";
        Assert.assertEquals(str, value1);
        System.out.println(str);
        System.out.println(value1);

//		value = driver.findElement(By.xpath("//*[@id=\"input-error\"]")).isDisplayed();
//		Assert.assertEquals(true,value);
    }

    @When("super admin left any one field blank")
    public void super_admin_left_any_one_field_blank() throws IOException, InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(OR_reader("login_email"))).sendKeys("superadmin@mph.com");
        driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys("");
        click("login");
    }


    @When("super admin enters invalid email and password")
    public void super_admin_enters_invalid_email_and_password() throws IOException, InterruptedException {
        driver.findElement(By.xpath(OR_reader("login_email"))).clear();
        driver.findElement(By.xpath(OR_reader("login_email"))).sendKeys("super@mph.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys("Password");
        Thread.sleep(2000);
        click("login");
    }

    @When("super admin enters invalid email and valid password")
    public void super_admin_enters_invalid_email_and_valid_password() throws IOException, InterruptedException {
        driver.findElement(By.xpath(OR_reader("login_email"))).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath(OR_reader("login_email"))).sendKeys("super@mph.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath(OR_reader("login_password"))).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys("password@123");
        Thread.sleep(2000);
        click("login");
    }

    @When("super admin enters valid email and invalid password")
    public void super_admin_enters_valid_email_and_invalid_password() throws IOException, InterruptedException {
        driver.findElement(By.xpath(OR_reader("login_email"))).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath(OR_reader("login_email"))).sendKeys("superadmin@mph.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath(OR_reader("login_password"))).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys("Password");
        Thread.sleep(1000);
    }

    @When("super admin enters valid email and password")
    public void super_admin_enters_valid_email_and_password() throws IOException, InterruptedException {
        driver.findElement(By.xpath(OR_reader("login_email"))).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath(OR_reader("login_email"))).sendKeys("superadmin@mph.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath(OR_reader("login_password"))).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys("Password@123");
        Thread.sleep(1000);
    }

    @Then("login button should not be inactive")
    public void login_button_should_not_be_inactive() throws IOException {
        click("login");
        //Thread.sleep(1000);
        browser_wait(1000);
    }

    @Then("should only lands on super admin page")
    public void should_only_lands_on_super_admin_page() throws IOException, InterruptedException {
        Thread.sleep(3000);
        browser_wait(1000);
        str = driver.findElement(By.xpath(OR_reader("org_title"))).getText();
        Assert.assertEquals(str, td_reader("org_title"));
    }
    /* validate super admin not able to create org with duplicate ein and db */

    @When("super admin clicks on setup org")
    public void super_admin_clicks_on_setup_org() throws IOException {
        click("setup_org");
        browser_wait(7000);
    }

    @Then("enter org data with duplicate ein and db")
    public void enter_org_data_with_duplicate_ein_and_db() throws IOException, InterruptedException {
        try {

            WebElement chooseFile = driver.findElement(By.xpath(OR_reader("logo_upload")));
            File file = new File("./Upload_images/healthh1.png");
            chooseFile.sendKeys(file.getAbsolutePath());

            Random randomGenerator = new Random();
            int randomInt = randomGenerator.nextInt(1000);
            orgname = "Organization" + randomInt;
            driver.findElement(By.xpath(OR_reader("org_name"))).sendKeys(orgname);
            Thread.sleep(1000);


            driver.findElement(By.xpath(OR_reader("org_db"))).sendKeys("999999999");
            Thread.sleep(1000);

            driver.findElement(By.xpath(OR_reader("org_ein"))).sendKeys("999999999");
            Thread.sleep(1000);

            WebElement selectMyElement = driver.findElement(By.xpath(OR_reader("org_type")));
            selectMyElement.click();
            Thread.sleep(1000);
            WebElement selectMyItem = driver.findElement(By.xpath(OR_reader("org_type_item")));
            selectMyItem.click();
            Thread.sleep(1000);

            String randomNumbers2 = RandomStringUtils.randomNumeric(9);
            String busno = 2 + randomNumbers2;
            driver.findElement(By.xpath(OR_reader("org_bus_con_no"))).sendKeys(busno);
            Thread.sleep(1000);
            Random randomGenerator3 = new Random();
            int randomInt3 = randomGenerator3.nextInt(1000);
            driver.findElement(By.xpath(OR_reader("org_email"))).sendKeys("autotest" + randomInt3 + "@gmail.com");
            Thread.sleep(1000);

            String randomNumbers4 = RandomStringUtils.randomNumeric(9);
            String faxno = 2 + randomNumbers4;
            driver.findElement(By.xpath(OR_reader("org_faxno"))).sendKeys(faxno);
            String add = RandomStringUtils.randomAlphabetic(3);

            JavascriptExecutor jss = (JavascriptExecutor) driver;
            jss.executeScript("window.scrollBy");

            WebElement selectMyElement2 = driver.findElement(By.xpath(OR_reader("org_add_type")));
            selectMyElement2.click();
            Thread.sleep(1000);
            //Actions b = new Actions(driver);
            //b.moveToElement(selectMyElement2).click();
            //selectMyElement2.sendKeys(Keys.ENTER, Keys.RETURN);
            WebElement selectMyItem2 = driver.findElement(By.xpath(OR_reader("org_add_type_item")));
            selectMyItem2.click();
            Random randomGenerator5 = new Random();
            int apt = randomGenerator5.nextInt(1000);
            driver.findElement(By.xpath(OR_reader("org_apt"))).sendKeys("Block" + apt);
            Thread.sleep(1000);

            String street = RandomStringUtils.randomAlphabetic(3);
            driver.findElement(By.xpath(OR_reader("org_street_add"))).sendKeys("Street " + street);
            Thread.sleep(1000);

            String city = RandomStringUtils.randomAlphabetic(8);
            driver.findElement(By.xpath(OR_reader("org_city_add"))).sendKeys("City " + city);
            Thread.sleep(1000);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy");
            WebElement selectMyElement3 = driver.findElement(By.xpath(OR_reader("org_state_add")));
            selectMyElement3.click();
            Thread.sleep(1000);
            JavascriptExecutor jss1 = (JavascriptExecutor) driver;
            jss1.executeScript("window.scrollBy");
            WebElement selectMyItem3 = driver.findElement(By.xpath(OR_reader("org_state_add_item")));
            selectMyItem3.click();

            Thread.sleep(1000);

            String zip = RandomStringUtils.randomNumeric(5);
            driver.findElement(By.xpath(OR_reader("org_zip"))).sendKeys(zip);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("org_data");
        }
    }

    @Then("save changes")
    public void save_changes() throws IOException, InterruptedException {
        try {
            Thread.sleep(2000);
            click("org_add_address_save");
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("click the save button");
        }
    }

    @Then("Verify the error msg")
    public void Verify_the_error_msg() throws IOException, InterruptedException {
        try {
            @SuppressWarnings("deprecation")
            WebDriverWait wait = new WebDriverWait(driver, 100);
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("error_msg"))));
            String edittext = element.getText();
            System.out.println(edittext);
            Assert.assertEquals(edittext, td_reader("error_msg"));

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("unique ein db error msg");
        }
    }
    /* Validate super admin able to create org usinf diffent db and ein */

    @When("super admin edit the db and ein")
    public void super_admin_edit_the_db_and_ein() throws IOException, InterruptedException {
        try {
            backspace("org_db");
            String randomNumbers = RandomStringUtils.randomNumeric(9);
            String db = randomNumbers;
            driver.findElement(By.xpath(OR_reader( "org_db"))).sendKeys(db);
            Thread.sleep(2000);
            backspace("org_ein");
            String randomNumbers1 = RandomStringUtils.randomNumeric(9);
            String ein = randomNumbers1;
            driver.findElement(By.xpath(OR_reader( "org_ein"))).sendKeys(ein);
            Thread.sleep(2000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("super admin edit ein db");

        }
    }
    @Then("click on the save for changes")
    public void click_on_the_save_for_changes() throws IOException, InterruptedException {
        try {
            Thread.sleep(2000);
            click("org_add_address_save");
        } catch (IOException e) {
            e.printStackTrace();
            takeScreenShot("click on the save for changes");
        }
    }
    @Then("navigated to org page")
    public void navigated_to_org_page() throws IOException, InterruptedException {
        try {

            str = driver.findElement(By.xpath(OR_reader("superadmin_welcome_page_title"))).getText();
            Assert.assertEquals(str, td_reader("superadmin_welcome_page_title"));
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("navigated to org page");
        }

        //browser_refresh();
    }
    /* validate super admin not able perfome edit operation while lefe some fields are blank */

    @When("super admin clicks on edit org button")
    public void super_admin_clicks_on_edit_org_button() throws IOException, InterruptedException {
        try {
            browser_wait(5000);
            Thread.sleep(2000);
            click("org_edit_icon");
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("clicks org edit");
        }}

    @Then("successfully navigated to the edit org page")
    public void successfully_navigated_to_the_edit_org_page() throws IOException, InterruptedException {
        try {
            //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            //String bodyText = driver.findElement(By.xpath("//*[contains(text(),'Edit Organization details')]")).getText();
            //Assert.assertEquals("Edit Organization details", bodyText);
            WebDriverWait wait = new WebDriverWait(driver, 100);
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("org_edit_popup"))));
            String edittext = element.getText();
            System.out.println(edittext);
            Assert.assertEquals(edittext, td_reader("org_edit_popup"));
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("org_edit_popup");
        }

    }
    @Then("edit some fildes and left some fields as blank")
    public void edit_some_fildes_and_left_some_fields_asblank() throws IOException, InterruptedException {
        try {
            browser_wait(4000);
            //Thread.sleep(1000);
            backspace("org_edit_org_name");
            Thread.sleep(1000);
            Random randomGenerator = new Random();
            int randomInt = randomGenerator.nextInt(1000);
            String edit_orgname = "Org " + randomInt;
            driver.findElement(By.xpath(OR_reader("org_edit_org_name"))).sendKeys(edit_orgname);
            //driver.findElement(By.xpath(OR_reader( "org_edit_org_db"))).sendKeys(td_reader("org_edit_org_db",0));
            Thread.sleep(1000);
            backspace("org_edit_org_ein");
            WebElement selectMyElement = driver.findElement(By.xpath(OR_reader("org_edit_org_type")));
            selectMyElement.click();
            Thread.sleep(1000);
            WebElement selectMyItem = driver.findElement(By.xpath(OR_reader("org_edit_org_type_item")));
            selectMyItem.click();
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("org_edit_fields blank");
        }
    }
    @Then("click on the save button")
    public void click_on_the_save_button() throws IOException, InterruptedException {
        try {
            Thread.sleep(1000);

            @SuppressWarnings("deprecation")
            WebDriverWait wait = new WebDriverWait(driver, 100);

            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
            element.click();
            browser_wait(1000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click on the save button");
        }
    }
    @Then("verify the validation msgg")
    public void verify_the_validation_msgg() throws IOException, InterruptedException {
        try {
            @SuppressWarnings("deprecation")
            WebDriverWait wait = new WebDriverWait(driver, 100);
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("val_msg"))));
            String edittext = element.getText();
            System.out.println(edittext);
            Assert.assertEquals(edittext, td_reader("val_msg"));
            browser_wait(3000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("verify the validation msgg");
        }
    }
    /* validate super admin not able to edit while giving same ein */

    @When("giving ein number which already exist")
    public void giving_ein_number_which_already_exist() throws IOException, InterruptedException {
        try {
            //backspace("org_ein");
            driver.findElement(By.xpath(OR_reader("org_edit_org_ein"))).sendKeys("999999999");
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("give unique data to ein");
        }
    }

    @Then("super admin click on the save button in edit org")
    public void super_admin_click_on_the_save_button_in_edit_org() throws IOException, InterruptedException {
        try {
            Thread.sleep(1000);

            @SuppressWarnings("deprecation")
            WebDriverWait wait = new WebDriverWait(driver, 100);
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
            element.click();
            browser_wait(3000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click on the save button in edit org");
        }}
    @Then("verify duplicate error msg")
    public void verify_duplicate_error_msg() throws IOException, InterruptedException {
        try {
            @SuppressWarnings("deprecation")
            WebDriverWait wait = new WebDriverWait(driver, 100);
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("val_msgg"))));
            String edittext = element.getText();
            System.out.println(edittext);
            Assert.assertEquals(edittext, td_reader("val_msgg"));
            browser_wait(3000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("super admin verify the validation msgg");
        }
    }
    /* Validate super admin able to perfome edit operations while giving valid data */
    @When("super admin give ein data to ein field")
    public void super_admin_give_ein_data_to_ein_field() throws IOException, InterruptedException  {
        try {
            backspace("org_edit_org_ein");
            String randomNumbers1 = RandomStringUtils.randomNumeric(9);
            String edit_ein = randomNumbers1;
            driver.findElement(By.xpath(OR_reader("org_edit_org_ein"))).sendKeys(edit_ein);
            Thread.sleep(1000);
        }catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("super admin give valid data to ein field");

        }

    }

    @Then("click on the save button with valid ein")
    public void click_on_the_save_button_with_valid_ein() throws IOException, InterruptedException {
        try {
            Thread.sleep(1000);

            @SuppressWarnings("deprecation")
            WebDriverWait wait = new WebDriverWait(driver, 100);

            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
            element.click();
            browser_wait(3000);
        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("click on the save button with valid ein");
        }
    }
    @Then("verify edit org successfully done")
    public void verify_edit_org_successfully_done() throws IOException, InterruptedException {
        try {
            @SuppressWarnings("deprecation")
            WebDriverWait wait = new WebDriverWait(driver, 100);
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("edit_val_msg"))));
            String edittext = element.getText();
            System.out.println(edittext);
            Assert.assertEquals(edittext, td_reader("edit_val_msg"));
            browser_wait(3000);

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenShot("verify the validation msgg");
        }
    }

}
