package apitestcase1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Tc_01 {
	@Test
	public void getreq()
	{
		Response req=RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(req);
	
	}
}
