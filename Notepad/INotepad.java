/**
 * 
 */
package Notepad;

/**
 * @author kbogoev
 *
 */
public interface INotepad {

	public void addText(String text, int pageNumber);

	public void addNewText(String text, int pageNumber);

	public void deleteText(int pageNumber);

	public void reviewAllPages();

	public boolean searchWord(String word);

	public void printAllPagesWithDigits();
}
