package StepDefinition;

import java.io.File;
import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
import java.util.Random;
//import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.RandomStringUtils;
//import org.bouncycastle.jcajce.provider.asymmetric.EC;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.Point;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Reusable_Functions.Generic_function;
//import groovyjarjarantlr4.v4.runtime.atn.SemanticContext.OR;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import net.serenitybdd.screenplay.waits.Wait;


public class S01_SuperAdmin_CRUD_positive_scenario extends Generic_function {

	static int s;
	static String str, orgname;
	static boolean value;
	static String lobname;
	/* TC_01 Validate the welcome page */

	@Given("launches url")
	public void launches_url() throws IOException {
		try {
			browser_launch();
			s = Dataiter();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("MPH url launch");
		}
		//browser_wait(150000);
	}

	//@SuppressWarnings("deprecation")
	@When("verify MPH logo")
	public void verify_MPH_logo() throws IOException, InterruptedException {
		try {
			browser_wait(5000);
			Thread.sleep(2000);
			boolean logo = driver.findElement(By.xpath(OR_reader("landing_logo"))).isDisplayed();
			Assert.assertEquals(true,logo);
		}catch (Exception e){
			e.printStackTrace();
			takeScreenShot("MPH_logo");
		}

	}

	@Then("verify infotext below logo")
	public void verify_infotext_below_logo() throws IOException {
		try {
			str = driver.findElement(By.xpath(OR_reader("welcome_page_title"))).getText();
			Assert.assertEquals(str, td_reader("welcome_page_title"));
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("MPH_infotext");
		}
	}

	@Then("able to click on login button")
	public void able_to_click_on_button() throws IOException, InterruptedException {
		try {
			browser_wait(1000);
			click("landing_login");
			Thread.sleep(5000);
			browser_wait(12000);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("MPH_login");
		}
		//throw new io.cucumber.java.PendingException();
	}

	@Then("lands on login page")
	public void lands_on_login_page_button() throws IOException {
		try {

			str = driver.findElement(By.xpath(OR_reader("login_title"))).getText();
			Assert.assertEquals(str, td_reader("login_title"));
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("login_page");
		}
		//throw new io.cucumber.java.PendingException();
	}


	/* TC_02 Validate superadmin logins with valid credentials */
	@When("Superadmin enters valid email and password")
	public void Superadmin_enters_valid_email_and_password() throws InterruptedException, IOException {
		try {
			driver.findElement(By.xpath(OR_reader("login_email"))).sendKeys(td_reader("login_email", 0));
			Thread.sleep(2000);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("login_password", 0));
			Thread.sleep(2000);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		takeScreenShot("it admin logn data");
	}


	@When("hits login button and lands on superadmin page")
	public void hits_login_button_and_lands_on_superadmin_page() throws IOException {
		try {
			click("login");
			Thread.sleep(3000);
			browser_wait(1000);

		} catch (Exception e) {
			e.printStackTrace();
			str = driver.findElement(By.xpath(OR_reader("org_title"))).getText();
			Assert.assertEquals(str, td_reader("org_title"));
			takeScreenShot("login_positive_login");
		}


	}

	/* TC_03 Validate Superadmin able to create organization */


	@When("Superadmin clicks on create org button")
	public void superadmin_clicks_on_create_org_button() throws IOException {
		try {

			str = driver.findElement(By.xpath(OR_reader("org_title"))).getText();
			Assert.assertEquals(str, td_reader("org_title"));

			click("setup_org");
			browser_wait(7000);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("create_org");
		}
	}

