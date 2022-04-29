package pages;

import org.hamcrest.Matcher;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class post {
	@Test
public void metodoPost() {
		
	 RestAssured.given().log().all().contentType(ContentType.JSON)
			.body("{\r\n"
					+ "    \"name\": \"Matheus\",\r\n"
					+ "    \"job\": \"QA\"\r\n"
					+ "}").when().post("https://reqres.in/api/users").then().statusCode(201)
			.assertThat().body("name", "Matheus");
			
			//assertThat().body(containsString("Matheus"));
	 
	
	
	
	
	
}

	private Matcher<?> containsString(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
