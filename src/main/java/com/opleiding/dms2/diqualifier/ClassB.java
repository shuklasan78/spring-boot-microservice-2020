package com.opleiding.dms2.diqualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("classb")
public class ClassB implements MyInterface {
	
	@Override
	public String getInfor() {
		
		return "ClassB";
		
	}

}