	@Then("popup should appear for creating org")
	public void popup_should_appear_for_creating_org() throws IOException {
		try {

			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver, 100);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("org_create_popup"))));
			String edittext = element.getText();
			System.out.println(edittext);
			Assert.assertEquals(edittext, td_reader("org_create_popup"));
			//str= driver.findElement(By.xpath(OR_reader("org_create_popup"))).getText();
			//Assert.assertEquals(str,td_reader("org_create_popup"));
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("org_popup");
		}
	}


	@Then("enters org data")
	public void enters_org_data() throws IOException, InterruptedException {
		try {

			WebElement chooseFile = driver.findElement(By.xpath(OR_reader("logo_upload")));
			File file = new File("./Upload_images/healthh1.png");
			chooseFile.sendKeys(file.getAbsolutePath());

			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			orgname = "Organization" + randomInt;
			driver.findElement(By.xpath(OR_reader("org_name"))).sendKeys(orgname);
			Thread.sleep(1000);

			String randomNumbers = RandomStringUtils.randomNumeric(9);
			String db = randomNumbers;
			driver.findElement(By.xpath(OR_reader( "org_db"))).sendKeys(db);
			Thread.sleep(1000);


			String randomNumberss = RandomStringUtils.randomNumeric(9);
			String ein = randomNumberss;
			driver.findElement(By.xpath(OR_reader("org_ein"))).sendKeys(ein);
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

	@Then("clicks on add another address")
	public void clicks_on_add_another_address() throws IOException, InterruptedException {
		try {

			Thread.sleep(1000);
			WebElement addbutton = driver.findElement(By.xpath(OR_reader("org_add_ano_add_button")));
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(addbutton));
			addbutton.click();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("add_ano_adds");
		}

	}

	@Then("enters address data")
	public void enters_address_data() throws IOException, InterruptedException {
		try {

			String add_busno = RandomStringUtils.randomNumeric(9);
			String busno = 2 + add_busno;
			driver.findElement(By.xpath(OR_reader("org_add_ano_add_busno"))).sendKeys(busno);
			Thread.sleep(1000);
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			driver.findElement(By.xpath(OR_reader("org_add_add_email"))).sendKeys("autotest" + randomInt + "@gmail.com");
			Thread.sleep(1000);

			String randomNumbers4 = RandomStringUtils.randomNumeric(9);
			String faxno = 2 + randomNumbers4;
			driver.findElement(By.xpath(OR_reader("org_add_add_faxno"))).sendKeys(faxno);
			Thread.sleep(1000);


			WebElement selectMyElement1 = driver.findElement(By.xpath(OR_reader("org_add_add_type")));
			selectMyElement1.click();
			Thread.sleep(1000);
			WebElement selectMyItem1 = driver.findElement(By.xpath(OR_reader("org_add_add_type_item")));
			selectMyItem1.click();
			Thread.sleep(1000);

			Random randomGenerator1 = new Random();
			int apt = randomGenerator1.nextInt(1000);
			driver.findElement(By.xpath(OR_reader("org_add_add_apt"))).sendKeys("Block" + apt);
			Thread.sleep(1000);

			String street = RandomStringUtils.randomAlphabetic(8);
			driver.findElement(By.xpath(OR_reader("org_add_add_streetadd"))).sendKeys("Street 2 " + street);
			Thread.sleep(1000);

			String city = RandomStringUtils.randomAlphabetic(8);
			driver.findElement(By.xpath(OR_reader("org_add_add_cityadd"))).sendKeys("City 2 " + city);
			Thread.sleep(1000);
			WebElement selectMyElement2 = driver.findElement(By.xpath(OR_reader("org_add_add_state")));
			selectMyElement2.click();
			Thread.sleep(1000);
			WebElement selectMyItem2 = driver.findElement(By.xpath(OR_reader("org_add_add_stateitem")));
			selectMyItem2.click();
			Thread.sleep(1000);

			String zip = RandomStringUtils.randomNumeric(5);
			driver.findElement(By.xpath(OR_reader("org_add_add_zip"))).sendKeys(zip);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("adds_data");
		}

	}


	@Then("clicks on save button")
	public void clicks_on_save_button() throws IOException, InterruptedException {
		try {
			Thread.sleep(1000);
			WebElement savebutton = driver.findElement(By.xpath(OR_reader("org_save")));
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(savebutton));
			savebutton.click();

		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("org_save");
		}

	}


	@Then("navigates to the org page")
	public void navigates_to_the_org_page() throws IOException {
		try {
			str = driver.findElement(By.xpath(OR_reader("superadmin_welcome_page_title"))).getText();
			Assert.assertEquals(str, td_reader("superadmin_welcome_page_title"));
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("org_page");
		}

		//browser_refresh();
	}

	/* TC_04 Validate superadmin able to edit org data */
	@When("Superadmin clicks on org edit icon")
	public void Superadmin_clicks_on_org_edit_icon() throws InterruptedException, IOException {
		try {
			browser_wait(5000);
			Thread.sleep(2000);
			click("org_edit_icon");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("org_edit");
		}

	}

	@SuppressWarnings("deprecation")
	@Then("popup should appear for editing org")
	public void popup_should_appear_for_editing_org() throws IOException, InterruptedException {
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

	@Then("updates data")
	public void updates_data() throws InterruptedException, IOException {
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
			String randomNumbers1 = RandomStringUtils.randomNumeric(9);
			String edit_ein = randomNumbers1;
			driver.findElement(By.xpath(OR_reader("org_edit_org_ein"))).sendKeys(edit_ein);
			Thread.sleep(1000);
			WebElement selectMyElement = driver.findElement(By.xpath(OR_reader("org_edit_org_type")));
			selectMyElement.click();
			Thread.sleep(1000);
			WebElement selectMyItem = driver.findElement(By.xpath(OR_reader("org_edit_org_type_item")));
			selectMyItem.click();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("org_edit_data");
		}
	}

	@When("clicks on edits save button")
	public void clicks_on_edits_save_button() throws IOException, InterruptedException {
		try {
			Thread.sleep(1000);

			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver, 100);

			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
			element.click();
			browser_wait(1000);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("org_edit_save");
		}
	}

	@Then("should be edited successfully")
	public void should_be_edited_successfully() throws IOException {
		try {
			str = driver.findElement(By.xpath(OR_reader("org_edit_success"))).getText();
			Assert.assertEquals(str, td_reader("org_edit_success"));
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("org_edit_success");
		}
	}





	/* TC_05 Validate superadmin able to add address */

	@When("Superadmin clicks on add address icon")
	public void Superadmin_clicks_on_add_address_icon() throws InterruptedException, IOException {
		try {
			browser_wait(8000);
			browser_refresh();
			//click("org_add_address_icon");
			//Thread.sleep(2000);
			//js_click("org_add_address_icon");
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver, 100);

			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("org_add_address_icon"))));
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("add_adds_icon");
		}
	}

	@Then("popup should appear for adding address")
	public void popup_should_appear_for_adding_address() throws IOException {
		try {
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver, 100);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("org_add_address_popup"))));
			String edittext = element.getText();
			System.out.println(edittext);
			Assert.assertEquals(edittext, td_reader("org_add_address_popup"));
			//str= driver.findElement(By.xpath(OR_reader("org_add_address_popup"))).getText();
			//Assert.assertEquals(str,td_reader("org_add_address_popup"));
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("add_adds_popup");
		}
	}


	@Then("add address data")
	public void add_address_data() throws InterruptedException, IOException {
		try {
			browser_wait(2000);
			Thread.sleep(2000);
			String randomNumbers2 = RandomStringUtils.randomNumeric(9);
			String busno = 2 + randomNumbers2;
			driver.findElement(By.xpath(OR_reader("org_add_address_busno"))).sendKeys(busno);
			Thread.sleep(1000);
			Random randomGenerator3 = new Random();
			int randomInt3 = randomGenerator3.nextInt(1000);
			driver.findElement(By.xpath(OR_reader("org_add_address_email"))).sendKeys("test" + randomInt3 + "@gmail.com");
			Thread.sleep(1000);
			String randomNumbers4 = RandomStringUtils.randomNumeric(9);
			String faxno = 2 + randomNumbers4;
			driver.findElement(By.xpath(OR_reader("org_add_address_faxno"))).sendKeys(faxno);
			Thread.sleep(1000);

			WebElement selectMyElement = driver.findElement(By.xpath(OR_reader("org_add_address_type")));
			selectMyElement.click();
			Thread.sleep(1000);
			WebElement selectMyItem = driver.findElement(By.xpath(OR_reader("org_add_address_type_item")));
			selectMyItem.click();
			Thread.sleep(1000);
			Random randomGenerator1 = new Random();
			int apt = randomGenerator1.nextInt(1000);
			driver.findElement(By.xpath(OR_reader("org_add_address_apt"))).sendKeys("Block" + apt);
			Thread.sleep(1000);
			String street = RandomStringUtils.randomAlphabetic(8);
			driver.findElement(By.xpath(OR_reader("org_add_address_street"))).sendKeys("Street 3 " + street);
			Thread.sleep(1000);
			String city = RandomStringUtils.randomAlphabetic(8);
			driver.findElement(By.xpath(OR_reader("org_add_address_city"))).sendKeys("City 3 " + city);
			Thread.sleep(1000);

			WebElement selectMyElement1 = driver.findElement(By.xpath(OR_reader("org_add_address_state_type")));
			selectMyElement1.click();
			Thread.sleep(1000);
			WebElement selectMyItem1 = driver.findElement(By.xpath(OR_reader("org_add_address_state_item")));
			selectMyItem1.click();
			Thread.sleep(1000);
			String zip = RandomStringUtils.randomNumeric(5);
			driver.findElement(By.xpath(OR_reader("org_add_address_zip"))).sendKeys(zip);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("add_adds_data");
		}

	}

	@Then("clicks on address save button")
	public void clicks_on_address_save_button() throws InterruptedException, IOException {
		try {

			Thread.sleep(1000);
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver, 100);

			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("org_save"))));
			element.click();
			//click("org_add_address_icon");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("add_adds_save");
		}

	}

	@Then("adds the address successfully")
	public void adds_the_address_successfully() throws IOException {
		try {

			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver, 100);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("org_add_success"))));
			String edittext = element.getText();
			System.out.println(edittext);
			Assert.assertEquals(edittext, td_reader("org_add_success"));
			//str= driver.findElement(By.xpath(OR_reader("org_add_success"))).getText();
			//Assert.assertEquals(str,td_reader("org_add_success"));
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("add_adds_success");
		}
	}

	/* TC_06 Validate superadmin able to update org address */

	@When("superadmin clicks on edit icon to update org address")
	public void superadmin_clicks_on_edit_icon_to_update_org_address() throws IOException, InterruptedException {
		try {

			click("org_address_edit_icon");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("org_address_edit");
		}

	}

	@Then("popup should appear to edit address data")
	public void popup_should_appear_to_edit_address_data() throws IOException {
		try {
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver, 100);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("org_edit_address_popup"))));
			String edittext = element.getText();
			System.out.println(edittext);
			Assert.assertEquals(edittext, td_reader("org_edit_address_popup"));
			//str= driver.findElement(By.xpath(OR_reader("org_edit_address_popup"))).getText();
			//Assert.assertEquals(str,td_reader("org_edit_address_popup"));
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("org_edit_adds_popup");
		}
	}

	@Then("updates org address")
	public void updates_org_address() throws InterruptedException, IOException {
		try {
			Thread.sleep(1000);
			backspace("org_add_address_busno");
			Thread.sleep(1000);
			String randomNumbers2 = RandomStringUtils.randomNumeric(9);
			String busno = 2 + randomNumbers2;
			driver.findElement(By.xpath(OR_reader("org_add_address_busno"))).sendKeys(busno);
			//driver.findElement(By.xpath(OR_reader( "org_edit_org_db"))).sendKeys(td_reader("org_edit_org_db",0));
			Thread.sleep(2000);
			backspace("org_add_address_email");
			Random randomGenerator3 = new Random();
			int randomInt3 = randomGenerator3.nextInt(1000);
			driver.findElement(By.xpath(OR_reader("org_add_address_email"))).sendKeys("test" + randomInt3 + "@gmail.com");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("update_org_data");
		}
	}

	@Then("clicks on edit org address save button")
	public void clicks_on_edit_org_address_save_button() throws InterruptedException, IOException {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy");
			Thread.sleep(2000);
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver, 100);

			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("org_save"))));
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("edit_org_savebutton");
		}
	}

	@Then("updation should be successful")
	public void updation_should_be_successful() throws IOException {
		try {
			//str= driver.findElement(By.xpath(OR_reader("org_add_edit_success"))).getText();
			//Assert.assertEquals(str,td_reader("org_add_edit_success"));

			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver, 100);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("org_add_edit_success"))));
			String edittext = element.getText();
			System.out.println(edittext);
			Assert.assertEquals(edittext, td_reader("org_add_edit_success"));
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("adds_update");
		}
	}
	/* TC_07 Validate superadmin able to add affiliate */

	@When("superadmin clicks on add affiliate button")
	public void superadmin_clicks_on_add_affiliate_button() throws IOException, InterruptedException {
		try {
			browser_wait(8000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy");
			Thread.sleep(2000);
			js_click("aff_add_button");

		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("add_aff");
		}
	}

	@Then("popup should appear to add affiliate")
	public void popup_should_appear_to_add_affiliate() throws IOException {
		try {
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver, 100);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("aff_create_popup"))));
			String edittext = element.getText();
			System.out.println(edittext);
			Assert.assertEquals(edittext, td_reader("aff_create_popup"));

		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("add_aff_popup");
		}
	}

	@Then("adds affiliate data")
	public void adds_affiliate_data() throws IOException, InterruptedException {
		try {

			WebElement chooseFile = driver.findElement(By.xpath(OR_reader("logo_upload")));
			File file = new File("./Upload_images/healthh1.png");
			chooseFile.sendKeys(file.getAbsolutePath());

			Random randomGenerator1 = new Random();
			int aff = randomGenerator1.nextInt(1000);
			driver.findElement(By.xpath(OR_reader("aff_name"))).sendKeys("Aff" + aff);
			Thread.sleep(2000);
			String db = RandomStringUtils.randomNumeric(9);
			driver.findElement(By.xpath(OR_reader("aff_db"))).sendKeys(db);
			Thread.sleep(2000);
			String ein = RandomStringUtils.randomNumeric(9);
			driver.findElement(By.xpath(OR_reader("aff_ein"))).sendKeys(ein);
			Thread.sleep(2000);
			WebElement selectMyElement = driver.findElement(By.xpath("//*[@id=\"addresses[0].type-select\"]"));
			selectMyElement.click();
			Thread.sleep(2000);
			WebElement selectMyItem = driver.findElement(By.xpath(OR_reader("aff_add_item")));
			selectMyItem.click();
			Thread.sleep(2000);

			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver, 100);

			String randomNumbers2 = RandomStringUtils.randomNumeric(9);
			String busno = 2 + randomNumbers2;
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("aff_busno"))));
			element.sendKeys(busno);

			Thread.sleep(2000);
			Random randomGenerator3 = new Random();
			int randomInt3 = randomGenerator3.nextInt(1000);
			//driver.findElement(By.xpath(OR_reader( "org_add_address_email"))).sendKeys("testaff"+ randomInt3 +"@gmail.com");
			driver.findElement(By.xpath(OR_reader("aff_email"))).sendKeys("test" + randomInt3 + "@gmail.com");
			Thread.sleep(2000);
			String randomNumbers4 = RandomStringUtils.randomNumeric(9);
			String faxno = 2 + randomNumbers4;
			driver.findElement(By.xpath(OR_reader("aff_faxno"))).sendKeys(faxno);

			//scroll popup page
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy");

			Random randomGenerator5 = new Random();
			int apt = randomGenerator5.nextInt(1000);
			driver.findElement(By.xpath(OR_reader("aff_apt"))).sendKeys("Block" + apt);
			Thread.sleep(2000);
			//String add_adds = RandomStringUtils.randomAlphabetic(8);
			//driver.findElement(By.xpath(OR_reader("aff_address_name"))).sendKeys(add_adds);
			////Thread.sleep(2000);
			//Random randomGenerator5 = new Random();
			//int apt = randomGenerator5.nextInt(1000);
			//driver.findElement(By.xpath(OR_reader("aff_apt"))).sendKeys("Block" + apt);
			//Thread.sleep(2000);
			String street = RandomStringUtils.randomAlphabetic(8);
			driver.findElement(By.xpath(OR_reader("aff_street_address"))).sendKeys(street);
			Thread.sleep(2000);
			String city = RandomStringUtils.randomAlphabetic(8);
			driver.findElement(By.xpath(OR_reader("aff_city_address"))).sendKeys(city);

			Thread.sleep(2000);

			//scroll popup page
			//JavascriptExecutor js1 = (JavascriptExecutor) driver;
			//js1.executeScript("window.scrollBy");
			WebElement selectMyElement3 = driver.findElement(By.xpath(OR_reader("aff_state_type")));
			selectMyElement3.click();
			Thread.sleep(2000);
			JavascriptExecutor jss = (JavascriptExecutor) driver;
			jss.executeScript("window.scrollBy");
			WebElement selectMyItem3 = driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[5]"));
			selectMyItem3.click();
			Thread.sleep(2000);
			String zip = RandomStringUtils.randomNumeric(5);
			driver.findElement(By.xpath(OR_reader("aff_zip"))).sendKeys(zip);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("add_aff_data");
		}
	}


	@Then("clicks on affiliate save button")
	public void clicks_on_affiliate_save_button() throws InterruptedException, IOException {
		try {

			click("org_save");
			browser_wait(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("aff_save");
		}

	}


	/* TC_08 Validate superadmin able to edit affiliate  */

	@When("Superadmin clicks on edit affiliate icon")
	public void Superadmin_clicks_on_edit_affiliate_icon() throws InterruptedException, IOException {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy");
			Thread.sleep(2000);
			browser_wait(2000);

			WebElement edit = driver.findElement(By.xpath(OR_reader("a")));
			edit.click();


		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("aff_edit");
		}
	}
	@Then("popup should appear to edit affiliate")
	public void popup_should_appear_to_edit_affiliate() throws IOException {
		try {
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver,100);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("aff_edit_popup"))));
			String edittext = element.getText();
			System.out.println(edittext);
			Assert.assertEquals(edittext,td_reader("aff_edit_popup"));
			//str= driver.findElement(By.xpath(OR_reader("aff_edit_popup"))).getText();
			//Assert.assertEquals(str,td_reader("aff_edit_popup"));
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("edit_aff_popoup");
		}}
	@Then("Updates affiliate data")
	public void Updates_affiliate_data() throws InterruptedException, IOException {
		WebElement chooseFile = driver.findElement(By.xpath(OR_reader("logo_upload")));
		File file = new File("./Upload_images/healthh2.jpg");
		chooseFile.sendKeys(file.getAbsolutePath());
		Thread.sleep(1000);
		backspace("aff_name");
		Thread.sleep(1000);
		Random randomGenerator1 = new Random();
		int aff = randomGenerator1.nextInt(1000);
		driver.findElement(By.xpath(OR_reader( "aff_edit_name"))).sendKeys("Aff"+ aff);
		//driver.findElement(By.xpath(OR_reader( "org_edit_org_db"))).sendKeys(td_reader("org_edit_org_db",0));
		Thread.sleep(2000);
		backspace("aff_email");
		Random randomGenerator3 = new Random();
		int randomInt3 = randomGenerator3.nextInt(1000);
		driver.findElement(By.xpath(OR_reader( "aff_email"))).sendKeys("test"+ randomInt3 +"@gmail.com");
		scrolldown();
		Thread.sleep(1000);

	}

	@Then("Click save changes for updation")
	public void Click_save_changes_for_updation() throws InterruptedException, IOException {
		try {

			Thread.sleep(2000);

			scrolldown();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy");
			click("aff_edit_save");
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("edit_aff_save");
		}

	}

	@Then("affiliate edit should be successfull")
	public void affiliate_edit_should_be_successfull() throws IOException {
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver,100);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("aff_edit_success"))));
		String edittext = element.getText();
		System.out.println(edittext);
		Assert.assertEquals(edittext,td_reader("aff_edit_success"));
	}
	//	Validate that SuperAdmin able to add lob

	@When("Super Admin clicks on LOB tab")
	public void Super_Admin_clicks_on_LOB_tab() throws IOException, InterruptedException {
		try {
			Thread.sleep(1000);
			click("lob_tab");
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("lob_tab");
		}
	}

	@Then("SuperAdmin lands on LOB page")
	public void SuperAdmin_lands_on_LOB_page() throws IOException, InterruptedException {
		try {
			//Thread.sleep(1000);
			browser_wait(2000);
			str= driver.findElement(By.xpath(OR_reader("lob_title_it"))).getText();
			Assert.assertEquals(str,td_reader("lob_title_it"));
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("lobpage");
		}

	}


	@When("Super Admin clicks on Add lob")
	public void Super_Admin_clicks_on_Add_lob() throws IOException, InterruptedException {
		try {
			//Thread.sleep(1000);
			browser_wait(2000);
			Thread.sleep(1000);
			click("lob_add_button_it");
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("add_lob");
		}

	}

	@Then("SuperAdmin lands on Add lob page")
	public void SuperAdmin_lands_on_Add_lob_page() throws IOException {
		try {
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver,100);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("Add_lob_title"))));
			String edittext = element.getText();
			System.out.println(edittext);
			Assert.assertEquals(edittext,td_reader("Add_lob_title"));
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("lob_page");
		}
	}

	@When("Super Admin enters lob data")
	public void Super_Admin_enters_lob_data() throws IOException, InterruptedException {
		try {
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(1000);
			lobname = "Autolob"+randomInt;
			System.out.println(lobname);




			driver.findElement(By.xpath(OR_reader( "lob_name"))).sendKeys(lobname);
			Thread.sleep(2000);

			Random randomGenerator1 = new Random();
			int randomInt1 = randomGenerator1.nextInt(1000);
			String lobplan = "lobplan"+randomInt1;
			System.out.println(lobplan);
			driver.findElement(By.xpath(OR_reader( "lob_planid"))).sendKeys(lobplan);
			Thread.sleep(2000);


			//JavascriptExecutor js3 = (JavascriptExecutor) driver;
			//js3.executeScript("window.scrollBy");
			WebElement selectMyItem1 = driver.findElement(By.xpath(OR_reader("lob_plan_type")));
			selectMyItem1.click();
			Thread.sleep(2000);
			WebElement selectMyElement1 = driver.findElement(By.xpath(OR_reader("lob_plan_item")));
			selectMyElement1.click();
			browser_wait(3000);



			WebElement  addbutton = driver.findElement(By.xpath(OR_reader("lob_affiliate_it")));
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(addbutton));
			addbutton.click();

//		WebElement selectMyItem = driver.findElement(By.xpath("superadmin_user_roles_item_it"));
//		selectMyItem.click();

			//addbutton.KeyDown(Keys.click);

			WebElement ele = driver.findElement(By.xpath(OR_reader("lob_affiliate_it")));
			// Actions class
			Actions a = new Actions(driver);
			// moveToElement() and then click()
			a.moveToElement(ele).click();
			ele.sendKeys(Keys.DOWN, Keys.RETURN);

			browser_wait(3000);
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("lob_data");
		}

	}

	@When("Clicks on save lob button by Super Admin")
	public void Clicks_on_save_lob_button_by_Super_Admin() throws IOException, InterruptedException {
		try {
			//Thread.sleep(1000);
			Thread.sleep(2000);
			click("lob_save_it");
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("lob_save");
		}

	}

	@Then("lob should be saved successfully")
	public void lob_should_be_saved_successfully() throws IOException {
		try {
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver,100);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("Add_lob_success"))));
			String edittext = element.getText();
			System.out.println(edittext);
			Assert.assertEquals(edittext,td_reader("Add_lob_success"));
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("lob_data_save");
		}
	}
