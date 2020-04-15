package com.opleiding.dms2.diqualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("classa")
public class ClassA implements MyInterface {
	
	
	@Override
	public String getInfor() {
		return "ClassA";
	}

}
