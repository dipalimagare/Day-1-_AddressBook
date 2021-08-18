package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
	Person p = new Person();
	static Person[] group = new Person[5];

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter Contact of Person" + (i + 1));
			group[i] = new Person();
			getInfo(group[i]);
		}
		System.out.println("Want to Edit? Enter 1 for Yes, 2 for No");
		Scanner sc = new Scanner(System.in);
		if (sc.nextInt() == 1) {
			searchPerson();
		}
	}

	public static void searchPerson() {
		System.out.println("\nEnter Fisrt Name: ");
		Scanner sc = new Scanner(System.in);
		String firstName = sc.next();
		int flag = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println(group[i].fName);
			if (firstName.equals(group[i].fName)) {
				System.out.println("\nEdit---->");
				getInfo(group[i]);
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("Couldn't Find it!");
		}
	}

	public static void getInfo(Person p1) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First name: ");
		String str = sc.next();
		p1.setfName(str);
		System.out.println("Enter Last name: ");
		str = sc.next();
		p1.setlName(str);
		System.out.println("Enter Address: ");
		p1.setAddress(sc.next());
		System.out.println("Enter City: ");
		p1.setCity(sc.next());
		System.out.println("Enter State: ");
		p1.setState(sc.next());
		System.out.println("Enter Zip: ");
		p1.setZip(sc.nextInt());
		System.out.println("Enter Phone Number: ");
		p1.setpNumber(sc.nextLong());
		System.out.println("Enter Email: ");
		p1.setEmail(sc.next());
	}
}