// Validate that SuperAdmin able to edit lob



	@When("Super Admin clicks on an lob")
	public void Super_Admin_clicks_on_an_lob() throws IOException, InterruptedException {
		try {
			browser_wait(3000);
			//Thread.sleep(1000);
			//click("LOBName");
			//WebElement ele = driver.findElement(By.xpath(OR_reader("LOBName")));
			//ele.sendKeys(Keys.ENTER);
			System.out.println(lobname);

			driver.findElement(By.xpath(OR_reader("lob_it_search"))).sendKeys(lobname);
			//browser_wait(3000);
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver, 4000);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OR_reader("lob_search_item"))));
			//WebElement selectMyItem = driver.findElement(By.xpath(OR_reader("lob_search_item")));
			element.click();
			browser_wait(3000);
			System.out.println(lobname);
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("created_lob");
		}

	}
	@Then("Super admin should be in that LOB page")
	public void Super_admin_should_be_in_that_LOB_page() throws IOException {
		try {
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver,100);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("LOB_details_title"))));
			String edittext = element.getText();
			System.out.println(edittext);
			Assert.assertEquals(edittext,td_reader("LOB_details_title"));
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("lob_pagee");
		}
	}


	@When("Super Admin hits lob edit icon")
	public void Super_Admin_hits_lob_edit_icon() throws IOException, InterruptedException {
		try {
			Thread.sleep(1000);
			browser_wait(3000);
			click("edit_lob_it");
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("lob_edit_icon");
		}

	}

	@Then("Super Admin should be in edit lob page successfully")
	public void Super_Admin_should_be_in_edit_lob_page_successfully() throws IOException {
		try {
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver,100);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("Edit_LOB_title"))));
			String edittext = element.getText();
			System.out.println(edittext);
			Assert.assertEquals(edittext,td_reader("Edit_LOB_title"));
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("lob_edit_page");
		}
	}

	@Then("Super Admin edits lob data")
	public void Super_Admin_edits_lob_data() throws IOException, InterruptedException {
		try {
			Thread.sleep(2000);
			backspace("lob_planid");
			Thread.sleep(2000);
			Random randomGenerator1 = new Random();
			int randomInt1 = randomGenerator1.nextInt(1000);
			String lobplan = "lobplan"+randomInt1;
			System.out.println(lobplan);
			driver.findElement(By.xpath(OR_reader( "lob_planid"))).sendKeys(lobplan);
			Thread.sleep(2000);
//		driver.findElement(By.xpath(OR_reader( "lob_planid"))).sendKeys(td_reader("lob_planid_edit"));
//		Thread.sleep(2000);
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("lob_edit_data");
		}

	}

	@Then("Once clicks save changes by Super Admin")
	public void Once_clicks_save_changes_by_Super_Admin() throws IOException, InterruptedException {
		try {
			Thread.sleep(2000);
			WebElement  addbutton = driver.findElement(By.xpath(OR_reader("lob_edit_save_it")));
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.elementToBeClickable(addbutton));
			addbutton.click();
			//click("lob_edit_save_it");
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("lob_edit_save");
		}

	}

	@Then("lob changes should be saved successfully")
	public void lob_changes_should_be_saved_successfully() throws IOException {
		try {
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver,100);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("Edit_LOB_success"))));
			String edittext = element.getText();
			System.out.println(edittext);
			Assert.assertEquals(edittext,td_reader("Edit_LOB_success"));
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("lob_edit_save");
		}
	}


