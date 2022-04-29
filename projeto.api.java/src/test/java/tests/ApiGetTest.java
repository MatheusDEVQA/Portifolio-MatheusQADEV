package tests;

import org.junit.Test;

import pages.Get;

public class ApiGetTest {
	Get get = new Get();

	@Test
	public void teste() {
		get.testeGetSingle("/api/users/2", 200);
		get.testeGetList("/api/users?page=2", 200);
	}
}
