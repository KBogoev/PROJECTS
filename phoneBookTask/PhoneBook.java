package phoneBookTask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.format.ResolverStyle;
import java.util.Comparator;
import java.util.TreeMap;

public class PhoneBook {

	private TreeMap<String, String> phoneNumbers;
	private TreeMap<Integer, String> outgoingCalls;

	private static boolean validateName(String name) {

		if (name == null || name.equals("")) {

			return false;
		}
		return true;
	}

	private static String removeCountryCodeFromNumber(String phoneNumber) {

		String digitsWithoutCountryCode = "emptyPhoneNumber";
		if (phoneNumber.startsWith("+359")) {

			digitsWithoutCountryCode = phoneNumber.substring(4);
		}

		if (phoneNumber.startsWith("0")) {

			if (phoneNumber.substring(1, 5).equals("0359")) {

				digitsWithoutCountryCode = phoneNumber.substring(5);
			} else {

				digitsWithoutCountryCode = phoneNumber.substring(1);
			}
		}

		return digitsWithoutCountryCode;
	}

	private static boolean validatePhoneNumber(String phoneNumber) {

		boolean flag = false;

		String digitsWithoutCountryCode = removeCountryCodeFromNumber(phoneNumber);
		String mobileOperatorCode = digitsWithoutCountryCode.substring(0, 2);
		if (mobileOperatorCode.equals("87") || mobileOperatorCode.equals("88") || mobileOperatorCode.equals("89")) {

			if (digitsWithoutCountryCode.charAt(2) >= '2' && digitsWithoutCountryCode.charAt(2) <= '9') {

				for (int index = 3; index < digitsWithoutCountryCode.length() - 1; index++) {

					if (phoneNumber.charAt(index) > '0' && phoneNumber.charAt(index) < '9') {

						flag = true;
					} else {

						flag = false;
					}
				}
			}
		}

		return flag;

	}

	PhoneBook(String filePath) {
		this.phoneNumbers = new TreeMap<>();

		String[] contact = null;
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			String line = null;

			while ((line = br.readLine()) != null) {

				contact = line.split(" ");
				this.addContact(contact[0].trim(), contact[1].trim());
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	void addContact(String name, String phoneNumber) {

		if (validateName(name) && validatePhoneNumber(phoneNumber)) {

			if (!this.phoneNumbers.containsKey(name)) {

				this.phoneNumbers.put(name, phoneNumber);
			} else {

				System.out.println("Contact with this name already exists!");
			}
		}
	}

	void removeContact(String name) {

		if (validateName(name)) {

			this.phoneNumbers.remove(name);
		}

		System.out.println(name + " is removed from contacts!");
	}

	String findContact(String name) {

		if (validateName(name) && this.phoneNumbers.get(name) != null) {

			return this.phoneNumbers.get(name);
		}

		return "No such contact found!!!";
	}

	void printContacts() {

		for (String key : this.phoneNumbers.keySet()) {
			System.out.println("Name: " + key);
			System.out.println("Phone: " + this.phoneNumbers.get(key));
		}
	}

	void createOutgoingCalls() {

		this.outgoingCalls = new TreeMap<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 > o2) {
					return -1;
				}

				if (o1 < o2) {
					return 1;
				}

				return 0;
			}
		});

	}

	void receiveCalls(int numberOfCallsReceived, String toWho) {

		if (numberOfCallsReceived > 0 && validateName(toWho) && this.phoneNumbers.containsKey(toWho)) {
			this.outgoingCalls.put(numberOfCallsReceived, this.phoneNumbers.get(toWho));
		}
	}

	void printTopFiveOutgoingCalls() {

		int topFiveOutgoingCallse = 5;
		for (Integer key : this.outgoingCalls.keySet()) {

			System.out.println("Phone number: " + this.outgoingCalls.get(key));
			System.out.println("Received calls: " + key);
			topFiveOutgoingCallse--;

			if (topFiveOutgoingCallse == 0) {

				break;
			}
		}

	}

}
