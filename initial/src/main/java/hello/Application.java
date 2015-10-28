package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
	
	@RequestMapping("/")
	public String home() {
		return "Hey, it's working man!!! <a href='http://localhost:8080/'>Home</a>";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
