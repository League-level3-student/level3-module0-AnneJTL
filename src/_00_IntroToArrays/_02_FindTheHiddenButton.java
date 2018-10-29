package _00_IntroToArrays;

import jdk.nashorn.internal.scripts.JO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* Run the FindHiddenButton.jar to see the finished product. */

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame window;
	JPanel panel;
	
	//1. create an array of JButtons. Don't initialize it yet.
	JButton[] allButttons;
	
	//2 create an integer variable called hiddenButton
	Random randomNumber;
	int hiddenButton = 0;
	
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int userValue;
		
		//3.  Ask the user to enter a positive number and convert it to an int
		userValue = Integer.valueOf(JOptionPane.showInputDialog("Enter a positive number"));
		System.out.println(userValue);

		//4. Initialize the array of JButtons to be the size of the int created in step 3
		allButttons = new JButton[userValue];
		
		//5. Make a for loop to iterate through the JButton array
		for (int i = 0; i < allButttons.length; i++) {
			//6. initialize each JButton in the array
			String iString = String.valueOf(i);
			allButttons[i] = new JButton();
			//7. add the ActionListener to each JButton
			allButttons[i].addActionListener(this);
			//8. add each JButton to the panel
			panel.add(allButttons[i]);
		}
		//9 add the panel to the window
		window.add(panel);

		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//11. set the JFrame to visible.
		window.setVisible(true);
		//12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(null, "Here are the instructions :-D");
		
		//13. initialize the hiddenButton variable to a random number less than the int created in step 3
		randomNumber = new Random();
		hiddenButton = randomNumber.nextInt(userValue);
		System.out.println("randomNumber: " + randomNumber);
		System.out.println("hiddenButton: " + hiddenButton);

		//14. Set the text of the JButton located at hiddenButton to read "ME"
		allButttons[hiddenButton].setText("ME");

		//15. Use Thread.sleep(100); to pause the program.
		try{
			Thread.sleep(100);
		} catch (InterruptedException e){}
		
		//16. Set the text of the JButton located at hiddenButton to be blank.
		allButttons[hiddenButton].setText("");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		int intButtonClicked = -1;

		for (int i = 0; i < allButttons.length; i++) {
			if (allButttons[i] == buttonClicked)
			{
				intButtonClicked = i;
			}
		}

        System.out.println("ActionListener - intButtonClicked:" + intButtonClicked);
        System.out.println("ActionListener - hiddenButton:" + hiddenButton);

        //17. if the hiddenButton is clicked, tell the user that they win.
		if (intButtonClicked == hiddenButton){
			JOptionPane.showMessageDialog(null, "YOU WIN");
		} else {
			JOptionPane.showMessageDialog(null, "TRY AGAIN");
		}

		//18. else tell them to try again
	}

}
