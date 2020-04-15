package com.opleiding.dms2.disimple;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor // Project Lombok will generate a constructor for all properties declared final. And Spring will automatically use the Lombok provided constructor to autowire the clase.
@RestController
public class BestConstructorDIController {
	
	 private final DIService bpService;
	 
	 @GetMapping("di/echtconstructor")
	 public Map<String, String> getDMSTeamDetails() {
		 return bpService.getDMSTeamDetails();
	 }
	 

}
