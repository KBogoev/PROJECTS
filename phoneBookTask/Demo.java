package phoneBookTask;

public class Demo {

	public static void main(String[] args) {

		PhoneBook phoneBook = new PhoneBook(
				"/Users/koliobogoev/Desktop/Work/Java/Proba/src/phoneBookTask/Contacts.txt");

		phoneBook.printContacts();
		System.out.println();
		phoneBook.addContact("Gosho", "0899735778");
		phoneBook.addContact("Atanas", "0885678678");
		System.out.println();
		phoneBook.printContacts();
		System.out.println();
		phoneBook.removeContact("Ivan");
		phoneBook.removeContact("Gosho");
		System.out.println();
		phoneBook.printContacts();
		System.out.println();
		phoneBook.addContact("Atanas", "00359876578578");
		System.out.println();
		System.out.println(phoneBook.findContact("Gosho"));
		System.out.println();
		System.out.println();
		System.out.println(phoneBook.findContact("Bojidar"));
		
		phoneBook.createOutgoingCalls();
		System.out.println();
		phoneBook.addContact("Ivan", "+359899876876");
		phoneBook.addContact("Stoqn", "0899876543");
		phoneBook.receiveCalls(5, "Georgi");
		phoneBook.receiveCalls(2, "Atanas");
		phoneBook.receiveCalls(3, "Minko");
		phoneBook.receiveCalls(9, "Bojidar");
		phoneBook.receiveCalls(1, "Ivan");
		phoneBook.receiveCalls(2, "Petar");
		phoneBook.receiveCalls(4, "Stoqn");
		phoneBook.receiveCalls(12, "Ivan");

		phoneBook.printTopFiveOutgoingCalls();
	}
}
