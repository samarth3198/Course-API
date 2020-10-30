package io.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //declared an annotation, so that spring framework can know that this class is a rest controller 
public class HelloController {
	
	@RequestMapping("/hello") //annotation for get request method
	public String sayHi() {
		return "Hi";
	}
}
