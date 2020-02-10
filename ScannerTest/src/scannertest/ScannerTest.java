/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scannertest;

/**
 *
 * @author Jalaw9578
 */
import java.util.Scanner;
public class ScannerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int userage;
        String username;
        Scanner keyedinput = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        username = keyedinput.nextLine();
        System.out.println("Your name is: " + username);
        System.out.print("Please enter your age: ");
        userage = keyedinput.nextInt();
        System.out.println("You are " + userage + " years old!");
        
    }
    
}
