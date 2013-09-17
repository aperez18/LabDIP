/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Scanner;
/**
 *
 * @author Andy
 */
public class KeyboardInput implements InputBehavior{
    private Scanner keyboard = new Scanner(System.in);
    
    @Override
    public String getInput(){
        promptUser();
        return keyboard.nextLine();
    }
    
    private void promptUser(){
        System.out.println("Enter message here: ");
    }
}
