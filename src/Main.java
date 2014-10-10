/**
 * Author   : Stretch Projects
 * Series   : Introduction to Java
 * Topic    : Error handling
 * Lecture  : http://youtu.be/FDsI_NGz2kw
 * Tutorial : http://youtu.be/ahC5x680Lkk
 * License  : None.  Do with it as you wish! :)
 */

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String userMessage = 
				JOptionPane.showInputDialog("input something");
		
		JOptionPane.showMessageDialog(null, userMessage);
		
		//JOptionPane.show //press ctrl + space
	
	}

}
