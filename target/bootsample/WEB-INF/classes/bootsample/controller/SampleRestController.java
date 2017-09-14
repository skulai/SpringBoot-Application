package bootsample.controller;

import org.springframework.web.bind.annotation.*;
@RestController
public class SampleRestController {
	
	@GetMapping("/")
	public String hello(){
		return "Hello World!!";
	}

}
