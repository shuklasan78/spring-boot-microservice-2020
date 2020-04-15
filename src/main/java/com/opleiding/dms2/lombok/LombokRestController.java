package com.opleiding.dms2.lombok;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class LombokRestController {
		
	
	@GetMapping("/lombokprop")
	public String getValue()
	{
		Account acc = new Account();
		log.info(acc.getPropertyValue());
		return acc.getPropertyValue();
	}

}
