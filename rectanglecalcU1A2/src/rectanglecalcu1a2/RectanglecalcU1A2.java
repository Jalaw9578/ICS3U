/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectanglecalcu1a2;

/**
 *
 * @author Jalaw9578
 */
import java.util.Scanner;
public class RectanglecalcU1A2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Define scanner to allow input
        Scanner keyedinput = new Scanner(System.in);
        System.out.println("We will calculate the area of a rectangle!");
        // Collect user inputs
        System.out.println("Define the width:");
        double width = keyedinput.nextDouble();
        System.out.println("Now, define the length:");
        double length = keyedinput.nextDouble();
        // Process user inputs
        double area = width*length;
        // Ouput procesed inputs
        System.out.println("The rectngle's area is: " + area);
    }
    
}
