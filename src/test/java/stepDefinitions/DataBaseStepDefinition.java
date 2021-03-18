package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.DataBaseUtility;

public class DataBaseStepDefinition extends Base {
	
	
	@Given("^User Connects to PostgreSql DataBase$")
	public void user_Connects_to_PostgreSql_DataBase() throws Throwable {
		
		DataBaseUtility.setupConnection();
		logger.info("connection is established between jdbc and db");
	    
	}

	@When("^User send query '(.+)'$")
	public void user_send_query_select_from_public_actor(String query) throws Throwable {
	    DataBaseUtility.runQuery(query);
	    logger.info(query + ": has been executed");
	}

	@Then("^User should get all information from that table$")
	public void user_should_get_all_information_from_that_table() throws Throwable {
	   
		DataBaseUtility.returnResult();
		logger.info("resultset is stored in a csv file in outcome folder");
		DataBaseUtility.closeDBConnection();
		logger.info("database connection has been closed");
	}


}
