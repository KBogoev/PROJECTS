/**
 * 
 */
package Notepad;

/**
 * @author kbogoev
 *
 */
public class SimpleNotepad implements INotepad {

	private static final int DEFAULT_PAGES = 5;
	private Page[] pages;

	SimpleNotepad(Page[] pages) {

		if (pages != null) {
			this.pages = pages;

			for (int index = 0; index < pages.length; index++) {

				if (this.pages[index] == null) {
					this.pages[index] = new Page();
				}
			}

			System.out.println("Simple notepad with " + pages.length
					+ " pages is been created, blagodarq vi che se doverihte na nas!!!");
		}
	}

	SimpleNotepad() {

		this.pages = new Page[DEFAULT_PAGES];
		for (int index = 0; index < DEFAULT_PAGES; index++) {

			this.pages[index] = new Page();
		}

		System.out.println("Simple notepad with 5 pages is been created, ae chao!");
	}

	@Override
	public void addText(String text, int pageNumber) {

		if (pageNumber + 1 > 0) {

			this.pages[pageNumber].addText(text);
			System.out.println("Dobaven beshe teks, have a nice day!");
		}
	}

	@Override
	public void addNewText(String text, int pageNumber) {

		if (pageNumber + 1 > 0) {

			this.pages[pageNumber].setText(text);
			System.out.println("Zadaden beshe nov tekst, chao!");
		}
	}

	@Override
	public void deleteText(int pageNumber) {

		if (pageNumber + 1 > 0) {

			this.pages[pageNumber].setText(null);
			System.out.println("Iztrit beshe teksta na stranica " + pageNumber + " i tq veche e prazna");
		}
	}

	@Override
	public void reviewAllPages() {

		for (int index = 0; index < this.pages.length; index++) {

			if (this.pages[index] != null) {

				System.out.println(this.pages[index].reviewPage());
			}
		}
	}

	public Page[] getPages() {

		return this.pages;
	}

	public void setPages(Page[] pages) {

		if (pages != null) {
			this.pages = pages;
		}
	}

	@Override
	public boolean searchWord(String word) {

		if (word != null && !word.equals("")) {
			for (int i = 0; i < this.pages.length; i++) {

				if (this.pages[i].searchWord(word)) {

					return true;
				}
			}
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {

		for (int index = 0; index < this.pages.length; index++) {

			if (this.pages[index].containsDigit()) {

				System.out.println(this.pages[index].reviewPage());
			}
		}
	}
}
