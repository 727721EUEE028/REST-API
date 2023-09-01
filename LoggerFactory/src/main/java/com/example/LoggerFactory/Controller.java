package com.example.LoggerFactory;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class Controller {
	Logger logger = LoggerFactory.getLogger(Controller.class);
	@GetMapping("/test")
	public String hello()
	{
		logger.trace("A TRACE Message");
		logger.debug("A DEBUG Message");
		logger.info("A INFO Message");
		logger.warn("An WARN Message");
		logger.error("An ERROR Message");
		return "Hello ";
	}

}
