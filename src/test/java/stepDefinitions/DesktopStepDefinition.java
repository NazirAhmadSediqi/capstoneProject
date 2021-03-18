package stepDefinitions;

import java.util.List;
import java.util.Map;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.DesktopPageObject;
import utilities.WebDriverUtility;

public class DesktopStepDefinition extends Base {

	DesktopPageObject deskObject = new DesktopPageObject();

	@When("^User Click on Desktops tab$")
	public void user_Click_on_Desktops_tab() throws Throwable {
		deskObject.clickOnDesktoTab();
	}

	@When("^User click on Show all desktops$")
	public void user_click_on_Show_all_desktops() throws Throwable {
		deskObject.clickOnShowAllDesktops();
	}

	@Then("^User should see all items are present in Desktop page$")
	public void user_should_see_all_items_are_present_in_Desktop_page() throws Throwable {
		WebDriverUtility.screenShot();
	}

	@When("^User click ADD TO CART option on 'HP LP(\\d+)' item$")
	public void user_click_ADD_TO_CART_option_on_HP_LP_item(int arg1) throws Throwable {
		deskObject.clickOnAddToCartHPOption();
	}

	@When("^User select quantity (\\d+)$")
	public void user_select_quantity(int arg1) throws Throwable {
		deskObject.selectQuantityHP();
	}

	@When("^User click add to Cart button$")
	public void user_click_add_to_Cart_button() throws Throwable {
		deskObject.clickOnAddToCartHPButton();
	}

	@Then("^User should see a message 'Success: you have added HP LP (\\d+) to your Shopping cart!'$")
	public void user_should_see_a_message_Success_you_have_added_HP_LP_to_your_Shopping_cart(int arg1)
			throws Throwable {
		WebDriverUtility.screenShot();
	}

	@When("^User click ADD TO CART option on 'Canon EOS (\\d+)D' item$")
	public void user_click_ADD_TO_CART_option_on_Canon_EOS_D_item(int arg1) throws Throwable {
		deskObject.clickOnAddToCartCanonOption();
	}

	@When("^User select color from dropdown 'Red'$")
	public void user_select_color_from_dropdown_Red() throws Throwable {
		deskObject.selectRedFromDropDown();
	}

	@When("^User select quuantity (\\d+)$")
	public void user_select_quuantity(int arg1) throws Throwable {
		deskObject.selectQuantityCanon();
	}

	@When("^User click add too Cart button$")
	public void user_click_add_too_Cart_button() throws Throwable {
		deskObject.clickOnAddToCartCanonButton();
	}

	@Then("^User should see a message 'Succes: You have added Canon EOS (\\d+)d to your shopping cart'$")
	public void user_should_see_a_message_Succes_You_have_added_Canon_EOS_d_to_your_shopping_cart(int arg1)
			throws Throwable {
		WebDriverUtility.screenShot();
	}

	@When("^User click on Canon EOS (\\d+)D item$")
	public void user_click_on_Canon_EOS_D_item(int arg1) throws Throwable {
		deskObject.clickOnCanonEOS5D();
	}

	@When("^User click on write a review link$")
	public void user_click_on_write_a_review_link() throws Throwable {
		deskObject.writeAReview();
	}

	@When("^user fill the review information with below information$")
	public void user_fill_the_review_information_with_below_information(DataTable personalInfo) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<Map<String, String>> dataValues = personalInfo.asMaps(String.class, String.class);

		deskObject.yourName(dataValues.get(0).get("yourname"));
		deskObject.yourReview(dataValues.get(0).get("yourReview"));
		deskObject.rating();
		

	}

	@When("^User click on Continue Button$")
	public void user_click_on_Continue_Button() throws Throwable {
		
		deskObject.ClickOnContinueButton();

	}

	@Then("^User should see a message with 'Thank you for your review\\. It has been submitted to the webmaster for approval'$")
	public void user_should_see_a_message_with_Thank_you_for_your_review_It_has_been_submitted_to_the_webmaster_for_approval()
			throws Throwable {
		
		WebDriverUtility.screenShot();

	}

}
