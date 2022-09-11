package paramAPI;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class ParaAPI {
	@Test
	public  void apiparameters() {
		given()
			.auth().basic("qsidersseleniumar","selenium1-2")
			.pathParam("ownername", "users")
			.pathParam("querypara","page=2")
		.when()
			.get("https://reqres.in/api/{ownername}?{querypara}")
		.then()
			.log().all();
			
		
	}
}
