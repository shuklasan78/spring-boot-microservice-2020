package com.opleiding.dms2.disimple;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SIServiceImpls implements DIService {
	
	 @Override
	 public Map<String, String> getDMSTeamDetails() {
	        Map<String, String> o1 = new HashMap<String, String>();
	        o1.put("Sandee", "40");
	        o1.put("Veena", "21");
	        o1.put("Jos", "50");
	        o1.put("Bert", "55");
	        o1.put("Dennis", "42");

	        return o1;
	    }

}
