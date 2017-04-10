package ru.Javabegin.FastJava.Shop4interface.bank;

import ru.Javabegin.FastJava.Shop4interface.interfaces.BankInterface;

public class BaseBank implements BankInterface {

	private String name;
	private String creditDescription;

	public void checkInfo() {

	}

	public void giveCredit() { 
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreditDescription() {
		return creditDescription;
	}

	public void setCreditDescription(String creditDescription) {
		this.creditDescription = creditDescription;
	}

	
}
