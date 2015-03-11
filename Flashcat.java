package flashcat;

import javax.swing.*;
import java.awt.*;

class Flashcat{

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

==============================
	Windows Method
==============================

*/
    public void useWindows(){
        FlashcatWindows fw = new FlashcatWindows();
        fw.fwCaller();
 

    }


/*

==============================
    Macintosh Method
==============================

*/
    public static void useMac(){
        System.out.println("Hi Mac");
    }

    /*

     Begin main method

    */

    public static void main(String[] args){


        Flashcat driver = new Flashcat();
        driver.start();



    } // end main method

    public void start(){
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
            useWindows();
        }

        /*
         =============================
                  MAC CASE
         =============================
         */

        if(system.equals("MAC"))
        {
            useMac();
        }
    }// end start

} //end class