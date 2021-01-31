package com.bookzy.website;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class WebsiteApplicationTests {

	@Test
	void contextLoads() {
		WebsiteApplication test = new  WebsiteApplication();
		String result = test.HomePage();
		Assert.hasText(result,"Bookzy");
	}

}
