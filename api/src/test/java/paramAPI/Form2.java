package paramAPI;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Form2 {


	@Test
	public  void form2parameters() {
		given()
			.formParam("Client ID", "Punith M")
			.formParam("Client Secret", "2bc9f4d40ef36bbba00b934394ee8d11")
			.formParam("grant_type", "client_credentials")
			
		.when()
			.post("http://coop.apps.symfonycasts.com/token")
			
		.then()
			.log().all();
		

}
}