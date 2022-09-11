package paramAPI;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Formpara {

	@Test
	public  void formparameters() {
		String accessToken = given()
			.formParam("Client ID", "Punith M")
			.formParam("Client Secret", "2bc9f4d40ef36bbba00b934394ee8d11")
			.formParam("grant_type", "client_credentials")
		.when()
			.post("http://coop.apps.symfonycasts.com/token")
			.jsonPath().get("access_token");
		System.out.println(accessToken);
		
		given()
			.auth().oauth2(accessToken)
			.post("http://coop.apps.symfonycasts.com/api/3705/chickens-feed")
			.then().log().all();
	}
}
