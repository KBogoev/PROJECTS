/**
 * 
 */
package Notepad;

import java.net.PasswordAuthentication;

/**
 * @author kbogoev
 *
 */
public class SecuredNotepad extends SimpleNotepad {

	private String password;

	public SecuredNotepad(String password) {

		if (password != null && !password.equals("")) {

			this.password = password;
		}

		System.out.println("Secured notepad is been created.Have a nice day!!!");
	}

	public void addText(String text, int pageNumber, String password) {

		if (this.password.equals(password)) {

			super.addText(text, pageNumber);
		} else {

			System.out.println("Invalid password given.Request denied.");
		}
	}

	public void addNewText(String text, int pageNumber, String password) {

		if (this.password.equals(password)) {

			super.addNewText(text, pageNumber);
		} else {

			System.out.println("Invalid password given.Request denied.");
		}
	}

	public void deleteText(int pageNumber, String password) {

		if (this.password.equals(password)) {

			super.deleteText(pageNumber);
		} else {

			System.out.println("Invalid password given.Request denied.");
		}
	}

	public void reviewAllPages(String password) {

		if (this.password.equals(password)) {

			super.reviewAllPages();
		} else {

			System.out.println("Invalid password given.Request denied.");
		}

	}

	public void setPages(Page[] pages, String password) {
		if (this.password.equals(password)) {

			super.setPages(pages);
		} else {

			System.out.println("Invalid password given. Request denied!");
		}
	}
}
