/**
 * 
 */
package Notepad;

import java.util.Scanner;

/**
 * @author kbogoev
 *
 */
public class NotepadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Page[] pages = new Page[5];

		pages[0] = new Page("Random title", "Some simple 2 text");
		pages[1] = new Page("North", "Some simple text4 only for that3 page");
		pages[2] = new Page();
		pages[3] = new Page();
		pages[4] = new Page("miloto dnevniche", "milo dnevniche bla bla gluspoti");

		System.out.println(pages[1].searchWord("only"));
		System.out.println(pages[1].containsDigit());
		/*
		 * INotepad notepad = new SimpleNotepad(pages);
		 * 
		 * notepad.reviewAllPages();
		 */

		System.out.println("Molq vuvedete parola: ");
		String password = sc.next();
		SecuredNotepad securedNotepad = new SecuredNotepad(password);
		password = null;

		System.out.print("Molq vuvedete parola: ");
		password = sc.next();
		securedNotepad.addNewText("some simple text", 0, password);
		password = null;
		System.out.print("Molq vuvedete parola: ");
		password = sc.next();
		securedNotepad.setPages(pages, password);
		password = null;
		System.out.print("Molq vuvedete parola: ");
		password = sc.next();
		securedNotepad.reviewAllPages(password);// nema da ti dade da gledash,
												// ako ne
		// vuvedesh pravilna praola batko

		System.out.println(securedNotepad.searchWord("text"));
		securedNotepad.printAllPagesWithDigits();

	}

}
