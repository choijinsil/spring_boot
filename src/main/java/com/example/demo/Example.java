package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*@RestController
@Controller
@Repository
@Service
@Component
stereotype 어노테이션이라고 한다.
- 마크업!
- 코드를 읽는 사람에게 힌트를 준다.
- Spring이 컨트롤러로 인지하게 하는게 가장 큰 목적이다.

@RestController
@RequestMapping
위 두개는 Spring MVC에서 온 어노테이션이다.
*/
@RestController
@EnableAutoConfiguration
public class Example {

	@RequestMapping("/")
	String home() {
		return "hello world!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Example.class, args);
	}

}
