package features.steps.serenity;

import static net.serenitybdd.rest.SerenityRest.*;

import java.net.URI;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public enum HttpMethod
{
	GET
	{
		@Override
		public Response issueMethod(RequestSpecification specification, URI uri)
		{
			return specification.get(uri);
		}
	},
	POST
	{
		@Override
		public Response issueMethod(RequestSpecification specification, URI uri)
		{
			return specification.post(uri);
		}
	};

	public abstract Response issueMethod(RequestSpecification specification, URI uri);
}
