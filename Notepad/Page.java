/**
 * 
 */
package Notepad;

/**
 * @author kbogoev
 *
 */
public class Page {

	private String title;
	private String text;

	public Page() {

		this.title = "Default title";
		this.text = "This text file is empty";
	}

	public Page(String title, String text) {

		if (title != null && !title.equals("")) {

			this.title = title;
		}

		if (text != null && !text.equals("")) {

			this.title = title;
			this.text = text;
		}
	}

	public String getTitle() {

		return this.title;
	}

	public void setTitle(String title) {
		if (this.title != null && !this.title.equals("")) {

			this.title = title;
		}
	}

	public String getText() {
		return this.text;

	}

	public void setText(String text) {
		if (this.text != null && !this.text.equals("")) {

			this.text = text;
		}
	}

	void addText(String text) {

		if (text != null) {

			if (!this.text.equals("This text file is empty")) {

				this.text = this.text + text;
			} else {

				this.text = text;
			}
		}
	}

	void deleteText() {

		this.text = null;
	}

	String reviewPage() {

		return this.title + " " + this.text;
	}

	boolean searchWord(String word) {

		if (this.text != null && !this.text.equals("This text file is empty")) {

			return this.text.contains(word);
		} else {

			System.out.println("No text in this page, have a nice day");
		}

		return false;
	}

	boolean containsDigit() {

		if (this.text != null && !this.text.equals("This text file is empty")) {

			for (int index = 0; index < this.text.length(); index++) {

				if (this.text.charAt(index) > '1' && this.text.charAt(index) < '9') {

					return true;
				}
			}
		}

		return false;
	}

}
