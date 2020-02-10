/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package waterandcompmanufacturingu1a2;

/**
 *
 * @author Jalaw9578
 */
import java.util.Scanner;
public class WaterandcompmanufacturingU1A2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // allow user inputs
        Scanner keyedinput = new Scanner(System.in);
        // define tons of water needed per combo
        final double TONSPERCOMP = 1.5;
        // retrieve user input
        System.out.println("We are going to calculate your water used to make your computer combos!");
        System.out.println("Enter number of computer combos:");
        int numberofcombos = keyedinput.nextInt();
        // process input
        double tonsused = TONSPERCOMP*numberofcombos;
        //display output
        System.out.println("Tons used: " + tonsused);
    }
    
}
