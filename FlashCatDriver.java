import javax.swing.*;

public class FlashCatDriver{
    
    /*
     
     Get the user's operating system to ensure you're installing the proper
     files. (exe, dmg, etc)
     
     */
    
    public static String getOS()
    {
        String os = JOptionPane.showInputDialog("Are you running Mac or Windows?");
        
        StringBuilder sb = new StringBuilder(os);
        for (int index = 0; index < sb.length(); index++) {
            char c = sb.charAt(index);
            if (Character.isLowerCase(c)) {
                sb.setCharAt(index, Character.toUpperCase(c));
            } //end if
        }//end for loop
        
        os = sb.toString();
        return os;
    } //end getOS method

    
    /*
     
     Begin main method
     
    */
    
    public static void main(String[] args){
        
    
        String system = getOS();

        /*
         =============================
         NEITHER CASE
         =============================
         */
        
        while(!system.equals("MAC") && !system.equals("WINDOWS"))
        {
            JOptionPane.showMessageDialog(null, "Invalid input, please specify your OS");
            system = getOS();
        }
        /*
         =============================
                WINDOWS CASE
         =============================
         */
        
        if(system.equals("WINDOWS"))
        {
            //do something
        }
        
        /*
         =============================
                  MAC CASE
         =============================
         */
        
        if(system.equals("MAC"))
        {
            //do something
        }
        
        
        
    } // end main method

} //end class