package pages;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Get {

	public void testeGetList(String rota, int status) {
		given().when().get("https://reqres.in" + rota).
		then().statusCode(status).body("data.first_name[1]",
				equalTo("Lindsay"));
	}
	public void testeGetSingle(String rota, int status) {
		given().when().get("https://reqres.in" + rota).
		then().statusCode(status).body("data.first_name",
				equalTo("Janet"));
	}
}
