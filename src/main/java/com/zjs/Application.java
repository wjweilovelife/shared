package com.zjs;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Application {
	
	@Autowired
	private GreetingService greetingService;
	
	@Value("${greeting}")
    String greeting;
	
	@RequestMapping("/")
	/* String home(){
		return String.format("%s World!", greeting);
	}*/
		String target(){
		return String.format("%s world", greetingService.getGreeting());
	}
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
	/*	SpringApplication app = new SpringApplication(Application.class);
		app.addListeners(new TestListener());
		app.run(args);*/
    }
}