// Validate that SuperAdmin able to add configurations manual
@When("Super Admin enters to an lob")
public void Super_Admin_enters_to_an_lob() throws IOException, InterruptedException {
	Thread.sleep(2000);
	System.out.println(lobname);
	driver.findElement(By.xpath(OR_reader("lob_it_search"))).sendKeys(Keys.chord(Keys.CONTROL,"a"));
	driver.findElement(By.xpath(OR_reader("lob_it_search"))).sendKeys(Keys.BACK_SPACE);
	driver.findElement(By.xpath(OR_reader("lob_it_search"))).sendKeys(lobname);
	//browser_wait(3000);
	@SuppressWarnings("deprecation")
	WebDriverWait wait = new WebDriverWait(driver, 3000);
	element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OR_reader("lob_search_item"))));
	//WebElement selectMyItem = driver.findElement(By.xpath(OR_reader("lob_search_item")));
	element.click();

}

	@When("Clicks on manual add new config")
	public void Clicks_on_manual_add_new_config() throws IOException, InterruptedException {
		try {
			Thread.sleep(2000);
			browser_wait(4000);

			js_click("add_new_config_manual");
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("manual_data");
		}
	}
	@Then("popup should appear to add manual config")
	public void popup_should_appear_to_add_manual_config() throws IOException {
		try {
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver,100);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("manual_data_load_config"))));
			String edittext = element.getText();
			System.out.println(edittext);
			Assert.assertEquals(edittext,td_reader("manual_data_load_config"));
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("manual_data");
		}
	}

	@When("Enters frequency for manual")
	public void Enters_frequency_for_manual() throws IOException, InterruptedException {
		try {

			Thread.sleep(2000);
			WebElement freq = driver.findElement(By.xpath(OR_reader("freq_manual")));
			freq.sendKeys(Keys.DOWN, Keys.DOWN, Keys.RETURN);
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("manual_freq");
		}

	}
	@When("Batch start and end date and file type")
	public void Batch_start_and_end_date_and_file_type() throws IOException, InterruptedException {
		try {

			Thread.sleep(2000);
			//WebElement start = driver.findElement(By.xpath(OR_reader("batch_start_date_manual")));
			//browser_wait(2000);
			WebElement ele = driver.findElement(By.xpath(OR_reader("batch_start_date_manual")));
			Actions a = new Actions(driver);
			a.moveToElement(ele).click();
			ele.sendKeys(Keys.ENTER, Keys.RETURN);

			/* Batch time */


			browser_wait(2000);
			Thread.sleep(2000);
			WebElement time = driver.findElement(By.xpath(OR_reader("batch_time_manual")));
			Actions b = new Actions(driver);
			b.moveToElement(time).click();
			time.sendKeys(Keys.ENTER, Keys.RETURN);

			/* File Type */

			browser_wait(2000);
			Thread.sleep(2000);
			WebElement type = driver.findElement(By.xpath(OR_reader("file_type_manual")));
			Actions c = new Actions(driver);
			c.moveToElement(type).click();
			type.sendKeys(Keys.DOWN, Keys.RETURN);
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("manual_data");
		}
	}

	@When("Add sequence of ingesion for manual")
	public void Add_sequence_of_ingesion_for_manual() throws IOException, InterruptedException {
		try {

			Thread.sleep(2000);

			//for (int i=0;i<=3;i++) {
			click("add_resource_button");
			browser_wait(2000);
			//driver.findElement(By.xpath(OR_reader("add_resourse_manual")));
			WebElement selectMyItem1 = driver.findElement(By.xpath(OR_reader("add_resourse_manual")));
			selectMyItem1.click();
			Thread.sleep(1000);
			WebElement selectMyElement1 = driver.findElement(By.xpath(OR_reader("add_resourse_org")));
			selectMyElement1.click();
			//driver.findElement(By.xpath(OR_reader("add_resourse_org")));
			click("add_resource_button");
			WebElement selectMyItem2 = driver.findElement(By.xpath("//*[@id=\"resources[1].resource-select\"]"));
			selectMyItem2.click();
			Thread.sleep(1000);
			WebElement selectMyElement2 = driver.findElement(By.xpath(OR_reader("add_resourse_practitioner")));
			selectMyElement2.click();
			//driver.findElement(By.xpath(OR_reader("add_resourse_practitioner")));
			click("add_resource_button");
			//browser_wait(2000);
			//driver.findElement(By.xpath(OR_reader("add_resourse_manual")));
			WebElement selectMyItem3 = driver.findElement(By.xpath("//*[@id=\"resources[2].resource-select\"]"));
			selectMyItem3.click();
			Thread.sleep(1000);
			WebElement selectMyElement3 = driver.findElement(By.xpath(OR_reader("add_resourse_device")));
			selectMyElement3.click();
			//driver.findElement(By.xpath(OR_reader("add_resourse_device")));
			click("add_resource_button");
			//browser_wait(2000);
			//driver.findElement(By.xpath(OR_reader("add_resourse_manual")));
			WebElement selectMyItem4 = driver.findElement(By.xpath("//*[@id=\"resources[3].resource-select\"]"));
			selectMyItem4.click();
			Thread.sleep(1000);
			WebElement selectMyElement4 = driver.findElement(By.xpath(OR_reader("add_resourse_medication")));
			selectMyElement4.click();
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("manual_sequence");
		}


	}


	@When("Tries to delete any one of manual")
	public void Tries_to_delete_any_one_of_manual() throws IOException, InterruptedException {
		try {

			Thread.sleep(2000);
			click("resource_del_manual");
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("manual_del");
		}
	}

	@Then("Clicks on add button for saving")
	public void Clicks_on_add_button_for_saving() throws IOException, InterruptedException {
		try {

			Thread.sleep(2000);
			click("resource_add_button_manual");
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("manual_save");
		}
	}

	@Then("config should be added successfully")
	public void config_should_be_added_successfully() throws IOException {
		try {
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver,100);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("data_load_config_added"))));
			String edittext = element.getText();
			System.out.println(edittext);
			Assert.assertEquals(edittext,td_reader("data_load_config_added"));
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("manual_success");
		}
	}
	// Validate that Super Admin able to edit manual config

	@When("Clicks on edit config button")
	public void Clicks_on_edit_config_button() throws IOException, InterruptedException {
		try {
			Thread.sleep(2000);
			browser_wait(8000);
			click("edit_config_manual");
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("edit_config");
		}
	}

	@Then("popup page should appear to edit manual config")
	public void popup_page_should_appear_to_edit_manual_config() throws IOException {
		try {
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver,100);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("manual_data_load_config"))));
			String edittext = element.getText();
			System.out.println(edittext);
			Assert.assertEquals(edittext,td_reader("manual_data_load_config"));
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("edit_config_page");
		}
	}

	@When("Edit data needed")
	public void Edit_data_needed() throws IOException, InterruptedException {
		try {
			Thread.sleep(2000);
			WebElement freq = driver.findElement(By.xpath(OR_reader("freq_manual")));
			freq.sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.RETURN);
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("edit_config_data");
		}
	}


	@When("Clicks add button for updation")
	public void clicks_add_button_for_updation() throws IOException, InterruptedException {
		try {
			Thread.sleep(2000);
			click("resource_add_button_manual");
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("save_config_edit");
		}
	}

	@Then("edit data load configuration should be successfull")
	public void edit_data_load_configuration_should_be_successfull() throws IOException {
		try {
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver,100);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("data_load_config_edited"))));
			String edittext = element.getText();
			System.out.println(edittext);
			Assert.assertEquals(edittext,td_reader("data_load_config_edited"));
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("edit_config_success");
		}
	}

