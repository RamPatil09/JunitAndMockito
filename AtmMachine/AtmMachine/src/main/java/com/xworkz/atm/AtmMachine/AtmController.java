package com.xworkz.atm.AtmMachine;

import java.util.Scanner;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AtmController {
	private Scanner sc = new Scanner(System.in);
	private long balance = 200000;
	private int atmPin = 1346;

	@RequestMapping("userDetails")
	public void userlogin() {

		System.out.println("Welcome to the ATM");
		System.out.println("Select the Language");
		System.out.println("1 for English \n2 for ಕನ್ನಡ \n3 for हिंदी");
		int languageSelection = sc.nextInt();

		switch (languageSelection) {
		case 1: {

			english();
			break;
		}
		case 2: {
			kannada();
			break;
		}
		case 3: {
			hindi();
			break;
		}

		}
	}

	public void english() {
		System.out.println("Enter 4 digit ATM Pin");
		int pin = sc.nextInt();
		if (pin == atmPin) {
			System.out.println("Select the option");
			System.out.println("1 for Withdrawal \n2 for Balance Enquiry \n3 for Deposit");
			int option = sc.nextInt();
			switch (option) {
			case 1: {
				System.out.println("Enter Amount to be Withdrawal");
				long amountToBeWithdraw = sc.nextInt();
				if (balance >= amountToBeWithdraw) {
					if (amountToBeWithdraw % 100 == 0) {
						balance = balance - amountToBeWithdraw;
						System.out.println("Please collect your money");
					} else {
						System.out.println("Please enter a correct amount");
					}
				} else {
					System.out.println("Insufficient Balance");
				}
				break;
			}
			case 2: {
				System.out.println("Available Balance : " + balance);
				break;
			}
			case 3: {
				break;
			}

			}
		} else {
			System.out.println("Invalid ATM pin");
		}
	}

	public void kannada() {

	}

	public void hindi() {

	}
}
