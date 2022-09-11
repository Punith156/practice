package paramAPI;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Querypara {

	@Test
	public  void queryparameters() {
		given()
			.queryParam("q","page=3")
		.when()
			.get("https://reqres.in/api/users")
		.then()
			.log().all();
	}
}
