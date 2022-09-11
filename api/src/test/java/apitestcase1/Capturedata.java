package apitestcase1;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Capturedata {
	@Test
	public  void capturedata() {
		Response resp=given()
		.get("https://reqres.in/api/users?page=2");
		
		int firstid=resp.jsonPath().get("data[1].id");
		
		System.out.println(firstid);

		given()
		.pathParam("fid", firstid)
		.get("https://reqres.in/api/users?page=2/{fid}")
		
		.then()
		.log().all()
		.assertThat().statusCode(200)
		.and()
		.assertThat().header("Server", containsString("cloudflare"));
		}
}