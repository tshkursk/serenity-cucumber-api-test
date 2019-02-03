package features.steps.serenity;

import static net.serenitybdd.rest.SerenityRest.*;
import java.net.URI;
import java.util.Map;
import java.util.Optional;

import io.restassured.specification.RequestSpecification;

public class ApiSteps
{
	private Optional<Object> body = Optional.empty();
	private Optional<Map<String, String>> headers = Optional.empty();

    public void issueHttpMethod(String method, URI uri)
    {
    	HttpMethod.valueOf(method).issueMethod(buildRequest(), uri);
    }

    public void verifyCode(int code)
    {
        then().statusCode(code);
    }

    private RequestSpecification buildRequest()
    {
    	RequestSpecification requestSpecification = given();
    	headers.ifPresent(h -> requestSpecification.headers(h));
    	body.ifPresent(b -> requestSpecification.body(body));
    	return requestSpecification;
    }

    public void setHeaders(Map<String, String> headers)
    {
    	this.headers = Optional.of(headers);
    }

    public void setRequestBody(Object body)
    {
    	this.body = Optional.of(body);
    }
}
