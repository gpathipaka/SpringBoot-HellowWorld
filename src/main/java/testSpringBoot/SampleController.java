package testSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class SampleController {

	@RequestMapping("/")
	String home() {
		return "Gangadhar Pathipaka";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SampleController.class, args);
	}
}
