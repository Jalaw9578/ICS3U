/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package electionprogram;

/**
 *
 * @author Jalaw9578
 */
import java.util.Scanner;
public class Electionprogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedinput = new Scanner(System.in);
        System.out.println("What are the results for the election?: ");
        System.out.print("Martinez votes: ");
        double martinezvotes = keyedinput.nextInt();
        System.out.print("Awbrey votes: ");
        double awbreyvotes = keyedinput.nextInt();
        double totalvotes = awbreyvotes+martinezvotes;
        double awbreyperc = (awbreyvotes/totalvotes)*100;
        double martinezperc = (martinezvotes/totalvotes)*100;
        System.out.println("The results were: ");
        System.out.println("Martinez: " + martinezvotes + " votes " + martinezperc + "%");
        System.out.println("Awbrey: " + awbreyvotes + " votes " + awbreyperc + "%");
    }
    
}
