package Tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class A_GET_Ok {
	@Test
	public void verify200() {
		given().when().get("https://viacep.com.br/ws/08253000/json/")// It wasn't used the baseURI on purpose to show a
																		// straightforward REST-assured example
				.then().assertThat().statusCode(200);
	}
}