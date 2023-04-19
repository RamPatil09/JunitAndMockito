package com.xworkz.atm.AtmMachine;

public class UserDTO {

	private long id;
	private String name;
	private long accountNumber;
	private long atmPin;

	public UserDTO(long id, String name, long accountNumber, long atmPin) {
		super();
		this.id = id;
		this.name = name;
		this.accountNumber = accountNumber;
		this.atmPin = atmPin;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public long getAtmPin() {
		return atmPin;
	}

	public void setAtmPin(long atmPin) {
		this.atmPin = atmPin;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", name=" + name + ", accountNumber=" + accountNumber + ", atmPin=" + atmPin + "]";
	}

}
