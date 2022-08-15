import javax.swing.JOptionPane;
public class rockpaperscissor {

	public static void main(String args[]) {
	int y=1;
	int you = 0;
	int comp = 0;
	
	while(y>0) {
	double computer = Math.random()*101;
	String computerChoice;
	if(computer>=33 && computer<=66) {
		computerChoice = "Rock";
	}
	else if(computer<=66) {
		computerChoice = "Paper";
	}
	else {
		computerChoice = "Scissors";
	}
	String ree = JOptionPane.showInputDialog("Choose rock,paper,or scissors");
	if(ree.equalsIgnoreCase("rock")) {
		if(computerChoice.equals("Rock")) {
			JOptionPane.showMessageDialog(null,"You both chose rock! Try again!");
			}
		if(computerChoice.equals("Paper")) {
			JOptionPane.showMessageDialog(null,"The computer chose paper! You lose!");
			comp++;
			}
		if(computerChoice.equals("Scissors")) {
			JOptionPane.showMessageDialog(null,"The computer chose scissors! You win!");
			you++;
			}
		}
	else if(ree.equalsIgnoreCase("paper")) {
		if(computerChoice.equals("Rock")) {
			JOptionPane.showMessageDialog(null,"The computer chose rock! You win!");
			you++;
			}
		if(computerChoice.equals("Paper")) {
			JOptionPane.showMessageDialog(null,"You both chose paper! Try again!");
			}
		if(computerChoice.equals("Scissors")) {
			JOptionPane.showMessageDialog(null,"The computer chose scissors! You lose!");
			comp++;
			}
		}
	else if(ree.equalsIgnoreCase("scissors")) {
		if(computerChoice.equals("Rock")) {
			JOptionPane.showMessageDialog(null,"The computer chose rock! You lose!");
			comp++;
			}
		if(computerChoice.equals("Paper")) {
			JOptionPane.showMessageDialog(null,"The computer chose paper! You win!");
			you++;
			}
		if(computerChoice.equals("Scissors")) {
			JOptionPane.showMessageDialog(null,"You both chose scissors! Try again!");
			}
		}
	else {
		JOptionPane.showMessageDialog(null, "You somehow made a mistake in choosing \"rock, paper, or scissors \". I don't know how that's possible considering that the right spelling was given to you. Anyway, I hope you aren't so inept that you do this again.");
	}
	y--;
	System.out.println("Current Score: \n \tYou:"+you+"Computer:"+comp );
	
	String e = JOptionPane.showInputDialog("Do you want to continue for another match?");
	int confirmation = x(e);
	y+=confirmation;
	}
	JOptionPane.showMessageDialog(null,"It was fun playing with you. See ya!");
	}
	
	public static int x(String answer) {
		if(answer.equalsIgnoreCase("Yes")) {
			return 1;
		}
		if(answer.equalsIgnoreCase("No")) {
		return 0;
		}
		JOptionPane.showMessageDialog(null, "So you decided to pick neither \"yes or no \". I'll just assume you want to play another match then!");
		return 1;
	}
}
