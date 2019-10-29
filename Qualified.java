import java.util.Scanner;
import javax.swing.JOptionPane;

/**This program is for determining whether a person's credit score is 
high enough to be approved to purchase a new car */

public class Qualified
{
    public static void main(String[] args) 
    {
        
        

        int score = Integer.parseInt(JOptionPane.showInputDialog("Enter your credit score: "));
        

        if (score <= 300  && score < 579)
        {
           //System.out.print("Sorry, your" + score +  " credit score isn't high enough");
           JOptionPane.showMessageDialog(null, "Sorry, your " + score + " credit score isn't high enough.");
        }
        else if (score <= 580 && score < 669)
        {
            JOptionPane.showMessageDialog(null, "Your credit score of " + score + " is fair, but not quite enough for us to lend you money.");
        }
        else if (score <= 670 && score < 739)
        {
            JOptionPane.showMessageDialog(null, "Your credit score of " + score + " is good! There's a possiblity we'd lend you money for the car.");
        }
        else if (score <= 740 && score < 799)
        {
            JOptionPane.showMessageDialog(null, "Your credit score of " + score + " is very good! We'll lend you the money for the car!");

        }
        else
        {
            JOptionPane.showMessageDialog(null, "Your credit score of " + score + " is exceptional! We have no problem lending you money for the car! Enjoy!");
        }
    }
}