package pages;

import static org.junit.Assert.assertEquals;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class get {
	Response response;
Respo
	public Response consultarApi(String rota) {
		response = RestAssured.get(rota);
		return response;
	}
	public void bodyApi(String texto) {
		String bodyResponse = response.asString();
		
		
		assertEquals(texto, bodyResponse);
	}
	public void statusCode(int status) {
		int statusCode = response.getStatusCode();
		assertEquals(status, statusCode);
	}
	
}
