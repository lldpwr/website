package com.bookzy.website;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class WebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsiteApplication.class, args);
	}

	@GetMapping("/")
	@ResponseBody
	public String HomePage() {
		return String.format("<!DOCTYPE html> <head> <title>Bookzy</title> </head> <body> <h1>Bookzy</h1> </body> </html>");
	}

}