// Validate that Super Admin able to add file sensed data



	@When("Super Admin clicks on add new config on file sensed")
	public void Super_Admin_clicks_on_add_new_config_on_file_sensed() throws IOException, InterruptedException {
		try {
//		Thread.sleep(2000);
//		browser_wait(8000);
			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("window.scrollBy");
			js_click("file_sensed");
			Thread.sleep(2000);
			browser_wait(8000);


		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("file_sensed");
		}
	}

	@Then("popup should appear to add file config")
	public void popup_should_appear_to_add_file_config() throws IOException {
		try {
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver,100);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("file_data_load_config"))));
			String edittext = element.getText();
			System.out.println(edittext);
			Assert.assertEquals(edittext,td_reader("file_data_load_config"));
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("filesensed_popup");
		}
	}
	@When("Add resources on file sensed data")
	public void Add_resources_on_file_sensed_data() throws IOException, InterruptedException {
		try {
			Thread.sleep(1000);
			browser_wait(6000);
			js_click("add_resource_button");
			//click("add_resource_button");
			WebElement selectMyItem1 = driver.findElement(By.xpath(OR_reader("resource_type_file")));
			selectMyItem1.click();
			Thread.sleep(1000);
			WebElement selectMyElement1 = driver.findElement(By.xpath(OR_reader("resource_type_patient")));
			selectMyElement1.click();


			browser_wait(5000);
			Thread.sleep(1000);
			WebElement type = driver.findElement(By.xpath(OR_reader("file_type_file")));
			Actions c = new Actions(driver);
			c.moveToElement(type).click();
			type.sendKeys(Keys.DOWN, Keys.RETURN);

			browser_wait(5000);
			Thread.sleep(1000);
			WebElement time = driver.findElement(By.xpath(OR_reader("file_start_date")));
			Actions b = new Actions(driver);
			b.moveToElement(time).click();
			time.sendKeys(Keys.ENTER, Keys.RETURN);

			click("resource_add_button_manual");
			browser_wait(3000);
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("filesensed_data");
		}

	}

	@Then("file config should be added successfully")
	public void file_config_should_be_added_successfully() throws IOException {
		try {
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver,100);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("data_load_config_added"))));
			String edittext = element.getText();
			System.out.println(edittext);
			Assert.assertEquals(edittext,td_reader("data_load_config_added"));
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("file_sensed_save_data");
		}
	}

