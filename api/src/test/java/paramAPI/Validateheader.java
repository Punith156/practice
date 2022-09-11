package paramAPI;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Validateheader {


	@Test
	public  void validatehead() {
		given()
			.get("https://reqres.in/api/users?page=2")
			
		.then()
			.log().all()
			.assertThat().statusCode(200)
			.and()
			.assertThat().header("Content-Type","application/json; charset=utf-8")
			.and()
			.assertThat().header("Server", "cloudflare")
			.and().body("data[0].id", equalTo(7))
			.and().body("data[0].email", equalTo("michael.lawson@reqres.in"))
			.and().body("data.id",  hasItems("7","9","10"));
			
}
}