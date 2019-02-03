package features.steps;

import java.net.URI;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import features.steps.serenity.ApiSteps;
import net.thucydides.core.annotations.Steps;

public class ApiStepDefinitions
{
	@Steps
	ApiSteps steps;

    @Given("^I set request headers:$")
    public void buyerWantsToBuy(DataTable headersTable)
    {
    	steps.setHeaders(headersTable.asMap(String.class, String.class));
    }

    @Given("^I set request body: '(.*)'")
    public void buyerWantsToBuy(String body)
    {
    	steps.setRequestBody(body);
    }

    @When("I issue HTTP '(.*)' to the URL '(.*)'")
    public void issueUrl(String method, String url)
    {
    	steps.issueHttpMethod(method, URI.create(url));
    }

    @Then("the response code is equal to '(.*)'")
    public void checkResponseCode(int code)
    {
    	steps.verifyCode(code);
    }
}
