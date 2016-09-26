import javax.swing.JOptionPane;


/**
 * This program creates the lyrics to The Name Game song after processing user input
 */


public class NameGame
{
    public static void main(String[] args)
    {
    // Variables
    String name= ""; // user input name
    String nameSub = ""; // name starting with first vowel or y
    char letter; // used to find the first vowel in name
    char initial; // used to prevent first initial letters classes with song
    int nameStart; // used to show where where a name should begin based on first vowel location
    int i; // iterator for loop creating sub name

    
        // Loops the program until the user is done making lyrics
        while(!name.toUpperCase().equals("DONE"))
        {
          //Get user name input 
          name = JOptionPane.showInputDialog("Please enter a name to use for \"The Name Game\" song." +
          "\n If you are done making lyrics enter DONE.");
          
          // Prevent use of vulgar words in song by blocking some names
          if (name.toLowerCase().equals("mitch") || name.toLowerCase().equals("tucker") || name.toLowerCase().equals("buck"))
          {
            JOptionPane.showMessageDialog(null, "Please pick another name");
          }
          
          else if (!name.toUpperCase().equals("DONE"))
          {    
            // Create sub name that begin with a vowel 
            letter = name.charAt(1);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y')
             {
               nameStart = 1;
             }       

             else
             {
               nameStart = 2;
             }

             for (i = nameStart; i<name.length(); i++)
             {
               nameSub = nameSub + name.charAt(i);
             }


             // Song Lyrics Output
             initial = name.charAt(0);
             
             
             // Prevent saying full name when the line begins with first letter of name
             switch (initial)
             {             
                case 'b':
                case 'B':
                    JOptionPane.showMessageDialog(null, "~The Name Game~\n\n" + name + "!\n" + 
                    name + ", " + name + " bo " + nameSub + " \nBanana fanna fo F" + nameSub + 
                    "\nFee fy mo M" + nameSub + ", " + name + "!");                     
                  break;
                case 'f':
                case 'F':
                    JOptionPane.showMessageDialog(null, "~The Name Game~\n\n" + name + "!\n" + 
                    name + ", " + name + " bo B" + nameSub + " \nBanana fanna fo " + nameSub + 
                    "\nFee fy mo M" + nameSub + ", " + name + "!");                    
                  break; 
                case 'm':
                case 'M':
                    JOptionPane.showMessageDialog(null, "~The Name Game~\n\n" + name + "!\n" + 
                    name + ", " + name + " bo B" + nameSub + " \nBanana fanna fo F" + nameSub + 
                    "\nFee fy mo " + nameSub + ", " + name + "!");                     
                  break;
                default:
                    JOptionPane.showMessageDialog(null, "~The Name Game~\n\n" + name + "!\n" + 
                    name + ", " + name + " bo B" + nameSub + " \nBanana fanna fo F" + nameSub + 
                    "\nFee fy mo M" + nameSub + ", " + name + "!");                        
             }  
             
             // Clear values for next loop
             name = "";
             nameSub = "";
         }
      }
        // Exit when user enters DONE
        JOptionPane.showMessageDialog(null, "I guess you're all sung out for now. BYE!");
        System.exit(0);
   }
}