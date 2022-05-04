package tests;

import org.junit.Test;

import pages.Post;

public class ApiPostTest {
	Post post = new Post();

	@Test
	public void teste() {
		post.metodoPath("/api/users/2", 200);
		post.metodoPostCreate("/api/users", 201);
	}
}
