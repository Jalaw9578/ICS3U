/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shoppingu1a2;

/**
 *
 * @author Jalaw9578
 */
import java.util.Scanner;
public class ShoppingU1A2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Define scanner to allow input
    Scanner keyedinput = new Scanner(System.in);
    // Collect inputs
    System.out.println("We are going shopping !!!!");
    System.out.println("How many keyboards would you like?: ");
    int keyboards = keyedinput.nextInt();
    System.out.println("How many storage devices would you like?: ");
    int storage = keyedinput.nextInt();
    System.out.println("How many mice would you like?: ");
    int mice = keyedinput.nextInt();
    // Process inputs
    //totals for each product
    double keyboardcost = keyboards*49.99;
    double storagecost = storage*19.99;
    double micecost = mice*25.99;
    // subtotal
    double subtotal = keyboardcost+storagecost+micecost;
    System.out.println("Subtotal: $"+subtotal);
    // taxes
    double tax = 0.13*subtotal;
    System.out.println("Tax: $"+tax);
    // Total
    System.out.println("Total: $"+(tax+subtotal));
    }
    
}
