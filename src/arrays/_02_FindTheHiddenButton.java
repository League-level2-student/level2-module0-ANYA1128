/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener {
	JFrame window;
	JPanel panel;
	String numero = JOptionPane.showInputDialog(null, "Enter a positive number");
	int number = Integer.parseInt(numero);

	// 1. create an array of JButtons. Don't initialize it yet.
	JButton[] bob;
	// 2 create an int variable called hiddenButton
	int hiddenButton;

	public static void main(String[] args) {
		 _02_FindTheHiddenButton hi = new _02_FindTheHiddenButton();
		hi.setup();
		hi.start();

	}

	void setup() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		// 3. Ask the user to enter a positive number and convert it to an int

		// 4. Initialize the array of JButtons to be the size of the int created in step
		// 3
		bob = new JButton[number];
		// 5. Make a for loop to iterate through the JButton array
		for (int i = 0; i < number; i++) {
			// 6. initialize each JButton in the array
			bob[i] = new JButton();
			// 7. add the ActionListener to each JButton
			bob[i].addActionListener(this);
			// 8. add each JButton to the panel
			panel.add(bob[i]);
			window.add(panel);
			window.pack();
		}

	}

	public void start() {
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 9 add the panel to the window
		window.add(panel);
		// 10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// 11. set the JFrame to visible.
		window.setVisible(true);
		// 12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(null, "Click the button with the word 'ME' on it...be quick!!!");
		// 13. initialize the hiddenButton variable to a random number less than the int
		// created in step 3
		Random rand = new Random();
		hiddenButton = rand.nextInt(bob.length);
		// 14. Set the text of the JButton located at hiddenButton to "ME"
		bob[hiddenButton].setText("ME");
		// 15. Use Thread.sleep(1000); to pause the program.
		// Surround it with a try/catch - use Eclipse helper for this
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 16. Set the text of the JButton located at hiddenButton to be blank.
		bob[hiddenButton].setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();

		// 17. if the hiddenButton is clicked, tell the user that they win.
if(buttonClicked==bob[hiddenButton]) {
	JOptionPane.showMessageDialog(null, "YOU WON GO EAT ICE CREAM");
}
		// 18. else tell them to try again
else {
	JOptionPane.showMessageDialog(null, "Try again hahhahaha");
}
	}
}
