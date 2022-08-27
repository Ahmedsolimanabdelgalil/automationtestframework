package Api.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;



public class Assuredapitesting {
	@Test
	void test_01()
	{
		Response response = RestAssured.get("https://jsonplaceholder.typicode.com/posts/1");
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().asString());
		int statuscode = response.getStatusCode();
		Assert.assertEquals(statuscode, 200);
		String responsebody = response.getBody().asString();
		Assert.assertTrue(responsebody.contains("\"userId\": 1"));
	}

}