// Validate that Super Admin able to edit file sensed data
@When("Super Admin clicks on edit config on file sensed data")
public void Super_Admin_clicks_on_edit_config_on_file_sensed_data() throws IOException, InterruptedException {
	try {
		Thread.sleep(1000);
		browser_wait(15000);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy");

		js_click("resource_file_edit");
	}
	catch (Exception e){
		e.printStackTrace();
		takeScreenShot("filesensed_edit");
	}
}

	@Then("popup page should appear to edit file config")
	public void popup_page_should_appear_to_edit_file_config() throws IOException {
		try {
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver,100);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("file_data_load_config"))));
			String edittext = element.getText();
			System.out.println(edittext);
			Assert.assertEquals(edittext,td_reader("file_data_load_config"));
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("filesensed_popup");
		}
	}

	@When("Edit data on file sensed dataa")
	public void Edit_data_on_file_sensed_dataa() throws IOException, InterruptedException {
		try {
			Thread.sleep(1000);
			browser_wait(2000);
			//Thread.sleep(2000);
			WebElement type = driver.findElement(By.xpath(OR_reader("file_type_file")));
			Actions c = new Actions(driver);
			c.moveToElement(type).click();
			type.sendKeys(Keys.DOWN, Keys.DOWN, Keys.RETURN);
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("filesensed_edit_data");
		}
	}

	@When("Click add button for updation on file sensed data")
	public void Click_add_button_for_updation_on_file_sensed_data() throws IOException, InterruptedException {
		try {
			Thread.sleep(2000);
			click("resource_file_edit_add");
			browser_wait(10000);
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("filesensed_edit_button_save");
		}
	}

	@Then("edit file data load configuration should be successfull")
	public void edit_file_data_load_configuration_should_be_successfull() throws IOException {
		try {
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver,100);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("data_load_config_edited"))));
			String edittext = element.getText();
			System.out.println(edittext);
			Assert.assertEquals(edittext,td_reader("data_load_config_edited"));
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("filesensed_data_success");
		}
	}

