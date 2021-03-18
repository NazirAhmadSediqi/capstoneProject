package stepDefinitions;

import java.util.*;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.RetailPageObject;
import utilities.WebDriverUtility;

public class RetailPageLoginTestStepDefinition extends Base {
	
	RetailPageObject retail = new RetailPageObject();
	
	@When("^User click on‘Register for an Affiliate Account’link$")
	public void user_click_on_Register_for_an_Affiliate_Account_link() throws Throwable {
	   retail.registerForAffiliateAccount();
	}

	@When("^User fill affiliate form with below information$")
	public void user_fill_affiliate_form_with_below_information(DataTable dataInfo) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
List<Map<String, String>> dataValue = dataInfo.asMaps(String.class, String.class);
		
		retail.company(dataValue.get(0).get("company"));
		retail.website(dataValue.get(0).get("website"));
		retail.taxID(dataValue.get(0).get("taxID"));
		retail.chequePayeeName(dataValue.get(0).get("Cheque Payee Name"));
	}

	@When("^User check on About us check box$")
	public void user_check_on_About_us_check_box() throws Throwable {
	    retail.aboutUSbtn();
	}

	@When("^User click on Continue button affiliate$")
	public void user_click_on_Continue_button_affiliate() throws Throwable {
	   retail.continuebtnAffiliate1();
	}

	@Then("^User should see a success messages$")
	public void user_should_see_a_success_messages() throws Throwable {
	    WebDriverUtility.screenShot();
	}
//=========

	@When("^User click on‘Edit your affiliate informationlink$")
	public void user_click_on_Edit_your_affiliate_informationlink() throws Throwable {
		retail.editAffiliateInformation();
	}

	@When("^user click on Bank Transfer radio button$")
	public void user_click_on_Bank_Transfer_radio_button() throws Throwable {
		 retail.banktranfareRadioButton();
	}

	@When("^User fill Bank information with below information$")
	public void user_fill_Bank_information_with_below_information(DataTable tableList) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		List<Map<String, String>> dataValue = tableList.asMaps(String.class, String.class);
		
		retail.bankName(dataValue.get(0).get("bankName"));
		retail.abaNumber(dataValue.get(0).get("abaNumber"));
		retail.swiftCode(dataValue.get(0).get("swiftCode"));
		retail.accountName(dataValue.get(0).get("accountName"));
		retail.bankAccountNumberAffiliate(dataValue.get(0).get("accountNumber"));
				
	}
	
	@Then("^User should see a success message$")
	public void user_should_see_a_success_message() throws Throwable {
	   WebDriverUtility.screenShot();
	}
	
	@And("^User click on Continue AffiliateButton$")
	public void user_click_on_continue_affiliatebutton() {
		retail.continueButtonAffiliate();
	}

	@When("^User click on‘Edit your account information’ link$")
	public void user_click_on_Edit_your_account_information_link() throws Throwable {
		retail.editYourAccountInformation();
	}

	@When("^User modify below information$")
	public void user_modify_below_information(DataTable accountInfo) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<Map<String, String>> dataValue = accountInfo.asMaps(String.class, String.class);
		
		retail.firstName(dataValue.get(0).get("firstname"));
		retail.lastName(dataValue.get(0).get("lastname"));
		retail.email(dataValue.get(0).get("email"));
		retail.telephone(dataValue.get(0).get("telephone"));
	}

	@When("^User click on continue button$")
	public void user_click_on_continue_button() throws Throwable {
		
		retail.continueButtonEditAccount();
		
	}

	@Then("^User should seea message ‘Success: Your account has been successfully updated\\.’$")
	public void user_should_seea_message_Success_Your_account_has_been_successfully_updated() throws Throwable {
		
		WebDriverUtility.screenShot();
	}

}
