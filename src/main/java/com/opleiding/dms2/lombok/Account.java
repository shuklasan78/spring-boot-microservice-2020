package com.opleiding.dms2.lombok;




import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class Account {
	
	private String userName;
	private String password;
	private Account acc;

	public  String getPropertyValue()
	{
		this.setUserName("Dennis");
		this.setPassword("password");
		return this.getUserName()+" : " +this.getPassword();
	}
	
	
	
}