// Validate that Super Admin able to add configurations time based


	@When("Super Admin clicks on add new config time based")
	public void Super_Admin_clicks_on_add_new_config_time_based() throws InterruptedException, IOException {
		try {
			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("window.scrollBy");
			Thread.sleep(2000);
			browser_wait(10000);

			js_click("time_based_it_add_config");
			Thread.sleep(2000);
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("timebased_button");
		}

	}

	@Then("popup should appear to add time config")
	public void popup_should_appear_to_add_time_config() throws IOException {
		try {
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver,100);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("time_load_config"))));
			String edittext = element.getText();
			System.out.println(edittext);
			Assert.assertEquals(edittext,td_reader("time_load_config"));
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("timebased_popup");
		}
	}

	@When("Clicks on add resources time based and add resources time based")
	public void clicks_on_add_resources_time_based_and_add_resources_time_based() throws IOException, InterruptedException {
		try {
			Thread.sleep(1000);
			click("add_resource_button");
			Thread.sleep(1000);

			WebElement selectMyItem1 = driver.findElement(By.xpath(OR_reader("time_based_it_resource_type")));
			selectMyItem1.click();
			Thread.sleep(1000);
			WebElement selectMyElement1 = driver.findElement(By.xpath(OR_reader("time_based_it_resource_item")));
			selectMyElement1.click();

			WebElement freq = driver.findElement(By.xpath(OR_reader("time_based_fre_it")));
			freq.sendKeys(Keys.DOWN, Keys.DOWN, Keys.RETURN);
			Thread.sleep(1000);
			//WebElement start = driver.findElement(By.xpath(OR_reader("batch_start_date_manual")));

			//browser_wait(4000);
			Thread.sleep(1000);
			WebElement type1 = driver.findElement(By.xpath(OR_reader("file_type_file")));
			Actions z = new Actions(driver);
			z.moveToElement(type1).click();
			type1.sendKeys(Keys.DOWN, Keys.RETURN);

			//browser_wait(2000);
			WebElement ele = driver.findElement(By.xpath(OR_reader("time_start_date_it")));
			Actions a = new Actions(driver);
			a.moveToElement(ele).click();
			ele.sendKeys(Keys.ENTER, Keys.RETURN);

			/* Batch time */


			//browser_wait(5000);
			Thread.sleep(1000);
			WebElement time = driver.findElement(By.xpath(OR_reader("time_start_time_it")));
			Actions b = new Actions(driver);
			b.moveToElement(time).click();
			time.sendKeys(Keys.ENTER, Keys.RETURN);
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("timebased_data");
		}
	}


	@When("Clicks on add for time based")
	public void clicks_on_add_for_time_based() throws InterruptedException, IOException {
		try {

			//Thread.sleep(1000);
			Thread.sleep(2000);
			browser_wait(10000);
			//JavascriptExecutor js3 = (JavascriptExecutor) driver;
			//js3.executeScript("window.scrollBy");
			//scrolldown();
			WebElement  addbutton = driver.findElement(By.xpath(OR_reader("time_add_it")));
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver, 100);
			wait.until(ExpectedConditions.elementToBeClickable(addbutton));
			addbutton.click();
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("timebased_add");
		}
	}

	@Then("time config should be added successfully")
	public void time_config_should_be_added_successfully() throws IOException {
		try {
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver,100);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("data_load_config_added"))));
			String edittext = element.getText();
			System.out.println(edittext);
			Assert.assertEquals(edittext,td_reader("data_load_config_added"));
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("timebased_save");
		}
	}
	/*  validate that IT admin able to edit time based */

	@When("Super Admin clicks on edit config of time based")
	public void Super_Admin_clicks_on_edit_config_of_time_based() throws InterruptedException, IOException {
		try {

			Thread.sleep(1000);
			browser_wait(16000);
			click("time_based_it_add_config");
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("timebased_editbutton");
		}
	}

	@Then("popup page should appear to edit time config")
	public void popup_page_should_appear_to_edit_time_config() throws IOException {
		try {
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver,100);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("time_load_config"))));
			String edittext = element.getText();
			System.out.println(edittext);
			Assert.assertEquals(edittext,td_reader("time_load_config"));
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("timebased_popup");
		}
	}

	@Then("Edit data on time based")
	public void Edit_data_on_time_based() throws InterruptedException, IOException {
		try {
			Thread.sleep(2000);
			WebElement selectMyItem1 = driver.findElement(By.xpath(OR_reader("time_based_it_resource_type")));
			selectMyItem1.click();
			Thread.sleep(1000);
			WebElement selectMyElement1 = driver.findElement(By.xpath(OR_reader("time_based_it_resource_item1")));
			selectMyElement1.click();

			WebElement freq = driver.findElement(By.xpath(OR_reader("time_based_fre_it")));
			freq.sendKeys(Keys.DOWN, Keys.RETURN);
			Thread.sleep(2000);
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("timebased_data");
		}
	}

	@When("Clicks on add for updation of time based")
	public void Clicks_on_add_for_updation_of_time_based() throws InterruptedException, IOException {
		try {

			Thread.sleep(2000);
			browser_wait(2000);
			//JavascriptExecutor js3 = (JavascriptExecutor) driver;
			//js3.executeScript("window.scrollBy");
			//scrolldown();
			WebElement  addbutton = driver.findElement(By.xpath(OR_reader("time_add_it")));
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver,100);
			wait.until(ExpectedConditions.elementToBeClickable(addbutton));
			addbutton.click();
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("timebased_updation");
		}

	}

	@Then("edit time data load configuration should be successfull")
	public void edit_time_data_load_configuration_should_be_successfull() throws IOException {
		try {
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver,100);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR_reader("data_load_config_edited"))));
			String edittext = element.getText();
			System.out.println(edittext);
			Assert.assertEquals(edittext,td_reader("data_load_config_edited"));
		}
		catch (Exception e){
			e.printStackTrace();
			takeScreenShot("edit_timebased");
		}
	}
	@When ("Super Admin clicks Organization button")
	public void Super_Admin_clicks_Organization_button() throws InterruptedException, IOException
	{
		try
		{
			Thread.sleep(2000);
			WebElement selectMyItem1 = driver.findElement(By.xpath(OR_reader("org_button")));
			selectMyItem1.click();
			Thread.sleep(1000);
			driver.close();
		}
		catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("clicks_orgg_button");
		}
		}
	}



